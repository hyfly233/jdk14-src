/*
 * Copyright (c) 2011, 2019, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


package org.graalvm.compiler.nodes.extended;

import static org.graalvm.compiler.nodeinfo.NodeCycles.CYCLES_8;
import static org.graalvm.compiler.nodeinfo.NodeSize.SIZE_8;

import org.graalvm.compiler.core.common.spi.ForeignCallDescriptor;
import org.graalvm.compiler.core.common.type.StampFactory;
import org.graalvm.compiler.core.common.type.TypeReference;
import org.graalvm.compiler.debug.GraalError;
import org.graalvm.compiler.graph.Node;
import org.graalvm.compiler.graph.NodeClass;
import org.graalvm.compiler.graph.NodeInputList;
import org.graalvm.compiler.graph.spi.Canonicalizable;
import org.graalvm.compiler.graph.spi.CanonicalizerTool;
import org.graalvm.compiler.nodeinfo.NodeInfo;
import org.graalvm.compiler.nodeinfo.Verbosity;
import org.graalvm.compiler.nodes.FrameState;
import org.graalvm.compiler.nodes.ValueNode;
import org.graalvm.compiler.nodes.memory.AbstractMemoryCheckpoint;
import org.graalvm.compiler.nodes.memory.MemoryCheckpoint;
import org.graalvm.compiler.nodes.spi.Lowerable;
import org.graalvm.compiler.nodes.spi.LoweringTool;
import jdk.internal.vm.compiler.word.LocationIdentity;

import jdk.vm.ci.meta.JavaKind;
import jdk.vm.ci.meta.MetaAccessProvider;

/**
 * A node that represents an exception thrown implicitly by a Java bytecode. It can be lowered to
 * either a {@linkplain ForeignCallDescriptor foreign} call or a pre-allocated exception object.
 */
// @formatter:off
@NodeInfo(cycles = CYCLES_8,
          cyclesRationale = "Node will be lowered to a foreign call.",
          size = SIZE_8)
// @formatter:on
public final class BytecodeExceptionNode extends AbstractMemoryCheckpoint implements Lowerable, MemoryCheckpoint.Single, Canonicalizable {

    public enum BytecodeExceptionKind {
        NULL_POINTER(0, NullPointerException.class),
        OUT_OF_BOUNDS(2, ArrayIndexOutOfBoundsException.class),
        CLASS_CAST(2, ClassCastException.class),
        ARRAY_STORE(1, ArrayStoreException.class),
        DIVISION_BY_ZERO(0, ArithmeticException.class),
        INTEGER_EXACT_OVERFLOW(0, ArithmeticException.class),
        LONG_EXACT_OVERFLOW(0, ArithmeticException.class);

        final int numArguments;
        final Class<? extends Throwable> exceptionClass;

        BytecodeExceptionKind(int numArguments, Class<? extends Throwable> exceptionClass) {
            this.numArguments = numArguments;
            this.exceptionClass = exceptionClass;
        }
    }

    public static final NodeClass<BytecodeExceptionNode> TYPE = NodeClass.create(BytecodeExceptionNode.class);
    protected final BytecodeExceptionKind exceptionKind;
    @Input NodeInputList<ValueNode> arguments;

    public BytecodeExceptionNode(MetaAccessProvider metaAccess, BytecodeExceptionKind exceptionKind, ValueNode... arguments) {
        super(TYPE, StampFactory.objectNonNull(TypeReference.createExactTrusted(metaAccess.lookupJavaType(exceptionKind.exceptionClass))));
        this.exceptionKind = exceptionKind;
        this.arguments = new NodeInputList<>(this, arguments);
        GraalError.guarantee(arguments.length == exceptionKind.numArguments, "Mismatch in argument count for BytecodeExceptionNode");
    }

    public BytecodeExceptionKind getExceptionKind() {
        return exceptionKind;
    }

    @Override
    public String toString(Verbosity verbosity) {
        if (verbosity == Verbosity.Name) {
            return super.toString(verbosity) + "#" + exceptionKind;
        }
        return super.toString(verbosity);
    }

    @Override
    public LocationIdentity getKilledLocationIdentity() {
        return LocationIdentity.any();
    }

    @Override
    public Node canonical(CanonicalizerTool tool) {
        if (tool.allUsagesAvailable() && (hasNoUsages() || (hasExactlyOneUsage() && usages().first() == stateAfter))) {
            return null;
        }
        return this;
    }

    @Override
    public void lower(LoweringTool tool) {
        tool.getLowerer().lower(this, tool);
    }

    public NodeInputList<ValueNode> getArguments() {
        return arguments;
    }

    /**
     * Create a new stateDuring for use by a foreign call.
     */
    public FrameState createStateDuring() {
        return stateAfter.duplicateModified(graph(), stateAfter.bci, /* rethrowException */ false, /* duringCall */ true,
                        JavaKind.Object, null, null);
    }

}

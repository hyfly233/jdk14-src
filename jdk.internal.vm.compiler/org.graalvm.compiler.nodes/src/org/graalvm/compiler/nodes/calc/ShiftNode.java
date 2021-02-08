/*
 * Copyright (c) 2009, 2019, Oracle and/or its affiliates. All rights reserved.
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


package org.graalvm.compiler.nodes.calc;

import static org.graalvm.compiler.nodeinfo.NodeCycles.CYCLES_1;
import static org.graalvm.compiler.nodeinfo.NodeSize.SIZE_1;
import static org.graalvm.compiler.nodes.calc.BinaryArithmeticNode.getArithmeticOpTable;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable.ShiftOp;
import org.graalvm.compiler.core.common.type.IntegerStamp;
import org.graalvm.compiler.core.common.type.Stamp;
import org.graalvm.compiler.graph.NodeClass;
import org.graalvm.compiler.graph.spi.CanonicalizerTool;
import org.graalvm.compiler.nodeinfo.NodeInfo;
import org.graalvm.compiler.nodes.ArithmeticOperation;
import org.graalvm.compiler.nodes.ConstantNode;
import org.graalvm.compiler.nodes.NodeView;
import org.graalvm.compiler.nodes.ValueNode;
import org.graalvm.compiler.nodes.spi.ArithmeticLIRLowerable;

import jdk.vm.ci.code.CodeUtil;
import jdk.vm.ci.meta.JavaConstant;
import jdk.vm.ci.meta.JavaKind;

/**
 * The {@code ShiftOp} class represents shift operations.
 */
@NodeInfo(cycles = CYCLES_1, size = SIZE_1)
public abstract class ShiftNode<OP> extends BinaryNode implements ArithmeticOperation, ArithmeticLIRLowerable, NarrowableArithmeticNode {

    @SuppressWarnings("rawtypes") public static final NodeClass<ShiftNode> TYPE = NodeClass.create(ShiftNode.class);

    /**
     * Creates a new shift operation.
     *
     * @param x the first input value
     * @param s the second input value
     */
    protected ShiftNode(NodeClass<? extends ShiftNode<OP>> c, ShiftOp<OP> opForStampComputation, ValueNode x, ValueNode s) {
        super(c, opForStampComputation.foldStamp(x.stamp(NodeView.DEFAULT), (IntegerStamp) s.stamp(NodeView.DEFAULT)), x, s);
        assert ((IntegerStamp) s.stamp(NodeView.DEFAULT)).getBits() == 32;
    }

    protected abstract ShiftOp<OP> getOp(ArithmeticOpTable table);

    protected final ShiftOp<OP> getOp(ValueNode forValue) {
        return getOp(getArithmeticOpTable(forValue));
    }

    @Override
    public final ShiftOp<OP> getArithmeticOp() {
        return getOp(getX());
    }

    @Override
    public Stamp foldStamp(Stamp stampX, Stamp stampY) {
        return getArithmeticOp().foldStamp(stampX, (IntegerStamp) stampY);
    }

    @Override
    public ValueNode canonical(CanonicalizerTool tool, ValueNode forX, ValueNode forY) {
        NodeView view = NodeView.from(tool);
        ValueNode valueNode = canonical(getOp(forX), stamp(NodeView.DEFAULT), forX, forY, view);
        if (valueNode != null) {
            return valueNode;
        }
        return this;
    }

    @SuppressWarnings("unused")
    public static <OP> ValueNode canonical(ShiftOp<OP> op, Stamp stamp, ValueNode forX, ValueNode forY, NodeView view) {
        if (forX.isConstant() && forY.isConstant()) {
            JavaConstant amount = forY.asJavaConstant();
            assert amount.getJavaKind() == JavaKind.Int;
            return ConstantNode.forPrimitive(stamp, op.foldConstant(forX.asConstant(), amount.asInt()));
        }
        return null;
    }

    public int getShiftAmountMask() {
        return getArithmeticOp().getShiftAmountMask(stamp(NodeView.DEFAULT));
    }

    @Override
    public boolean isNarrowable(int resultBits) {
        assert CodeUtil.isPowerOf2(resultBits);
        int narrowMask = resultBits - 1;
        int wideMask = getShiftAmountMask();
        assert (wideMask & narrowMask) == narrowMask : String.format("wideMask %x should be wider than narrowMask %x", wideMask, narrowMask);

        /*
         * Shifts are special because narrowing them also changes the implicit mask of the shift
         * amount. We can narrow only if (y & wideMask) == (y & narrowMask) for all possible values
         * of y.
         */
        IntegerStamp yStamp = (IntegerStamp) getY().stamp(NodeView.DEFAULT);
        return (yStamp.upMask() & (wideMask & ~narrowMask)) == 0;
    }
}

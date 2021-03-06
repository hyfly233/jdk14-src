/*
 * Copyright (c) 2015, 2018, Oracle and/or its affiliates. All rights reserved.
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
 *
 *
 */

package jdk.internal.access;

import java.lang.invoke.MethodType;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.util.Map;

public interface JavaLangInvokeAccess {
    /**
     * Create a new MemberName instance. Used by {@code StackFrameInfo}.
     */
    Object newMemberName();

    /**
     * Returns the name for the given MemberName. Used by {@code StackFrameInfo}.
     */
    String getName(Object mname);

    /**
     * Returns the {@code MethodType} for the given MemberName.
     * Used by {@code StackFrameInfo}.
     */
    MethodType getMethodType(Object mname);

    /**
     * Returns the descriptor for the given MemberName.
     * Used by {@code StackFrameInfo}.
     */
    String getMethodDescriptor(Object mname);

    /**
     * Returns {@code true} if the given MemberName is a native method.
     * Used by {@code StackFrameInfo}.
     */
    boolean isNative(Object mname);

    /**
     * Returns the declaring class for the given MemberName.
     * Used by {@code StackFrameInfo}.
     */
    Class<?> getDeclaringClass(Object mname);

    /**
     * Returns a {@code byte[]} representation of a class implementing
     * DirectMethodHandle of each pairwise combination of {@code MethodType} and
     * an {@code int} representing method type.  Used by
     * GenerateJLIClassesPlugin to generate such a class during the jlink phase.
     */
    byte[] generateDirectMethodHandleHolderClassBytes(String className,
            MethodType[] methodTypes, int[] types);

    /**
     * Returns a {@code byte[]} representation of a class implementing
     * DelegatingMethodHandles of each {@code MethodType} kind in the
     * {@code methodTypes} argument.  Used by GenerateJLIClassesPlugin to
     * generate such a class during the jlink phase.
     */
    byte[] generateDelegatingMethodHandleHolderClassBytes(String className,
            MethodType[] methodTypes);

    /**
     * Returns a {@code byte[]} representation of {@code BoundMethodHandle}
     * species class implementing the signature defined by {@code types}. Used
     * by GenerateJLIClassesPlugin to enable generation of such classes during
     * the jlink phase. Should do some added validation since this string may be
     * user provided.
     */
    Map.Entry<String, byte[]> generateConcreteBMHClassBytes(
            final String types);

    /**
     * Returns a {@code byte[]} representation of a class implementing
     * the zero and identity forms of all {@code LambdaForm.BasicType}s.
     */
    byte[] generateBasicFormsClassBytes(final String className);

    /**
     * Returns a {@code byte[]} representation of a class implementing
     * the invoker forms for the set of supplied {@code invokerMethodTypes}
     * and {@code callSiteMethodTypes}.
     */
    byte[] generateInvokersHolderClassBytes(String className,
            MethodType[] invokerMethodTypes,
            MethodType[] callSiteMethodTypes);

    /**
     * Returns a var handle view of a given memory address.
     * Used by {@code jdk.internal.foreign.LayoutPath} and
     * {@code jdk.incubator.foreign.MemoryHandles}.
     */
    VarHandle memoryAddressViewVarHandle(Class<?> carrier, long alignmentMask,
                                         ByteOrder order, long offset, long[] strides);

    /**
     * Returns the carrier associated with a memory access var handle.
     * Used by {@code jdk.incubator.foreign.MemoryHandles}.
     */
    Class<?> memoryAddressCarrier(VarHandle handle);

    /**
     * Returns the alignment mask associated with a memory access var handle.
     * Used by {@code jdk.incubator.foreign.MemoryHandles}.
     */
    long memoryAddressAlignmentMask(VarHandle handle);

    /**
     * Returns the byte order associated with a memory access var handle.
     * Used by {@code jdk.incubator.foreign.MemoryHandles}.
     */
    ByteOrder memoryAddressByteOrder(VarHandle handle);

    /**
     * Returns the offset associated with a memory access var handle.
     * Used by {@code jdk.incubator.foreign.MemoryHandles}.
     */
    long memoryAddressOffset(VarHandle handle);

    /**
     * Returns the strides associated with a memory access var handle.
     * Used by {@code jdk.incubator.foreign.MemoryHandles}.
     */
    long[] memoryAddressStrides(VarHandle handle);
}

/*
 * Copyright (c) 2000, 2019, Oracle and/or its affiliates. All rights reserved.
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

// -- This file was mechanically generated: Do not edit! -- //

package java.nio;

import jdk.internal.access.foreign.MemorySegmentProxy;

import java.util.Objects;

class ByteBufferAsDoubleBufferRL                  // package-private
        extends ByteBufferAsDoubleBufferL {


    ByteBufferAsDoubleBufferRL(ByteBuffer bb, MemorySegmentProxy segment) {   // package-private


        super(bb, segment);

    }

    ByteBufferAsDoubleBufferRL(ByteBuffer bb,
                               int mark, int pos, int lim, int cap,
                               long addr, MemorySegmentProxy segment) {


        super(bb, mark, pos, lim, cap, addr, segment);

    }

    @Override
    Object base() {
        return bb.hb;
    }

    @Override
    public DoubleBuffer slice() {
        int pos = this.position();
        int lim = this.limit();
        int rem = (pos <= lim ? lim - pos : 0);
        long addr = byteOffset(pos);
        return new ByteBufferAsDoubleBufferRL(bb, -1, 0, rem, rem, addr, segment);
    }

    @Override
    public DoubleBuffer slice(int index, int length) {
        Objects.checkFromIndexSize(index, length, limit());
        return new ByteBufferAsDoubleBufferRL(bb,
                -1,
                0,
                length,
                length,
                byteOffset(index), segment);
    }

    @Override
    public DoubleBuffer duplicate() {
        return new ByteBufferAsDoubleBufferRL(bb,
                this.markValue(),
                this.position(),
                this.limit(),
                this.capacity(),
                address, segment);
    }

    @Override
    public DoubleBuffer asReadOnlyBuffer() {


        return duplicate();

    }


    @Override
    public DoubleBuffer put(double x) {


        throw new ReadOnlyBufferException();

    }

    @Override
    public DoubleBuffer put(int i, double x) {


        throw new ReadOnlyBufferException();

    }

    @Override
    public DoubleBuffer compact() {


        throw new ReadOnlyBufferException();

    }

    @Override
    public boolean isDirect() {
        return bb.isDirect();
    }

    @Override
    public boolean isReadOnly() {
        return true;
    }


    @Override
    public ByteOrder order() {


        return ByteOrder.LITTLE_ENDIAN;

    }


}

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

class ByteBufferAsDoubleBufferB                  // package-private
        extends DoubleBuffer {


    protected final ByteBuffer bb;


    ByteBufferAsDoubleBufferB(ByteBuffer bb, MemorySegmentProxy segment) {   // package-private

        super(-1, 0,
                bb.remaining() >> 3,
                bb.remaining() >> 3, segment);
        this.bb = bb;
        // enforce limit == capacity
        int cap = this.capacity();
        this.limit(cap);
        int pos = this.position();
        assert (pos <= cap);
        address = bb.address;


    }

    ByteBufferAsDoubleBufferB(ByteBuffer bb,
                              int mark, int pos, int lim, int cap,
                              long addr, MemorySegmentProxy segment) {

        super(mark, pos, lim, cap, segment);
        this.bb = bb;
        address = addr;
        assert address >= bb.address;


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
        return new ByteBufferAsDoubleBufferB(bb, -1, 0, rem, rem, addr, segment);
    }

    @Override
    public DoubleBuffer slice(int index, int length) {
        Objects.checkFromIndexSize(index, length, limit());
        return new ByteBufferAsDoubleBufferB(bb,
                -1,
                0,
                length,
                length,
                byteOffset(index), segment);
    }

    @Override
    public DoubleBuffer duplicate() {
        return new ByteBufferAsDoubleBufferB(bb,
                this.markValue(),
                this.position(),
                this.limit(),
                this.capacity(),
                address, segment);
    }

    @Override
    public DoubleBuffer asReadOnlyBuffer() {

        return new ByteBufferAsDoubleBufferRB(bb,
                this.markValue(),
                this.position(),
                this.limit(),
                this.capacity(),
                address, segment);


    }


    private int ix(int i) {
        int off = (int) (address - bb.address);
        return (i << 3) + off;
    }

    protected long byteOffset(long i) {
        return (i << 3) + address;
    }

    @Override
    public double get() {
        checkSegment();
        long x = UNSAFE.getLongUnaligned(bb.hb, byteOffset(nextGetIndex()),
                true);
        return Double.longBitsToDouble(x);
    }

    @Override
    public double get(int i) {
        checkSegment();
        long x = UNSAFE.getLongUnaligned(bb.hb, byteOffset(checkIndex(i)),
                true);
        return Double.longBitsToDouble(x);
    }


    @Override
    public DoubleBuffer put(double x) {

        checkSegment();
        long y = Double.doubleToRawLongBits(x);
        UNSAFE.putLongUnaligned(bb.hb, byteOffset(nextPutIndex()), y,
                true);
        return this;


    }

    @Override
    public DoubleBuffer put(int i, double x) {

        checkSegment();
        long y = Double.doubleToRawLongBits(x);
        UNSAFE.putLongUnaligned(bb.hb, byteOffset(checkIndex(i)), y,
                true);
        return this;


    }

    @Override
    public DoubleBuffer compact() {

        int pos = position();
        int lim = limit();
        assert (pos <= lim);
        int rem = (pos <= lim ? lim - pos : 0);

        ByteBuffer db = bb.duplicate();
        db.limit(ix(lim));
        db.position(ix(0));
        ByteBuffer sb = db.slice();
        sb.position(pos << 3);
        sb.compact();
        position(rem);
        limit(capacity());
        discardMark();
        return this;


    }

    @Override
    public boolean isDirect() {
        return bb.isDirect();
    }

    @Override
    public boolean isReadOnly() {
        return false;
    }


    @Override
    public ByteOrder order() {

        return ByteOrder.BIG_ENDIAN;


    }


}

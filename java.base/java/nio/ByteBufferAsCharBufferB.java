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

class ByteBufferAsCharBufferB                  // package-private
        extends CharBuffer {


    protected final ByteBuffer bb;


    ByteBufferAsCharBufferB(ByteBuffer bb, MemorySegmentProxy segment) {   // package-private

        super(-1, 0,
                bb.remaining() >> 1,
                bb.remaining() >> 1, segment);
        this.bb = bb;
        // enforce limit == capacity
        int cap = this.capacity();
        this.limit(cap);
        int pos = this.position();
        assert (pos <= cap);
        address = bb.address;


    }

    ByteBufferAsCharBufferB(ByteBuffer bb,
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
    public CharBuffer slice() {
        int pos = this.position();
        int lim = this.limit();
        int rem = (pos <= lim ? lim - pos : 0);
        long addr = byteOffset(pos);
        return new ByteBufferAsCharBufferB(bb, -1, 0, rem, rem, addr, segment);
    }

    @Override
    public CharBuffer slice(int index, int length) {
        Objects.checkFromIndexSize(index, length, limit());
        return new ByteBufferAsCharBufferB(bb,
                -1,
                0,
                length,
                length,
                byteOffset(index), segment);
    }

    @Override
    public CharBuffer duplicate() {
        return new ByteBufferAsCharBufferB(bb,
                this.markValue(),
                this.position(),
                this.limit(),
                this.capacity(),
                address, segment);
    }

    @Override
    public CharBuffer asReadOnlyBuffer() {

        return new ByteBufferAsCharBufferRB(bb,
                this.markValue(),
                this.position(),
                this.limit(),
                this.capacity(),
                address, segment);


    }


    private int ix(int i) {
        int off = (int) (address - bb.address);
        return (i << 1) + off;
    }

    protected long byteOffset(long i) {
        return (i << 1) + address;
    }

    @Override
    public char get() {
        checkSegment();
        char x = UNSAFE.getCharUnaligned(bb.hb, byteOffset(nextGetIndex()),
                true);
        return (x);
    }

    @Override
    public char get(int i) {
        checkSegment();
        char x = UNSAFE.getCharUnaligned(bb.hb, byteOffset(checkIndex(i)),
                true);
        return (x);
    }


    @Override
    char getUnchecked(int i) {
        char x = UNSAFE.getCharUnaligned(bb.hb, byteOffset(i),
                true);
        return (x);
    }


    @Override
    public CharBuffer put(char x) {

        checkSegment();
        char y = (x);
        UNSAFE.putCharUnaligned(bb.hb, byteOffset(nextPutIndex()), y,
                true);
        return this;


    }

    @Override
    public CharBuffer put(int i, char x) {

        checkSegment();
        char y = (x);
        UNSAFE.putCharUnaligned(bb.hb, byteOffset(checkIndex(i)), y,
                true);
        return this;


    }

    @Override
    public CharBuffer compact() {

        int pos = position();
        int lim = limit();
        assert (pos <= lim);
        int rem = (pos <= lim ? lim - pos : 0);

        ByteBuffer db = bb.duplicate();
        db.limit(ix(lim));
        db.position(ix(0));
        ByteBuffer sb = db.slice();
        sb.position(pos << 1);
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
    public String toString(int start, int end) {
        Objects.checkFromToIndex(start, end, limit());
        try {
            int len = end - start;
            char[] ca = new char[len];
            CharBuffer cb = CharBuffer.wrap(ca);
            CharBuffer db = this.duplicate();
            db.position(start);
            db.limit(end);
            cb.put(db);
            return new String(ca);
        } catch (StringIndexOutOfBoundsException x) {
            throw new IndexOutOfBoundsException();
        }
    }


    // --- Methods to support CharSequence ---

    @Override
    public CharBuffer subSequence(int start, int end) {
        int pos = position();
        int lim = limit();
        assert (pos <= lim);
        pos = (pos <= lim ? pos : lim);
        int len = lim - pos;

        Objects.checkFromToIndex(start, end, len);
        return new ByteBufferAsCharBufferB(bb,
                -1,
                pos + start,
                pos + end,
                capacity(),
                address, segment);
    }


    @Override
    public ByteOrder order() {

        return ByteOrder.BIG_ENDIAN;


    }


    @Override
    ByteOrder charRegionOrder() {
        return order();
    }

}

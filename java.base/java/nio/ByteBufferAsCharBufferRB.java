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

class ByteBufferAsCharBufferRB                  // package-private
        extends ByteBufferAsCharBufferB {


    ByteBufferAsCharBufferRB(ByteBuffer bb, MemorySegmentProxy segment) {   // package-private


        super(bb, segment);

    }

    ByteBufferAsCharBufferRB(ByteBuffer bb,
                             int mark, int pos, int lim, int cap,
                             long addr, MemorySegmentProxy segment) {


        super(bb, mark, pos, lim, cap, addr, segment);

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
        return new ByteBufferAsCharBufferRB(bb, -1, 0, rem, rem, addr, segment);
    }

    @Override
    public CharBuffer slice(int index, int length) {
        Objects.checkFromIndexSize(index, length, limit());
        return new ByteBufferAsCharBufferRB(bb,
                -1,
                0,
                length,
                length,
                byteOffset(index), segment);
    }

    @Override
    public CharBuffer duplicate() {
        return new ByteBufferAsCharBufferRB(bb,
                this.markValue(),
                this.position(),
                this.limit(),
                this.capacity(),
                address, segment);
    }

    @Override
    public CharBuffer asReadOnlyBuffer() {


        return duplicate();

    }


    @Override
    public CharBuffer put(char x) {


        throw new ReadOnlyBufferException();

    }

    @Override
    public CharBuffer put(int i, char x) {


        throw new ReadOnlyBufferException();

    }

    @Override
    public CharBuffer compact() {


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
        return new ByteBufferAsCharBufferRB(bb,
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

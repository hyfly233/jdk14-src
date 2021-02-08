/*
 * Copyright (c) 2007, 2018, Oracle and/or its affiliates. All rights reserved.
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


package org.graalvm.compiler.jtt.bytecode;

import org.junit.Test;

import org.graalvm.compiler.jtt.JTTTest;

/*
 */
public class BC_lookupswitch01 extends JTTTest {

    public static int test(int a) {
        switch (a) {
            case 67:
                return 0;
            case 97:
                return 1;
            case 107:
                return 2;
            case 133:
                return 3;
            case 212:
                return 4;
        }
        return 42;
    }

    @Test
    public void run0() throws Throwable {
        runTest("test", 0);
    }

    @Test
    public void run1() throws Throwable {
        runTest("test", 1);
    }

    @Test
    public void run2() throws Throwable {
        runTest("test", 66);
    }

    @Test
    public void run3() throws Throwable {
        runTest("test", 67);
    }

    @Test
    public void run4() throws Throwable {
        runTest("test", 68);
    }

    @Test
    public void run5() throws Throwable {
        runTest("test", 96);
    }

    @Test
    public void run6() throws Throwable {
        runTest("test", 97);
    }

    @Test
    public void run7() throws Throwable {
        runTest("test", 98);
    }

    @Test
    public void run8() throws Throwable {
        runTest("test", 106);
    }

    @Test
    public void run9() throws Throwable {
        runTest("test", 107);
    }

    @Test
    public void run10() throws Throwable {
        runTest("test", 108);
    }

    @Test
    public void run11() throws Throwable {
        runTest("test", 132);
    }

    @Test
    public void run12() throws Throwable {
        runTest("test", 133);
    }

    @Test
    public void run13() throws Throwable {
        runTest("test", 134);
    }

    @Test
    public void run14() throws Throwable {
        runTest("test", 211);
    }

    @Test
    public void run15() throws Throwable {
        runTest("test", 212);
    }

    @Test
    public void run16() throws Throwable {
        runTest("test", 213);
    }

}

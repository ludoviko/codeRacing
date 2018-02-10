package com.lam.coder.topCoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HalvingEasyTest {

    protected HalvingEasy solution;

    @Before
    public void setUp() {
        solution = new HalvingEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] S = new int[]{6, 14, 11, 3, 1};
        int T = 3;

        int expected = 3;
        int actual = solution.count(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] S = new int[]{42, 10, 10, 10, 11, 11, 20, 21, 39, 40, 42, 43, 44};
        int T = 10;

        int expected = 9;
        int actual = solution.count(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] S = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int T = 1;

        int expected = 20;
        int actual = solution.count(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] S = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int T = 0;

        int expected = 20;
        int actual = solution.count(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int[] S = new int[]{0, 0, 0, 0, 0};
        int T = 0;

        int expected = 5;
        int actual = solution.count(S, T);

        Assert.assertEquals(expected, actual);
    }


    @Test(timeout = 2000)
    public void testCase7() {
        int[] S = new int[]{0, 0, 0, 0, 0};
        int T = 111;

        int expected = 0;
        int actual = solution.count(S, T);

        Assert.assertEquals(expected, actual);
    }


    @Test(timeout = 2000)
    public void testCase3() {
        int[] S = new int[]{987654321, 1000000000, 998244353, 123456789, 999999999};
        int T = 476;

        int expected = 3;
        int actual = solution.count(S, T);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] S = new int[]{987654321, 1000000000, 998244353, 123456789, 999999999};
        int T = 1000000000;

        int expected = 1;
        int actual = solution.count(S, T);

        Assert.assertEquals(expected, actual);
    }

}

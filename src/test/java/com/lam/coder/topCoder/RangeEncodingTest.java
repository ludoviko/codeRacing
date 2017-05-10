package com.lam.coder.topCoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RangeEncodingTest {

    protected RangeEncoding solution;

    @Before
    public void setUp() {
        solution = new RangeEncoding();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int expected = 1;
        int actual = solution.minRanges(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] arr = new int[]{1, 6, 10, 20, 32, 50};

        int expected = 6;
        int actual = solution.minRanges(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] arr = new int[]{2, 4, 5, 6, 8, 9, 10, 11, 12, 15};

        int expected = 4;
        int actual = solution.minRanges(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] arr = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};

        int expected = 14;
        int actual = solution.minRanges(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] arr = new int[]{10, 11, 12, 13, 14, 15, 20, 21, 22, 23, 25, 27, 28, 29, 30, 31, 32, 33};

        int expected = 4;
        int actual = solution.minRanges(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        int[] arr = new int[]{33};

        int expected = 1;
        int actual = solution.minRanges(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        int[] arr = new int[]{33};

        int expected = 1;
        int actual = solution.minRanges(arr);

        Assert.assertEquals(expected, actual);
    }

}

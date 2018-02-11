package com.lam.coder.topCoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BrokenChessboardTest {

    protected BrokenChessboard solution;

    @Before
    public void setUp() {
        solution = new BrokenChessboard();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] board = new String[]{"BWB", "BBW", "BWW"};

        int expected = 2;
        int actual = solution.minimumFixes(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] board = new String[]{"WW", "WW"};

        int expected = 2;
        int actual = solution.minimumFixes(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] board = new String[]{"BWB", "WBW", "BWB"};

        int expected = 0;
        int actual = solution.minimumFixes(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] board = new String[]{"B", "W", "B", "B"};

        int expected = 1;
        int actual = solution.minimumFixes(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] board = new String[]{"BWBBB", "WWBBW", "BBBBW", "WBWBB"};

        int expected = 7;
        int actual = solution.minimumFixes(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] board = new String[]{"B"};

        int expected = 0;
        int actual = solution.minimumFixes(board);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCasej() {
        String[] board = new String[]{"W"};

        int expected = 0;
        int actual = solution.minimumFixes(board);

        Assert.assertEquals(expected, actual);
    }

}

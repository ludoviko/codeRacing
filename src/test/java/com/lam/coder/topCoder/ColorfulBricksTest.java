package com.lam.coder.topCoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.ColorfulBricks;

public class ColorfulBricksTest {

    protected ColorfulBricks solution;

    @Before
    public void setUp() {
        this.solution = new ColorfulBricks();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String bricks = "ABAB";

        int expected = 2;
        int actual = this.solution.countLayouts(bricks);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String bricks = "AAA";

        int expected = 1;
        int actual = this.solution.countLayouts(bricks);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String bricks = "WXYZ";

        int expected = 0;
        int actual = this.solution.countLayouts(bricks);

        Assert.assertEquals(expected, actual);
    }

}

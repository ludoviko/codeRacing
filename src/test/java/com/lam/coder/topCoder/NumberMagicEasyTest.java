package com.lam.coder.topCoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.NumberMagicEasy;

public class NumberMagicEasyTest {
    protected NumberMagicEasy solution;

    @Before
    public void setUp() {
        this.solution = new NumberMagicEasy();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String answer = "YNYY";

        int expected = 5;
        int actual = this.solution.theNumber(answer);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String answer = "YNNN";

        int expected = 8;
        int actual = this.solution.theNumber(answer);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String answer = "NNNN";

        int expected = 16;
        int actual = this.solution.theNumber(answer);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String answer = "YYYY";

        int expected = 1;
        int actual = this.solution.theNumber(answer);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String answer = "NYNY";

        int expected = 11;
        int actual = this.solution.theNumber(answer);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout=2000)
    public void testCase5() {
        String answer = "NNNY";

        int expected = 15;
        int actual = this.solution.theNumber(answer);

        Assert.assertEquals(expected, actual);
    }

}

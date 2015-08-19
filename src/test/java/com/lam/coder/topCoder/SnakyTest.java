package com.lam.coder.topCoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Snaky;

public class SnakyTest {
    protected Snaky solution;

    @Before
    public void setUp() {
        this.solution = new Snaky();
    }
    
    
    @Test(timeout = 2000)
    public void testCase7() {
        String[] snake = new String[] {".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x", ".x"};

        int expected = 50;
        int actual = this.solution.longest(snake);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase6() {
        String[] snake = new String[] {"..xxx" };

        int expected = 3;
        int actual = this.solution.longest(snake);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase5() {
        String[] snake = new String[] {"xx...xxxx..", ".xxxxxxxxxx"};

        int expected = 10;
        int actual = this.solution.longest(snake);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] snake = new String[] {"xx...xxxxxx", ".xxxxx....."};

        int expected = 6;
        int actual = this.solution.longest(snake);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] snake = new String[]{"x.xxx.xxx", "x.x.x.x.x", "xxx.xxx.x"};

        int expected = 3;
        int actual = this.solution.longest(snake);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] snake = new String[]{"xxxx..", "...x..", "...x..", "......"};

        int expected = 4;
        int actual = this.solution.longest(snake);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] snake = new String[]{"...x................", "...x................", "....................", "...................."};

        int expected = 2;
        int actual = this.solution.longest(snake);

        Assert.assertEquals(expected, actual);
    }

}

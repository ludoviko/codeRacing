package com.lam.coder.acmTimus;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumTest {
    Sum sum;

    @Before
    public void setUp() {
        sum = new Sum();
    }

    @After
    public void tearDown()  {
        sum = null;
    }

    @Test
    public void testAssertData() {
        Assert.assertThat("Should be the same.", sum.find(-3), CoreMatchers.is(-5));

    }
}

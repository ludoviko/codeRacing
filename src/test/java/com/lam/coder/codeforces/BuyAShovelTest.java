package com.lam.coder.codeforces;

import org.junit.*;

import com.lam.coder.codeforces.BuyAShovel;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuyAShovelTest {
    BuyAShovel buyAShovel;

    @Before
    public void setUp() throws Exception {
        buyAShovel = new BuyAShovel();
    }

    @After
    public void tearDown() throws Exception {
        buyAShovel  = null;
    }

    @Test
    public void test() {
        Assert.assertThat("Should be the same.", BuyAShovel.find(117, 3), CoreMatchers.is(9));
        Assert.assertThat("Should be the same.", BuyAShovel.find(237, 7), CoreMatchers.is(1));
        Assert.assertThat("Should be the same.", BuyAShovel.find(15, 2), CoreMatchers.is(2));
        Assert.assertThat("Should be the same.", BuyAShovel.find(999, 8), CoreMatchers.is(2));
        Assert.assertThat("Should be the same.", BuyAShovel.find(228, 9), CoreMatchers.is(5));
        Assert.assertThat("Should be the same.", BuyAShovel.find(666, 5), CoreMatchers.is(5));
        Assert.assertThat("Should be the same.", BuyAShovel.find(1000, 7), CoreMatchers.is(1));
    }
}

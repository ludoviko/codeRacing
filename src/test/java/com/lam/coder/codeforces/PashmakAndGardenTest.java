package com.lam.coder.codeforces;

import org.junit.*;

import com.lam.coder.codeforces.PashmakAndGarden;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PashmakAndGardenTest {
    PashmakAndGarden pashmakAndGarden;

    @Before
    public void setUp() throws Exception {
        pashmakAndGarden = new PashmakAndGarden();
    }

    @After
    public void tearDown() throws Exception {
        pashmakAndGarden  = null;
    }

    @Test
    public void test1() {
        pashmakAndGarden.setPoints(0, 0, 1, 1);
        Assert.assertThat("Should be the same.", pashmakAndGarden.findPoints(), CoreMatchers.is("0 1 1 0"));
    }

    @Test
    public void test2() {
        pashmakAndGarden.setPoints(0, 0, 0, 1);
        Assert.assertThat("Should be the same.", pashmakAndGarden.findPoints(), CoreMatchers.is("1 0 1 1"));
    }

    @Test
    public void test3() {
        pashmakAndGarden.setPoints(0, 0, 1, 2);
        Assert.assertThat("Should be the same.", pashmakAndGarden.findPoints(), CoreMatchers.is("-1"));
    }

    @Test
    public void test4() {
        pashmakAndGarden.setPoints(-100, -100, 100, 100);
        Assert.assertThat("Should be the same.", pashmakAndGarden.findPoints(), CoreMatchers.is("-100 100 100 -100"));
    }

    @Test
    public void test5() {
        pashmakAndGarden.setPoints(-100, -100, 99, 100);
        Assert.assertThat("Should be the same.", pashmakAndGarden.findPoints(), CoreMatchers.is("-1"));
    }

    @Test
    public void test6() {
        pashmakAndGarden.setPoints(0, -100, 0, 100);
        Assert.assertThat("Should be the same.", pashmakAndGarden.findPoints(), CoreMatchers.is("200 -100 200 100"));
    }

    @Test
    public void test7() {
        pashmakAndGarden.setPoints(27, -74, 27, 74);
        Assert.assertThat("Should be the same.", pashmakAndGarden.findPoints(), CoreMatchers.is("175 -74 175 74"));
    }

    @Test
    public void test8() {
        pashmakAndGarden.setPoints(0, 1, 2, 3);
        Assert.assertThat("Should be the same.", pashmakAndGarden.findPoints(), CoreMatchers.is("0 3 2 1"));
    }

    @Test
    public void test9() {
        pashmakAndGarden.setPoints(-100, 100, 100, -100);
        Assert.assertThat("Should be the same.", pashmakAndGarden.findPoints(), CoreMatchers.is("-100 -100 100 100"));
    }

    @Test
    public void test10() {
        pashmakAndGarden.setPoints(1, 1, 0, 0);
        Assert.assertThat("Should be the same.", pashmakAndGarden.findPoints(), CoreMatchers.is("1 0 0 1"));
    }
}


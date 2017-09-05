package com.lam.coder.projectEuler;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PythagoreanTriplesTest {
    PythagoreanTriples main;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        main = null;
    }

    @Test
    public void testABC() {
        main = new PythagoreanTriples(1000);
        main.find();
        Assert.assertThat("Should be the same.", main.getA() * main.getB() * main.getC(), CoreMatchers.is(31875000L));
    }

    @Test
    public void testABC2() {
        main = new PythagoreanTriples(12);
        main.find();
        Assert.assertThat("Should be the same.", main.getA() * main.getB() * main.getC(), CoreMatchers.is(60L));
    }

    @Test
    public void testCC() {
        main = new PythagoreanTriples(30);
        main.find();
        Assert.assertThat("Should be the same.", main.getC() * main.getC(), CoreMatchers.is(169L));
    }

    @Test
    public void testNoSolution() {
        main = new PythagoreanTriples(10);
        main.find();
        Assert.assertThat("Should be the same.", main.getA(), CoreMatchers.is(-1L));
    }


}


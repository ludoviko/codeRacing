package com.lam.coder.acmTimus;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class DemocracyinDangerTest {
    DemocracyinDanger democracyinDanger;

    @Before
    public void setUp() {
        democracyinDanger = new DemocracyinDanger();
    }

    @After
    public void tearDown()  {
        democracyinDanger = null;
    }

    @Test
    public void testAssertData() {
        assertThat("Error: Should be the same.", democracyinDanger.findMinimunVoters(new int[]{5, 7, 5}), CoreMatchers.is(6));
    }
}

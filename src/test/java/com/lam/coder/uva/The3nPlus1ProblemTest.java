package com.lam.coder.uva;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.uva.The3nPlus1Problem;

public class The3nPlus1ProblemTest {
	The3nPlus1Problem the3nPlus1Problem;
	
	@Before
	public void setUp() throws Exception {
		this.the3nPlus1Problem = new The3nPlus1Problem();
	}

	@After
	public void tearDown() throws Exception {
		this.the3nPlus1Problem  = null;
	}

	@Test
	public void test() {
        Assert.assertThat("Should be the same.", the3nPlus1Problem.find(1, 10), CoreMatchers.is(20));
        Assert.assertThat("Should be the same.", the3nPlus1Problem.find(100, 200), CoreMatchers.is(125));
        Assert.assertThat("Should be the same.", the3nPlus1Problem.find(201,210), CoreMatchers.is(89));
        Assert.assertThat("Should be the same.", the3nPlus1Problem.find(900, 1000), CoreMatchers.is(174));
        Assert.assertThat("Should be the same.", the3nPlus1Problem.find(1000, 900), CoreMatchers.is(174));
        Assert.assertThat("Should be the same.", the3nPlus1Problem.find(999999, 999990), CoreMatchers.is(259));
	}
}

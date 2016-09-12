package com.lam.coder.codeabbey;

import com.lam.coder.codeabbey.MortgageCalculator;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MortgageCalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
        Assert.assertThat("Should be the same.", MortgageCalculator.monthtlyPayment(800000, 6, 103), CoreMatchers.is(9957L));
        Assert.assertThat("Should be the same.", MortgageCalculator.monthtlyPayment(1700000, 5, 99), CoreMatchers.is(20992L));
	}
}

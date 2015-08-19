package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.NewYearCandles;

public class NewYearCandlesTest {
	NewYearCandles newYearCandles;
	
	@Before
	public void setUp() throws Exception {
		this.newYearCandles = new NewYearCandles();
	}

	@After
	public void tearDown() throws Exception {
		this.newYearCandles  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(7, this.newYearCandles.find("4 2"));
		Assert.assertEquals(8, this.newYearCandles.find("6 3"));
		Assert.assertEquals(153, this.newYearCandles.find("123 5"));
	}
}

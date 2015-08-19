package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.PrimeNumbers;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PrimeNumbersTest extends TestCase {
	PrimeNumbers number;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		number = new PrimeNumbers();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		number = null;
	}

	@Test
	public void testPairwisePrimes() {
		Assert.assertEquals(14, number.pairwisePrimes(18));
		Assert.assertEquals(6, number.pairwisePrimes(12));
		Assert.assertEquals(9, number.pairwisePrimes(29));
		Assert.assertEquals(13, number.pairwisePrimes(37));
		Assert.assertEquals(2, number.pairwisePrimes(8));
		Assert.assertEquals(1, number.pairwisePrimes(13));
		Assert.assertEquals(48, number.pairwisePrimes(38));
		Assert.assertEquals(10, number.pairwisePrimes(27));
//		Assert.assertEquals(32, number.pairwisePrimes(34));
	}
}

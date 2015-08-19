package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.CircularPrimes;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CircularPrimesTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testMethod() {
		Assert.assertEquals(13, CircularPrimes.find(100));
		Assert.assertEquals(55, CircularPrimes.find(1000000));
	}
}

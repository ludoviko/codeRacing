package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.TruncatablePrimes;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TruncatablePrimesTest extends TestCase {

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
		int n = 1000000;
		Assert.assertEquals(748317, TruncatablePrimes.find(n));
	}

}

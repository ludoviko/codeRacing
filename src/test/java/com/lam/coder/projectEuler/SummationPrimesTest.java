package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.SummationPrimes;

import junit.framework.TestCase;

public class SummationPrimesTest extends TestCase {

	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void test() {
		Assert.assertEquals(142913828922L, SummationPrimes.go(2000000));
	}
}

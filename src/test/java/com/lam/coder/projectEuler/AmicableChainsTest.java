package com.lam.coder.projectEuler;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.AmicableChains;

public class AmicableChainsTest {
	AmicableChains chain;
	
	@Before
	public void setUp() throws Exception {
		chain = new AmicableChains();
	}

	@After
	public void tearDown() throws Exception {
		chain = null;
	}

	@Test
	public void testGetSumProperDivisors() {
		Assert.assertEquals(14316,  chain.find(15000));
	}
}

package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.FractionTC;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FractionTCTest extends TestCase {
	FractionTC fraction;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		fraction = new FractionTC();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		fraction = null;
	}

	@Test
	public void testGetXSmallestSystemTest() {
		Assert.assertEquals(0.5, fraction.getXSmallest(3, 4));
		Assert.assertEquals(0.5, fraction.getXSmallest(1, 2));
		Assert.assertEquals(0.6, fraction.getXSmallest(14, 7));
		Assert.assertEquals(1.0, fraction.getXSmallest(63, 8));
		Assert.assertEquals(0.583, fraction.getXSmallest(40, 12));
		Assert.assertEquals(0.889, fraction.getXSmallest(53, 11));
	}
}

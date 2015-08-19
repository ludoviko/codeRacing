package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.LargestExponential;

import junit.framework.TestCase;

public class LargestExponentialTest extends TestCase {

	LargestExponential largest;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		largest = new LargestExponential();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		largest = null;
	}

	@Test
	public void testFind() {
		Assert.assertEquals(709, largest.find());
	}
}

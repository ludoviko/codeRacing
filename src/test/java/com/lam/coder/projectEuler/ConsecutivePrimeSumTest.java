package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.ConsecutivePrimeSum;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ConsecutivePrimeSumTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testFind() {
		Assert.assertEquals(997651, ConsecutivePrimeSum.find(4000));
	}
}

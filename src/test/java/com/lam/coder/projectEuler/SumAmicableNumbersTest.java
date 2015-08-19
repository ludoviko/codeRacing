package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.SumAmicableNumbers;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SumAmicableNumbersTest extends TestCase {
	SumAmicableNumbers sum;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		sum = new SumAmicableNumbers(9999);
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		sum = null;
	}

	@Test
	public void testFind() {
		Assert.assertEquals(31626, sum.find());
	}
}

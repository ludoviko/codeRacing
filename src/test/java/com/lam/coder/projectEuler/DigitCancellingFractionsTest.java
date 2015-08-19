package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.DigitCancellingFractions;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DigitCancellingFractionsTest extends TestCase {
	DigitCancellingFractions fractions;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		fractions = new DigitCancellingFractions();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		fractions = null;
	}

	@Test
	public void testGo() {
		fractions.go();
		Assert.assertEquals(100, fractions.getDenominator());
	}

}

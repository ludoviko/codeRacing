package com.lam.coder.projectEuler;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class SquareRootDigitalExpansionTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindSumFirstHundredDigits() {
		Assert.assertEquals(475, SquareRootDigitalExpansion.findSumFirstHundredDigits(2));
		Assert.assertEquals(40886, SquareRootDigitalExpansion.findSumFirstHundredDigits(100));
	}
}

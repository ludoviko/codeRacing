package com.lam.coder.projectEuler;


import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.PowerfulDigitSum;

public class PowerfulDigitSumTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFind() {
		Assert.assertEquals(972, PowerfulDigitSum.find());
	}
}

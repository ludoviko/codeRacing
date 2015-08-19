package com.lam.coder.projectEuler;


import org.junit.*;

import com.lam.coder.projectEuler.NonAbundantSum;

public class NonAbundantSumTest {
	NonAbundantSum sum;
	
	@Before
	public void setUp() throws Exception {
		sum = new NonAbundantSum();
	}

	@After
	public void tearDown() throws Exception {
		sum = null;
	}

	// Test broken: XXX.
	@Ignore
	@Test
	public void testFind() {
		Assert.assertEquals(4179871, sum.find());
	}
}

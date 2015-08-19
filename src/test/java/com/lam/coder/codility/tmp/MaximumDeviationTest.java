package com.lam.coder.codility.tmp;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.tmp.MaximumDeviation;

public class MaximumDeviationTest extends TestCase {
	MaximumDeviation deviation;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		deviation = new MaximumDeviation();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		deviation = null; 
	}

	@Test
	public void testSolution() {
		Assert.assertEquals(3, deviation.solution(new int[] {9,4,-3,-10}));
		Assert.assertEquals(-1, deviation.solution(new int[] {}));
	}
}

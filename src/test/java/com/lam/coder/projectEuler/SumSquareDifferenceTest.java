package com.lam.coder.projectEuler;

import org.junit.Test;

import com.lam.coder.projectEuler.SumSquareDifference;

import junit.framework.TestCase;

public class SumSquareDifferenceTest extends TestCase {
	SumSquareDifference difference;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		difference = new SumSquareDifference();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		difference = null;
	}

	@Test
	public void testCalculation() {
		difference.setUpto(10);
		difference.findDifference();
		SumSquareDifferenceTest.assertEquals(2640, difference.getDifference());
		difference.setUpto(100);
		difference.findDifference();
		SumSquareDifferenceTest.assertEquals(25164150, difference.getDifference());
	} 
	
	
}

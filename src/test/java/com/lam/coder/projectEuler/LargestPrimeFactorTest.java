package com.lam.coder.projectEuler;

import junit.framework.TestCase;

import org.junit.Test;

import com.lam.coder.projectEuler.LargestPrimeFactor;

public class LargestPrimeFactorTest extends TestCase {

	protected LargestPrimeFactor largestPrimeFactor;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		largestPrimeFactor = new LargestPrimeFactor();
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.setUp();
		largestPrimeFactor = null;
	};

	@Test
	public void testCalculation() {
		LargestPrimeFactorTest.assertEquals(largestPrimeFactor.getLargest(600851475143l), 6857);  
		LargestPrimeFactorTest.assertEquals(largestPrimeFactor.getLargest(2), 2);  
		LargestPrimeFactorTest.assertEquals(largestPrimeFactor.getLargest(32), 2);  
		LargestPrimeFactorTest.assertEquals(largestPrimeFactor.getLargest(100), 5);  
	}
}

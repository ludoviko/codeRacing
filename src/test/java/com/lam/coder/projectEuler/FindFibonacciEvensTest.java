package com.lam.coder.projectEuler;

import junit.framework.TestCase;

import org.junit.Test;

import com.lam.coder.projectEuler.FindFibonacciEvens;

public class FindFibonacciEvensTest extends TestCase {

	FindFibonacciEvens fibonacci;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		fibonacci = new FindFibonacciEvens();
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.setUp();
		fibonacci = null;
	};
	
	@Test
	public void testCalculationEven() {
		int limit = 4000000;
		int expected = 4613732;
		FindFibonacciEvensTest.assertEquals("Test has failed in calculating the sum", expected, fibonacci.calculateSummaEven(limit) );
		FindFibonacciEvensTest.assertEquals("Test has failed in calculating the sum", expected, fibonacci.calculateSummaEvenImprove(limit));
		FindFibonacciEvensTest.assertEquals("Test has failed in calculating the sum", expected, fibonacci.calculateSummaEvenImproveBest(limit));
	};
}

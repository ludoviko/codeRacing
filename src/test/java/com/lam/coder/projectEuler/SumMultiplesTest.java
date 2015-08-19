package com.lam.coder.projectEuler;

import junit.framework.TestCase;

import org.junit.Test;

import com.lam.coder.projectEuler.SumMultiples;

public class SumMultiplesTest extends TestCase {

	SumMultiples sum;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		sum = new SumMultiples(999);
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.setUp();
		sum = null;
	};
	
	@Test
	public void testCalculationEven() {
		int expected = 233168;
		
		int result_3 = sum.getSum(3);
		int result_5 = sum.getSum(5);
		int result_15 = sum.getSum(15);
		
		int result_i_3 = sum.getSumImproved(3);
		int result_i_5 = sum.getSumImproved(5);
		int result_i_15 = sum.getSumImproved(15);

		SumMultiplesTest.assertEquals("The test has failed in calculating the sum", expected, result_3 + result_5 - result_15 );
		SumMultiplesTest.assertEquals("The test has failed in calculating the sum", expected, result_i_3 + result_i_5 - result_i_15 );
	};

	
}

package com.lam.coder.codility.tmp;


import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.tmp.MaxProfit;

public class MaxProfitTest  {
	MaxProfit profit;
	
	@Before
	public void setUp() throws Exception {
		profit = new MaxProfit();
	}

	@After
	public void tearDown() throws Exception {
		profit = null;
	}

	@Test
	public void testSolution() {
		Assert.assertEquals(354, profit.solution(23171, 21015, 21123, 21366, 21013, 21367));
		Assert.assertEquals(77, profit.solution(3,5,10,20,80,70,40,1));
		Assert.assertEquals(0, profit.solution(80,70,40,3,2,1));
	}
}

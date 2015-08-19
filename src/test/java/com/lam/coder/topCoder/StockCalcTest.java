package com.lam.coder.topCoder;


import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.StockCalc;

public class StockCalcTest  {
	StockCalc profit;
	
	@Before
	public void setUp() throws Exception {
		profit = new StockCalc();
	}

	@After
	public void tearDown() throws Exception {
		profit = null;
	}

	@Test
	public void testGetProfit() {
		Assert.assertEquals(354, profit.getProfit(23171, 21015, 21123, 21366, 21013, 21367));
		Assert.assertEquals(77, profit.getProfit(3,5,10,20,80,70,40,1));
		Assert.assertEquals(0, profit.getProfit(80,70,40,3,2,1));
	}

	@Test
	public void testGetProfitSystemTest() {
		Assert.assertEquals(0, profit.getProfit(1));
		Assert.assertEquals(0, profit.getProfit(10, 9, 8, 7, 6));
		Assert.assertEquals(160, profit.getProfit(59, 40, 70, 80, 90, 200));
		Assert.assertEquals(19, profit.getProfit(1, 3, 8, 10, 20, 14, 12, 1, 17));
		Assert.assertEquals(98, profit.getProfit(2, 3, 8, 1, 99, 8));
	}
}

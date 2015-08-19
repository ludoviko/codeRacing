package com.lam.coder.topCoder;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Profit;

public class ProfitTest {
	Profit profit;
	
	@Before
	public void setUp() throws Exception {
		profit = new Profit();
	}

	@After
	public void tearDown() throws Exception {
		profit = null;
	}

	@Test
	public void testMaxProfit() {
		Assert.assertEquals(61, profit.maxProfit(20, new int[] {18,35,6,80,15,21} ));
		Assert.assertEquals(0, profit.maxProfit(40, new int[] {30,20,10,38} ));
		Assert.assertEquals(58, profit.maxProfit(10, new int[]  {30,20,10,38}));
	}
	@Test
	public void maxProfitSystemTest() { 
		Assert.assertEquals(140, profit.maxProfit(30, new int[] { 100, 100, 10, 10, 10}));
		Assert.assertEquals(80, profit.maxProfit(20, new int[] { 100}));
		Assert.assertEquals(528, profit.maxProfit(20, new int[] { 509, 59}));
		Assert.assertEquals(140, profit.maxProfit(30, new int[] { 10, 10, 10, 100, 100}));
		Assert.assertEquals(15, profit.maxProfit(5, new int[] { 20}));
		Assert.assertEquals(0, profit.maxProfit(12, new int[] { 6, 10, 11, 11, 10, 8}));
		Assert.assertEquals(457, profit.maxProfit(100, new int[] { 101, 101, 102, 300, 350, 100, 103}));
		Assert.assertEquals(50, profit.maxProfit(70, new int[] { 80, 50, 90, 100, 30, 10, 5, 1, 1}));
		Assert.assertEquals(30, profit.maxProfit(60, new int[] { 65, 60, 70, 10, 10, 10, 10, 70, 70, 70}));
		Assert.assertEquals(1952, profit.maxProfit(12, new int[] { 1, 1, 1, 999, 1, 1, 999, 1}));
		Assert.assertEquals(90, profit.maxProfit(10, new int[] { 100}));
		Assert.assertEquals(20, profit.maxProfit(10, new int[] { 30}));
		Assert.assertEquals(20, profit.maxProfit(20, new int[] { 40, 10, 10}));
		Assert.assertEquals(1, profit.maxProfit(1, new int[] { 2}));
		Assert.assertEquals(1, profit.maxProfit(1, new int[] { 2}));
		Assert.assertEquals(30, profit.maxProfit(20, new int[] { 50})) ;
		Assert.assertEquals(19, profit.maxProfit(10, new int[] { 20, 9, 20}));
		Assert.assertEquals(40, profit.maxProfit(10, new int[] { 50}));
		Assert.assertEquals(16, profit.maxProfit(5, new int[] { 2, 10, 10, 11}));
	}
}

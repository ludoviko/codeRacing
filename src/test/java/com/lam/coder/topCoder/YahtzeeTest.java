package com.lam.coder.topCoder;


import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Yahtzee;

public class YahtzeeTest  {
	private Yahtzee yahtzee;
	
	@Before
	public void setUp() throws Exception {
		yahtzee = new Yahtzee();
	}

	@After
	public void tearDown() throws Exception {
		yahtzee = null;
	}

	@Test
	public void testMaxPoints() {
		 Assert.assertEquals(5, yahtzee.maxPoints(new int[] { 2, 2, 3, 5, 4 } ));
		 Assert.assertEquals(6, yahtzee.maxPoints(new int[] { 6, 4, 1, 1, 3 } ));
		 Assert.assertEquals(10, yahtzee.maxPoints(new int[] { 5, 3, 5, 3, 3 } ));
		 Assert.assertEquals(20, yahtzee.maxPoints(new int[] { 5, 3, 5, 3, 3, 4, 8,4,8,4, 4, 4 } ));
	}

	@Test
	public void testSystemTestMaxPoints() {
		Assert.assertEquals(5 ,yahtzee.maxPoints(new int[]  {2, 2, 3, 5, 4}));
		Assert.assertEquals(6 ,yahtzee.maxPoints(new int[] {6, 4, 1, 1, 3}));
		Assert.assertEquals(10 ,yahtzee.maxPoints(new int[] {5, 3, 5, 3, 3}));
		Assert.assertEquals(6 ,yahtzee.maxPoints(new int[] {2, 3, 2, 2, 3}));
		Assert.assertEquals(5 ,yahtzee.maxPoints(new int[] {1, 1, 1, 1, 1}));
		Assert.assertEquals(8 ,yahtzee.maxPoints(new int[] {3, 4, 4, 3, 6}));
		Assert.assertEquals(12 ,yahtzee.maxPoints(new int[] {6, 4, 3, 6, 1}));
		Assert.assertEquals(5 ,yahtzee.maxPoints(new int[] {1, 5, 1, 3, 2}));
		Assert.assertEquals(12 ,yahtzee.maxPoints(new int[] {4, 6, 4, 6, 1}));
		Assert.assertEquals(12 ,yahtzee.maxPoints(new int[] {6, 1, 1, 6, 3}));
		Assert.assertEquals(6 ,yahtzee.maxPoints(new int[] {2, 6, 3, 3, 5}));
		Assert.assertEquals(4 ,yahtzee.maxPoints(new int[] {2, 4, 1, 1, 2}));
		Assert.assertEquals(8 ,yahtzee.maxPoints(new int[] {4, 6, 5, 1, 4}));
		Assert.assertEquals(12 ,yahtzee.maxPoints(new int[] {3, 3, 3, 5, 3}));
		Assert.assertEquals(8 ,yahtzee.maxPoints(new int[] {4, 4, 1, 1, 5}));
		Assert.assertEquals(12 ,yahtzee.maxPoints(new int[] {4, 4, 2, 2, 4}));
		Assert.assertEquals(4 ,yahtzee.maxPoints(new int[] {3, 1, 1, 2, 4}));
		Assert.assertEquals(8 ,yahtzee.maxPoints(new int[] {1, 4, 3, 4, 5}));
		Assert.assertEquals(10 ,yahtzee.maxPoints(new int[] {1, 5, 6, 3, 5}));
		Assert.assertEquals(12 ,yahtzee.maxPoints(new int[] {3, 5, 6, 5, 6}));
		Assert.assertEquals(12 ,yahtzee.maxPoints(new int[] {6, 4, 4, 6, 4}));
		Assert.assertEquals(6 ,yahtzee.maxPoints(new int[] {2, 6, 3, 1, 4}));
		Assert.assertEquals(8 ,yahtzee.maxPoints(new int[] {3, 3, 4, 4, 2}));
		Assert.assertEquals(12 ,yahtzee.maxPoints(new int[] {3, 6, 3, 5, 6}));
		Assert.assertEquals(6 ,yahtzee.maxPoints(new int[] {6, 1, 2, 5, 1}));
		Assert.assertEquals(12 ,yahtzee.maxPoints(new int[] {2, 2, 5, 6, 6}));
		Assert.assertEquals(20 ,yahtzee.maxPoints(new int[] {5, 5, 5, 5, 6}));
		Assert.assertEquals(10 ,yahtzee.maxPoints(new int[] {2, 2, 2, 2, 2}));
		Assert.assertEquals(30 ,yahtzee.maxPoints(new int[] {6, 6, 6, 6, 6}));
		Assert.assertEquals(8 ,yahtzee.maxPoints(new int[] {5, 2, 2, 2, 2}));
		Assert.assertEquals(12 ,yahtzee.maxPoints(new int[] {6, 2, 2, 2, 6}));
		Assert.assertEquals(6 ,yahtzee.maxPoints(new int[] {2, 2, 2, 3, 3}));
		Assert.assertEquals(10 ,yahtzee.maxPoints(new int[] {5, 3, 5, 3, 6}));
		Assert.assertEquals(9 ,yahtzee.maxPoints(new int[] {1, 3, 3, 3, 5}));
		Assert.assertEquals(20 ,yahtzee.maxPoints(new int[] {5, 5, 5, 4, 5}));
		Assert.assertEquals(6 ,yahtzee.maxPoints(new int[] {5, 3, 2, 4, 3}));
		Assert.assertEquals(5 ,yahtzee.maxPoints(new int[] {1, 1, 1, 1, 1}));
		Assert.assertEquals(20 ,yahtzee.maxPoints(new int[] {5, 5, 5, 5, 6}));
		Assert.assertEquals(10 ,yahtzee.maxPoints(new int[] {2, 2, 2, 2, 2}));
		Assert.assertEquals(30 ,yahtzee.maxPoints(new int[] {6, 6, 6, 6, 6}));
		Assert.assertEquals(8 ,yahtzee.maxPoints(new int[] {5, 2, 2, 2, 2}));
		Assert.assertEquals(12 ,yahtzee.maxPoints(new int[] {6, 2, 2, 2, 6}));
		Assert.assertEquals(6 ,yahtzee.maxPoints(new int[] {2, 2, 2, 3, 3}));
		Assert.assertEquals(10 ,yahtzee.maxPoints(new int[] {5, 3, 5, 3, 6}));
		Assert.assertEquals(9 ,yahtzee.maxPoints(new int[] {1, 3, 3, 3, 5}));
		Assert.assertEquals(20 ,yahtzee.maxPoints(new int[] {5, 5, 5, 4, 5}));
		Assert.assertEquals(6 ,yahtzee.maxPoints(new int[] {5, 3, 2, 4, 3}));
		Assert.assertEquals(5 ,yahtzee.maxPoints(new int[] {1, 1, 1, 1, 1}));
		Assert.assertEquals(20 ,yahtzee.maxPoints(new int[] {5, 5, 5, 5, 6}));
		Assert.assertEquals(10 ,yahtzee.maxPoints(new int[] {2, 2, 2, 2, 2}));
		Assert.assertEquals(30 ,yahtzee.maxPoints(new int[] {6, 6, 6, 6, 6}));
		Assert.assertEquals(8 ,yahtzee.maxPoints(new int[] {5, 2, 2, 2, 2}));
		Assert.assertEquals(12 ,yahtzee.maxPoints(new int[] {6, 2, 2, 2, 6}));
		Assert.assertEquals(6 ,yahtzee.maxPoints(new int[] {2, 2, 2, 3, 3}));
		Assert.assertEquals(10 ,yahtzee.maxPoints(new int[] {5, 3, 5, 3, 6}));
		Assert.assertEquals(9 ,yahtzee.maxPoints(new int[] {1, 3, 3, 3, 5}));
		Assert.assertEquals(20 ,yahtzee.maxPoints(new int[] {5, 5, 5, 4, 5}));
		Assert.assertEquals(6 ,yahtzee.maxPoints(new int[] {5, 3, 2, 4, 3}));
		Assert.assertEquals(5  ,yahtzee.maxPoints(new int[] {1, 1, 1, 1, 1}));
	}

}

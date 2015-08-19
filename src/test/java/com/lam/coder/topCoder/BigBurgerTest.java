package com.lam.coder.topCoder;


import org.junit.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.BigBurger;

public class BigBurgerTest  {
	BigBurger burger;
	
	@Before
	public void setUp() throws Exception {
		burger = new BigBurger();
	}

	@After
	public void tearDown() throws Exception {
		burger = null;
	}

	@Test
	public void testMaxWait() {
		// System full test
		Assert.assertEquals(11, burger.maxWait(new int[] {3,3,9}, new int[] {2,15,14}));
		Assert.assertEquals(0, burger.maxWait(new int[] {182}, new int[] {11}));
		Assert.assertEquals(3, burger.maxWait(new int[] {2,10,11}, new int[] {3,4,3}));
		Assert.assertEquals(7, burger.maxWait(new int[] {2,10,12}, new int[] {15,1,15}));
		Assert.assertEquals(735, burger.maxWait(new int[] {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}
		, new int[] {15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15}));
		Assert.assertEquals(9, burger.maxWait(new int[] {5, 5, 100, 100, 200, 200, 300, 300, 400, 400}, new int[] {3, 12, 9, 1, 4, 5, 1, 9, 8, 15}));
		Assert.assertEquals(735, burger.maxWait(new int[] {720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720}, 
		new int[] {15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15}));
		Assert.assertEquals(9, burger.maxWait(new int[] {5, 5, 100, 100, 200, 200, 300, 300, 400, 400}, new int[] {3, 12, 9, 1, 4, 5, 1, 9, 8, 15}));
		Assert.assertEquals(15, burger.maxWait(new int[] {3, 3, 3, 700, 700, 700}, new int[] {12, 3, 9, 13, 1, 15}));
		Assert.assertEquals(16, burger.maxWait(new int[] {3, 7, 15, 15, 20, 29, 40, 41, 42, 43, 100, 103, 103, 109, 344, 703, 707, 708}, 
				new int[] {3, 9, 6, 3, 6, 8, 2, 12, 5, 3, 6, 8, 8, 3, 9, 11, 1, 1}));
		Assert.assertEquals(0, burger.maxWait(new int[] {9}, new int[]  {3}));
		Assert.assertEquals(0, burger.maxWait(new int[] {100, 200, 300, 400, 500, 600, 700}, new int[] {1, 2, 3, 4, 5, 6, 7}));
		Assert.assertEquals(14, burger.maxWait(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new int[] {15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
		Assert.assertEquals(15, burger.maxWait(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new int[] {15, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1}));
		Assert.assertEquals(15, burger.maxWait(new int[] {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new int[] {15, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1}));
		Assert.assertEquals(16, burger.maxWait(new int[] {1, 2, 3, 4, 5, 6, 7, 7, 7, 10, 11, 12, 13, 14, 15}, new int[] {15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
		Assert.assertEquals(20, burger.maxWait(new int[] {1, 2, 3, 4, 7, 7, 7, 7, 10, 11, 12, 13, 14, 15}, new int[] {15, 1, 1, 1, 3, 3, 2, 3, 1, 1, 1, 1, 1, 1}));
		Assert.assertEquals(7, burger.maxWait(new int[] {2, 10, 12}, new int[] {15, 1, 5}));
		Assert.assertEquals(16, burger.maxWait(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]  {1, 1, 1, 1, 1, 10, 3, 6, 9}));
		Assert.assertEquals(33, burger.maxWait(new int[] {7, 7, 7, 7}, new int[]  {10, 15, 8, 10}));
		Assert.assertEquals(5, burger.maxWait(new int[] {1, 1, 1}, new int[] {3, 2, 2}));
		Assert.assertEquals(16, burger.maxWait(new int[] {3, 3, 5, 6, 6}, new int[] {3, 3, 3, 10, 10}));
		Assert.assertEquals(735, burger.maxWait(new int[] {720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720, 720}, 
		new int[] {15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15}));
		Assert.assertEquals(3, burger.maxWait(new int[] {3, 5, 5}, new int[] {1, 3, 1}));
	}
}

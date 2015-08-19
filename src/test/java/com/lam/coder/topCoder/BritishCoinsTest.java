package com.lam.coder.topCoder;


import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.BritishCoins;

public class BritishCoinsTest  {
	BritishCoins coins;
	
	@Before
	public void setUp() throws Exception {
		coins = new BritishCoins();
	}

	@After
	public void tearDown() throws Exception {
		coins = null;
	}

	@Test
	public void testCoins() {
		Assert.assertArrayEquals(new int[] {2, 4, 5}, coins.coins(533));
		Assert.assertArrayEquals(new int[] {0, 0, 0}, coins.coins(0));
		Assert.assertArrayEquals(new int[] {0, 0, 6}, coins.coins(6));
		Assert.assertArrayEquals(new int[] {17, 0, 11}, coins.coins(4091));
		Assert.assertArrayEquals(new int[] {41, 13, 4}, coins.coins(10000));
	}
	
	@Test
   public void tetCoinsSystemTest() {
		Assert.assertArrayEquals( new int[] {2, 4, 5} ,coins.coins( 	533));
		Assert.assertArrayEquals( new int[] {0, 0, 0} ,coins.coins(0));
		Assert.assertArrayEquals( new int[] {0, 0, 6} ,coins.coins(6));
		Assert.assertArrayEquals( new int[] {17, 0, 11} ,coins.coins(4091));
		Assert.assertArrayEquals( new int[] {41, 13, 4} ,coins.coins(10000));
		Assert.assertArrayEquals( new int[] {0, 6, 0} ,coins.coins(72));
		Assert.assertArrayEquals( new int[] {10, 0, 0} ,coins.coins(2400));
		Assert.assertArrayEquals( new int[] {2, 2, 0} ,coins.coins(504));
		Assert.assertArrayEquals( new int[] {0, 5, 1} ,coins.coins(61));
		Assert.assertArrayEquals( new int[] {0, 6, 4} ,coins.coins(76));
		Assert.assertArrayEquals( new int[] {2, 15, 9} ,coins.coins(669));
		Assert.assertArrayEquals( new int[] {3, 14, 1} ,coins.coins(889));
		Assert.assertArrayEquals( new int[] {5, 0, 1} ,coins.coins(1201));
		Assert.assertArrayEquals( new int[] {5, 8, 7} ,coins.coins(1303));
		Assert.assertArrayEquals( new int[] {5, 13, 7} ,coins.coins(1363));
		Assert.assertArrayEquals( new int[] {6, 4, 11} ,coins.coins(1499));
		Assert.assertArrayEquals( new int[] {6, 12, 0} ,coins.coins(1584));
		Assert.assertArrayEquals( new int[] {7, 13, 9} ,coins.coins(1845));
		Assert.assertArrayEquals( new int[] {7, 14, 1} ,coins.coins(1849));
		Assert.assertArrayEquals( new int[] {10, 15, 0} ,coins.coins(2580));
		Assert.assertArrayEquals( new int[] {11, 3, 6} ,coins.coins(2682));
		Assert.assertArrayEquals( new int[] {11, 14, 0} ,coins.coins(2808));
		Assert.assertArrayEquals( new int[] {14, 12, 1} ,coins.coins(3505));
		Assert.assertArrayEquals( new int[] {16, 8, 1} ,coins.coins(3937));
		Assert.assertArrayEquals( new int[] {16, 15, 2} ,coins.coins(4022));
		Assert.assertArrayEquals( new int[] {17, 8, 3} ,coins.coins(4179));
		Assert.assertArrayEquals( new int[] {17, 19, 11} ,coins.coins(4319));
		Assert.assertArrayEquals( new int[] {18, 5, 2} ,coins.coins(4382));
		Assert.assertArrayEquals( new int[] {21, 18, 5} ,coins.coins(5261));
		Assert.assertArrayEquals( new int[] {24, 4, 11} ,coins.coins(5819));
		Assert.assertArrayEquals( new int[] {27, 3, 8} ,coins.coins(6524));
		Assert.assertArrayEquals( new int[] {27, 10, 1} ,coins.coins(6601));
		Assert.assertArrayEquals( new int[] {29, 15, 8} ,coins.coins(7148));
		Assert.assertArrayEquals( new int[] {29, 17, 6} ,coins.coins(7170));
		Assert.assertArrayEquals( new int[] {29, 19, 4} ,coins.coins(7192));
		Assert.assertArrayEquals( new int[] {30, 9, 2} ,coins.coins(7310));
		Assert.assertArrayEquals( new int[] {30, 12, 0} ,coins.coins(7344));
		Assert.assertArrayEquals( new int[] {31, 4, 6} ,coins.coins(7494));
		Assert.assertArrayEquals( new int[] {31, 7, 9} ,coins.coins(7533));
		Assert.assertArrayEquals( new int[] {31, 18, 3} ,coins.coins(7659));
		Assert.assertArrayEquals( new int[] {33, 2, 2} ,coins.coins(7946));
		Assert.assertArrayEquals( new int[] {34, 6, 9} ,coins.coins(8241));
		Assert.assertArrayEquals( new int[] {36, 3, 9} ,coins.coins(8685));
		Assert.assertArrayEquals( new int[] {38, 1, 11} ,coins.coins(9143));
		Assert.assertArrayEquals( new int[] {38, 11, 6} ,coins.coins(9258));
		Assert.assertArrayEquals( new int[] {39, 12, 3} ,coins.coins(9507));
		Assert.assertArrayEquals( new int[] {40, 0, 0} ,coins.coins(9600));
		Assert.assertArrayEquals( new int[] {41, 10, 6} ,coins.coins(9966));
		Assert.assertArrayEquals( new int[] {41, 2, 10} ,coins.coins(9874));
		Assert.assertArrayEquals( new int[] {1, 0, 0} ,coins.coins(240));
		Assert.assertArrayEquals( new int[] {2, 4, 5} ,coins.coins(533));
		Assert.assertArrayEquals( new int[] {0, 19, 11} ,coins.coins(239));
		Assert.assertArrayEquals( new int[] {17, 0, 11} ,coins.coins(4091));
	}
}

package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.TriTravel;

public class TriTravelTest {
	TriTravel travel;
	
	@Before
	public void setUp() throws Exception {
		travel = new TriTravel();
	}

	@After
	public void tearDown() throws Exception {
		travel = null;
	}

	@Test
	public void testBestWayDown() {
		Assert.assertEquals(23, travel.bestWayDown( new int[] {1,6,7,4,-1,6,5,8,9,0}));
		Assert.assertEquals(23, travel.bestWayDown( new int[] {3,7,4,2,4,6,8,5,9,3}));
		Assert.assertEquals(17, travel.bestWayDown(new int[] {5, 4, 1, 2, 8, -1}));
	}

	@Test
	public void bestWayDownSystemTest() {
		Assert.assertEquals(23, travel.bestWayDown( new int[] {1,6,7,4,-1,6,5,8,9,0}));
		Assert.assertEquals(10, travel.bestWayDown(new int[] {10}));
		Assert.assertEquals(103, travel.bestWayDown(new int[] {3, 9, 0, 9, 0, 0, 9, 0, 0, 0, 9, 0, 0, 0, 100}));
		Assert.assertEquals(7, travel.bestWayDown(new int[] {5, 9, 2, 15, 12, 0, 13, 16, 0, 0, 21, 17, 0, 0, 0, -99, -99, -99, -99, -99, 0}));
		Assert.assertEquals(10, travel.bestWayDown(new int[] {6, 1, 1, 1, 1, 1, 1, 2, 1, 1}));
        Assert.assertEquals(34, travel.bestWayDown(new int[] {7, 8, 5, 4, 3, 2, 7, 6, 7, 8, 1, 3, 9, 6, 2}));
//		Assert.assertEquals(, travel.bestWayDown(new int[]));
	}
}

package com.lam.coder.topCoder;


import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Race;

public class RaceTest {
	Race race; 
	
	@Before
	public void setUp() throws Exception {
		race = new Race();
	}

	@After
	public void tearDown() throws Exception {
		race = null;
	}

	@Test
	public void testClosestCheckPoint() {
		Assert.assertEquals(2, race.closestCheckPoint(
			new int[]	{10,40,90}, 
			new int[]	{12,37,87},
			new int[]	{15,32,88}
				));

		Assert.assertEquals(3, race.closestCheckPoint(
				new int[]	{3,4,5,8}, 
				new int[]	{3,4,5,8}, 
				new int[]	{3,4,5,8}
					));
	}

	@Test
	public void closestCheckPointSystemTest() {
		Assert.assertEquals(1, race.closestCheckPoint(
				new int[] {0, 1, 2}, 
				new int[] {7, 8, 9},
				new int[] {12, 13, 17} 
					));
		Assert.assertEquals(0, race.closestCheckPoint(
				new int[] {0}, 
				new int[] {100},
				new int[] {1000} 
					));

		Assert.assertEquals(0, race.closestCheckPoint(
				new int[] {10, 5, 0}, 
				new int[] {1, 2, 3},
				new int[] {12, 20, 300}
					));
		Assert.assertEquals(1, race.closestCheckPoint(
				new int[] {10, 9, 8}, 
				new int[] {9, 9, 7},
				new int[] {3, 9, 2}
					));
		Assert.assertEquals(5, race.closestCheckPoint(
				new int[] {1, 2, 4, 6, 8, 19}, 
				new int[] {2, 6, 12, 15, 17, 19},
				new int[] {2, 0, 0, 0, 0, 20} 
					));
	}
}

package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Dice;

public class DiceTest {
	Dice dice;
	
	@Before
	public void setUp() throws Exception {
		dice = new Dice();
	}

	@After
	public void tearDown() throws Exception {
		dice = null;
	}

	@Test
	public void testGetScores() {
		Assert.assertArrayEquals(new int[] {39,2,0,1,13}, dice.getScores(5, new int[] {3,4,4,4,4,6,6,2,1,5,5}));
		Assert.assertArrayEquals(new int[] {27,2,0,1,13}, dice.getScores(5, new int[] {3,4,4,4,6,6,2,1,5,5}));
		Assert.assertArrayEquals(new int[] {5,5,17}, dice.getScores(3, new int[] {2,5,6,3,1,3,2,5,5,6}));
		Assert.assertArrayEquals(new int[] {5,5,3,2,10}, dice.getScores(5, new int[] {1,1,2,1,3,5,3,3,1,2,2,1,1}));
		Assert.assertArrayEquals(new int[] {3,2,12,10,0,0,0,0,0,0}, dice.getScores(10, new int[] {5,3,5,6,5,2,2,1,6,3,6}));
	}
	
	@Test
	public void scoresSystemTest() {
		Assert.assertArrayEquals(new int[] {6, 3, 6, 6}, dice.getScores(4, new int[] {2, 4, 6, 2, 4, 6, 2, 4, 6, 2, 4}));
		Assert.assertArrayEquals(new int[] {9, 9, 0}, dice.getScores(3, new int[] {1, 2, 3, 4, 5, 6, 1, 2, 3, 4}));
		Assert.assertArrayEquals(new int[] {16, 1, 0, 45}, dice.getScores(4, new int[] {5, 2, 6, 6, 6, 6, 5, 5, 4, 5}));
		Assert.assertArrayEquals(new int[] {4, 26, 1, 0, 0, 0, 0, 0}, dice.getScores(8, new int[] {5, 5, 3, 2, 2, 4, 1, 1, 1, 1, 1}));
		Assert.assertArrayEquals(new int[] {8, 1, 13}, dice.getScores(3, new int[] {2, 2, 3, 4, 5, 6, 5, 4, 2, 1, 2}));
	}

}

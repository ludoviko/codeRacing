package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.DiceChecker;

public class DiceCheckerTest {
	DiceChecker dice;
	
	@Before
	public void setUp() throws Exception {
		dice = new DiceChecker();
	}

	@After
	public void tearDown() throws Exception {
		dice = null;
	}

	@Test
	public void testBadValues() {
		Assert.assertArrayEquals(new int[] {}, dice.badValues(new int[] { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4 } ));
		Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, dice.badValues(new int[] { 3, 1, 5 }));
		Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, dice.badValues(new int[] { 1, 1, 1, 1, 1, 1, 1, 2, 2, 2 }));
		Assert.assertArrayEquals(new int[] {}, dice.badValues(new int[] { 1, 1, 3, 3, 4, 4, 2, 2, 5, 5, 6, 6 }));
	}
}

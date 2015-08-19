package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.NextRound;

public class NextRoundTest {
	NextRound round;

	@Before
	public void setUp() throws Exception {
		round = new NextRound();
	}

	@After
	public void tearDown() throws Exception {
		round = null;
	}

	@Test
	public void testFind() {
		Assert.assertEquals(6, round.find (7, new int[] { 10, 9, 8, 7, 7, 7, 5, 5 }));
		Assert.assertEquals(0, round.find (0, new int[] { 0, 0, 0, 0 }));
		Assert.assertEquals(5, round.find (1, new int[] { 1, 1, 1, 1, 1 }));
//		Assert.assertEquals(0, round.find (0, new int[] { 0, 0, 0, 0 }));
	}
}

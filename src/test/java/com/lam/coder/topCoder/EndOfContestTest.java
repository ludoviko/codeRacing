package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.EndOfContest;

import junit.framework.TestCase;

public class EndOfContestTest extends TestCase {

	EndOfContest contest;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		contest = new EndOfContest();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		contest = null;
	}

	@Test
	public void testCalcEarnings() {
		String[] expected;

		expected = new String[] { "ads: 6, 0", "talub: 1, 300",
				"romana: 2, 75", "mike: 7, 0", "td: 2, 75", "dok: 2, 75",
				"dwarfsleepy: 5, 0" };
		Assert.assertArrayEquals(expected, contest.calcEarnings(new String[] {
				"ads: 550.34", "talub: 2102.98", "romana: 1123.21",
				"mike: -1000.00", "td: 1123.21", "dok: 1123.21",
				"dwarfsleepy: 812.12" }, new int[] { 300, 150, 75 }));

		expected = new String[] { "buddy: 1, 10", "carl: 2, 0" };
		Assert.assertArrayEquals(
				expected,
				contest.calcEarnings(new String[] { "buddy: 100.00",
						"carl: 0.00", }, new int[] { 10, 20, 30 }));

		expected = new String[] { "a: 1, 214", "b: 1, 214", "c: 1, 214",
				"d: 1, 214", "e: 1, 214", "f: 1, 214", "g: 1, 214" };
		Assert.assertArrayEquals(
				expected,
				contest.calcEarnings(new String[] { "a: 100.00", "b: 100.00",
						"c: 100.00", "d: 100.00", "e: 100.00", "f: 100.00",
						"g: 100.00" }, new int[] { 1000, 500 }));
	}
}

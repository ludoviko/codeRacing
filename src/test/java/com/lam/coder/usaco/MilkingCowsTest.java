package com.lam.coder.usaco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.usaco.MilkingCows;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MilkingCowsTest extends TestCase {

	MilkingCows cows;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		cows = new MilkingCows();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		cows = null;
	}

	@Test
	public void testFindTimes() {
		Assert.assertEquals(
				"100 0",
				cows.findTimes(new String[] { "100 200" }));

		
		Assert.assertEquals(
				"900 300",
				cows.findTimes(new String[] { "300 1000", "300 1100", "700 1200",
						"1500 2100" }));
		
		Assert.assertEquals(
				"100 1",
				cows.findTimes(new String[] { "100 200", "201 301",
						"302 402", "403 503" }));
		
		Assert.assertEquals(
				"19 0",
				cows.findTimes(new String[] { 
						"2 3",
						"4 5",
						"6 7",
						"8 9",
						"10 11",
						"12 13",
						"14 15",
						"16 17",
						"18 19",
						"1 20"
						}));

		Assert.assertEquals(
				"1550 100",
				cows.findTimes(new String[] { 
						"100 200",
						"200 400",
						"400 800",
						"800 1600",
						"50 100",
						"1700 3200",
						}));
	}
}

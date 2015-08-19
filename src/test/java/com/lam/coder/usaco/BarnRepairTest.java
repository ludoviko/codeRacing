package com.lam.coder.usaco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.usaco.BarnRepair;

import junit.framework.Assert;
import junit.framework.TestCase;

public class BarnRepairTest extends TestCase {
	BarnRepair barn;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		barn = new BarnRepair();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		barn = null;
	}

	@Test
	public void testFindMinimumStallsBlocked() {
		Assert.assertEquals(25, barn.findMinimumStallsBlocked(4, 50, new int[] {
				3, 4, 6, 8, 14, 15, 16, 17, 21, 25, 26, 27, 30, 31, 40, 41, 42,
				43 }));

		Assert.assertEquals(
				20,
				barn.findMinimumStallsBlocked(3, 27, new int[] { 2, 3, 5, 6, 8,
						9, 10, 13, 14, 15, 16, 19, 20, 21, 22, 27 }));
	}
}

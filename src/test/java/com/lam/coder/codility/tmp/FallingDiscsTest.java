package com.lam.coder.codility.tmp;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.tmp.FallingDiscs;

public class FallingDiscsTest extends TestCase {

	FallingDiscs discs;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		discs = new FallingDiscs();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		discs = null;
	}

	@Test
	public void testSolution() {
		Assert.assertEquals(
				4,
				discs.solution(new int[] { 5, 6, 4, 3, 6, 2, 3 }, new int[] {
						2, 3, 5, 2, 4 }));

	}
}

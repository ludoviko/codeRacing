package com.lam.coder.codility;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.FrogRiverOne;

public class FrogRiverOneTest {
	FrogRiverOne frog;
	
	@Before
	public void setUp() throws Exception {
		frog = new FrogRiverOne();
	}

	@After
	public void tearDown() throws Exception {
		frog = null;
	}

	@Test
	public void testSolution() {
		Assert.assertEquals(6, frog.solution(5, new int[] { 1, 3, 4, 2, 2, 3, 5, 4,
				5 }));
		Assert.assertEquals(6, frog.solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4,
				5 }));
		Assert.assertEquals(7, frog.solution(5, new int[] { 1, 3, 1, 1, 2, 3, 5, 4,
				5 }));
	}
}

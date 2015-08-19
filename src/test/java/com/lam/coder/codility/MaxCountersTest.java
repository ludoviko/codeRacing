package com.lam.coder.codility;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.MaxCounters;

public class MaxCountersTest {
	MaxCounters counter;

	@Before
	public void setUp() throws Exception {
		counter = new MaxCounters();
	}

	@After
	public void tearDown() throws Exception {
		counter = null;
	}

	@Test
	public void testSolution() {
		Assert.assertArrayEquals(new int[] { 3, 2, 2, 4, 2 },
				counter.solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 }));
	}

}

package com.lam.coder.codility;

import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.GenomicRangeQuery;

public class GenomicRangeQueryTest {
	GenomicRangeQuery query;

	@Before
	public void setUp() throws Exception {
		query = new GenomicRangeQuery();
	}

	@After
	public void tearDown() throws Exception {
		query = null;
	}

	@Test
	public void testSolution() {
		boolean result = Arrays.equals(new int[] { 1, 1, 2, 4 }, query
				.solution("GACACCATA", new int[] { 0, 0, 4, 7 }, new int[] { 8,
						2, 5, 7 }));
		Assert.assertTrue(result);

		result = Arrays.equals(new int[] { 3, 3, 3, 3 }, query
				.solution("GGGGGGGGG", new int[] { 0, 0, 4, 7 }, new int[] { 8,
						2, 5, 7 }));
		Assert.assertTrue(result);
	}
}

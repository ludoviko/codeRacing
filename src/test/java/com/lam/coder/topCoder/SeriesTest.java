package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Series;

public class SeriesTest {
	Series series;
	int result;

	@Before
	public void setUp() throws Exception {
		series = new Series();
	}

	@After
	public void tearDown() throws Exception {
		series = null;
	}

	@Test
	public void testEmptyArray() {
		int[] array = new int[0];
		result = series.increasingLength(array);
		Assert.assertEquals("Error ", 0, result);
	}

	@Test
	public void testOneSizeArray() {
		int[] array = { 4 };
		result = series.increasingLength(array);
		Assert.assertEquals("Error ", 1, result);
	}

	@Test
	public void testTwoSizeArray() {
		int[] array = { 1, 0 };
		result = series.increasingLength(array);
		Assert.assertEquals("Error ", 1, result);
	}

	@Test
	public void testComplexArray() {
		int[] array = { -4, 5, 6, -2, 0, 4, 5, 9, 9, 1 };
		result = series.increasingLength(array);
		Assert.assertEquals("Error ", 5, result);
	}

	@Test
	public void testIncreasingArray() {
		int[] array = { 1, 2 };

		result = series.increasingLength(array);
		Assert.assertEquals("Error ", 2, result);

		array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		;
		result = series.increasingLength(array);
		Assert.assertEquals("Error ", 10, result);
	}

	@Test
	public void systemTest() {
		Assert.assertEquals("Error ", 1,
				series.increasingLength(new int[] { 9, 9, 9, -9 }));
		Assert.assertEquals("Error ", 3,
				series.increasingLength(new int[] { 3, 2, 1, 2, 3, 3 }));
		Assert.assertEquals("Error ", 2,
				series.increasingLength(new int[] { -1, 10, 8, 2, 4, 1 }));
		Assert.assertEquals("Error ", 1,
				series.increasingLength(new int[] { 10, 8, 2 }));
		Assert.assertEquals(
				"Error ",
				16,
				series.increasingLength(new int[] { 10, -98, -96, -94, -90,
						-80, -70, -60, -61, -40, -30, -20, -10, 0, 1, 2, 3, 4,
						5, 6, 7, 8, 9, 10, 9 }));
	}

}

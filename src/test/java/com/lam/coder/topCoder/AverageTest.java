package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Average;

public class AverageTest {
	Average average;

	@Before
	public void setUp() throws Exception {
		average = new Average();
	}

	@After
	public void tearDown() throws Exception {
		average = null;
	}

	@Test
	public void testBelowAvg() {
		Assert.assertEquals(
				2,
				average.belowAvg(new int[] { 200, 250, 700, 700 }, new int[] {
						400, 400, 400, 400 }));
		Assert.assertEquals(0, average.belowAvg(new int[] { 500, 400 },
				new int[] { 300, 400 }));
		Assert.assertEquals(0,
				average.belowAvg(new int[] { 293 }, new int[] { 799 }));
		Assert.assertEquals(6, average.belowAvg(new int[] { 400, 400, 400, 400,
				400, 400, 401 },
				new int[] { 400, 400, 400, 400, 400, 400, 400 }));
	}

	@Test
	public void belowAvgSystemTest() {
		Assert.assertEquals(
				2,
				average.belowAvg(new int[] { 200, 250, 700, 700 }, new int[] {
						400, 400, 400, 400 }));
		Assert.assertEquals(0, average.belowAvg(new int[] { 500, 400 },
				new int[] { 300, 400 }));
		Assert.assertEquals(0,
				average.belowAvg(new int[] { 293 }, new int[] { 799 }));
		Assert.assertEquals(6, average.belowAvg(new int[] { 400, 400, 400, 400,
				400, 400, 401 },
				new int[] { 400, 400, 400, 400, 400, 400, 400 }));
		Assert.assertEquals(0, average.belowAvg(new int[] { 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707 }, new int[] {
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707 }));
		Assert.assertEquals(49, average.belowAvg(new int[] { 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707 },
				new int[] { 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
						707, 707, 707, 707, 707, 707, 708, 707, 707, 707, 707,
						707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
						707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
						707, 707, 707, 707, 707, 707, 707 }));
		Assert.assertEquals(1, average.belowAvg(new int[] { 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 706, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707 }, new int[] {
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707, 707,
				707, 707 }));
		Assert.assertEquals(
				1,
				average.belowAvg(new int[] { 800, 300, 799 }, new int[] { 800,
						800, 800 }));
		Assert.assertEquals(
				1,
				average.belowAvg(new int[] { 350, 350, 450 }, new int[] { 350,
						450, 450 }));
		Assert.assertEquals(
				2,
				average.belowAvg(new int[] { 350, 351, 450 }, new int[] { 350,
						448, 450 }));
		Assert.assertEquals(3, average.belowAvg(new int[] { 249, 250, 250, 250,
				250, 250, 250, 250, 250, 250, 250, 250, 249, 253, 250, 250,
				250, 250, 250, 250, 250, 250, 250, 250, 250, 250, 250, 250,
				250, 250, 250, 250, 250, 250, 250, 250, 250, 250, 250, 250,
				250, 250, 250, 250, 250, 250, 250, 250, 249 }, new int[] { 250,
				250, 250, 250, 250, 250, 250, 250, 250, 250, 250, 250, 250,
				250, 250, 250, 250, 250, 250, 250, 250, 250, 250, 250, 250,
				250, 250, 250, 250, 250, 250, 250, 250, 250, 250, 250, 250,
				250, 250, 250, 250, 250, 250, 250, 250, 250, 250, 250, 250 }));
		Assert.assertEquals(
				3,
				average.belowAvg(new int[] { 400, 400, 400, 401 }, new int[] {
						400, 400, 400, 400 }));
		Assert.assertEquals(
				2,
				average.belowAvg(new int[] { 200, 300, 250, 400 }, new int[] {
						200, 400, 640, 245 }));
		Assert.assertEquals(
				3,
				average.belowAvg(new int[] { 400, 400, 400, 401 }, new int[] {
						400, 400, 400, 400 }));
		Assert.assertEquals(6, average.belowAvg(new int[] { 400, 400, 400, 400,
				400, 400, 401 },
				new int[] { 400, 400, 400, 400, 400, 400, 400 }));
		Assert.assertEquals(0, average.belowAvg(new int[] { 400, 400 },
				new int[] { 400, 400 }));
		Assert.assertEquals(
				2,
				average.belowAvg(new int[] { 300, 300, 300 }, new int[] { 300,
						302, 305 }));
		Assert.assertEquals(
				2,
				average.belowAvg(new int[] { 400, 400, 401 }, new int[] { 400,
						400, 400 }));
		Assert.assertEquals(6, average.belowAvg(new int[] { 400, 400, 400, 400,
				400, 400, 401 },
				new int[] { 400, 400, 400, 400, 400, 400, 400 }));
		Assert.assertEquals(6, average.belowAvg(new int[] { 400, 400, 400, 400,
				400, 400, 401 },
				new int[] { 400, 400, 400, 400, 400, 400, 400 }));
		Assert.assertEquals(1, average.belowAvg(new int[] { 400, 400 },
				new int[] { 400, 401 }));
		Assert.assertEquals(6, average.belowAvg(new int[] { 400, 400, 400, 400,
				400, 400, 401 },
				new int[] { 400, 400, 400, 400, 400, 400, 400 }));
		Assert.assertEquals(
				2,
				average.belowAvg(new int[] { 200, 200, 800 }, new int[] { 200,
						200, 800 }));
		Assert.assertEquals(
				2,
				average.belowAvg(new int[] { 300, 300, 300 }, new int[] { 300,
						302, 305 }));
		Assert.assertEquals(
				2,
				average.belowAvg(new int[] { 200, 200, 201 }, new int[] { 200,
						200, 200 }));
		Assert.assertEquals(0,
				average.belowAvg(new int[] { 200 }, new int[] { 200 }));
		Assert.assertEquals(4, average.belowAvg(new int[] { 201, 200, 200, 200,
				200 }, new int[] { 200, 200, 200, 200, 200 }));
		Assert.assertEquals(1, average.belowAvg(new int[] { 200, 201 },
				new int[] { 200, 200 }));
		Assert.assertEquals(
				2,
				average.belowAvg(new int[] { 200, 200, 201 }, new int[] { 200,
						200, 200 }));
		Assert.assertEquals(
				2,
				average.belowAvg(new int[] { 551, 440, 400 }, new int[] { 410,
						440, 400 }));
		Assert.assertEquals(
				1,
				average.belowAvg(new int[] { 300, 500, 500 }, new int[] { 300,
						500, 500 }));
		Assert.assertEquals(4, average.belowAvg(new int[] { 201, 200, 200, 200,
				200 }, new int[] { 200, 200, 200, 200, 200 }));
		Assert.assertEquals(
				2,
				average.belowAvg(new int[] { 551, 440, 400 }, new int[] { 410,
						440, 400 }));
		Assert.assertEquals(1, average.belowAvg(new int[] { 300, 301 },
				new int[] { 300, 300 }));
		Assert.assertEquals(
				2,
				average.belowAvg(new int[] { 200, 200, 201 }, new int[] { 200,
						200, 200 }));
		Assert.assertEquals(
				2,
				average.belowAvg(new int[] { 200, 200, 201 }, new int[] { 200,
						200, 200 }));
		Assert.assertEquals(6, average.belowAvg(new int[] { 400, 400, 400, 400,
				400, 400, 401 },
				new int[] { 400, 400, 400, 400, 400, 400, 400 }));
		Assert.assertEquals(
				1,
				average.belowAvg(new int[] { 400, 600, 800 }, new int[] { 400,
						600, 800 }));
	}

}

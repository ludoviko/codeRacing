package com.lam.coder.topCoder;

import org.junit.*;

import com.lam.coder.topCoder.EelAndRabbit;

public class EelAndRabbitTest {
	EelAndRabbit rabit;

	@Before
	public void setUp() throws Exception {
		rabit = new EelAndRabbit();
	}

	@After
	public void tearDown() throws Exception {
		rabit = null;
	}

	// In construction.
	@Ignore
	@Test
	public void testGetmax() {
		Assert.assertEquals(
				6,
				rabit.getmax(new int[] { 2, 4, 3, 2, 2, 1, 10 }, new int[] { 2,
						6, 3, 7, 0, 2, 0 }));
		Assert.assertEquals(2,
				rabit.getmax(new int[] { 1, 1, 1 }, new int[] { 2, 0, 4 }));
		Assert.assertEquals(1, rabit.getmax(new int[] { 1 }, new int[] { 1 }));
		Assert.assertEquals(7, rabit.getmax(new int[] { 8, 2, 1, 10, 8, 6, 3,
				1, 2, 5 }, new int[] { 17, 27, 26, 11, 1, 27, 23, 12, 11, 13 }));
		// Assert.assertEquals(0, rabit.getmax(new int[] , new int[]));
	}
}

package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.MagicSeries;

public class MagicSeriesTest {
	MagicSeries series;

	@Before
	public void setUp() throws Exception {
		series = new MagicSeries();
	}

	@After
	public void tearDown() throws Exception {
		series = null;
	}

	@Test
	public void testLookup() {
		Assert.assertEquals(0, series.lookup(1));
		Assert.assertEquals(2, series.lookup(2));
		Assert.assertEquals(26, series.lookup(20));
		// Assert.assertEquals(, series.lookup());
	}

	@Test
	public void lookupSystemTest() {
		Assert.assertEquals(20, series.lookup(15));
		Assert.assertEquals(26, series.lookup(20));
		Assert.assertEquals(12, series.lookup(10));
		Assert.assertEquals(1363634, series.lookup(999999));
	}
}

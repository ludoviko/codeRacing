package com.lam.coder.topCoder;

import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.MetricClock;

public class MetricClockTest {
	MetricClock clock;
	
	@Before
	public void setUp() throws Exception {
		clock = new MetricClock();
	}

	@After
	public void tearDown() throws Exception {
		clock = null;
	}

	@Test
	public void testConvertToMetric() {
		Assert.assertEquals("0:73:11", clock.convertToMetric("01:45:17"));
		Assert.assertEquals("1:37:32", clock.convertToMetric("03:17:45"));
		Assert.assertEquals("3:41:92", clock.convertToMetric("08:12:22"));
		Assert.assertEquals("5:00:00", clock.convertToMetric("12:00:00"));
		Assert.assertEquals("5:10:65", clock.convertToMetric("12:15:21"));
		Assert.assertEquals("8:32:62", clock.convertToMetric("19:58:59"));
		Assert.assertEquals("9:99:98", clock.convertToMetric("23:59:59"));
	}
	
	@Test
	public void convertToMetricSystemTest() {
		Assert.assertEquals("0:00:01", clock.convertToMetric("0:00:01"));
		Assert.assertEquals("0:00:03", clock.convertToMetric("0:00:03"));
		Assert.assertEquals("0:00:00", clock.convertToMetric("00:00:00"));
		Assert.assertEquals("9:99:98", clock.convertToMetric("23:59:59"));
		Assert.assertEquals("0:01:16", clock.convertToMetric("00:01:41"));
		Assert.assertEquals("7:36:00", clock.convertToMetric("17:39:51"));
		Assert.assertEquals("9:61:57", clock.convertToMetric("23:04:40"));
		Assert.assertEquals("2:59:74", clock.convertToMetric("06:14:02"));
		Assert.assertEquals("4:11:29", clock.convertToMetric("09:52:16"));
	}
}

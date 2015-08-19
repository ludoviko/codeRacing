package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.BadClock;
@Ignore
public class BadClockTest {
	BadClock clock;
	
	@Before
	public void setUp() throws Exception {
		clock = new BadClock();
	}

	@After
	public void tearDown() throws Exception {
		clock = null;
	}

	@Test
	public void testNextAgreement() {
		Assert.assertEquals(70.0, clock.nextAgreement("11:59:58", "12:03:28", -3));
		Assert.assertEquals(70.0, clock.nextAgreement("12:03:28", "11:59:58",  3));

		Assert.assertEquals(15.0, clock.nextAgreement("03:03:02", "03:01:47",  5));
		Assert.assertEquals(8625.0, clock.nextAgreement("03:03:02", "03:01:47",  -5));
//		Assert.assertEquals(0.0, clock.nextAgreement("", "",  3));
//		Assert.assertEquals(, clock.nextAgreement(, , ));
	}
}

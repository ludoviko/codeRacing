package com.lam.coder.topCoder;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.LongLongTripDiv2;
@Ignore
public class LongLongTripDiv2Test {

	LongLongTripDiv2 trip;
	
	@Before
	public void setUp() throws Exception {
		trip = new LongLongTripDiv2();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsAble() {
		Assert.assertEquals("Possible", trip.isAble(10, 6,3));
	}

}

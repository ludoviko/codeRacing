package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.ModEncoder;

public class ModEncoderTest {
	ModEncoder encoder;
	
	@Before
	public void setUp() throws Exception {
		encoder = new ModEncoder();
	}

	@After
	public void tearDown() throws Exception {
		encoder = null;
	}

	@Test
	public void testEncoder() {
		Assert.assertEquals("TC~AHOMGIDEESES~~DS~$", encoder.encoder("THIS CODED MESSAGE"));
		Assert.assertEquals("Tdsloe~~prc~C~o~oio~$", encoder.encoder("TopCoder is cool"));
	}

	@Test
	public void testEncoderSystemTest() {
		Assert.assertEquals("HaooRuWe~1~~~Y~$", encoder.encoder("HoW1 aRe You"));
		Assert.assertEquals("12345$", encoder.encoder("12345"));
		Assert.assertEquals("E2xraocwts$", encoder.encoder("Exact2rows"));
		Assert.assertEquals("Ls~tdioee49e~arilns05~tt~anygs16~~reoa~~a27~uyxrrlmg38~$", encoder.encoder("Let us try a extraordinarily long message0123456789"));
		Assert.assertEquals("1~~~~$", encoder.encoder("1"));
	}
}

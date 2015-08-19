package com.lam.coder.topCoder;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.DivisorDigits;

public class DivisorDigitsTest extends TestCase {
	DivisorDigits div;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		div = new DivisorDigits();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		div = null;
	}

	@Test
	public void testHowMany() {
		Assert.assertEquals(3, div.howMany(12345));
		Assert.assertEquals(3, div.howMany(661232));
		Assert.assertEquals(0, div.howMany(52527));
		Assert.assertEquals(0, div.howMany(730000000));
	}

	@Test
	public void testSystemTestHowMany() {
		Assert.assertEquals(3 ,div.howMany( 12345));
		Assert.assertEquals(5 ,div.howMany( 33333));
		Assert.assertEquals(3 ,div.howMany( 661232));
		Assert.assertEquals(0 ,div.howMany( 52527));
		Assert.assertEquals(1 ,div.howMany( 98765));
		Assert.assertEquals(0 ,div.howMany( 730000000));
		Assert.assertEquals(4 ,div.howMany( 273472734));
		Assert.assertEquals(9 ,div.howMany( 999999999));
		Assert.assertEquals(4 ,div.howMany( 918273645));
		Assert.assertEquals(3 ,div.howMany( 203948576));
		Assert.assertEquals(3 ,div.howMany( 102938475));
		Assert.assertEquals(7 ,div.howMany( 512667324));
		Assert.assertEquals(0 ,div.howMany( 227345383));
		Assert.assertEquals(3 ,div.howMany( 1622361));
		Assert.assertEquals(3 ,div.howMany( 32252));
		Assert.assertEquals(1 ,div.howMany( 100000));
		Assert.assertEquals(2 ,div.howMany( 124175603));
		Assert.assertEquals(8 ,div.howMany( 11111111));
		Assert.assertEquals(1 ,div.howMany( 1234567));
		Assert.assertEquals(1 ,div.howMany( 7000000));
		Assert.assertEquals(8 ,div.howMany( 12121212));
		Assert.assertEquals(1 ,div.howMany( 17000));
		Assert.assertEquals(1 ,div.howMany( 10000));
		Assert.assertEquals(1 ,div.howMany( 200001));
		Assert.assertEquals(1 ,div.howMany( 60000));
		Assert.assertEquals(5 ,div.howMany( 44444));
		Assert.assertEquals(6 ,div.howMany( 666666));
		Assert.assertEquals(2 ,div.howMany( 220000));
	}

}

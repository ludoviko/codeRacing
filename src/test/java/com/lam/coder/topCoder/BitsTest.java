package com.lam.coder.topCoder;


import junit.framework.TestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Bits;

public class BitsTest extends TestCase {
	Bits bits;
	
	@Override
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		this.bits = new Bits();
	}

	@Override
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		this.bits = null;
	}

	@Test
	public void testMinBits() {
		Assert.assertEquals(6, this.bits.minBits(32));
		Assert.assertEquals(4, this.bits.minBits(12));
		Assert.assertEquals(1, this.bits.minBits(1));
		Assert.assertEquals(11, this.bits.minBits(1500));
		Assert.assertEquals(0, this.bits.minBits(0));
	}

	@Test
	public void testMinBitsSysteTest() {
		Assert.assertEquals(6, this.bits.minBits(32));
		Assert.assertEquals(4, this.bits.minBits(12));
		Assert.assertEquals(1, this.bits.minBits(1));
		Assert.assertEquals(11, this.bits.minBits(1500));
		Assert.assertEquals(20, this.bits.minBits(1000000));
		Assert.assertEquals(10, this.bits.minBits(1023));
		Assert.assertEquals(19, this.bits.minBits(487664));
		Assert.assertEquals(20, this.bits.minBits(524288));
		Assert.assertEquals(9, this.bits.minBits(395));
		Assert.assertEquals(11, this.bits.minBits(1113));
		Assert.assertEquals(20, this.bits.minBits(897406));
		Assert.assertEquals(9, this.bits.minBits(287));
		Assert.assertEquals(17, this.bits.minBits(73634));
		Assert.assertEquals(20, this.bits.minBits(993999));
		Assert.assertEquals(20, this.bits.minBits(1000000));
		Assert.assertEquals(2, this.bits.minBits(2));
		Assert.assertEquals(1, this.bits.minBits(1));
		Assert.assertEquals(4, this.bits.minBits(8));
		Assert.assertEquals(20, this.bits.minBits(1000000));
		Assert.assertEquals(2, this.bits.minBits(2));
		Assert.assertEquals(1, this.bits.minBits(1));
		Assert.assertEquals(4, this.bits.minBits(8));
	}
}

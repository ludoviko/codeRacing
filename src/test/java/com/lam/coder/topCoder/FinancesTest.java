package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Finances;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FinancesTest extends TestCase {
	Finances finances; 
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		finances = new Finances();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		finances = null;
	}

	@Test
	public void testTimeLeftSystemTest() {
		Assert.assertEquals(7, finances.timeLeft(50, 10, 10));
		Assert.assertEquals(1, finances.timeLeft(100, 0, 100));
		Assert.assertEquals(0, finances.timeLeft(200, 1, 300));
		Assert.assertEquals(1200, finances.timeLeft(3453, 8, 200));
		Assert.assertEquals(1, finances.timeLeft(100, 20, 100));
		Assert.assertEquals(0, finances.timeLeft(2000, 10, 2300));
		Assert.assertEquals(1200, finances.timeLeft(100, 14, 1));
		Assert.assertEquals(1, finances.timeLeft(1, 50, 1));
	}
}

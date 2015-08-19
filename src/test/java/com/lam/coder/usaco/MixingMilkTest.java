package com.lam.coder.usaco;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.usaco.MixingMilk;

public class MixingMilkTest extends TestCase {
	MixingMilk milk;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		milk = new MixingMilk();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		milk = null;
	}

	@Test
	public void testFind() {
		String[] array = new String[] { "5 20", "9 40", "3 10", "8 80", "6 30" };
		Assert.assertEquals(630, MixingMilk.find(100, array));

		array = new String[] { "5 10", "5 10", "9 40", "3 10", "8 80", "6 10", "6 20" };
		Assert.assertEquals(630, MixingMilk.find(100, array));
	}
}

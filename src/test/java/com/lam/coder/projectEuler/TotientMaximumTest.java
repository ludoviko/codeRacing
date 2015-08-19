package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.TotientMaximum;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TotientMaximumTest extends TestCase {
	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testFind() {
		Assert.assertEquals(6, TotientMaximum.find(10));
		Assert.assertEquals(510510, TotientMaximum.find(1000000));
	}
}

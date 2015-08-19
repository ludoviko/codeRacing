package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.PandigitalMultiples;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PandigitalMultiplesTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testIsProduct() {
		Assert.assertEquals(932718654, PandigitalMultiples.isProduct());
	}
}

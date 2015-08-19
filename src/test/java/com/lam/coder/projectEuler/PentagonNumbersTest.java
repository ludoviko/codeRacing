package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.PentagonNumbers;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PentagonNumbersTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGo() {
		Assert.assertEquals(5482660, PentagonNumbers.find());
	}
}

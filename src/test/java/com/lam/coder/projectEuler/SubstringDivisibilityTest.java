package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.SubstringDivisibility;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SubstringDivisibilityTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testFindSum() {
		Assert.assertEquals(16695334890L, SubstringDivisibility.findSum());
	}

}
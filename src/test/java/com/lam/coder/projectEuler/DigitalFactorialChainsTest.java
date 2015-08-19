package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.projectEuler.DigitalFactorialChains;

import junit.framework.Assert;
import junit.framework.TestCase;

@Ignore
public class DigitalFactorialChainsTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}


    @Ignore
	@Test
	public void testFind() {
		Assert.assertEquals(402, DigitalFactorialChains.find());
	}

}

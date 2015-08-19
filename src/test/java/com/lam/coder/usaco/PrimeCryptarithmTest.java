package com.lam.coder.usaco;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.usaco.PrimeCryptarithm;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PrimeCryptarithmTest extends TestCase {

	PrimeCryptarithm crypta;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		crypta = new PrimeCryptarithm();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		crypta = null;
	}

	@Test
	public void testFind() {
		Assert.assertEquals(1, crypta.find("23468"));
		Assert.assertEquals(384, crypta.find("1234567"));
		
	}

}

package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.HowEasy;

import junit.framework.Assert;
import junit.framework.TestCase;

public class HowEasyTest extends TestCase {
	
	HowEasy  easy;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		easy = new HowEasy();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		easy = null;
	}

	@Test
	public void testPointVal() {
		Assert.assertEquals(500, easy.pointVal("This is a problem statement"));
		Assert.assertEquals(500, easy.pointVal("       This     is a problem statement"));
		Assert.assertEquals(250, easy.pointVal("523hi."));
		Assert.assertEquals(500, easy.pointVal("Implement a class H5 which contains some method."));
		Assert.assertEquals(250, easy.pointVal(" no9 . wor7ds he8re. hj.."));
		Assert.assertEquals(1000, easy.pointVal("Develop greats solutions "));
	}

}

package com.lam.coder.codeeval;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeeval.BitsPositions;

public class BitsPositionsTest {
	BitsPositions bitsPositions;
	
	@Before
	public void setUp() throws Exception {
		this.bitsPositions = new BitsPositions();
	}

	@After
	public void tearDown() throws Exception {
		this.bitsPositions  = null;
	}

	@Test(timeout = 10000)
	public void test() {
		Assert.assertTrue(this.bitsPositions.find(86,2,3));
		Assert.assertFalse(this.bitsPositions.find(125,1,2));
	}
}

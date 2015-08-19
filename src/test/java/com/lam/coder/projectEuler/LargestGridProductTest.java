package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.LargestGridProduct;

import junit.framework.Assert;
import junit.framework.TestCase;

public class LargestGridProductTest extends TestCase {

	private LargestGridProduct grid;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		grid = new LargestGridProduct(); 
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		grid = null;
	}

	@Test
	public void testcalCulateMaxAmongProducts() {
		Assert.assertEquals(70600674, grid.calculateMaxAmongProducts());
	}

}

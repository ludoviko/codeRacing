package com.lam.coder.projectEuler;

import org.junit.Test;

import com.lam.coder.projectEuler.LargestProductInASeries;

import junit.framework.Assert;
import junit.framework.TestCase;


public class LargestProductInASeriesTest extends TestCase {
	private LargestProductInASeries product;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		product = new LargestProductInASeries(); 
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		product = null;
	}

	@Test
	public void testProduct() {
		Assert.assertEquals(40824, product.go());
	}
	
	
	
}

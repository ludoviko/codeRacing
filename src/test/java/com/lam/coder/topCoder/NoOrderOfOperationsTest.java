package com.lam.coder.topCoder;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.NoOrderOfOperations;


public class NoOrderOfOperationsTest extends TestCase {

	private NoOrderOfOperations operation;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		operation  = new NoOrderOfOperations();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
		operation = null;
	}

	@Test
	public void testEvaluate() {
		Assert.assertEquals(56, operation.evaluate("3+5*7"));
		Assert.assertEquals(-36, operation.evaluate("4-8*9*1"));
		Assert.assertEquals(0, operation.evaluate("0"));
		Assert.assertEquals(362880, operation.evaluate("1*2*3*4*5*6*7*8*9"));
	}
	
	@Test
	public void testEvaluateSystemTest() {
		Assert.assertEquals(56, operation.evaluate("3+5*7"));
		Assert.assertEquals(-36, operation.evaluate("4-8*9*1"));
		Assert.assertEquals(0, operation.evaluate("0"));
		Assert.assertEquals(362880, operation.evaluate("1*2*3*4*5*6*7*8*9"));
		Assert.assertEquals(0, operation.evaluate("5-7*9+2*0"));
		Assert.assertEquals(387420489, operation.evaluate("9*9*9*9*9*9*9*9*9"));
		Assert.assertEquals(306, operation.evaluate("9+8*3*2*3"));
		Assert.assertEquals(16, operation.evaluate("5+0+8+2+1"));
		Assert.assertEquals(123, operation.evaluate("1*9-3*3*7-9+5+1"));
		Assert.assertEquals(126, operation.evaluate("7*9*2*1"));
		Assert.assertEquals(2, operation.evaluate("7*9-2*0+2"));
		Assert.assertEquals(23, operation.evaluate("4*4+7"));
		Assert.assertEquals(-21, operation.evaluate("8-5-4-7*2-9+6-2"));
		Assert.assertEquals(-7, operation.evaluate("8*5-1+9-0+7*0-7"));
		Assert.assertEquals(15, operation.evaluate("6+2-3*3"));
		Assert.assertEquals(15, operation.evaluate("6-4+1*1+6+6"));
		Assert.assertEquals(-57, operation.evaluate("3*0*5*8-2*9-1*3"));
		Assert.assertEquals(-15, operation.evaluate("1-3*6-8+9+4-0-8"));
		Assert.assertEquals(14, operation.evaluate("1+5+5+3-9+9"));
		Assert.assertEquals(280, operation.evaluate("5*6*9+3-2+9"));
		Assert.assertEquals(36, operation.evaluate("3+4+1+8-7*4"));
		Assert.assertEquals(0, operation.evaluate("0+7-2*0"));
		Assert.assertEquals(-1, operation.evaluate("6-7"));
		Assert.assertEquals(147, operation.evaluate("1+1*8+6*7-2-5+0"));
		Assert.assertEquals(30, operation.evaluate("6*5+0*1"));
		Assert.assertEquals(12, operation.evaluate("5-1*3"));
		Assert.assertEquals(-12, operation.evaluate("6+4-7-9-4+3-5-0"));
		Assert.assertEquals(79, operation.evaluate("7+2+4+8*4+4-9"));
		Assert.assertEquals(1084, operation.evaluate("2+6*3*9*5+5-7+6"));
		Assert.assertEquals(6, operation.evaluate("3-3*4+5*1+9-3-5"));
		Assert.assertEquals(15, operation.evaluate("9+6*1"));
		Assert.assertEquals(4, operation.evaluate("5-1-0"));
		Assert.assertEquals(54, operation.evaluate("4+2*9"));
		Assert.assertEquals(8, operation.evaluate("7+3-2-1+6-8-5+8"));
		Assert.assertEquals(24, operation.evaluate("6-2+8-8*6"));
		Assert.assertEquals(21, operation.evaluate("8*2+7-2"));
		Assert.assertEquals(-22, operation.evaluate("0*2-7-1+6*9-4"));
		Assert.assertEquals(0, operation.evaluate("8+0-2-8-0-1+3*9"));
		Assert.assertEquals(1560, operation.evaluate("2*7*7-4+1*2+4*8+8"));
		Assert.assertEquals(26, operation.evaluate("5-4*2*9+8"));
		Assert.assertEquals(12, operation.evaluate("2*6"));
		Assert.assertEquals(33, operation.evaluate("5*6+3"));
		Assert.assertEquals(-99, operation.evaluate("4-8*9*1+5-2*3"));
		Assert.assertEquals(362880, operation.evaluate("1*2*3*4*5*6*7*8*9"));
		Assert.assertEquals(8, operation.evaluate("8"));
		Assert.assertEquals(5, operation.evaluate("5"));
		Assert.assertEquals(43046721, operation.evaluate("9*9*9*9*9*9*9*9"));
		Assert.assertEquals(-103, operation.evaluate("5-7-4-6-7-8+2*4-3"));
	}

}

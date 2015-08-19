package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.RPN;

import junit.framework.Assert;
import junit.framework.TestCase;

public class RPNTest extends TestCase {

	RPN rpn;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		rpn = new RPN();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		rpn = null;
	}

	@Test
	public void testEvaluate() {
		Assert.assertEquals(47, rpn.evaluate("2 3 + 6 ~ 7 * -"));
		Assert.assertEquals(-5, rpn.evaluate("5 ~ ~ ~"));
		Assert.assertEquals(505, rpn.evaluate("9 8 7 * * 4 5 - -"));
		Assert.assertEquals(-999, rpn.evaluate("1 + 2 + 3"));
		Assert.assertEquals(-999, rpn.evaluate("1 9 ~ 2 8 * +"));
	}

}

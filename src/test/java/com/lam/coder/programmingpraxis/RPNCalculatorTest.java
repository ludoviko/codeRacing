package com.lam.coder.programmingpraxis;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.programmingpraxis.RPNCalculator;

public class RPNCalculatorTest {
	RPNCalculator rpn;
	
	@Before
	public void setUp() throws Exception {
		rpn = new RPNCalculator();
	}

	@After
	public void tearDown() throws Exception {
		rpn = null;
	}

	@Test
	public void testEvaluate() throws Exception {
		Assert.assertEquals(85.2974, rpn.evaluate("19 2.14 + 4.5 2 4.3 / - *"), 0.0001);
		Assert.assertEquals(47, rpn.evaluate("2 3 + 6 ~ 7 * -"), 0.0001);
		Assert.assertEquals(-5, rpn.evaluate("5 ~ ~ ~"), 0.0001);
		Assert.assertEquals(505, rpn.evaluate("9 8 7 * * 4 5 - -"), 0.0001);
	}


	@Test(expected= Exception.class)
	public void testEvaluateException() throws Exception {
		Assert.assertEquals(-999, rpn.evaluate("1 + 2 + 3"), 0.0001);
		Assert.assertEquals(-999, rpn.evaluate("1 9 ~ 2 8 * +"), 0.0001);
	}

}

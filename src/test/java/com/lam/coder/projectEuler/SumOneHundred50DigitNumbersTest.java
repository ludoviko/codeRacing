package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.SumOneHundred50DigitNumbers;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SumOneHundred50DigitNumbersTest extends TestCase {
	SumOneHundred50DigitNumbers sum;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		sum = new SumOneHundred50DigitNumbers();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		sum = null;
	}

	@Test
	public void testGetSum() {
		sum.go();
		Assert.assertEquals("5537376230393663730204874683298597176855159831892672", sum.getSum());
	}

}

package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.DigitFactorials;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DigitFactorialsTest extends TestCase {
	DigitFactorials factorial;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		factorial = new DigitFactorials();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		factorial = null;
	}

	@Test
	public void testGetSum() {
		Assert.assertEquals(40730, factorial.getSum());
	}

}

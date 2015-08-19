package com.lam.coder.projectEuler;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.QuadraticPrimes;


public class QuadraticPrimesTest extends TestCase {

	private QuadraticPrimes quadratic;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		quadratic = new QuadraticPrimes();
	}

	@After
	public void tearDown() throws Exception {
		quadratic = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(-59231, quadratic.checkFormula(1000));
	}
}

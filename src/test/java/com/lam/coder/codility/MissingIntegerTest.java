package com.lam.coder.codility;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.MissingInteger;

public class MissingIntegerTest {
	MissingInteger missingInteger;

	@Before
	public void setUp() throws Exception {
		missingInteger = new MissingInteger();
	}

	@After
	public void tearDown() throws Exception {
		missingInteger = null;
	}

	@Test
	public void testSolution() {
		Assert.assertEquals(4, missingInteger.solution(2,3,1,5));
	}

}

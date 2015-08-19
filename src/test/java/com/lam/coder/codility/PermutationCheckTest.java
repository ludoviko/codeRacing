package com.lam.coder.codility;

import org.junit.Assert;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.PermutationCheck;

public class PermutationCheckTest extends TestCase {
	PermutationCheck permuta;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		permuta = new PermutationCheck();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		permuta = null;
	}

	@Test
	public void testSolution_1() {
		Assert.assertEquals(1, permuta.solution(new int[] { 4, 1, 3, 2 }));
	}

	@Test
	public void testSolution_0() {
		Assert.assertEquals(0, permuta.solution(new int[] { 4, 1, 3 }));
	}
}

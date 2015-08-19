package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.LexicographicPermutations;

import junit.framework.Assert;
import junit.framework.TestCase;

public class LexicographicPermutationsTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGo() {
		Assert.assertEquals("2783915460", LexicographicPermutations.go());
	}

}

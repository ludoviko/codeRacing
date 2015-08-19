package com.lam.coder.usaco;


import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.usaco.DualPalindromes;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DualPalindromesTest extends TestCase {

	DualPalindromes dual;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		dual = new DualPalindromes();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		dual = null;
	}

	@Test
	public void testFind() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(26);
		expected.add(27);
		expected.add(28);
		dual.find(25, 3);
		Assert.assertEquals( expected, dual.getKeys());
	}
	
}

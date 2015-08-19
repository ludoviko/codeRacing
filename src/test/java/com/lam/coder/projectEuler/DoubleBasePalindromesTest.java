package com.lam.coder.projectEuler;


import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.DoubleBasePalindromes;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DoubleBasePalindromesTest extends TestCase {
	DoubleBasePalindromes palis;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		palis = new DoubleBasePalindromes(
				new ArrayList<Integer>());}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		palis = null;
	}

	@Test
	public void testFind() {
		Assert.assertEquals(872187, palis.find());
	}

}

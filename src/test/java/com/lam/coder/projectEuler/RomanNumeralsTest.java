package com.lam.coder.projectEuler;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.RomanNumerals;

import junit.framework.Assert;
import junit.framework.TestCase;

public class RomanNumeralsTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testFind() throws FileNotFoundException, IOException {
		Assert.assertEquals(743, RomanNumerals.find());
	}
}

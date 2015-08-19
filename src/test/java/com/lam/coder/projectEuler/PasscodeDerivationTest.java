package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.PasscodeDerivation;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PasscodeDerivationTest extends TestCase {

	PasscodeDerivation passcode;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		passcode = new PasscodeDerivation();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		passcode = null;
	}

	@Test
	public void testFind() {
		Assert.assertEquals("73162890", passcode.find());
	}
}

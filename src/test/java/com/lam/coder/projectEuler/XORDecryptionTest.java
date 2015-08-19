package com.lam.coder.projectEuler;


import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.XORDecryption;

import junit.framework.Assert;
import junit.framework.TestCase;

public class XORDecryptionTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testFind() {
		try {
			Assert.assertEquals(107359, XORDecryption.find());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

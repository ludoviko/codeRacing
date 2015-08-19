package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.LongestCollatzSequence;

import junit.framework.Assert;
import junit.framework.TestCase;

public class LongestCollatzSequenceTest extends TestCase {
	LongestCollatzSequence collatz; 
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		collatz = new LongestCollatzSequence();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		collatz = null;
	}

	@Test
	public void testFind() {
		Assert.assertEquals(new Long(837799), collatz.find().get(0));
	}

}

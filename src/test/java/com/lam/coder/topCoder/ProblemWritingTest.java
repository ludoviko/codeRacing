package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.ProblemWriting;

import junit.framework.Assert;
import junit.framework.TestCase;
@Ignore
public class ProblemWritingTest extends TestCase {
	ProblemWriting writing;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		writing = new ProblemWriting();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		writing = null;
	}

	@Test
	public void testMyCheckData() {
		Assert.assertEquals("", writing.myCheckData("3+5"));
		Assert.assertEquals("", writing.myCheckData("3...........+...........4"));
		Assert.assertEquals(ProblemWriting.ERROR, writing.myCheckData("5.3+4"));
		Assert.assertEquals("", writing.myCheckData("9..+.5...*....3"));
		Assert.assertEquals(ProblemWriting.ERROR_25, writing.myCheckData("9*9*9*9*9*9*9*9*9*9*9*9*9*9"));
	}

}

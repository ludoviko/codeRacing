package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.HelpfulMaths;

public class HelpfulMathsTest {
	HelpfulMaths helpfulMaths;
	
	@Before
	public void setUp() throws Exception {
		this.helpfulMaths = new HelpfulMaths();
	}

	@After
	public void tearDown() throws Exception {
		this.helpfulMaths  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("1+2+3", this.helpfulMaths.find("3+2+1"));
		Assert.assertEquals("1+1+1+3+3", this.helpfulMaths.find("1+1+3+1+3"));
		Assert.assertEquals("2", this.helpfulMaths.find("2"));
	}
}

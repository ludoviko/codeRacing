package com.lam.coder.codeeval;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeeval.StringMask;

public class StringMaskTest {
	StringMask stringMask;
	
	@Before
	public void setUp() throws Exception {
		this.stringMask = new StringMask();
	}

	@After
	public void tearDown() throws Exception {
		this.stringMask  = null;
	}

	@Test(timeout = 10000)
	public void test() {
		Assert.assertEquals("HEllO", this.stringMask.find("hello 11001"));
		Assert.assertEquals("World", this.stringMask.find("world 10000"));
		Assert.assertEquals("CBA", this.stringMask.find("cba 111"));
	}
}

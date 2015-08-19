package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.Twins;

public class TwinsTest {
	Twins twins;
	
	@Before
	public void setUp() throws Exception {
		this.twins = new Twins();
	}

	@After
	public void tearDown() throws Exception {
		this.twins  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(2, this.twins.find("3 3"));
		Assert.assertEquals(1, this.twins.find("1"));
		Assert.assertEquals(2, this.twins.find("2 1 2"));
	}
}

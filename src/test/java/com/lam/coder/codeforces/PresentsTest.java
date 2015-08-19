package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.Presents;

public class PresentsTest {
	Presents presents;
	
	@Before
	public void setUp() throws Exception {
		this.presents = new Presents();
	}

	@After
	public void tearDown() throws Exception {
		this.presents  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("4 1 2 3", this.presents.find("2 3 4 1"));
		Assert.assertEquals("1 3 2", this.presents.find("1 3 2"));
		Assert.assertEquals("1 2", this.presents.find("1 2"));
//		Assert.assertEquals("", presents.find(""));
	}
}

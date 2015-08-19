package com.lam.coder.codeeval;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeeval.Main;

public class MainTest {
	Main main;
	
	@Before
	public void setUp() throws Exception {
		this.main = new Main();
	}

	@After
	public void tearDown() throws Exception {
		this.main  = null;
	}

	@Test(timeout = 10000)
	public void test() {
//		Assert.assertEquals(0, this.main);
//		Assert.assertEquals("", main.);
//		Assert.assertArrayEquals(new int[] {}, main.);
//		Assert.assertArrayEquals(new String[] {}, main.);
	}
}


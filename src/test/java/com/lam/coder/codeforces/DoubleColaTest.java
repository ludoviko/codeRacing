package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.DoubleCola;

public class DoubleColaTest {
	DoubleCola doubleCola;
	
	@Before
	public void setUp() throws Exception {
		this.doubleCola = new DoubleCola();
	}

	@After
	public void tearDown() throws Exception {
		this.doubleCola  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("Sheldon", this.doubleCola.find(1));
		Assert.assertEquals("Sheldon", this.doubleCola.find(6));
		Assert.assertEquals("Penny", this.doubleCola.find(1802));
//		Assert.assertEquals("", doubleCola.find(0));
	}
}

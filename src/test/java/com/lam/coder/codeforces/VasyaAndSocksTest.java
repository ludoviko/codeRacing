package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.VasyaAndSocks;

public class VasyaAndSocksTest {
	VasyaAndSocks vasyaAndSocks;
	
	@Before
	public void setUp() throws Exception {
		this.vasyaAndSocks = new VasyaAndSocks();
	}

	@After
	public void tearDown() throws Exception {
		this.vasyaAndSocks  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(3, this.vasyaAndSocks.find("2 2"));
		Assert.assertEquals(13, this.vasyaAndSocks.find("9 3"));
		Assert.assertEquals(19, this.vasyaAndSocks.find("10 2"));
//		Assert.assertEquals(0, this.vasyaAndSocks.find(""));
	}
}

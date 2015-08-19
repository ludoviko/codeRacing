package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.NearlyLuckyNumber;

public class NearlyLuckyNumberTest {
	NearlyLuckyNumber nearlyLuckyNumber;
	
	@Before
	public void setUp() throws Exception {
		this.nearlyLuckyNumber = new NearlyLuckyNumber();
	}

	@After
	public void tearDown() throws Exception {
		this.nearlyLuckyNumber  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("NO", this.nearlyLuckyNumber.find("40047"));
		Assert.assertEquals("YES", this.nearlyLuckyNumber.find("7747774"));
		Assert.assertEquals("NO", this.nearlyLuckyNumber.find("1000000000000000000"));
	}
}

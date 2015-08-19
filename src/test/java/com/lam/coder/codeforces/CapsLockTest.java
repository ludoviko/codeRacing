package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.CapsLock;

public class CapsLockTest {
	CapsLock capsLock;
	
	@Before
	public void setUp() throws Exception {
		this.capsLock = new CapsLock();
	}

	@After
	public void tearDown() throws Exception {
		this.capsLock  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("Lock", this.capsLock.correct("Lock"));
		Assert.assertEquals("Hello", this.capsLock.correct("hELLO"));
		Assert.assertEquals("http", this.capsLock.correct("HTTP"));
		Assert.assertEquals("Z", this.capsLock.correct("z"));
		Assert.assertEquals("z", this.capsLock.correct("Z"));
	}
}

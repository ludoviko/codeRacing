package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.LinelandMail;

public class LinelandMailTest {
	LinelandMail linelandMail;
	
	@Before
	public void setUp() throws Exception {
		this.linelandMail = new LinelandMail();
	}

	@After
	public void tearDown() throws Exception {
		this.linelandMail  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("3 12", this.linelandMail.find(0, new Long[] {-5L, -2L, 2L, 7L}));
		Assert.assertEquals("3 9", this.linelandMail.find(1, new Long[] {-5L, -2L, 2L, 7L}));
		Assert.assertEquals("4 7", this.linelandMail.find(2, new Long[] {-5L, -2L, 2L, 7L}));
		Assert.assertEquals("5 12", this.linelandMail.find(3, new Long[] {-5L, -2L, 2L, 7L}));
		Assert.assertEquals("2 2", this.linelandMail.find(0, new Long[] {-1L, 1L}));
		Assert.assertEquals("2 2", this.linelandMail.find(1, new Long[] {-1L, 1L}));
		Assert.assertEquals("2000000000 2000000000", this.linelandMail.find(0, new Long[] {-1000000000L, 1000000000L}));
        Assert.assertEquals("2000000000 2000000000", this.linelandMail.find(1, new Long[] {-1000000000L, 1000000000L}));
	}
}

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
		Assert.assertEquals("3 12", this.linelandMail.find(0, new long[] {-5, -2, 2, 7}));
		Assert.assertEquals("3 9", this.linelandMail.find(1, new long[] {-5, -2, 2, 7}));
		Assert.assertEquals("4 7", this.linelandMail.find(2, new long[] {-5, -2, 2, 7}));
		Assert.assertEquals("5 12", this.linelandMail.find(3, new long[] {-5, -2, 2, 7}));
		Assert.assertEquals("2 2", this.linelandMail.find(0, new long[] {-1, 1}));
		Assert.assertEquals("2 2", this.linelandMail.find(1, new long[] {-1, 1}));
//		Assert.assertEquals("", linelandMail.);
//		Assert.assertArrayEquals(new int[] {}, linelandMail.);
//		Assert.assertArrayEquals(new String[] {}, linelandMail.);
	}
}

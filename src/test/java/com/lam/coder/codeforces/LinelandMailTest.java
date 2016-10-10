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
		linelandMail = new LinelandMail();
	}

	@After
	public void tearDown() throws Exception {
		linelandMail  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("3 12", LinelandMail.find(0, new long[] {-5L, -2L, 2L, 7L}));
		Assert.assertEquals("3 9", LinelandMail.find(1, new long[] {-5L, -2L, 2L, 7L}));
		Assert.assertEquals("4 7", LinelandMail.find(2, new long[] {-5L, -2L, 2L, 7L}));
		Assert.assertEquals("5 12", LinelandMail.find(3, new long[] {-5L, -2L, 2L, 7L}));
		Assert.assertEquals("2 2", LinelandMail.find(0, new long[] {-1L, 1L}));
		Assert.assertEquals("2 2", LinelandMail.find(1, new long[] {-1L, 1L}));
		Assert.assertEquals("2000000000 2000000000", LinelandMail.find(0, new long[] {-1000000000L, 1000000000L}));
        Assert.assertEquals("2000000000 2000000000", LinelandMail.find(1, new long[] {-1000000000L, 1000000000L}));

        Assert.assertEquals("9 9122", LinelandMail.find(0, new long[] {1L, 10L, 12L, 15L, 59L, 68L, 130L, 912L, 1239L, 9123}));
        Assert.assertEquals("2 9113", LinelandMail.find(1, new long[] {1L, 10L, 12L, 15L, 59L, 68L, 130L, 912L, 1239L, 9123}));
        Assert.assertEquals("2 9111", LinelandMail.find(2, new long[] {1L, 10L, 12L, 15L, 59L, 68L, 130L, 912L, 1239L, 9123}));
        Assert.assertEquals("3 9108", LinelandMail.find(3, new long[] {1L, 10L, 12L, 15L, 59L, 68L, 130L, 912L, 1239L, 9123}));
        Assert.assertEquals("9 9064", LinelandMail.find(4, new long[] {1L, 10L, 12L, 15L, 59L, 68L, 130L, 912L, 1239L, 9123}));
        Assert.assertEquals("9 9055", LinelandMail.find(5, new long[] {1L, 10L, 12L, 15L, 59L, 68L, 130L, 912L, 1239L, 9123}));
        Assert.assertEquals("62 8993", LinelandMail.find(6, new long[] {1L, 10L, 12L, 15L, 59L, 68L, 130L, 912L, 1239L, 9123}));
        Assert.assertEquals("327 8211", LinelandMail.find(7, new long[] {1L, 10L, 12L, 15L, 59L, 68L, 130L, 912L, 1239L, 9123}));
        Assert.assertEquals("327 7884", LinelandMail.find(8, new long[] {1L, 10L, 12L, 15L, 59L, 68L, 130L, 912L, 1239L, 9123}));
        Assert.assertEquals("7884 9122", LinelandMail.find(9, new long[] {1L, 10L, 12L, 15L, 59L, 68L, 130L, 912L, 1239L, 9123}));
	}
}

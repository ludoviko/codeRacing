package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.AlephNull;

public class AlephNullTest {
	AlephNull aleph;
	
	@Before
	public void setUp() throws Exception {
		aleph = new AlephNull();
	}

	@After
	public void tearDown() throws Exception {
		aleph = null;
	}

	@Test
	public void testRational() {
		Assert.assertArrayEquals(new int[] {0, 1}, aleph.rational(1, 0));
	    Assert.assertArrayEquals(new int[] {1, 0}, aleph.rational(1, 1));
	    Assert.assertArrayEquals(new int[] {0, 0}, aleph.rational(1, 2));
	    Assert.assertArrayEquals(new int[] {1, 3}, aleph.rational(4, 1));
	    Assert.assertArrayEquals(new int[] {2, 1}, aleph.rational(4, 6));
	    Assert.assertArrayEquals(new int[] {5, 3}, aleph.rational(5, 11));
	    Assert.assertArrayEquals(new int[] {9, 7}, aleph.rational(8, 70));
	    }

	@Test
	public void testRationalLong() {
	    Assert.assertArrayEquals(new int[] {43, 12}, aleph.rational(10, 467));
	//    Assert.assertArrayEquals(new int[] {438, 43}, aleph.rational(23, 4190316));
	//    Assert.assertArrayEquals(new int[] {7, 157}, aleph.rational(30, 100));
	    }

}

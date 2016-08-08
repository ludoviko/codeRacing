package com.lam.coder.codeforces;

import org.junit.*;

import com.lam.coder.codeforces.DreamoonAndStairs;

public class DreamoonAndStairsTest {
	DreamoonAndStairs dreamoonAndStairs;
	
	@Before
	public void setUp() throws Exception {
		dreamoonAndStairs = new DreamoonAndStairs();
	}

	@After
	public void tearDown() throws Exception {
		dreamoonAndStairs  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(6, dreamoonAndStairs.find(10, 2));
		Assert.assertEquals(6, dreamoonAndStairs.find(12, 2));
		Assert.assertEquals(6, dreamoonAndStairs.find(11, 2));
		Assert.assertEquals(10, dreamoonAndStairs.find(11, 5));
		Assert.assertEquals(-1, dreamoonAndStairs.find(3, 5));
		Assert.assertEquals(1920, dreamoonAndStairs.find(3832, 6));

//		Assert.assertEquals(0, dreamoonAndStairs.find());
	}
}

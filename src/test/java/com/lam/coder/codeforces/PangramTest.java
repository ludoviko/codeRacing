package com.lam.coder.codeforces;

import org.junit.*;

import com.lam.coder.codeforces.Pangram;

public class PangramTest {
	Pangram pangram;
	
	@Before
	public void setUp() throws Exception {
		pangram = new Pangram();
	}

	@After
	public void tearDown() throws Exception {
		pangram  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("NO", pangram.find("toosmallword"));
		Assert.assertEquals("YES", pangram.find("TheQuickBrownFoxJumpsOverTheLazyDog"));
//		Assert.assertEquals("", pangram.find(""));
	}
}

package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.WaterMelon;

public class WaterMelonTest {
	WaterMelon melon;
	
	@Before
	public void setUp() throws Exception {
		melon = new WaterMelon();
	}

	@After
	public void tearDown() throws Exception {
		melon  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("NO", melon.find(1));
		Assert.assertEquals("NO", melon.find(2));
		Assert.assertEquals("NO", melon.find(3));
		Assert.assertEquals("NO", melon.find(5));
		Assert.assertEquals("YES", melon.find(4));
		Assert.assertEquals("YES", melon.find(6));
		Assert.assertEquals("YES", melon.find(10));
	}

}

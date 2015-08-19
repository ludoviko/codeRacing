package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.GameWithSticks;

public class GameWithSticksTest {
	GameWithSticks gameWithSticks;
	
	@Before
	public void setUp() throws Exception {
		this.gameWithSticks = new GameWithSticks();
	}

	@After
	public void tearDown() throws Exception {
		this.gameWithSticks  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("Malvika", this.gameWithSticks.find("2 2"));
		Assert.assertEquals("Malvika", this.gameWithSticks.find("2 3"));
		Assert.assertEquals("Akshat", this.gameWithSticks.find("3 3"));
//		Assert.assertEquals("", gameWithSticks.find(""));
	}
}

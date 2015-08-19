package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.EpicGame;

public class EpicGameTest {
	EpicGame epicGame;
	
	@Before
	public void setUp() throws Exception {
		this.epicGame = new EpicGame();
	}

	@After
	public void tearDown() throws Exception {
		this.epicGame  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("0", this.epicGame.find(3, 5, 9));
		Assert.assertEquals("1", this.epicGame.find(1, 1, 100));
	}
}

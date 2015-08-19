package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.DoorsGame;
@Ignore
public class DoorsGameTest {
	DoorsGame game;

	@Before
	public void setUp() throws Exception {
		game = new DoorsGame();
	}

	@After
	public void tearDown() throws Exception {
		game = null;
	}

	@Test
	public void testDetermineOutcome() {
		Assert.assertEquals(3, game.determineOutcome("ABCD", 2));
		Assert.assertEquals(-2, game.determineOutcome("ABCC", 2));
		Assert.assertEquals(0, game.determineOutcome("ABABAB", 3));
		                                              
		Assert.assertEquals(5, game.determineOutcome("MOCFDCE", 3));
		
		Assert.assertEquals(-4, game.determineOutcome("ABAPDCAA", 5));
		Assert.assertEquals(0, game.determineOutcome("ABCCDE", 3));
		Assert.assertEquals(0, game.determineOutcome("ABCCD", 3));
	}

	@Test
	public void determineOutcomeSystemTest() {

	}

}

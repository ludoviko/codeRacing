package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.CircleGame;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CircleGameTest extends TestCase {
	CircleGame game;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		game = new CircleGame();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	    game = null;
	}

	@Test
	public void testCardsLeftSystemTest() {
		Assert.assertEquals(13 ,game.cardsLeft("AQKTQKATQAKTKTQTQTAKTQKATQKATQ"));
		Assert.assertEquals(9 ,game.cardsLeft("J92J43KT5T879QA2QK3"));
		Assert.assertEquals(0 ,game.cardsLeft("KKKKKKKKKK"));
		Assert.assertEquals(1 ,game.cardsLeft("KKKKKAQT23"));
		Assert.assertEquals(6 ,game.cardsLeft("KKKKATQ23J"));
		Assert.assertEquals(4 ,game.cardsLeft("AT68482AK6875QJ5K9573Q"));
		Assert.assertEquals(24 ,game.cardsLeft("AQK262362TKKAQ6262437892KTTJA332"));
		Assert.assertEquals(42 ,game.cardsLeft("7879J4JQK24Q46K2A3TQ7T4256632TQ738JA6KA8K959J5T895"));
		Assert.assertEquals(30 ,game.cardsLeft("A8929JTAQ6J247759TKK5K3K947JQA284Q4256Q36587T6833A"));
		Assert.assertEquals(31 ,game.cardsLeft("AJJTKK29T883J2JJT9329JAJJTJKK2JTJKQQ88TJ2A"));
		Assert.assertEquals(0 ,game.cardsLeft("AT26532AQJT87J3Q"));
		Assert.assertEquals(11 ,game.cardsLeft("AKKKQAATT8AAAQ9A9ATQ"));
		Assert.assertEquals(28 ,game.cardsLeft("26834658972634985629856986587465872987369535"));
		Assert.assertEquals(0 ,game.cardsLeft("A23456789TJQA23456789TJQ"));
		Assert.assertEquals(12 ,game.cardsLeft("553553553553"));
		Assert.assertEquals(2 ,game.cardsLeft("AQTKKKKKKQ"));
		Assert.assertEquals(12 ,game.cardsLeft("TTTTTTTTTTT3TTT3"));
		Assert.assertEquals(10 ,game.cardsLeft("4454454454"));
		Assert.assertEquals(3 ,game.cardsLeft("AKKKKKKKKKT3JJ"));
		Assert.assertEquals(22 ,game.cardsLeft("KTQ55662JJ3KAAKK2235QKKAK253525KKJKKT"));
	}
	
	@Test
	public void testCardsLeft() {
		Assert.assertEquals(4, game.cardsLeft("AT68482AK6875QJ5K9573Q"));
		Assert.assertEquals(0, game.cardsLeft("KKKKKKK"));
		Assert.assertEquals(1, game.cardsLeft("KKKKKAQT23"));
		Assert.assertEquals(6, game.cardsLeft("KKKKATQ23J"));
		Assert.assertEquals(24, game.cardsLeft("AQK262362TKKAQ6262437892KTTJA332"));
//		Assert.assertEquals(, game.cardsLeft());
	}
	

}

package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.PairGame;
import com.lam.coder.topCoder.PairGameEasy;

public class PairGameTest {
	PairGame game = new PairGame();
	
	@Before
	public void setUp() throws Exception {
		game = new PairGame();
	}

	@After
	public void tearDown() throws Exception {
		game = null;
	}

	@Test
	public void testAble() {
		Assert.assertEquals(PairGameEasy.ABLE, game.able(1, 2, 3, 5));
		Assert.assertEquals(PairGameEasy.NOT_ABLE, game.able(1, 2, 2, 1));
		Assert.assertEquals(PairGameEasy.NOT_ABLE, game.able(2, 2, 2, 999));
		Assert.assertEquals(PairGameEasy.ABLE, game.able(2, 2, 2, 1000));
		Assert.assertEquals(PairGameEasy.ABLE, game.able(47, 58, 384, 221));
		Assert.assertEquals(PairGameEasy.ABLE,
				game.able(1000, 1000, 1000, 1000));
	}

	@Test
	public void ableSystemTest() {
		Assert.assertEquals("Able to generate", game.able(1, 2, 3, 5));
		Assert.assertEquals("Not able to generate", game.able(1, 2, 2, 1));
		Assert.assertEquals("Not able to generate", game.able(2, 2, 2, 999));
		Assert.assertEquals("Able to generate", game.able(2, 2, 2, 1000));
		Assert.assertEquals("Able to generate", game.able(47, 58, 384, 221));
		Assert.assertEquals("Able to generate", game.able(1000, 1000, 1000, 1000));
		Assert.assertEquals("Able to generate", game.able(3, 2, 19, 26));
		Assert.assertEquals("Able to generate", game.able(8, 685, 8, 685));
		Assert.assertEquals("Able to generate", game.able(7, 88, 299, 496));
		Assert.assertEquals("Able to generate", game.able(28, 492, 28, 492));
		Assert.assertEquals("Able to generate", game.able(583, 609, 583, 609));
		Assert.assertEquals("Able to generate", game.able(8, 9, 8, 9));
		Assert.assertEquals("Able to generate", game.able(635, 24, 635, 24));
		Assert.assertEquals("Able to generate", game.able(786, 23, 809, 832));
		Assert.assertEquals("Able to generate", game.able(341, 242, 341, 242));
		Assert.assertEquals("Able to generate", game.able(6, 7, 13, 7));
		Assert.assertEquals("Able to generate", game.able(1, 4, 62, 45));
		Assert.assertEquals("Able to generate", game.able(77, 711, 77, 711));
		Assert.assertEquals("Able to generate", game.able(127, 310, 127, 310));
		Assert.assertEquals("Able to generate", game.able(8, 2, 26, 66));
		Assert.assertEquals("Able to generate", game.able(69, 31, 69, 31));
		Assert.assertEquals("Able to generate", game.able(1, 18, 194, 431));
		Assert.assertEquals("Able to generate", game.able(8, 6, 346, 124));
		Assert.assertEquals("Able to generate", game.able(923, 8, 923, 8));
		Assert.assertEquals("Able to generate", game.able(8, 971, 8, 971));
		Assert.assertEquals("Able to generate", game.able(64, 32, 160, 96));
		Assert.assertEquals("Not able to generate", game.able(40, 63, 38, 49));
		Assert.assertEquals("Not able to generate", game.able(564, 561, 3, 558));
		Assert.assertEquals("Able to generate", game.able(831, 16, 831, 16));
		Assert.assertEquals("Not able to generate", game.able(507, 341, 139, 287));
		Assert.assertEquals("Not able to generate", game.able(84, 223, 35, 32));
		Assert.assertEquals("Able to generate", game.able(29, 874, 29, 874));
		Assert.assertEquals("Not able to generate", game.able(79, 67, 362, 583));
		Assert.assertEquals("Able to generate", game.able(68, 41, 68, 41));
		Assert.assertEquals("Able to generate", game.able(9, 44, 9, 44));
		Assert.assertEquals("Able to generate", game.able(8, 91, 8, 91));
		Assert.assertEquals("Able to generate", game.able(42, 35, 42, 35));
		Assert.assertEquals("Not able to generate", game.able(579, 570, 9, 552));
		Assert.assertEquals("Able to generate", game.able(7, 1, 177, 817));
		Assert.assertEquals("Not able to generate", game.able(29, 24, 5, 9));
		Assert.assertEquals("Not able to generate", game.able(774, 292, 74, 14));
		Assert.assertEquals("Able to generate", game.able(2, 88, 626, 268));
		Assert.assertEquals("Able to generate", game.able(268, 296, 268, 296));
		Assert.assertEquals("Able to generate", game.able(990, 4, 990, 4));
		Assert.assertEquals("Able to generate", game.able(88, 5, 88, 5));
		Assert.assertEquals("Not able to generate", game.able(141, 661, 35, 9));
		Assert.assertEquals("Not able to generate", game.able(72, 239, 8, 87));
		Assert.assertEquals("Not able to generate", game.able(939, 948, 7, 80));
		Assert.assertEquals("Not able to generate", game.able(468, 3, 67, 980));
		Assert.assertEquals("Not able to generate", game.able(95, 2, 862, 23));
		Assert.assertEquals("Not able to generate", game.able(923, 10, 95, 4));
		Assert.assertEquals("Not able to generate", game.able(6, 19, 1, 9));
		Assert.assertEquals("Not able to generate", game.able(351, 17, 9, 63));
		Assert.assertEquals("Not able to generate", game.able(5, 52, 60, 2));
		Assert.assertEquals("Not able to generate", game.able(638, 33, 59, 56));
		Assert.assertEquals("Not able to generate", game.able(48, 85, 56, 53));
		Assert.assertEquals("Not able to generate", game.able(6, 16, 61, 4));
		Assert.assertEquals("Not able to generate", game.able(7, 1, 489, 948));
		Assert.assertEquals("Not able to generate", game.able(87, 612, 304, 10));
		Assert.assertEquals("Not able to generate", game.able(571, 73, 862, 177));
		Assert.assertEquals("Not able to generate", game.able(72, 112, 6, 151));
		Assert.assertEquals("Not able to generate", game.able(279, 18, 7, 3));
		Assert.assertEquals("Not able to generate", game.able(3, 8, 5, 833));
		Assert.assertEquals("Not able to generate", game.able(20, 37, 89, 140));
		Assert.assertEquals("Not able to generate", game.able(151, 115, 33, 572));
		Assert.assertEquals("Not able to generate", game.able(3, 214, 50, 7));
		Assert.assertEquals("Not able to generate", game.able(1, 2, 999, 1000));
		Assert.assertEquals("Not able to generate", game.able(1, 1, 1000, 1000));
		Assert.assertEquals("Not able to generate", game.able(2, 1, 1, 2));
		Assert.assertEquals("Not able to generate", game.able(1, 1, 998, 994));
		Assert.assertEquals("Able to generate", game.able(1, 1, 1, 1));
		Assert.assertEquals("Not able to generate", game.able(3, 2, 1, 1000));
		Assert.assertEquals("Able to generate", game.able(1, 2, 1, 2));
		Assert.assertEquals("Not able to generate", game.able(1, 1, 10, 12));
		Assert.assertEquals("Not able to generate", game.able(3, 6, 6, 9));
		Assert.assertEquals("Not able to generate", game.able(4, 6, 6, 8));
		Assert.assertEquals("Not able to generate", game.able(1, 2, 4, 4));
		Assert.assertEquals("Not able to generate", game.able(7, 9, 10, 11));
		Assert.assertEquals("Not able to generate", game.able(5, 6, 15, 18));
		Assert.assertEquals("Able to generate", game.able(4, 1, 5, 1));
		Assert.assertEquals("Able to generate", game.able(2, 2, 6, 4));
		Assert.assertEquals("Not able to generate", game.able(1, 1, 200, 200));
		Assert.assertEquals("Able to generate", game.able(1, 1, 1, 1000));
		Assert.assertEquals("Able to generate", game.able(1, 2, 4, 3));
		Assert.assertEquals("Not able to generate", game.able(789, 789, 1, 1000));
		Assert.assertEquals("Not able to generate", game.able(5, 7, 5, 13));
		Assert.assertEquals("Not able to generate", game.able(3, 3, 4, 4));
		Assert.assertEquals("Not able to generate", game.able(2, 3, 5, 4));
		Assert.assertEquals("Not able to generate", game.able(5, 47, 20, 20));
		Assert.assertEquals("Able to generate", game.able(1, 1, 1, 2));
		Assert.assertEquals("Not able to generate", game.able(1, 1, 3, 3));
		Assert.assertEquals("Able to generate", game.able(1, 1, 1, 3));
		Assert.assertEquals("Not able to generate", game.able(2, 3, 5, 11));
		Assert.assertEquals("Able to generate", game.able(2, 2, 1000, 998));
		Assert.assertEquals("Not able to generate", game.able(7, 9, 10, 10));
		Assert.assertEquals("Able to generate", game.able(2, 2, 2, 2));
		Assert.assertEquals("Not able to generate", game.able(5, 7, 7, 5));
		Assert.assertEquals("Not able to generate", game.able(2, 3, 4, 6));
		Assert.assertEquals("Not able to generate", game.able(1, 3, 4, 4));
		Assert.assertEquals("Not able to generate", game.able(1, 1, 5, 5));
		Assert.assertEquals("Not able to generate", game.able(5, 47, 20, 200));
		Assert.assertEquals("Not able to generate", game.able(1, 10, 8, 10));
		Assert.assertEquals("Able to generate", game.able(4, 4, 800, 804));
		Assert.assertEquals("Not able to generate", game.able(1, 2, 3, 3));
		Assert.assertEquals("Able to generate", game.able(5, 2, 40, 7));
		Assert.assertEquals("Not able to generate", game.able(5, 3, 6, 6));
		Assert.assertEquals("Not able to generate", game.able(5, 20, 20, 200));
		Assert.assertEquals("Not able to generate", game.able(999, 999, 1000, 1000));
		Assert.assertEquals("Not able to generate", game.able(2, 3, 11, 11));
		Assert.assertEquals("Able to generate", game.able(3, 2, 12, 19));
		Assert.assertEquals("Not able to generate", game.able(1, 4, 3, 2));
		Assert.assertEquals("Not able to generate", game.able(1, 1000, 1000, 1000));
		Assert.assertEquals("Not able to generate", game.able(2, 3, 2, 6));
		Assert.assertEquals("Not able to generate", game.able(1, 2, 2, 3));
		Assert.assertEquals("Not able to generate", game.able(1, 2, 5, 6));
	}
}

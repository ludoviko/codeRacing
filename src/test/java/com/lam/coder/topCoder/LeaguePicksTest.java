package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.LeaguePicks;

import junit.framework.TestCase;

public class LeaguePicksTest extends TestCase {
	LeaguePicks league;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		league = new LeaguePicks();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		league = null;
	}

	@Test
	public void testReturnPicks() {
		Assert.assertArrayEquals(new int[] { 3, 10, 15 },
				league.returnPicks(3, 6, 15));
		Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
				league.returnPicks(1, 1, 10));
		Assert.assertArrayEquals(new int[] { 1, 4, 5, 8, 9, 12, 13, 16, 17, 20,
				21, 24, 25, 28, 29, 32, 33, 36, 37 },
				league.returnPicks(1, 2, 39));
		Assert.assertArrayEquals(
				new int[] { 5, 18, 27, 40, 49, 62, 71, 84, 93 },
				league.returnPicks(5, 11, 100));
	}

	@Test
	public void testReturnPicksSystemTest() {
		Assert.assertArrayEquals(new int[] {3, 10, 15} ,league.returnPicks( 3, 6, 15));
		Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ,league.returnPicks( 1, 1, 10));
		Assert.assertArrayEquals(new int[] {1, 4, 5, 8, 9, 12, 13, 16, 17, 20, 21, 24, 25, 28, 29, 32, 33, 36, 37} ,league.returnPicks( 1, 2, 39));
		Assert.assertArrayEquals(new int[] {5, 18, 27, 40, 49, 62, 71, 84, 93} ,league.returnPicks( 5, 11, 100));
		Assert.assertArrayEquals(new int[] {17, 64, 97, 144, 177, 224, 257, 304, 337, 384, 417, 464, 497, 544, 577, 624, 657, 704, 737, 784, 817, 864, 897, 944, 977, 1024, 1057, 1104, 1137, 1184, 1217, 1264, 1297, 1344, 1377, 1424, 1457, 1504, 1537, 1584} ,league.returnPicks( 17, 40, 1600));
		Assert.assertArrayEquals(new int[] {3, 6, 11, 14, 19, 22, 27, 30, 35, 38, 43, 46, 51, 54, 59, 62, 67, 70, 75, 78, 83, 86, 91, 94, 99} ,league.returnPicks( 3, 4, 100));
		Assert.assertArrayEquals(new int[] {2, 7, 10, 15, 18, 23, 26, 31, 34, 39, 42, 47, 50, 55, 58, 63, 66, 71, 74, 79, 82, 87, 90, 95, 98} ,league.returnPicks( 2, 4, 100));
		Assert.assertArrayEquals(new int[] {1, 8, 9, 16, 17, 24, 25, 32, 33, 40, 41, 48, 49, 56, 57, 64, 65, 72, 73, 80, 81, 88, 89, 96, 97} ,league.returnPicks( 1, 4, 100));
		Assert.assertArrayEquals(new int[] {4, 5, 12, 13, 20, 21, 28, 29, 36, 37, 44, 45, 52, 53, 60, 61, 68, 69, 76, 77, 84, 85, 92, 93, 100} ,league.returnPicks( 4, 4, 100));
		Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20} ,league.returnPicks( 1, 1, 20));
		Assert.assertArrayEquals(new int[] {1} ,league.returnPicks( 1, 1, 1));
		Assert.assertArrayEquals(new int[] {2, 3} ,league.returnPicks( 2, 2, 4));
		Assert.assertArrayEquals(new int[] {3, 8, 13, 18} ,league.returnPicks( 3, 5, 20));
		Assert.assertArrayEquals(new int[] {17, 64, 97, 144, 177, 224, 257, 304, 337, 384, 417, 464, 497, 544, 577, 624, 657, 704, 737, 784, 817, 864, 897, 944, 977, 1024, 1057, 1104, 1137, 1184, 1217, 1264, 1297, 1344, 1377, 1424, 1457, 1504, 1537, 1584} ,league.returnPicks( 17, 40, 1600));
		Assert.assertArrayEquals(new int[] {9, 52, 69, 112, 129, 172, 189, 232, 249, 292, 309, 352, 369, 412, 429, 472, 489, 532, 549, 592, 609, 652, 669, 712, 729, 772, 789, 832, 849, 892, 909, 952, 969, 1012} ,league.returnPicks( 9, 30, 1024));
		Assert.assertArrayEquals(new int[] {15, 20} ,league.returnPicks( 15, 17, 23));
		Assert.assertArrayEquals(new int[] {39, 42} ,league.returnPicks( 39, 40, 42));
		Assert.assertArrayEquals(new int[] {7} ,league.returnPicks( 7, 9, 11));
		Assert.assertArrayEquals(new int[] {5, 16, 25, 36, 45} ,league.returnPicks( 5, 10, 45));
		Assert.assertArrayEquals(new int[] {18, 57, 92, 131, 166, 205, 240, 279, 314, 353, 388, 427, 462, 501, 536, 575, 610, 649, 684, 723, 758, 797, 832, 871, 906, 945} ,league.returnPicks( 18, 37, 979));
		Assert.assertArrayEquals(new int[] {6, 7, 18, 19, 30, 31} ,league.returnPicks( 6, 6, 35));
		Assert.assertArrayEquals(new int[] {} ,league.returnPicks( 5, 10, 1));
		Assert.assertArrayEquals(new int[] {4, 7} ,league.returnPicks( 4, 5, 9));
		Assert.assertArrayEquals(new int[] {40, 41, 120, 121, 200, 201, 280, 281, 360, 361, 440, 441, 520, 521, 600, 601, 680, 681, 760, 761, 840, 841, 920, 921, 1000, 1001, 1080, 1081, 1160, 1161, 1240, 1241, 1320, 1321, 1400, 1401, 1480, 1481, 1560, 1561} ,league.returnPicks( 40, 40, 1600));
	}
}

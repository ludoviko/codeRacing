package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.BenfordsLaw;

import junit.framework.Assert;
import junit.framework.TestCase;

public class BenfordsLawTest extends TestCase {
	BenfordsLaw law;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		law = new BenfordsLaw();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		law = null;
	}

	@Test
	public void testQuestionableDigit() {
		Assert.assertEquals(
				1,
				law.questionableDigit(new int[] { 5236, 7290, 200, 1907, 3336,
						9182, 17, 4209, 8746, 7932, 6375, 909, 2189, 3977,
						2389, 2500, 1239, 3448, 6380, 4812 }, 2));
		Assert.assertEquals(
				2,
				law.questionableDigit(new int[] { 1, 10, 100, 2, 20, 200, 2000,
						3, 30, 300 }, 2));
		Assert.assertEquals(
				-1,
				law.questionableDigit(new int[] { 9, 87, 765, 6543, 54321,
						43219, 321987, 21987, 1987, 345, 234, 123 }, 2));
		Assert.assertEquals(
				9,
				law.questionableDigit(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 7, 6,
						5, 4, 3, 2, 1 }, 8));
		Assert.assertEquals(
				8,
				law.questionableDigit(new int[] { 987, 234, 1234, 234873487,
						876, 234562, 17, 7575734, 5555, 4210, 678234, 3999,
						8123 }, 3));
	}

	@Test
	public void testQuestionableDigitSystemTest() {
		Assert.assertEquals(
				1,
				law.questionableDigit(new int[] { 5236, 7290, 200, 1907, 3336,
						9182, 17, 4209, 8746, 7932, 6375, 909, 2189, 3977,
						2389, 2500, 1239, 3448, 6380, 4812 }, 2));
		Assert.assertEquals(
				2,
				law.questionableDigit(new int[] { 1, 10, 100, 2, 20, 200, 2000,
						3, 30, 300 }, 2));
		Assert.assertEquals(
				-1,
				law.questionableDigit(new int[] { 9, 87, 765, 6543, 54321,
						43219, 321987, 21987, 1987, 345, 234, 123 }, 2));
		Assert.assertEquals(
				9,
				law.questionableDigit(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 7, 6,
						5, 4, 3, 2, 1 }, 8));
		Assert.assertEquals(
				8,
				law.questionableDigit(new int[] { 987, 234, 1234, 234873487,
						876, 234562, 17, 7575734, 5555, 4210, 678234, 3999,
						8123 }, 3));
		Assert.assertEquals(
				-1,
				law.questionableDigit(new int[] { 168249, 128764, 274843,
						480487, 6470, 321163, 914970, 651946, 860681, 651156,
						533305, 97811, 948843, 357358, 312413, 255070, 74193,
						28869, 793437, 592639, 25154, 554199, 458379, 585723,
						957071, 620787, 618315, 999088, 992120, 660875 }, 5));
		Assert.assertEquals(
				1,
				law.questionableDigit(new int[] { 929238, 225022, 368132,
						419489, 406037, 476829, 454825, 792981, 873000, 566777,
						925392, 448354, 270943, 717454, 441466, 943277, 981218,
						825975, 529528, 884725, 366158, 409775, 286906, 97902,
						136183, 644910, 660556, 268189, 344640, 310889 }, 9));
		Assert.assertEquals(
				2,
				law.questionableDigit(new int[] { 87686, 300702, 161999,
						917426, 475725, 725295, 312782, 410472, 237840, 75515,
						674516, 391965, 562072, 154635, 359049, 934178, 555142,
						159623, 623961, 864710, 617694, 108332, 828539, 602937,
						170762, 543943, 461252, 582121, 176235, 789195 }, 3));
		Assert.assertEquals(
				9,
				law.questionableDigit(new int[] { 935189, 872499, 767283,
						621491, 284705, 445848, 187047, 410621, 215923, 116325,
						926201, 764755, 175689, 982944, 906067, 427226, 227093,
						691445, 937981, 182991, 11663, 916071, 852174, 503223,
						601235, 543188, 21146, 36881, 37372, 384399, 10735,
						386812, 527127, 99382, 108651, 851071, 396242, 892414,
						778132, 784572 }, 2));
		Assert.assertEquals(-1, law.questionableDigit(new int[] { 2, 8, 2, 2,
				138836868, 4, 12, 157, 19, 3, 102, 879, 5, 5, 35, 4, 4, 19,
				666, 24, 123, 7, 937, 209, 6, 7, 2, 3, 100, 3, 4, 3, 4, 111, 4,
				2, 4 }, 4));
		Assert.assertEquals(
				5,
				law.questionableDigit(new int[] { 46126, 6669, 10, 9, 3, 8,
						401, 4, 20947581, 3, 81, 10, 101023, 1770, 14, 8, 383,
						127, 5, 41, 654, 7, 9, 94, 2, 32, 240, 1949969, 3, 3,
						4, 4, 256, 4, 2268, 2, 3 }, 2));
		Assert.assertEquals(
				6,
				law.questionableDigit(new int[] { 234, 5, 38, 3, 5, 4, 8, 9,
						18, 3, 20, 3, 2, 4, 1968049, 27, 30, 3, 2, 2, 2, 4, 3,
						534914, 4, 10, 37, 70, 3, 3, 2152, 27, 8, 1533, 1217,
						3, 3, 2, 23, 3, 567, 4, 10, 130004, 3, 5, 5371,
						10253521, 3 }, 10));
		Assert.assertEquals(
				8,
				law.questionableDigit(new int[] { 22, 26, 47822, 10, 68597,
						1201, 22983, 9, 22, 263, 11, 80, 1108, 36151, 20, 43,
						22, 15, 13958, 5285, 9, 23, 4886, 10157537, 2471, 90,
						8, 26, 32, 2180, 68, 70, 2498, 16, 31, 8, 21, 8258, 26,
						15, 9, 30306576, 52, 10, 82, 10, 81, 720 }, 2));
		Assert.assertEquals(
				-1,
				law.questionableDigit(new int[] { 465, 10, 73, 64, 17, 1618,
						29, 671869, 458, 17, 12, 17, 12, 9, 7, 18, 10, 9,
						137087639, 22820083, 10, 14, 11, 60, 19, 1615, 911, 46,
						28, 534546, 232, 54, 3138972, 10, 27, 11, 740226530,
						22, 9242, 16, 9, 12, 36, 8, 15 }, 3));
		Assert.assertEquals(
				-1,
				law.questionableDigit(new int[] { 12, 35847144, 289578, 23, 8,
						49, 16, 27, 73, 9, 11, 604, 12, 7, 38, 25, 10, 6428,
						22965, 9, 12, 11, 39, 30, 18, 14, 11, 16, 503, 92,
						21474, 8, 20, 25, 45122636, 157, 8, 8, 14, 458, 292,
						545003208, 13 }, 6));
		Assert.assertEquals(
				4,
				law.questionableDigit(new int[] { 34, 3934, 35, 228, 730, 8,
						5321491, 30, 6324, 15, 2274, 11, 76, 11, 11, 106382,
						613, 37 }, 3));
		Assert.assertEquals(
				-1,
				law.questionableDigit(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9,
						9, 9, 9, 9, 9, 1, 2 }, 9));
		Assert.assertEquals(
				-1,
				law.questionableDigit(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1,
						2, 3, 4, 5, 6, 7, 4, 4, 1, 2, 3, 4, 5, 4, 4, 4, 4, 4,
						4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 }, 6));
		Assert.assertEquals(6, law.questionableDigit(new int[] { 6, 6, 6, 6, 6,
				6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1, 2, 3, 4, 5, 7, 8, 9, 1, 2, 3,
				4, 5 }, 8));
		Assert.assertEquals(
				-1,
				law.questionableDigit(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1,
						2, 3, 4, 7, 7, 7, 7, 7, 1, 2, 3, 7, 7 }, 6));
		Assert.assertEquals(
				-1,
				law.questionableDigit(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1,
						2, 3, 4, 8, 8, 8, 8, 8, 1, 2, 8, 8 }, 8));
		Assert.assertEquals(
				-1,
				law.questionableDigit(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1,
						2, 3, 4, 5, 6, 7, 7, 7, 1, 2, 3, 4, 5 }, 3));
		Assert.assertEquals(
				8,
				law.questionableDigit(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1,
						2, 3, 4, 5, 6, 7, 8, 8, 1, 2, 3, 4, 5, 6, 8, 8, 8, 1,
						2, 3, 4, 5, 6, 8, 8, 8, 1, 2, 3, 4, 5, 8, 8 }, 5));
		Assert.assertEquals(
				2,
				law.questionableDigit(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1,
						2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1,
						3, 3, 4, 5, 6, 7, 1, 1, 1, 1, 1, 4, 5, 6, 7, 1, 1 }, 2));
		Assert.assertEquals(2, law.questionableDigit(new int[] { 1 }, 4));
		Assert.assertEquals(1, law.questionableDigit(new int[] { 1 }, 3));
		Assert.assertEquals(
				8,
				law.questionableDigit(new int[] { 987, 234, 1234, 234873487,
						876, 234562, 17, 7575734, 5555, 4210, 678234, 3999,
						8123 }, 3));
		Assert.assertEquals(
				2,
				law.questionableDigit(new int[] { 1, 10, 100, 2, 20, 200, 2000,
						3, 30, 300 }, 2));
		Assert.assertEquals(
				9,
				law.questionableDigit(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 7, 6,
						5, 4, 3, 2, 1 }, 8));
		Assert.assertEquals(1, law.questionableDigit(new int[] { 1 }, 2));
		Assert.assertEquals(
				-1,
				law.questionableDigit(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 7, 6,
						5, 4, 3, 2, 1, 9876, 6543 }, 8));
		Assert.assertEquals(
				-1,
				law.questionableDigit(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1,
						1, 2, 3, 1 }, 10));
	}

}

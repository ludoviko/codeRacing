package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.PrimalUnlicensedCreatures;

public class PrimalUnlicensedCreaturesTest {
	PrimalUnlicensedCreatures primal;

	@Before
	public void setUp() throws Exception {
		primal = new PrimalUnlicensedCreatures();
	}

	@After
	public void tearDown() throws Exception {
		primal = null;
	}

	@Test
	public void testMaxWins() {
		Assert.assertEquals(3, primal.maxWins(31, new int[] { 10, 20, 30 }));
		Assert.assertEquals(3, primal.maxWins(20, new int[] { 24, 5, 6, 38 }));
		Assert.assertEquals(6,
				primal.maxWins(20, new int[] { 3, 3, 3, 3, 3, 1, 25 }));
		Assert.assertEquals(5, primal.maxWins(4, new int[] { 3, 13, 6, 4, 9 }));
		Assert.assertEquals(0, primal.maxWins(7, new int[] { 7, 8, 9, 10 }));
	}

	@Test
	public void testMaxWinsSystemTest() {
		Assert.assertEquals(3, primal.maxWins(31, new int[] { 10, 20, 30 }));
		Assert.assertEquals(3, primal.maxWins(20, new int[] { 24, 5, 6, 38 }));
		Assert.assertEquals(6,
				primal.maxWins(20, new int[] { 3, 3, 3, 3, 3, 1, 25 }));
		Assert.assertEquals(5, primal.maxWins(4, new int[] { 3, 13, 6, 4, 9 }));
		Assert.assertEquals(0, primal.maxWins(7, new int[] { 7, 8, 9, 10 }));
		Assert.assertEquals(6,
				primal.maxWins(713, new int[] { 794, 857, 149, 857, 663, 49 }));
		Assert.assertEquals(
				28,
				primal.maxWins(423, new int[] { 351, 891, 95, 526, 387, 756,
						717, 415, 904, 541, 543, 77, 456, 912, 822, 70, 167,
						542, 337, 38, 876, 463, 765, 550, 614, 580, 753, 80 }));
		Assert.assertEquals(
				1,
				primal.maxWins(32, new int[] { 127, 818, 146, 275, 340, 651,
						647, 105, 211, 863, 6, 613, 182, 833, 127, 145, 184,
						402, 786, 740, 82, 674, 309, 872, 108, 197 }));
		Assert.assertEquals(
				27,
				primal.maxWins(112, new int[] { 621, 268, 33, 874, 107, 876,
						388, 595, 386, 342, 471, 488, 75, 437, 53, 461, 21,
						323, 941, 863, 77, 903, 550, 272, 991, 219, 118 }));
		Assert.assertEquals(
				43,
				primal.maxWins(653, new int[] { 856, 647, 67, 375, 507, 57,
						175, 577, 922, 550, 389, 995, 874, 738, 820, 961, 492,
						88, 818, 269, 601, 170, 543, 508, 174, 875, 37, 290,
						670, 82, 110, 593, 351, 514, 619, 205, 544, 637, 989,
						261, 677, 100, 579 }));
		Assert.assertEquals(
				42,
				primal.maxWins(837, new int[] { 303, 853, 78, 768, 546, 385,
						780, 100, 455, 585, 143, 792, 372, 557, 360, 849, 255,
						304, 3, 835, 546, 646, 59, 811, 69, 8, 499, 966, 473,
						423, 397, 147, 232, 929, 927, 209, 760, 192, 74, 569,
						316, 926 }));
		Assert.assertEquals(
				47,
				primal.maxWins(498, new int[] { 511, 664, 108, 16, 595, 295,
						170, 252, 996, 482, 217, 291, 288, 153, 414, 626, 334,
						350, 639, 827, 350, 131, 837, 904, 407, 913, 732, 919,
						87, 908, 79, 533, 692, 486, 935, 635, 866, 711, 454,
						179, 728, 320, 851, 78, 648, 271, 435 }));
		Assert.assertEquals(7, primal.maxWins(719, new int[] { 138, 2, 40, 851,
				164, 542, 585 }));
		Assert.assertEquals(
				7,
				primal.maxWins(749, new int[] { 82, 329, 918, 625, 432, 433,
						992 }));
		Assert.assertEquals(
				14,
				primal.maxWins(683, new int[] { 295, 309, 111, 475, 273, 314,
						509, 460, 356, 159, 922, 933, 735, 521 }));
		Assert.assertEquals(
				49,
				primal.maxWins(289, new int[] { 576, 49, 225, 196, 256, 625,
						676, 100, 324, 100, 169, 961, 4, 784, 121, 289, 49, 25,
						9, 225, 100, 25, 400, 4, 16, 361, 16, 81, 196, 25, 1,
						16, 64, 361, 81, 49, 324, 729, 441, 81, 676, 16, 361,
						900, 100, 81, 729, 196, 81 }));
		Assert.assertEquals(
				21,
				primal.maxWins(256, new int[] { 289, 1, 625, 841, 64, 25, 841,
						484, 49, 289, 169, 576, 400, 484, 900, 841, 225, 169,
						900, 484, 961 }));
		Assert.assertEquals(
				29,
				primal.maxWins(529, new int[] { 16, 81, 841, 144, 676, 4, 400,
						400, 841, 289, 289, 441, 4, 1, 361, 144, 529, 625, 256,
						121, 225, 64, 49, 576, 256, 324, 729, 169, 64 }));
		Assert.assertEquals(
				0,
				primal.maxWins(4, new int[] { 576, 625, 49, 256, 441, 324, 625,
						961, 225, 729, 9, 25, 9, 169, 441, 4, 25, 289, 196,
						576, 36, 361, 169, 64, 441, 900, 100, 169, 81, 144, 9,
						256, 784, 729, 16, 625, 784, 81, 121, 49, 729, 121,
						841, 484, 144, 4 }));
		Assert.assertEquals(0, primal.maxWins(16, new int[] { 900, 64, 121,
				841, 121, 676, 676 }));
		Assert.assertEquals(
				4,
				primal.maxWins(121, new int[] { 36, 729, 625, 64, 900, 625, 1,
						100 }));
		Assert.assertEquals(
				43,
				primal.maxWins(625, new int[] { 81, 144, 361, 361, 4, 961, 1,
						169, 484, 16, 64, 25, 36, 841, 9, 169, 49, 225, 676,
						64, 784, 729, 225, 196, 324, 441, 324, 784, 576, 64,
						25, 225, 961, 64, 9, 100, 324, 225, 25, 676, 9, 169,
						169 }));
		Assert.assertEquals(
				0,
				primal.maxWins(1, new int[] { 81, 121, 576, 144, 121, 64, 256,
						576, 169, 400, 625, 900, 576, 25, 144 }));
		Assert.assertEquals(
				16,
				primal.maxWins(289, new int[] { 4, 400, 256, 576, 900, 729,
						324, 4, 841, 289, 121, 529, 529, 256, 36, 100 }));
		Assert.assertEquals(
				5,
				primal.maxWins(49, new int[] { 361, 324, 64, 64, 225, 361, 4,
						4, 25, 256, 400, 324, 400, 961, 289 }));
		Assert.assertEquals(
				5,
				primal.maxWins(64, new int[] { 343, 512, 343, 27, 27, 27, 64,
						512, 343, 343, 1 }));
		Assert.assertEquals(
				0,
				primal.maxWins(1, new int[] { 64, 512, 8, 729, 343, 216, 27,
						216, 1, 729, 27, 729, 343, 216, 512 }));
		Assert.assertEquals(
				33,
				primal.maxWins(64, new int[] { 216, 343, 343, 125, 64, 64, 64,
						27, 729, 8, 216, 729, 512, 512, 512, 125, 1, 1, 729,
						125, 64, 216, 27, 8, 343, 64, 729, 729, 64, 64, 343,
						216, 27 }));
		Assert.assertEquals(
				8,
				primal.maxWins(125, new int[] { 27, 343, 27, 27, 125, 343, 8,
						125, 27, 729, 729, 27 }));
		Assert.assertEquals(46, primal.maxWins(216, new int[] { 729, 27, 125,
				8, 216, 1, 8, 8, 8, 27, 64, 512, 729, 1, 343, 1, 125, 343, 343,
				343, 512, 27, 8, 8, 27, 729, 216, 512, 216, 729, 27, 64, 1, 27,
				8, 1, 125, 64, 216, 216, 512, 27, 125, 512, 64, 125 }));
		Assert.assertEquals(
				25,
				primal.maxWins(729, new int[] { 27, 1, 8, 1, 8, 125, 512, 64,
						8, 125, 125, 216, 27, 216, 1, 512, 64, 729, 343, 343,
						27, 27, 729, 729, 8 }));
		Assert.assertEquals(
				16,
				primal.maxWins(64, new int[] { 125, 27, 64, 27, 64, 216, 343,
						512, 64, 27, 64, 512, 64, 1, 27, 8 }));
		Assert.assertEquals(
				0,
				primal.maxWins(1, new int[] { 8, 729, 729, 8, 216, 64, 1, 729,
						125, 64, 64, 8, 512, 216, 343, 64, 343, 729, 729, 512,
						216, 64, 512, 729, 343, 1, 27, 729, 64, 343 }));
		Assert.assertEquals(
				24,
				primal.maxWins(216, new int[] { 1, 8, 216, 512, 216, 125, 1,
						125, 8, 512, 64, 27, 64, 729, 64, 512, 125, 64, 125,
						216, 8, 343, 27, 343 }));
		Assert.assertEquals(
				15,
				primal.maxWins(343, new int[] { 1, 512, 125, 64, 64, 1, 8, 216,
						8, 1, 125, 216, 512, 1, 512 }));
		Assert.assertEquals(
				16,
				primal.maxWins(3, new int[] { 2, 3, 4, 6, 9, 13, 19, 28, 42,
						63, 94, 141, 211, 316, 474, 711 }));
		Assert.assertEquals(
				18,
				primal.maxWins(3, new int[] { 2, 2, 4, 4, 8, 8, 16, 16, 32, 32,
						64, 64, 128, 128, 256, 256, 512, 512 }));
		Assert.assertEquals(
				21,
				primal.maxWins(3, new int[] { 2, 2, 2, 5, 5, 5, 11, 11, 11, 26,
						26, 26, 65, 65, 65, 161, 161, 161, 401, 401, 401 }));
		Assert.assertEquals(0, primal.maxWins(7, new int[] { 7, 8, 9, 10 }));
		Assert.assertEquals(
				16,
				primal.maxWins(3, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
						11, 12, 13, 14, 15, 16 }));
		Assert.assertEquals(3, primal.maxWins(500, new int[] { 10, 20, 30 }));
		Assert.assertEquals(4, primal.maxWins(3, new int[] { 5, 4, 3, 2 }));
		Assert.assertEquals(2, primal.maxWins(6, new int[] { 6, 5 }));
		Assert.assertEquals(5, primal.maxWins(4, new int[] { 3, 13, 6, 4, 9 }));
		Assert.assertEquals(3, primal.maxWins(20, new int[] { 24, 5, 6, 38 }));
		Assert.assertEquals(0, primal.maxWins(3, new int[] { 3, 3 }));
		Assert.assertEquals(0, primal.maxWins(10, new int[] { 10, 10 }));
		Assert.assertEquals(1, primal.maxWins(30, new int[] { 1, 30 }));
		Assert.assertEquals(1, primal.maxWins(2, new int[] { 1, 2 }));
		Assert.assertEquals(
				1,
				primal.maxWins(10, new int[] { 999, 999, 999, 888, 899, 910,
						920, 930, 940, 950, 960, 960, 777, 456, 678, 987, 654,
						345, 456, 456, 2, 456 }));
		Assert.assertEquals(8,
				primal.maxWins(3, new int[] { 1, 1, 1, 1, 1, 1, 1, 1 }));
		Assert.assertEquals(50, primal.maxWins(1000, new int[] { 999, 999, 999,
				999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999,
				999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999,
				999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999,
				999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999 }));
		Assert.assertEquals(4, primal.maxWins(20, new int[] { 37, 24, 6, 6 }));
		Assert.assertEquals(1, primal.maxWins(1000, new int[] { 999 }));
		Assert.assertEquals(1, primal.maxWins(10, new int[] { 1, 150, 400 }));
	}
}
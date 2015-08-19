package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.RecurrenceRelation;

import org.junit.Assert;

public class RecurrenceRelationTest  {
	RecurrenceRelation relation;

	@Before
	public void setUp() throws Exception {
		relation = new RecurrenceRelation();
	}

	@After
	public void tearDown() throws Exception {
		relation = null;
	}

	@Test
	public void testModuloTenSimple() {
		Assert.assertEquals(5,
				relation.moduloTen(new int[] { 2, 1 }, new int[] { 9, 7 }, 6));
		Assert.assertEquals(4,
				relation.moduloTen(new int[] { 1, 1 }, new int[] { 0, 1 }, 9));
		Assert.assertEquals(0, relation.moduloTen(new int[] { 25, 143 },
				new int[] { 0, 0 }, 100000));
	}

	@Test
	public void testModuloTen() {
		Assert.assertEquals(
		1,
		relation.moduloTen(new int[] { 901, 492, 100 }, new int[] { 5,
				-15, -39 }, 2));
		Assert.assertEquals(6,
				relation.moduloTen(new int[] { 2 }, new int[] { 1 }, 20));
		Assert.assertEquals(6,
				relation.moduloTen(new int[] { 2 }, new int[] { 1 }, 64));
		Assert.assertEquals(5, relation.moduloTen(new int[] { 9, 8, 7, 6, 5, 4,
				3, 2, 1, 0 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 654));
		Assert.assertEquals(
				4,
				relation.moduloTen(new int[] { 901, 492, 100 }, new int[] { -6,
						-15, -39 }, 0));
	}

	@Test
	public void testModuloTenSystemTest() {
		Assert.assertEquals(5,
				relation.moduloTen(new int[] { 2, 1 }, new int[] { 9, 7 }, 6));
		Assert.assertEquals(4,
				relation.moduloTen(new int[] { 1, 1 }, new int[] { 0, 1 }, 9));
		Assert.assertEquals(6,
				relation.moduloTen(new int[] { 2 }, new int[] { 1 }, 20));
		Assert.assertEquals(6,
				relation.moduloTen(new int[] { 2 }, new int[] { 1 }, 64));
		Assert.assertEquals(3, relation.moduloTen(new int[] { 1, 2, 3, 4, 5, 6,
				7, 8, 9 }, new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 }, 96837));
		Assert.assertEquals(0, relation.moduloTen(new int[] { 25, 143 },
				new int[] { 0, 0 }, 100000));
		Assert.assertEquals(5, relation.moduloTen(new int[] { 9, 8, 7, 6, 5, 4,
				3, 2, 1, 0 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 654));
		Assert.assertEquals(
				4,
				relation.moduloTen(new int[] { 901, 492, 100 }, new int[] { -6,
						-15, -39 }, 0));
		Assert.assertEquals(2,
				relation.moduloTen(new int[] { -2 }, new int[] { -4 }, 3));
		Assert.assertEquals(
				1,
				relation.moduloTen(new int[] { 4, 9, -150, -30 }, new int[] {
						63, 10, -199, 593 }, 83));
		Assert.assertEquals(9, relation.moduloTen(new int[] { 157, -358, 1000,
				29, -599 }, new int[] { 28, 0, 53, -66, -599 }, 93753));
		Assert.assertEquals(
				9,
				relation.moduloTen(new int[] { 999, 999, 999, 999, 999, 999,
						999, 999, 999, 999 }, new int[] { 999, 999, 999, 999,
						999, 999, 999, 999, 999, 999 }, 99999));
		Assert.assertEquals(
				8,
				relation.moduloTen(new int[] { 217, 588, 967, -12, -659, 764,
						-778, -529 }, new int[] { -475, -963, -265, -270, -557,
						365, 843, 342 }, 28387));
		Assert.assertEquals(9, relation.moduloTen(new int[] { 771 },
				new int[] { -891 }, 73266));
		Assert.assertEquals(5, relation.moduloTen(new int[] { -377, 442, -643,
				692, -569 }, new int[] { -713, 267, 771, 950, -535 }, 78556));
		Assert.assertEquals(
				1,
				relation.moduloTen(new int[] { -941, -246, -272, 47, 575, -667,
						726, 54, -873, 796 }, new int[] { -559, -396, -347,
						-509, -174, -955, -982, 496, -733, -693 }, 6441));
		Assert.assertEquals(
				5,
				relation.moduloTen(new int[] { 574, -878, -582, 287, -871,
						-109, 950, -349, 667 }, new int[] { -532, 265, -447,
						-107, 346, -559, 176, -447, -775 }, 2239));
		Assert.assertEquals(
				1,
				relation.moduloTen(new int[] { -729, 576, -843 }, new int[] {
						105, -118, 260 }, 71291));
		Assert.assertEquals(3, relation.moduloTen(new int[] { 568, -696, 286,
				521 }, new int[] { -183, -302, 984, 261 }, 69507));
		Assert.assertEquals(
				5,
				relation.moduloTen(new int[] { 711, -847, -336, 334, -787, 540,
						-886, -746, 808 }, new int[] { -777, -842, 660, 315,
						-443, 593, 368, 247, 969 }, 8286));
		Assert.assertEquals(9, relation.moduloTen(new int[] { 478, -555, 887,
				322, -452 }, new int[] { 189, 339, 731, 407, 416 }, 57268));
		Assert.assertEquals(
				5,
				relation.moduloTen(new int[] { 639, -584 }, new int[] { 925,
						860 }, 70138));
		Assert.assertEquals(
				9,
				relation.moduloTen(new int[] { -384, 706, -912, -643, -229,
						-379, -566 }, new int[] { -397, -810, -280, -388, -483,
						-429, -407 }, 12128));
		Assert.assertEquals(
				7,
				relation.moduloTen(new int[] { -150, 716, 96, -624, -527, -901,
						-662, 507 }, new int[] { 151, 203, -42, 399, -501, 134,
						875, -46 }, 38428));
		Assert.assertEquals(8, relation.moduloTen(new int[] { 144, 932, -708,
				576 }, new int[] { -877, 58, -298, -87 }, 68447));
		Assert.assertEquals(
				6,
				relation.moduloTen(new int[] { 506, -560, 561 }, new int[] {
						-148, 913, -844 }, 24724));
		Assert.assertEquals(
				3,
				relation.moduloTen(new int[] { -329, 612, 991, 835, 586, -161,
						-447, 744, -403 }, new int[] { 492, 144, 711, -672,
						341, 621, 983, -516, -964 }, 73462));
		Assert.assertEquals(5, relation.moduloTen(new int[] { -494, 297, 984,
				925 }, new int[] { 575, -988, 294, 101 }, 56215));
		Assert.assertEquals(
				4,
				relation.moduloTen(new int[] { 758, -912 }, new int[] { 678,
						369 }, 50217));
		Assert.assertEquals(7, relation.moduloTen(new int[] { -363, 521, 555,
				-43, 899, -852 },
				new int[] { -344, 780, -641, -893, -743, -505 }, 14068));
		Assert.assertEquals(7, relation.moduloTen(new int[] { -775, 581, -631,
				-628 }, new int[] { -643, 522, 122, 851 }, 39505));
		Assert.assertEquals(4, relation.moduloTen(new int[] { -110, 57, -94,
				-387 }, new int[] { 980, -22, 879, 100 }, 69226));
		Assert.assertEquals(
				5,
				relation.moduloTen(new int[] { -893, -798, 605 }, new int[] {
						-774, -813, -466 }, 21337));
		Assert.assertEquals(
				1,
				relation.moduloTen(new int[] { -647, 251, -246, 53, 109, -393,
						-566, -602, 692 }, new int[] { 721, -275, 259, 656,
						-423, 903, 706, 179, -191 }, 28546));
		Assert.assertEquals(
				2,
				relation.moduloTen(new int[] { -65, 819, 904, 229, -446, 764,
						708, 190 }, new int[] { 678, 42, -980, 66, 988, -93,
						-428, -539 }, 20988));
		Assert.assertEquals(
				4,
				relation.moduloTen(new int[] { 674, -623, -601, 544, 991, 606,
						-217, -915, 139 }, new int[] { -60, -720, -189, -203,
						235, -592, -460, -399, 547 }, 5036));
		Assert.assertEquals(4, relation.moduloTen(new int[] { -831, 913, 640,
				-939, 639 }, new int[] { 176, 490, 620, -614, 450 }, 1166));
		Assert.assertEquals(
				3,
				relation.moduloTen(new int[] { -611, 593, -69, 142, 928, -114,
						-155, 311 }, new int[] { -437, -655, 136, -79, -253,
						-290, -471, 984 }, 41238));
		Assert.assertEquals(7, relation.moduloTen(new int[] { 909, -336, -595,
				-3, 805, 474, 948 }, new int[] { 359, 378, 862, -533, -365,
				991, 863 }, 52247));
		Assert.assertEquals(0,
				relation.moduloTen(new int[] { 765 }, new int[] { 42 }, 16129));
		Assert.assertEquals(
				6,
				relation.moduloTen(new int[] { 520, 210, 984, -508, 596, -661,
						-403, -562 }, new int[] { 274, 964, -946, -149, 682,
						61, -439, 2 }, 95186));
		Assert.assertEquals(
				4,
				relation.moduloTen(new int[] { 469, 628, 775 }, new int[] {
						784, -58, 132 }, 72912));
		Assert.assertEquals(0,
				relation.moduloTen(new int[] { 4, -6 }, new int[] { 2, 3 }, 2));
		Assert.assertEquals(
				4,
				relation.moduloTen(new int[] { 901, 492, 100 }, new int[] { -6,
						-15, -39 }, 0));
		Assert.assertEquals(9,
				relation.moduloTen(new int[] { 2 }, new int[] { -111 }, 0));
		Assert.assertEquals(6,
				relation.moduloTen(new int[] { 2 }, new int[] { 1 }, 20));
		Assert.assertEquals(6,
				relation.moduloTen(new int[] { 2 }, new int[] { 1 }, 64));
		Assert.assertEquals(0,
				relation.moduloTen(new int[] { 2 }, new int[] { -100 }, 0));
		Assert.assertEquals(1,
				relation.moduloTen(new int[] { 1, 1 }, new int[] { 1, 2 }, 0));
		Assert.assertEquals(5, relation.moduloTen(new int[] { 9, 8, 7, 6, 5, 4,
				3, 2, 1, 0 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 654));
		Assert.assertEquals(8,
				relation.moduloTen(new int[] { 2 }, new int[] { 1 }, 9999));
		Assert.assertEquals(3, relation.moduloTen(new int[] { 45, 23 },
				new int[] { 43, 55 }, 0));
		Assert.assertEquals(
				5,
				relation.moduloTen(new int[] { 901, 492, 100 }, new int[] { -6,
						-15, -39 }, 1));
		Assert.assertEquals(0, relation.moduloTen(new int[] { -10, -10 },
				new int[] { 1, 1 }, 10000));
		Assert.assertEquals(9,
				relation.moduloTen(new int[] { 1 }, new int[] { -1 }, 0));
		Assert.assertEquals(0, relation.moduloTen(new int[] { 0, 0, 0 },
				new int[] { 1, 2, 3 }, 99999));
		Assert.assertEquals(9,
				relation.moduloTen(new int[] { 2, 1 }, new int[] { 9, 7 }, 0));
		Assert.assertEquals(0, relation.moduloTen(new int[] { 1000, 1000, 1000,
				1000, 1000, 1000, 1000, 1000, 1000, 1000 }, new int[] { 1000,
				1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 }, 100000));
		Assert.assertEquals(9, relation.moduloTen(new int[] { 1, 1, 1 },
				new int[] { 9, 1, 1 }, 0));
		Assert.assertEquals(1, relation.moduloTen(new int[] { 34, 43 },
				new int[] { -199, 323 }, 0));
		Assert.assertEquals(1,
				relation.moduloTen(new int[] { 7 }, new int[] { 1 }, 100000));
		Assert.assertEquals(
				1,
				relation.moduloTen(new int[] { -32, -34 }, new int[] { -199,
						-32 }, 0));
		Assert.assertEquals(6,
				relation.moduloTen(new int[] { 2 }, new int[] { 1 }, 108));
		Assert.assertEquals(8, relation.moduloTen(new int[] { 25, 143, -111,
				-432, -312, -999 }, new int[] { -818, -13, -312, -823, -211,
				987 }, 100000));
		Assert.assertEquals(4,
				relation.moduloTen(new int[] { -16 }, new int[] { -16 }, 0));
		Assert.assertEquals(0, relation.moduloTen(new int[] { 25, 143, -123,
				-234, -345, -567 }, new int[] { -12, -982, -345, 247, -232,
				-987 }, 100000));
		Assert.assertEquals(0, relation.moduloTen(new int[] { 10, 10 },
				new int[] { 10, 10 }, 0));
		Assert.assertEquals(2,
				relation.moduloTen(new int[] { 2 }, new int[] { 2 }, 0));
		Assert.assertEquals(0, relation.moduloTen(new int[] { 1000, 1000, 1000,
				1000, 1000, 1000, 1000, 1000, 1000, 1000 }, new int[] { 1000,
				1000, 1000, 1000, 999, 1000, 1000, 1000, 1000, 1000 }, 100000));
		Assert.assertEquals(0,
				relation.moduloTen(new int[] { 1, 1 }, new int[] { 10, 10 }, 1));
		Assert.assertEquals(4, relation.moduloTen(new int[] { 1, 2, 3, 4, 5, 6,
				7, 8, 9 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 3));
		Assert.assertEquals(
				0,
				relation.moduloTen(new int[] { 1, 2, 3 }, new int[] { -1, -10,
						-2 }, 1));
		Assert.assertEquals(2,
				relation.moduloTen(new int[] { 1, 1 }, new int[] { 12, 12 }, 1));
	}

}

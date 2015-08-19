package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.DinkyFish;

public class DinkyFishTest {
	DinkyFish fish;
	
	@Before
	public void setUp() throws Exception {
		fish = new DinkyFish();
	}

	@After
	public void tearDown() throws Exception {
		fish = null;
	}

	@Test
	public void testMonthsUntilCrowded() {
		Assert.assertEquals(2, fish.monthsUntilCrowded(10, 4, 6));
		Assert.assertEquals(5, fish.monthsUntilCrowded(100, 4, 6));
		Assert.assertEquals(1, fish.monthsUntilCrowded(5, 6, 4));
		Assert.assertEquals(0, fish.monthsUntilCrowded(4, 6, 4));
		Assert.assertEquals(19, fish.monthsUntilCrowded(1000000, 3, 2));
		Assert.assertEquals(11, fish.monthsUntilCrowded(431131, 764, 249));
	}
	
	@Test
	public void monthsUntilCrowdedSystemTest() {
		Assert.assertEquals(2, fish.monthsUntilCrowded(10, 4, 6));
		Assert.assertEquals(5, fish.monthsUntilCrowded(100, 4, 6));
		Assert.assertEquals(1, fish.monthsUntilCrowded(5, 6, 4));
		Assert.assertEquals(0, fish.monthsUntilCrowded(4, 6, 4));
		Assert.assertEquals(19, fish.monthsUntilCrowded(1000000, 3, 2));
		Assert.assertEquals(11, fish.monthsUntilCrowded(431131, 764, 249));
		Assert.assertEquals(11, fish.monthsUntilCrowded(948885, 971, 526));
		Assert.assertEquals(6, fish.monthsUntilCrowded(21506, 919, 520));
		Assert.assertEquals(10, fish.monthsUntilCrowded(118094, 183, 503));
		Assert.assertEquals(12, fish.monthsUntilCrowded(955277, 293, 477));
		Assert.assertEquals(12, fish.monthsUntilCrowded(678033, 457, 171));
		Assert.assertEquals(11, fish.monthsUntilCrowded(268744, 210, 401));
		Assert.assertEquals(11, fish.monthsUntilCrowded(327864, 227, 914));
		Assert.assertEquals(14, fish.monthsUntilCrowded(411244, 242, 31));
		Assert.assertEquals(11, fish.monthsUntilCrowded(307459, 388, 247));
		Assert.assertEquals(10, fish.monthsUntilCrowded(356731, 757, 431));
		Assert.assertEquals(11, fish.monthsUntilCrowded(291086, 218, 728));
		Assert.assertEquals(14, fish.monthsUntilCrowded(835213, 94, 714));
		Assert.assertEquals(14, fish.monthsUntilCrowded(781165, 380, 66));
		Assert.assertEquals(9, fish.monthsUntilCrowded(299824, 738, 976));
		Assert.assertEquals(10, fish.monthsUntilCrowded(700535, 808, 936));
		Assert.assertEquals(12, fish.monthsUntilCrowded(470158, 444, 194));
		Assert.assertEquals(10, fish.monthsUntilCrowded(524441, 559, 757));
		Assert.assertEquals(12, fish.monthsUntilCrowded(977161, 411, 714));
		Assert.assertEquals(16, fish.monthsUntilCrowded(204060, 262, 4));
		Assert.assertEquals(6, fish.monthsUntilCrowded(25898, 820, 553));
		Assert.assertEquals(13, fish.monthsUntilCrowded(426602, 95, 795));
		Assert.assertEquals(11, fish.monthsUntilCrowded(992799, 720, 776));
		Assert.assertEquals(11, fish.monthsUntilCrowded(669500, 391, 502));
		Assert.assertEquals(11, fish.monthsUntilCrowded(641454, 430, 574));
		Assert.assertEquals(10, fish.monthsUntilCrowded(273734, 987, 461));
		Assert.assertEquals(10, fish.monthsUntilCrowded(90626, 94, 201));
		Assert.assertEquals(13, fish.monthsUntilCrowded(812595, 404, 143));
		Assert.assertEquals(12, fish.monthsUntilCrowded(337808, 594, 110));
		Assert.assertEquals(11, fish.monthsUntilCrowded(536745, 399, 480));
		Assert.assertEquals(10, fish.monthsUntilCrowded(523748, 697, 924));
		Assert.assertEquals(10, fish.monthsUntilCrowded(513296, 760, 824));
		Assert.assertEquals(7, fish.monthsUntilCrowded(48230, 977, 477));
		Assert.assertEquals(11, fish.monthsUntilCrowded(173329, 871, 141));
		Assert.assertEquals(12, fish.monthsUntilCrowded(77533, 30, 984));
		Assert.assertEquals(10, fish.monthsUntilCrowded(141912, 710, 247));
		Assert.assertEquals(11, fish.monthsUntilCrowded(545276, 523, 847));
		Assert.assertEquals(10, fish.monthsUntilCrowded(308105, 598, 452));
		Assert.assertEquals(9, fish.monthsUntilCrowded(294032, 671, 807));
		Assert.assertEquals(10, fish.monthsUntilCrowded(557796, 607, 680));
		Assert.assertEquals(11, fish.monthsUntilCrowded(330247, 229, 959));
		Assert.assertEquals(9, fish.monthsUntilCrowded(135324, 653, 333));
		Assert.assertEquals(11, fish.monthsUntilCrowded(582323, 924, 434));
		Assert.assertEquals(13, fish.monthsUntilCrowded(749403, 353, 173));
		Assert.assertEquals(9, fish.monthsUntilCrowded(226239, 933, 673));
		Assert.assertEquals(11, fish.monthsUntilCrowded(459169, 526, 443));
		Assert.assertEquals(9, fish.monthsUntilCrowded(136628, 434, 374));
		Assert.assertEquals(6, fish.monthsUntilCrowded(35028, 722, 924));
		Assert.assertEquals(9, fish.monthsUntilCrowded(349905, 804, 779));
		Assert.assertEquals(11, fish.monthsUntilCrowded(477094, 448, 742));
		Assert.assertEquals(16, fish.monthsUntilCrowded(901631, 36, 22));
		Assert.assertEquals(11, fish.monthsUntilCrowded(540756, 482, 300));
		Assert.assertEquals(13, fish.monthsUntilCrowded(772601, 152, 343));
		Assert.assertEquals(12, fish.monthsUntilCrowded(629442, 285, 997));
		Assert.assertEquals(14, fish.monthsUntilCrowded(992741, 611, 66));
		Assert.assertEquals(10, fish.monthsUntilCrowded(28071, 31, 530));
		Assert.assertEquals(11, fish.monthsUntilCrowded(559030, 292, 325));
		Assert.assertEquals(11, fish.monthsUntilCrowded(434435, 742, 309));
		Assert.assertEquals(12, fish.monthsUntilCrowded(807007, 882, 213));
		Assert.assertEquals(12, fish.monthsUntilCrowded(896997, 930, 343));
		Assert.assertEquals(12, fish.monthsUntilCrowded(774047, 590, 211));
		Assert.assertEquals(9, fish.monthsUntilCrowded(243000, 775, 786));
		Assert.assertEquals(9, fish.monthsUntilCrowded(204537, 746, 493));
		Assert.assertEquals(12, fish.monthsUntilCrowded(920332, 399, 294));
		Assert.assertEquals(8, fish.monthsUntilCrowded(195867, 979, 767));
		Assert.assertEquals(12, fish.monthsUntilCrowded(569380, 190, 944));
		Assert.assertEquals(12, fish.monthsUntilCrowded(539794, 375, 210));
		Assert.assertEquals(12, fish.monthsUntilCrowded(676669, 379, 189));
		Assert.assertEquals(12, fish.monthsUntilCrowded(401270, 378, 123));
		Assert.assertEquals(11, fish.monthsUntilCrowded(825992, 655, 781));
		Assert.assertEquals(11, fish.monthsUntilCrowded(590151, 694, 489));
		Assert.assertEquals(12, fish.monthsUntilCrowded(881949, 895, 306));
		Assert.assertEquals(13, fish.monthsUntilCrowded(974360, 732, 184));
		Assert.assertEquals(12, fish.monthsUntilCrowded(530324, 676, 182));
		Assert.assertEquals(10, fish.monthsUntilCrowded(571512, 844, 674));
		Assert.assertEquals(11, fish.monthsUntilCrowded(561554, 417, 494));
		Assert.assertEquals(10, fish.monthsUntilCrowded(345175, 988, 406));
		Assert.assertEquals(13, fish.monthsUntilCrowded(546418, 119, 348));
		Assert.assertEquals(10, fish.monthsUntilCrowded(356267, 660, 588));
		Assert.assertEquals(11, fish.monthsUntilCrowded(308511, 554, 291));
		Assert.assertEquals(11, fish.monthsUntilCrowded(702387, 487, 432));
		Assert.assertEquals(9, fish.monthsUntilCrowded(34231, 89, 922));
		Assert.assertEquals(10, fish.monthsUntilCrowded(685142, 892, 731));
		Assert.assertEquals(11, fish.monthsUntilCrowded(312676, 194, 246));
		Assert.assertEquals(11, fish.monthsUntilCrowded(395882, 426, 254));
		Assert.assertEquals(11, fish.monthsUntilCrowded(738096, 460, 460));
		Assert.assertEquals(13, fish.monthsUntilCrowded(874816, 132, 359));
		Assert.assertEquals(10, fish.monthsUntilCrowded(576510, 761, 817));
		Assert.assertEquals(12, fish.monthsUntilCrowded(241065, 348, 66));
		Assert.assertEquals(13, fish.monthsUntilCrowded(452108, 100, 207));
		Assert.assertEquals(11, fish.monthsUntilCrowded(641295, 341, 789));
		Assert.assertEquals(11, fish.monthsUntilCrowded(324032, 511, 160));
		Assert.assertEquals(11, fish.monthsUntilCrowded(878187, 807, 644));
		Assert.assertEquals(10, fish.monthsUntilCrowded(65843, 68, 400));
		Assert.assertEquals(13, fish.monthsUntilCrowded(980453, 138, 411));
		Assert.assertEquals(3, fish.monthsUntilCrowded(30, 4, 12));
		Assert.assertEquals(3, fish.monthsUntilCrowded(40, 10, 10));
		Assert.assertEquals(1, fish.monthsUntilCrowded(1, 1, 1));
		Assert.assertEquals(0, fish.monthsUntilCrowded(1, 1, 2));
		Assert.assertEquals(0, fish.monthsUntilCrowded(1, 2, 1));
		Assert.assertEquals(0, fish.monthsUntilCrowded(10, 10, 11));
		Assert.assertEquals(6, fish.monthsUntilCrowded(100, 3, 5));
		Assert.assertEquals(11, fish.monthsUntilCrowded(431131, 764, 249));
		Assert.assertEquals(2, fish.monthsUntilCrowded(2, 1, 1));
		Assert.assertEquals(1, fish.monthsUntilCrowded(50, 50, 50));
		Assert.assertEquals(2, fish.monthsUntilCrowded(3, 1, 3));
		Assert.assertEquals(0, fish.monthsUntilCrowded(6, 6, 7));
		Assert.assertEquals(2, fish.monthsUntilCrowded(100, 40, 60));
		Assert.assertEquals(1, fish.monthsUntilCrowded(6, 6, 6));
		Assert.assertEquals(1, fish.monthsUntilCrowded(5, 6, 4));
		Assert.assertEquals(2, fish.monthsUntilCrowded(10, 6, 4));
		Assert.assertEquals(0, fish.monthsUntilCrowded(10, 9, 100));
		Assert.assertEquals(0, fish.monthsUntilCrowded(2, 2, 3));
		Assert.assertEquals(0, fish.monthsUntilCrowded(4, 4, 5));
		Assert.assertEquals(2, fish.monthsUntilCrowded(8, 12, 1));
		Assert.assertEquals(2, fish.monthsUntilCrowded(10, 2, 8));
		Assert.assertEquals(4, fish.monthsUntilCrowded(20, 1, 20));
		Assert.assertEquals(3, fish.monthsUntilCrowded(17, 4, 6));
		Assert.assertEquals(0, fish.monthsUntilCrowded(8, 9, 8));
	}
}

package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Inchworm;

public class InchwormTest {
	Inchworm worm;
	
	@Before
	public void setUp() throws Exception {
		worm = new Inchworm();
	}

	@After
	public void tearDown() throws Exception {
		worm = null;
	}

	@Test
	public void testLunchtime() {
		Assert.assertEquals(3, worm.lunchtime(11, 2, 4));
		Assert.assertEquals(2, worm.lunchtime(12, 6, 4));
		Assert.assertEquals(1, worm.lunchtime(20, 3, 7));
		Assert.assertEquals(2, worm.lunchtime(21, 7, 3));
		Assert.assertEquals(1, worm.lunchtime(15, 16, 5));
		Assert.assertEquals(48, worm.lunchtime(1000, 3, 7));
		Assert.assertEquals(48, worm.lunchtime(1000, 7, 3));
		// Assert.assertEquals(, worm.lunchtime(, , ));
	}

	@Test
	public void lunchtimeSystemTest() {
		Assert.assertEquals(3, worm.lunchtime(11, 2, 4));
		Assert.assertEquals(2, worm.lunchtime(12, 6, 4));
		Assert.assertEquals(1, worm.lunchtime(20, 3, 7));
		Assert.assertEquals(2, worm.lunchtime(21, 7, 3));
		Assert.assertEquals(1, worm.lunchtime(15, 16, 5));
		Assert.assertEquals(48, worm.lunchtime(1000, 3, 7));
		Assert.assertEquals(48, worm.lunchtime(1000, 7, 3));
		Assert.assertEquals(1, worm.lunchtime(7872, 286, 64));
		Assert.assertEquals(3, worm.lunchtime(17306, 139, 42));
		Assert.assertEquals(1, worm.lunchtime(22207, 279, 86));
		Assert.assertEquals(1, worm.lunchtime(31216, 912, 77));
		Assert.assertEquals(66, worm.lunchtime(44450, 25, 27));
		Assert.assertEquals(1525, worm.lunchtime(50310, 3, 33));
		Assert.assertEquals(15, worm.lunchtime(68852, 172, 27));
		Assert.assertEquals(2, worm.lunchtime(70175, 499, 82));
		Assert.assertEquals(12, worm.lunchtime(87668, 819, 81));
		Assert.assertEquals(4, worm.lunchtime(98020, 977, 28));
		Assert.assertEquals(3, worm.lunchtime(103970, 534, 91));
		Assert.assertEquals(13, worm.lunchtime(116737, 387, 25));
		Assert.assertEquals(69, worm.lunchtime(126533, 462, 24));
		Assert.assertEquals(2, worm.lunchtime(139739, 890, 93));
		Assert.assertEquals(74, worm.lunchtime(141638, 102, 38));
		Assert.assertEquals(18, worm.lunchtime(150112, 644, 26));
		Assert.assertEquals(31, worm.lunchtime(168301, 60, 91));
		Assert.assertEquals(35, worm.lunchtime(175599, 736, 7));
		Assert.assertEquals(14, worm.lunchtime(186508, 537, 25));
		Assert.assertEquals(10, worm.lunchtime(196965, 770, 52));
		Assert.assertEquals(16, worm.lunchtime(203658, 459, 29));
		Assert.assertEquals(663, worm.lunchtime(212006, 320, 10));
		Assert.assertEquals(57, worm.lunchtime(220831, 980, 80));
		Assert.assertEquals(8, worm.lunchtime(233971, 313, 94));
		Assert.assertEquals(260, worm.lunchtime(242959, 117, 72));
		Assert.assertEquals(118, worm.lunchtime(254069, 47, 46));
		Assert.assertEquals(6, worm.lunchtime(266189, 595, 79));
		Assert.assertEquals(8, worm.lunchtime(270824, 388, 95));
		Assert.assertEquals(80, worm.lunchtime(288285, 606, 36));
		Assert.assertEquals(39, worm.lunchtime(291959, 124, 61));
		Assert.assertEquals(72, worm.lunchtime(308550, 620, 28));
		Assert.assertEquals(29, worm.lunchtime(310109, 850, 26));
		Assert.assertEquals(78, worm.lunchtime(328657, 98, 86));
		Assert.assertEquals(60, worm.lunchtime(336738, 810, 14));
		Assert.assertEquals(35, worm.lunchtime(348301, 131, 78));
		Assert.assertEquals(22, worm.lunchtime(356116, 325, 51));
		Assert.assertEquals(23, worm.lunchtime(364757, 319, 51));
		Assert.assertEquals(123, worm.lunchtime(372894, 762, 24));
		Assert.assertEquals(16, worm.lunchtime(387992, 247, 100));
		Assert.assertEquals(6, worm.lunchtime(396711, 804, 83));
		Assert.assertEquals(16, worm.lunchtime(408058, 327, 83));
		Assert.assertEquals(16, worm.lunchtime(415448, 289, 93));
		Assert.assertEquals(58, worm.lunchtime(428714, 275, 27));
		Assert.assertEquals(87, worm.lunchtime(431027, 73, 68));
		Assert.assertEquals(7, worm.lunchtime(440817, 675, 98));
		Assert.assertEquals(12, worm.lunchtime(455523, 579, 70));
		Assert.assertEquals(31, worm.lunchtime(463439, 197, 76));
		Assert.assertEquals(9, worm.lunchtime(476703, 824, 67));
		Assert.assertEquals(754, worm.lunchtime(486475, 646, 2));
		Assert.assertEquals(19, worm.lunchtime(496412, 578, 92));
		Assert.assertEquals(436, worm.lunchtime(508990, 78, 90));
		Assert.assertEquals(19, worm.lunchtime(517569, 55, 509));
		Assert.assertEquals(60, worm.lunchtime(527327, 81, 327));
		Assert.assertEquals(30, worm.lunchtime(531784, 55, 329));
		Assert.assertEquals(16, worm.lunchtime(546447, 59, 608));
		Assert.assertEquals(600, worm.lunchtime(558890, 3, 933));
		Assert.assertEquals(107, worm.lunchtime(565227, 31, 172));
		Assert.assertEquals(119, worm.lunchtime(572565, 28, 692));
		Assert.assertEquals(21, worm.lunchtime(587437, 49, 594));
		Assert.assertEquals(343, worm.lunchtime(598465, 2, 873));
		Assert.assertEquals(33, worm.lunchtime(608562, 49, 386));
		Assert.assertEquals(32, worm.lunchtime(618186, 39, 502));
		Assert.assertEquals(26, worm.lunchtime(621989, 27, 904));
		Assert.assertEquals(22, worm.lunchtime(638644, 59, 506));
		Assert.assertEquals(47, worm.lunchtime(649302, 63, 663));
		Assert.assertEquals(8568, worm.lunchtime(659709, 7, 11));
		Assert.assertEquals(82, worm.lunchtime(660314, 40, 812));
		Assert.assertEquals(130, worm.lunchtime(673601, 61, 85));
		Assert.assertEquals(84, worm.lunchtime(681181, 17, 479));
		Assert.assertEquals(47, worm.lunchtime(692402, 42, 712));
		Assert.assertEquals(2039, worm.lunchtime(709292, 4, 348));
		Assert.assertEquals(1538, worm.lunchtime(710104, 3, 154));
		Assert.assertEquals(165, worm.lunchtime(729917, 13, 341));
		Assert.assertEquals(19, worm.lunchtime(734539, 95, 428));
		Assert.assertEquals(12, worm.lunchtime(744435, 90, 743));
		Assert.assertEquals(112, worm.lunchtime(756509, 60, 339));
		Assert.assertEquals(20, worm.lunchtime(760805, 80, 994));
		Assert.assertEquals(586, worm.lunchtime(772319, 33, 440));
		Assert.assertEquals(33, worm.lunchtime(784781, 85, 288));
		Assert.assertEquals(165, worm.lunchtime(796478, 14, 345));
		Assert.assertEquals(61, worm.lunchtime(801670, 45, 293));
		Assert.assertEquals(485, worm.lunchtime(815867, 51, 99));
		Assert.assertEquals(133, worm.lunchtime(822467, 9, 688));
		Assert.assertEquals(1200, worm.lunchtime(835003, 29, 696));
		Assert.assertEquals(37, worm.lunchtime(840738, 31, 737));
		Assert.assertEquals(455, worm.lunchtime(857463, 32, 118));
		Assert.assertEquals(31, worm.lunchtime(867877, 49, 573));
		Assert.assertEquals(29, worm.lunchtime(875741, 98, 638));
		Assert.assertEquals(12, worm.lunchtime(883104, 90, 881));
		Assert.assertEquals(88, worm.lunchtime(899002, 11, 936));
		Assert.assertEquals(34, worm.lunchtime(906502, 86, 315));
		Assert.assertEquals(31, worm.lunchtime(918346, 53, 573));
		Assert.assertEquals(530, worm.lunchtime(926058, 23, 76));
		Assert.assertEquals(6, worm.lunchtime(10, 2, 2));
		Assert.assertEquals(11, worm.lunchtime(10, 1, 1));
		Assert.assertEquals(1001, worm.lunchtime(1000, 1, 1));
		Assert.assertEquals(1, worm.lunchtime(4, 3, 2));
		Assert.assertEquals(1000001, worm.lunchtime(1000000, 1, 1));
	}

}

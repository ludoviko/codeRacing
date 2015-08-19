package com.lam.coder.topCoder;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.SemiPerfectSquare;

public class SemiPerfectSquareTest {
	SemiPerfectSquare semi;
	
	@Before
	public void setUp() throws Exception {
		semi = new SemiPerfectSquare();
	}

	@After
	public void tearDown() throws Exception {
		semi = null;
	}

	@Test
	public void testCheck() {
		Assert.assertEquals(SemiPerfectSquare.YES, semi.check(48));
		Assert.assertEquals(SemiPerfectSquare.NO, semi.check(1000));
		Assert.assertEquals(SemiPerfectSquare.YES, semi.check(25));
		Assert.assertEquals(SemiPerfectSquare.NO, semi.check(47));
	}
	
	@Test
	public void testCheckSystemTest() {
		Assert.assertEquals("Yes", semi.check(48));
		Assert.assertEquals("No", semi.check(1000));
		Assert.assertEquals("Yes", semi.check(25));
		Assert.assertEquals("No", semi.check(47));
		Assert.assertEquals("Yes", semi.check(847));
		Assert.assertEquals("No", semi.check(3));
		Assert.assertEquals("Yes", semi.check(4));
		Assert.assertEquals("No", semi.check(5));
		Assert.assertEquals("No", semi.check(6));
		Assert.assertEquals("No", semi.check(7));
		Assert.assertEquals("No", semi.check(8));
		Assert.assertEquals("Yes", semi.check(9));
		Assert.assertEquals("No", semi.check(10));
		Assert.assertEquals("Yes", semi.check(16));
		Assert.assertEquals("Yes", semi.check(18));
		Assert.assertEquals("No", semi.check(27));
		Assert.assertEquals("Yes", semi.check(49));
		Assert.assertEquals("No", semi.check(83));
		Assert.assertEquals("Yes", semi.check(100));
		Assert.assertEquals("No", semi.check(396));
		Assert.assertEquals("Yes", semi.check(507));
		Assert.assertEquals("No", semi.check(33));
		Assert.assertEquals("No", semi.check(58));
		Assert.assertEquals("No", semi.check(63));
		Assert.assertEquals("No", semi.check(67));
		Assert.assertEquals("Yes", semi.check(72));
		Assert.assertEquals("No", semi.check(78));
		Assert.assertEquals("Yes", semi.check(81));
		Assert.assertEquals("No", semi.check(84));
		Assert.assertEquals("Yes", semi.check(98));
		Assert.assertEquals("Yes", semi.check(108));
		Assert.assertEquals("Yes", semi.check(121));
		Assert.assertEquals("No", semi.check(141));
		Assert.assertEquals("Yes", semi.check(144));
		Assert.assertEquals("No", semi.check(155));
		Assert.assertEquals("Yes", semi.check(162));
		Assert.assertEquals("No", semi.check(216));
		Assert.assertEquals("Yes", semi.check(225));
		Assert.assertEquals("No", semi.check(238));
		Assert.assertEquals("No", semi.check(240));
		Assert.assertEquals("Yes", semi.check(243));
		Assert.assertEquals("No", semi.check(265));
		Assert.assertEquals("Yes", semi.check(288));
		Assert.assertEquals("Yes", semi.check(289));
		Assert.assertEquals("Yes", semi.check(300));
		Assert.assertEquals("No", semi.check(303));
		Assert.assertEquals("No", semi.check(317));
		Assert.assertEquals("Yes", semi.check(320));
		Assert.assertEquals("No", semi.check(351));
		Assert.assertEquals("No", semi.check(377));
		Assert.assertEquals("No", semi.check(394));
		Assert.assertEquals("Yes", semi.check(405));
		Assert.assertEquals("No", semi.check(419));
		Assert.assertEquals("No", semi.check(438));
		Assert.assertEquals("No", semi.check(439));
		Assert.assertEquals("Yes", semi.check(441));
		Assert.assertEquals("No", semi.check(447));
		Assert.assertEquals("No", semi.check(449));
		Assert.assertEquals("No", semi.check(458));
		Assert.assertEquals("No", semi.check(472));
		Assert.assertEquals("Yes", semi.check(486));
		Assert.assertEquals("Yes", semi.check(512));
		Assert.assertEquals("No", semi.check(515));
		Assert.assertEquals("No", semi.check(554));
		Assert.assertEquals("No", semi.check(589));
		Assert.assertEquals("Yes", semi.check(600));
		Assert.assertEquals("Yes", semi.check(625));
		Assert.assertEquals("No", semi.check(635));
		Assert.assertEquals("No", semi.check(643));
		Assert.assertEquals("No", semi.check(647));
		Assert.assertEquals("Yes", semi.check(648));
		Assert.assertEquals("No", semi.check(659));
		Assert.assertEquals("No", semi.check(717));
		Assert.assertEquals("No", semi.check(735));
		Assert.assertEquals("No", semi.check(759));
		Assert.assertEquals("No", semi.check(766));
		Assert.assertEquals("No", semi.check(781));
		Assert.assertEquals("No", semi.check(813));
		Assert.assertEquals("No", semi.check(826));
		Assert.assertEquals("Yes", semi.check(841));
		Assert.assertEquals("Yes", semi.check(845));
		Assert.assertEquals("No", semi.check(852));
		Assert.assertEquals("No", semi.check(855));
		Assert.assertEquals("No", semi.check(887));
		Assert.assertEquals("Yes", semi.check(900));
		Assert.assertEquals("No", semi.check(930));
		Assert.assertEquals("No", semi.check(946));
		Assert.assertEquals("Yes", semi.check(968));
		Assert.assertEquals("Yes", semi.check(169));
		Assert.assertEquals("Yes", semi.check(529));
		Assert.assertEquals("No", semi.check(24));
		Assert.assertEquals("No", semi.check(12));
		Assert.assertEquals("Yes", semi.check(75));
		Assert.assertEquals("Yes", semi.check(50));
		Assert.assertEquals("No", semi.check(901));
		Assert.assertEquals("Yes", semi.check(576));
		Assert.assertEquals("No", semi.check(90));
		Assert.assertEquals("No", semi.check(343));
		Assert.assertEquals("Yes", semi.check(64));
		Assert.assertEquals("No", semi.check(20));
		Assert.assertEquals("No", semi.check(999));
	}

}

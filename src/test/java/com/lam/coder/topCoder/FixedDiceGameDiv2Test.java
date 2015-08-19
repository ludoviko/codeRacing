package com.lam.coder.topCoder;

import org.junit.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.FixedDiceGameDiv2;

public class FixedDiceGameDiv2Test {
	
	FixedDiceGameDiv2 dice;
	double delta = 1e-9;
	
	@Before
	public void setUp() throws Exception {
		dice = new FixedDiceGameDiv2();
	}

	@After
	public void tearDown() throws Exception {
		dice = null;
	}

	@Test
	public void testGetExpectation() {
		Assert.assertEquals(2.0, dice.getExpectation(2,2), delta);
		Assert.assertEquals(3.2, dice.getExpectation(4,2), delta);
		Assert.assertEquals(2.6666666666666665, dice.getExpectation(3,3), delta);
		Assert.assertEquals(7.999999999999999, dice.getExpectation(11,13), delta);
	}

	@Test
	public void testGetExpectationSystemTest() {
		Assert.assertEquals(2.0, dice.getExpectation(2, 2), delta);
		Assert.assertEquals(3.2, dice.getExpectation(4, 2), delta);
		Assert.assertEquals(4.666666666666667, dice.getExpectation(6, 6), delta);
		Assert.assertEquals(34.0, dice.getExpectation(50, 50), delta);
		Assert.assertEquals(2.6666666666666665, dice.getExpectation(3, 3), delta);
		Assert.assertEquals(7.999999999999999, dice.getExpectation(11, 13), delta);
		Assert.assertEquals(2.0, dice.getExpectation(2, 1000), delta);
		Assert.assertEquals(501.2498748122179, dice.getExpectation(1000, 2), delta);
		Assert.assertEquals(667.3333333333333, dice.getExpectation(1000, 1000), delta);
		Assert.assertEquals(278.40618101545294, dice.getExpectation(418, 382), delta);
		Assert.assertEquals(382.6666666666668, dice.getExpectation(573, 923), delta);
		Assert.assertEquals(101.10905349794261, dice.getExpectation(182, 39), delta);
		Assert.assertEquals(196.66666666666612, dice.getExpectation(294, 392), delta);
		Assert.assertEquals(383.3333333333333, dice.getExpectation(574, 964), delta);
		Assert.assertEquals(128.66666666666697, dice.getExpectation(192, 723), delta);
		Assert.assertEquals(558.1269205076807, dice.getExpectation(940, 382), delta);
		Assert.assertEquals(246.4746835443017, dice.getExpectation(483, 17), delta);
		Assert.assertEquals(195.99999999999997, dice.getExpectation(293, 420), delta);
		Assert.assertEquals(382.0000000000002, dice.getExpectation(572, 674), delta);
		Assert.assertEquals(567.3333333333334, dice.getExpectation(850, 878), delta);
		Assert.assertEquals(439.8580106302186, dice.getExpectation(681, 483), delta);
		Assert.assertEquals(328.66666666666663, dice.getExpectation(492, 549), delta);
		Assert.assertEquals(135.47656249999977, dice.getExpectation(207, 157), delta);
		Assert.assertEquals(89.99999999999999, dice.getExpectation(134, 323), delta);
		Assert.assertEquals(627.3246833487768, dice.getExpectation(948, 816), delta);
		Assert.assertEquals(375.3771353482258, dice.getExpectation(583, 404), delta);
		Assert.assertEquals(402.6666666666667, dice.getExpectation(603, 727), delta);
		Assert.assertEquals(230.4992690058504, dice.getExpectation(458, 3), delta);
		Assert.assertEquals(122.00000000000001, dice.getExpectation(182, 683), delta);
		Assert.assertEquals(495.262270400481, dice.getExpectation(788, 468), delta);
		Assert.assertEquals(288.8945478289269, dice.getExpectation(544, 66), delta);
		Assert.assertEquals(432.66666666666686, dice.getExpectation(648, 856), delta);
		Assert.assertEquals(306.6666666666666, dice.getExpectation(459, 600), delta);
		Assert.assertEquals(332.0000000000003, dice.getExpectation(497, 883), delta);
		Assert.assertEquals(390.15978334462284, dice.getExpectation(759, 40), delta);
		Assert.assertEquals(470.7959094865139, dice.getExpectation(855, 177), delta);
		Assert.assertEquals(327.9922239502304, dice.getExpectation(649, 11), delta);
		Assert.assertEquals(166.62729658792654, dice.getExpectation(249, 243), delta);
		Assert.assertEquals(332.1866666666661, dice.getExpectation(498, 470), delta);
		Assert.assertEquals(553.3724812895771, dice.getExpectation(866, 573), delta);
		Assert.assertEquals(337.5041782729804, dice.getExpectation(530, 341), delta);
		Assert.assertEquals(160.0, dice.getExpectation(239, 869), delta);
		Assert.assertEquals(353.32729269631477, dice.getExpectation(657, 99), delta);
		Assert.assertEquals(214.66666666666683, dice.getExpectation(321, 487), delta);
		Assert.assertEquals(219.97005988023966, dice.getExpectation(329, 323), delta);
		Assert.assertEquals(524.1550954120997, dice.getExpectation(786, 750), delta);
		Assert.assertEquals(435.20613026819996, dice.getExpectation(674, 477), delta);
		Assert.assertEquals(504.9642492339228, dice.getExpectation(994, 29), delta);
		Assert.assertEquals(280.66666666666674, dice.getExpectation(420, 457), delta);
		Assert.assertEquals(30.0, dice.getExpectation(44, 51), delta);
		Assert.assertEquals(9.333333333333334, dice.getExpectation(13, 796), delta);
		Assert.assertEquals(467.3333333333329, dice.getExpectation(700, 700), delta);
		Assert.assertEquals(4.0, dice.getExpectation(5, 7), delta);
		Assert.assertEquals(4.222222222222222, dice.getExpectation(6, 2), delta);
		Assert.assertEquals(611.1481975968048, dice.getExpectation(999, 499), delta);
		Assert.assertEquals(6.235294117647061, dice.getExpectation(10, 2), delta);
		Assert.assertEquals(33.333333333333336, dice.getExpectation(49, 48), delta);
	}

}

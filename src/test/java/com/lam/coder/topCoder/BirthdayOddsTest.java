package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.BirthdayOdds;

public class BirthdayOddsTest {
	BirthdayOdds odds;

	@Before
	public void setUp() throws Exception {
		odds = new BirthdayOdds();
	}

	@After
	public void tearDown() throws Exception {
		odds = null;
	}

	@Test
	public void testMinPeople() {
		Assert.assertEquals(4, odds.minPeople(75, 5));
		Assert.assertEquals(23, odds.minPeople(50, 365));
		Assert.assertEquals(4, odds.minPeople(1, 365));
		Assert.assertEquals(184, odds.minPeople(84, 9227));
	}

	@Test
	public void testMinPeopleSystemTest() {
		Assert.assertEquals(23, odds.minPeople(50, 365));
		Assert.assertEquals(4, odds.minPeople(1, 365));
		Assert.assertEquals(184, odds.minPeople(84, 9227));
		Assert.assertEquals(175, odds.minPeople(99, 3349));
		Assert.assertEquals(32, odds.minPeople(14, 3100));
		Assert.assertEquals(65, odds.minPeople(40, 4093));
		Assert.assertEquals(188, odds.minPeople(84, 9557));
		Assert.assertEquals(58, odds.minPeople(24, 5986));
		Assert.assertEquals(72, odds.minPeople(25, 8819));
		Assert.assertEquals(113, odds.minPeople(62, 6528));
		Assert.assertEquals(58, odds.minPeople(28, 4955));
		Assert.assertEquals(122, odds.minPeople(75, 5346));
		Assert.assertEquals(56, odds.minPeople(76, 1084));
		Assert.assertEquals(112, odds.minPeople(68, 5435));
		Assert.assertEquals(19, odds.minPeople(13, 1184));
		Assert.assertEquals(229, odds.minPeople(98, 6729));
		Assert.assertEquals(78, odds.minPeople(83, 1699));
		Assert.assertEquals(67, odds.minPeople(23, 8446));
		Assert.assertEquals(4, odds.minPeople(75, 5));
		Assert.assertEquals(2, odds.minPeople(99, 1));
		Assert.assertEquals(2, odds.minPeople(1, 1));
		Assert.assertEquals(3, odds.minPeople(99, 2));
		Assert.assertEquals(2, odds.minPeople(50, 1));
		Assert.assertEquals(3, odds.minPeople(75, 2));
		Assert.assertEquals(4, odds.minPeople(75, 5));
		Assert.assertEquals(7, odds.minPeople(99, 6));
		Assert.assertEquals(6, odds.minPeople(99, 5));
		Assert.assertEquals(2, odds.minPeople(5, 1));
		Assert.assertEquals(3, odds.minPeople(95, 2));
	}

}

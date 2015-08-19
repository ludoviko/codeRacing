package com.lam.coder.topCoder;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.SpamChecker;

public class SpamCheckerTest {
	SpamChecker checker;
	
	@Before
	public void setUp() throws Exception {
		checker = new SpamChecker();
	}

	@After
	public void tearDown() throws Exception {
		checker = null;
	}

	@Test
	public void testSpamCheck() {
		Assert.assertEquals(SpamChecker.SPAM, checker.spamCheck("ooooxxxo", 2, 3));
		Assert.assertEquals(SpamChecker.NOT_SPAM, checker.spamCheck("ooooxxxo", 3, 4));
		Assert.assertEquals(SpamChecker.SPAM, checker.spamCheck("xooooooooooooooooooooooooooo", 1000, 1));
		Assert.assertEquals(SpamChecker.NOT_SPAM, checker.spamCheck("oxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 1000, 1));
		Assert.assertEquals(SpamChecker.SPAM, checker.spamCheck("ooxoxoxooxoxxoxoxooxoxoxoxxoxx", 15, 17));
		Assert.assertEquals(SpamChecker.NOT_SPAM, checker.spamCheck("oooxoxoxoxoxoxooxooxoxooxo", 16, 18));
	}

	@Test
	public void testSpamCheckSysteTest() { 
		Assert.assertEquals("SPAM", checker.spamCheck("ooooxxxo", 2, 3));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("ooooxxxo", 3, 4));
		Assert.assertEquals("SPAM", checker.spamCheck("xooooooooooooooooooooooooooo", 1000, 1));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("oxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 1000, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("ooxoxoxooxoxxoxoxooxoxoxoxxoxx", 15, 17));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("oooxoxoxoxoxoxooxooxoxooxo", 16, 18));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("o", 1, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("x", 1, 1));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("ox", 1, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("xo", 1, 1));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("oo", 1, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("xx", 1, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("oxoxxxxxoooooxoxxoxooxxxooxxoooxxo", 945, 921));
		Assert.assertEquals("SPAM", checker.spamCheck("xxooxxxoooo", 191, 492));
		Assert.assertEquals("SPAM", checker.spamCheck("xooxoxoxxxoxxxxoxooooooooxxoxxoooxoxxooxoxxoo", 964, 657));
		Assert.assertEquals("SPAM", checker.spamCheck("oxxxxoxxxoox", 565, 848));
		Assert.assertEquals("SPAM", checker.spamCheck("oxoxooooooxxoxxoooxxoxxooxoxxooxxoxoxooxooxxooxx", 303, 788));
		Assert.assertEquals("SPAM", checker.spamCheck("oxxxxoxoxox", 220, 387));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("o", 683, 56));
		Assert.assertEquals("SPAM", checker.spamCheck("oxxxoxxooxoxoxoxoxooxooox", 874, 949));
		Assert.assertEquals("SPAM", checker.spamCheck("xxox", 144, 645));
		Assert.assertEquals("SPAM", checker.spamCheck("oooooxoooooxoxxoooooooxoxoxxxooxxxoxxxxoo", 80, 955));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("oox", 433, 837));
		Assert.assertEquals("SPAM", checker.spamCheck("oooxoxxoxooxxo", 155, 529));
		Assert.assertEquals("SPAM", checker.spamCheck("oxxxxxooxooooxoxxooooxxxoxxoxoo", 408, 750));
		Assert.assertEquals("SPAM", checker.spamCheck("xoooxxxooooxxoxxxooooxxxooxoxoxxooooo", 842, 459));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("oooooxxoooxxoxooxxxooxxoxxooooxoxxooxoxoxxoxxoxoo", 448, 25));
		Assert.assertEquals("SPAM", checker.spamCheck("oxo", 589, 793));
		Assert.assertEquals("SPAM", checker.spamCheck("oxxxo", 507, 729));
		Assert.assertEquals("SPAM", checker.spamCheck("xxxxxxooooxoxxxxxxooooxxxoooxoooooxooxxxoo", 642, 581));
		Assert.assertEquals("SPAM", checker.spamCheck("xoxxxxxxooooxoxxx", 672, 605));
		Assert.assertEquals("SPAM", checker.spamCheck("oxooooxooxxxxxxxxxxooxo", 649, 894));
		Assert.assertEquals("SPAM", checker.spamCheck("ooxxxxox", 453, 610));
		Assert.assertEquals("SPAM", checker.spamCheck("xxxooxxxxooxxxooxxoxxoo", 225, 778));
		Assert.assertEquals("SPAM", checker.spamCheck("xooxooooxoxxxooxxxxoxxoooxx", 343, 762));
		Assert.assertEquals("SPAM", checker.spamCheck("ooxoxxooxooxxxxooxoxxxxxxxxxoxxoxxooxxxoooxoxoxx", 494, 786));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("ooxoooxoxxxoxooooo", 716, 577));
		Assert.assertEquals("SPAM", checker.spamCheck("xoxxoxxxxxoxxoxoooooxxxooxxoxxxoooxxooooooooxooooo", 596, 354));
		Assert.assertEquals("SPAM", checker.spamCheck("oxxxxoxoxxooxoooxxoxxoxoooxxoxxoxxxoxxoxxoxxxxox", 26, 644));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("ooooxo", 357, 740));
		Assert.assertEquals("SPAM", checker.spamCheck("xoooxoxoxxxxxoxooxxoxooo", 912, 58));
		Assert.assertEquals("SPAM", checker.spamCheck("oxoxooxxxxoxxooxxoo", 438, 614));
		Assert.assertEquals("SPAM", checker.spamCheck("xo", 3, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("x", 1, 5));
		Assert.assertEquals("SPAM", checker.spamCheck("xoo", 10, 10));
		Assert.assertEquals("SPAM", checker.spamCheck("oxxoooo", 4, 7));
		Assert.assertEquals("SPAM", checker.spamCheck("xoooo", 2, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("xoooo", 10, 3));
		Assert.assertEquals("SPAM", checker.spamCheck("ox", 20, 30));
		Assert.assertEquals("SPAM", checker.spamCheck("xxoo", 2, 2));
		Assert.assertEquals("SPAM", checker.spamCheck("xxxoooo", 2, 2));
		Assert.assertEquals("SPAM", checker.spamCheck("xo", 100, 10));
		Assert.assertEquals("SPAM", checker.spamCheck("xooooo", 100, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("xoooo", 1000, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("xoooooooooo", 1, 1));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("ox", 5, 5));
		Assert.assertEquals("SPAM", checker.spamCheck("ox", 2, 5));
		Assert.assertEquals("SPAM", checker.spamCheck("ox", 2, 3));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("ox", 2, 2));
		Assert.assertEquals("SPAM", checker.spamCheck("xoooo", 1, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("oxxxooooo", 1, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("xo", 2, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("xo", 10, 9));
		Assert.assertEquals("SPAM", checker.spamCheck("ooooooooooooooooooooooooooooooooooooooooooooooooox", 1, 1000));
		Assert.assertEquals("SPAM", checker.spamCheck("xxoooo", 5, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("xoo", 30, 5));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("oooxxx", 1, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("x", 2, 3));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("ox", 2, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("ox", 1, 2));
		Assert.assertEquals("SPAM", checker.spamCheck("ooxxx", 1, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("xo", 5, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("x", 100, 100));
		Assert.assertEquals("SPAM", checker.spamCheck("x", 5, 10));
		Assert.assertEquals("SPAM", checker.spamCheck("xoo", 1, 1));
		Assert.assertEquals("SPAM", checker.spamCheck("xxx", 2, 2));
		Assert.assertEquals("NOT SPAM", checker.spamCheck("ox", 3, 3));
		Assert.assertEquals("SPAM", checker.spamCheck("ox", 5, 10));
		Assert.assertEquals("SPAM", checker.spamCheck("x", 5, 7));
	}
}

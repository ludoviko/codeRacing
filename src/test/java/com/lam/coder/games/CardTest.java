package com.lam.coder.games;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.games.Card;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CardTest extends TestCase {
	Card card;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testIllegarCard() {
		try {
			new Card("XX");
			fail("Expected IllegalArgumentException failed to be thrown.");
		} catch (IllegalArgumentException IEx) {
		}
	}

	@Test
	public void testCompareToWithDifferentRank() {
		Assert.assertEquals(-1, new Card("TD").compareTo(new Card("JD")));
		Assert.assertEquals(-1, new Card("JD").compareTo(new Card("QD")));
		Assert.assertEquals(-1, new Card("QD").compareTo(new Card("KD")));
		Assert.assertEquals(-1, new Card("KD").compareTo(new Card("AD")));
		Assert.assertEquals(-1, new Card("2D").compareTo(new Card("3D")));
		Assert.assertEquals(-1, new Card("2D").compareTo(new Card("TD")));
		Assert.assertEquals(0, new Card("9D").compareTo(new Card("9D")));
		Assert.assertEquals(1, new Card("4D").compareTo(new Card("2D")));
		Assert.assertEquals(1, new Card("AD").compareTo(new Card("KD")));
		Assert.assertEquals(1, new Card("KD").compareTo(new Card("QD")));
		Assert.assertEquals(1, new Card("QD").compareTo(new Card("JD")));
		Assert.assertEquals(1, new Card("JD").compareTo(new Card("TD")));
		Assert.assertEquals(1, new Card("TD").compareTo(new Card("2D")));
		Assert.assertEquals(1, new Card("9D").compareTo(new Card("2D")));
	}

	@Test
	public void testComparator() {
		Assert.assertEquals(1,
				Card.SORT_COMPARATOR.compare(new Card("4D"), new Card("AC")));
		Assert.assertEquals(1,
				Card.SORT_COMPARATOR.compare(new Card("2D"), new Card("3C")));
		Assert.assertEquals(1,
				Card.SORT_COMPARATOR.compare(new Card("4D"), new Card("2C")));
		Assert.assertEquals(0,
				Card.SORT_COMPARATOR.compare(new Card("3C"), new Card("3C")));
		Assert.assertEquals(-1,
				Card.SORT_COMPARATOR.compare(new Card("3C"), new Card("2D")));
	}

	// @Test
	public void testComparatorWithSameRankData() {
		Assert.assertEquals(-1,
				Card.SORT_COMPARATOR.compare(new Card("2C"), new Card("2D")));
		Assert.assertEquals(-1,
				Card.SORT_COMPARATOR.compare(new Card("2C"), new Card("2H")));
		Assert.assertEquals(-1,
				Card.SORT_COMPARATOR.compare(new Card("2C"), new Card("2S")));
		Assert.assertEquals(-1,
				Card.SORT_COMPARATOR.compare(new Card("2D"), new Card("2H")));
		Assert.assertEquals(-1,
				Card.SORT_COMPARATOR.compare(new Card("2D"), new Card("2S")));
		Assert.assertEquals(-1,
				Card.SORT_COMPARATOR.compare(new Card("2H"), new Card("2S")));
		Assert.assertEquals(1,
				Card.SORT_COMPARATOR.compare(new Card("2S"), new Card("2C")));
		Assert.assertEquals(1,
				Card.SORT_COMPARATOR.compare(new Card("2S"), new Card("2D")));
		Assert.assertEquals(1,
				Card.SORT_COMPARATOR.compare(new Card("2S"), new Card("2H")));
		Assert.assertEquals(1,
				Card.SORT_COMPARATOR.compare(new Card("2H"), new Card("2C")));
		Assert.assertEquals(1,
				Card.SORT_COMPARATOR.compare(new Card("2H"), new Card("2D")));
		Assert.assertEquals(1,
				Card.SORT_COMPARATOR.compare(new Card("2D"), new Card("2C")));
		Assert.assertEquals(0,
				Card.SORT_COMPARATOR.compare(new Card("2H"), new Card("2H")));
	}
}

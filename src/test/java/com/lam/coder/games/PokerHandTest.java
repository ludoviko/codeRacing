package com.lam.coder.games;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.games.Card;
import com.lam.coder.games.PokerHand;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PokerHandTest extends TestCase {
	PokerHand hand;
	PokerHand hand_2;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		hand = new PokerHand();
		hand_2 = new PokerHand();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
		hand = null;
		hand_2 = null;
	}

	@Test
	public void testIsRoyalFlush() {
		hand.setCards("TD JD QD KD AD");
		Assert.assertTrue(hand.isRoyalFlush());

		hand.setCards("2D JD QD KD AD");
		Assert.assertFalse(hand.isRoyalFlush());
	}

	@Test
	public void testGetHighestCard() {
		hand.setCards("TD JD QD JD AD");
		Assert.assertTrue(hand.getHighestCard().equals(new Card("AD")));

		hand.setCards("2D 3D 4D 5D TD");
		Assert.assertTrue(hand.getHighestCard().equals(new Card("TD")));
	}

	@Test
	public void testIsOnePair() {
		hand.setCards("5H 5C 6S 7S KD");
		Assert.assertTrue(hand.isOnePair());

		hand.setCards("2C 3S 8S 8D TD");
		Assert.assertTrue(hand.isOnePair());

		hand.setCards("4D 6S 9H QH QC");
		Assert.assertTrue(hand.isOnePair());

		hand.setCards("5H 5C 6S 7S KD");
		Assert.assertTrue(hand.isOnePair());

		hand.setCards("2H 2D 4C 4D 4S");
		Assert.assertTrue(hand.isOnePair());

		hand.setCards("3C 3D 3S 9S 9D");
		Assert.assertTrue(hand.isOnePair());
	}

	@Test
	public void testIsNotOnePair() {
		hand.setCards("5D 8C 9S JS AC");
		Assert.assertFalse(hand.isOnePair());

		hand.setCards("2C 5C 7D 8S QH");
		Assert.assertFalse(hand.isOnePair());

		hand.setCards("2D 9C AS AH AC");
		Assert.assertFalse(hand.isOnePair());

		hand.setCards("3D 6D 7D TD QD");
		Assert.assertFalse(hand.isOnePair());
	}

	@Test
	public void testAreTwoPairs() {
		hand.setCards("5H 5C 7S 7S KD");
		Assert.assertTrue(hand.areTwoPairs());

		hand.setCards("3C 3D 3S 9S 9D");
		Assert.assertFalse(hand.areTwoPairs());
	}

	@Test
	public void testAreThreeOfAKind() {
		hand.setCards("5H 5C 7S 7S 7D");
		Assert.assertTrue(hand.areThreeOfAKind());

		hand.setCards("3C 3D 3S 9S 9D");
		Assert.assertTrue(hand.areThreeOfAKind());
		Assert.assertTrue(hand.isOnePair());

		hand.setCards("TD JD QD KD AD");
		Assert.assertFalse(hand.areThreeOfAKind());
	}

	@Test
	public void testAreFourOfAKind() {
		hand.setCards("5H 7C 7S 7S 7D");
		Assert.assertTrue(hand.areFourOfAKind());

		hand.setCards("7C 7S 7S 7D AH");
		Assert.assertTrue(hand.areFourOfAKind());

		hand.setCards("TD JD QD KD AD");
		Assert.assertFalse(hand.areFourOfAKind());
	}

	@Test
	public void testIsStraight() {
		hand.setCards("9H TC JS QS KD");
		Assert.assertTrue(hand.isStraight());

		hand.setCards("TC JS QS KD AC");
		Assert.assertTrue(hand.isStraight());

		hand.setCards("TD JD QD KD AD");
		Assert.assertFalse(hand.isStraight());
	}

	@Test
	public void testIsFlush() {
		hand.setCards("2D JD QD KD AD");
		Assert.assertTrue(hand.isFlush());

		hand.setCards("TD JD QD KD AD");
		Assert.assertFalse(hand.isFlush());
	}

	@Test
	public void testIsStraightFlush() {
		hand.setCards("2H 3H 4H 5H 6H");
		Assert.assertTrue(hand.isStraightFlush());

		hand.setCards("TD JD QD KD AD");
		Assert.assertTrue(hand.isStraightFlush());

		hand.setCards("2H 3H 4H 5H AH");
		Assert.assertFalse(hand.isStraightFlush());

		hand.setCards("2D JD QD KD AD");
		Assert.assertFalse(hand.isStraightFlush());
	}

	@Test
	public void testIsFullHouse() {
		hand.setCards("2H 2D 4C 4D 4S");
		Assert.assertTrue(hand.isFullHouse());

		hand.setCards("2H 2D 4C 4D TS");
		Assert.assertFalse(hand.isFullHouse());
	}

	@Test
	public void testCompareTo() {
		hand.setCards("5H 5C 6S 7S KD");
		hand_2.setCards("2C 3S 8S 8D TD");
		Assert.assertEquals(-1, hand.compareTo(hand_2));

		hand.setCards("5D 8C 9S JS AC");
		hand_2.setCards("2C 5C 7D 8S QH");
		Assert.assertEquals(1, hand.compareTo(hand_2));

		hand.setCards("2D 9C AS AH AC");
		hand_2.setCards("3D 6D 7D TD QD");
		Assert.assertEquals(-1, hand.compareTo(hand_2));

		hand.setCards("4D 6S 9H QH QC");
		hand_2.setCards("3D 6D 7H QD QS");
		Assert.assertEquals(1, hand.compareTo(hand_2));

		hand.setCards("2H 2D 4C 4D 4S");
		hand_2.setCards("3C 3D 3S 9S 9D");
		Assert.assertEquals(1, hand.compareTo(hand_2));

		hand.setCards("3D 4D 5D 6D 8D");
		hand_2.setCards("2H 4H 5H 6H 9H");
		Assert.assertEquals(-1, hand.compareTo(hand_2));
	}

	@Test
	public void testCheckArgumentLenth() {
		try {
			hand.setCards("3D 4D 5D 6D 8D 8S");
			Assert.fail("The method failed to throw an exception as expected.");
		} catch (IllegalArgumentException rtExc) {
           System.out.println(rtExc.getMessage());
		}

	}
}

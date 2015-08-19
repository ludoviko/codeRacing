package com.lam.coder.games;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.games.Card;
import com.lam.coder.games.CardRankE;
import com.lam.coder.games.CardSuitE;
import com.lam.coder.games.Deck;

public class DeckTest {
	private Deck deck, deck2;

	@Before
	public void setUp() throws Exception {
		deck = new Deck();
		deck2 = new Deck();
	}

	@After
	public void tearDown() throws Exception {
		deck = null;
		deck2 = null;
	}

	@Test
	public void testFillDeck() {
		deck.clear();
		deck.fillDeck();
		for (int i = 0; i < deck.getCards().length; i++) {
			Assert.assertNotNull(deck.getCards()[i]);
		}
	}

	@Test
	public void testFind() {
		Card card = new Card(CardRankE.ACE, CardSuitE.SPADES);
		deck.clear();
		deck.fillDeck();
		Assert.assertEquals(Deck.SIZE - 1, deck.find(card));
		deck.getCards()[Deck.SIZE - 1] = new Card(CardRankE.EIGHT,
				CardSuitE.DIAMONDS);
		Assert.assertEquals(-1 - Deck.SIZE, deck.find(card));
	}

	@Test
	public void testFindBinary() {
		Card card = new Card(CardRankE.ACE, CardSuitE.SPADES);
		deck.clear();
		deck.fillDeck();
		Assert.assertEquals(Deck.SIZE - 1, deck.findBinarySearch(card));

		deck.getCards()[Deck.SIZE - 1] = new Card(CardRankE.KING,
				CardSuitE.SPADES);
		Assert.assertEquals(-1 - Deck.SIZE, deck.findBinarySearch(card));

		card = new Card(CardRankE.TWO, CardSuitE.CLUBS);
		deck.getCards()[0] = new Card(CardRankE.THREE, CardSuitE.CLUBS);
		Assert.assertEquals(-1, deck.findBinarySearch(card));

		card = new Card(CardRankE.SEVEN, CardSuitE.CLUBS);
		deck.getCards()[5] = new Card(CardRankE.SIX, CardSuitE.CLUBS);
		Assert.assertEquals(-6, deck.findBinarySearch(card));
	}

	@Test
	public void testFindBinaryRec() {
		Card card = new Card(CardRankE.ACE, CardSuitE.SPADES);
		deck.clear();
		deck.fillDeck();
		Assert.assertEquals(Deck.SIZE - 1,
				deck.findBinarySearchRec(card, 0, Deck.SIZE - 1));

		deck.getCards()[Deck.SIZE - 1] = new Card(CardRankE.KING,
				CardSuitE.SPADES);
		Assert.assertEquals(-1 - Deck.SIZE,
				deck.findBinarySearchRec(card, 0, Deck.SIZE - 1));

		card = new Card(CardRankE.TWO, CardSuitE.CLUBS);
		deck.getCards()[0] = new Card(CardRankE.THREE, CardSuitE.CLUBS);
		Assert.assertEquals(-1,
				deck.findBinarySearchRec(card, 0, Deck.SIZE - 1));

		card = new Card(CardRankE.SEVEN, CardSuitE.CLUBS);
		deck.getCards()[5] = new Card(CardRankE.SIX, CardSuitE.CLUBS);
		Assert.assertEquals(-6,
				deck.findBinarySearchRec(card, 0, Deck.SIZE - 1));
	}
	
	@Test
	public void testClear() {
		Assert.assertNotNull(deck.getCards());
		deck.clear();
		for (int i = 0; i < deck.getCards().length; i++) {
			Assert.assertNull(deck.getCards()[i]);
		}
	}

	@Test
	public void testMerge() {
		deck = new Deck();
        deck.sort();
        
	 	Card[] cs1 = new Card[30]; 
	 	Card[] cs2 = new Card[10];
	 	Card[] expected = new Card[cs1.length + cs2.length];
	 	
	 	System.arraycopy(deck.getCards(), 0, cs1, 0, cs1.length);
	 	System.arraycopy(deck.getCards(), cs1.length, cs2, 0, cs2.length);
	 	System.arraycopy(deck.getCards(), 0, expected, 0, expected.length);
	 	
		deck2 = new Deck();
		Card[] merged = Deck.merge(cs1, cs2);
		Assert.assertEquals(cs1.length + cs2.length, merged.length);
		Assert.assertNotNull(merged);
		org.junit.Assert.assertArrayEquals(expected, merged);
	}

	@Test
	public void testMergeSortStatic() {
		deck = new Deck();
        deck.shuffle();
		deck2 = new Deck();
		deck2.sort();
        Card[] sorted = Deck.mergeSort(deck.getCards());
        org.junit.Assert.assertArrayEquals(deck2.getCards(), sorted);
	}
	
	@Test
	public void testMergeSortInstanceMethod() {
		deck = new Deck();
        deck.shuffle();
        deck.mergeSort();
		deck2 = new Deck();
		deck2.sort();
        Card[] sorted = Deck.mergeSort(deck.getCards());
        org.junit.Assert.assertArrayEquals(deck2.getCards(), sorted);
	}

	@Test
	public void testySortSelectionSort() {
		deck2.clear();
		deck2.fillDeck();

		deck.clear();
		deck.fillDeck();
		deck.shuffle();
		deck.selectionSort();
		
		org.junit.Assert.assertArrayEquals(deck.getCards(), deck2.getCards());
	}

	@Test
	public void testShuffle() {
		deck = new Deck();
		deck2 = new Deck();
		org.junit.Assert.assertArrayEquals(deck.getCards(), deck2.getCards());
		deck.shuffle();
		for (Card card : deck.getCards()) {
			Assert.assertNotNull(card);
		}

		Assert.assertFalse(deck.getCards()[0].equals(deck2.getCards()[0]));
	}
	
	@Test
	public void testFullShuffle() {
		deck2.clear();
		deck2.fillDeck();
		deck2.sort();

		deck.clear();
		deck.fullShuffle(deck2.getCards());

		for (Card card : deck.getCards()) {
			Assert.assertNotNull(card);
		}
	}
}

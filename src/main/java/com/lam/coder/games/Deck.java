package com.lam.coder.games;

import java.util.Arrays;

public class Deck {
	public static final int SIZE = 52;
	private Card[] cards = new Card[SIZE];

	public Deck() {
		this.fillDeck();
	}

	public void fillDeck() {
		int index = 0;
		for (int i = 0; i < CardSuitE.values().length; i++) {
			for (int j = 0; j < CardRankE.values().length; j++) {
				cards[index++] = new Card(CardRankE.values()[j],
						CardSuitE.values()[i]);
			}
		}
	}

	@Override
	public String toString() {
		return "Deck [cards=" + Arrays.toString(this.cards) + "]";
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	public int find(Card card) {
		// this.sort();
		int index = Arrays.binarySearch(this.cards, card, Card.SORT_COMPARATOR);
		return index;
	}

	// sort before calling this method
	public int findBinarySearch(Card card) {
		// Returns:
		// index of the search key, if it is contained in the array; otherwise,
		// (-(insertion point) - 1).
		// The insertion point is defined as the point at which the key would be
		// inserted into the array: the index of the first element greater
		// than the key, or a.length if all elements in the array are less than
		// the specified key.
		// Note that this guarantees that the return value will be >= 0 if and
		// only if the key is found.

		int index = -1;

		int upper = this.cards.length - 1;
		int middle = (this.cards.length - 1) / 2;
		int lower = 0;
		int comparison = 0;

		while (lower <= upper) {
			comparison = Card.SORT_COMPARATOR.compare(this.cards[middle], card);
			if (comparison == 0) {
				index = middle;
				break;
			} else if (comparison > 0) {
				upper = middle - 1;
			} else {
				lower = middle + 1;
			}
			middle = (upper + lower) / 2;
		}

		if (lower > upper) {
			if (lower == this.cards.length) {
				index = -middle - 2;
			} else {
				index = -middle - 1;
			}
		}

		return index;
	}

	// Sort before calling this method
	public int findBinarySearchRec(Card card, int lower, int upper) {
		// Returns:
		// index of the search key, if it is contained in the array; otherwise,
		// (-(insertion point) - 1).
		// The insertion point is defined as the point at which the key would be
		// inserted into the array: the index of the first element greater
		// than the key, or a.length if all elements in the array are less than
		// the specified key.
		// Note that this guarantees that the return value will be >= 0 if and
		// only if the key is found.

		int middle = (upper + lower) / 2;
		int comparison = Card.SORT_COMPARATOR.compare(this.cards[middle], card);

		if (lower > upper) {
			if (lower == this.cards.length) {
				return -middle - 2;
			} else {
				return -middle - 1;
			}
		} else {
			if (comparison == 0) {
				return middle;
			} else if (comparison > 0) {
				return this.findBinarySearchRec(card, lower, middle - 1);
			} else {
				return this.findBinarySearchRec(card, middle + 1, upper);
			}
		}

	}

	public void sort() {
		Arrays.sort(this.cards, Card.SORT_COMPARATOR);
	}

	// Selection sort is a slow sorting algorithm.
	public void selectionSort() {
		for (int i = 0; i < Deck.SIZE - 1; i++) {
			this.swap(i, findLowestCardIndex(i));
		}
	}

	public void mergeSort() {
		this.setCards(Deck.mergeSort(this.cards));
	}

	public static Card[] mergeSort(Card[] cs) {
		if (cs.length <= 1) {
			return cs;
		}

		int middle = cs.length / 2;
		int remainder = cs.length % 2;

		Card[] cs1 = new Card[middle];
		Card[] cs2 = new Card[middle + remainder];

		System.arraycopy(cs, 0, cs1, 0, cs1.length);
		System.arraycopy(cs, cs1.length, cs2, 0, cs2.length);

		cs1 = Deck.mergeSort(cs1);
		cs2 = Deck.mergeSort(cs2);

		return Deck.merge(cs1, cs2);
	}

	public static Card[] merge(Card[] cs1, Card[] cs2) {
		Card[] merged = new Card[cs1.length + cs2.length];

		int i = 0;
		int j = 0;
		int k = 0;
		int comparison;

		for (i = 0; i < cs1.length && j < cs2.length;) {
			comparison = Card.SORT_COMPARATOR.compare(cs1[i], cs2[j]);
			if (comparison <= 0) {
				merged[k++] = cs1[i++];
			} else {
				merged[k++] = cs2[j++];
			}
		}

		while (i < cs1.length) {
			merged[k++] = cs1[i++];
		}

		while (j < cs2.length) {
			merged[k++] = cs2[j++];
		}

		return merged;
	}

	private int findLowestCardIndex(int initial) {
		int index = -1;
		int comparison;
		Card min = new Card(CardRankE.ACE, CardSuitE.SPADES);

		for (int i = initial; i < Deck.SIZE; i++) {
			comparison = Card.SORT_COMPARATOR.compare(this.cards[i], min);
			if (comparison < 0) {
				min = this.cards[i];
				index = i;
			}
		}
		return index;
	}

	public void clear() {
		Arrays.fill(this.cards, null);
	}

	public void shuffle() {
		int random;
		for (int i = 0; i < Deck.SIZE; i++) {
			random = Deck.findRandomIndex();
			this.swap(i, random);
		}
	}

	// Better than shuffle() 
	private void incrementalShuffle(Card card) {
		// Precondition: the deck is not full
		int random = Deck.findRandomIndex();
		int point = this.getAvailableSpot(random);

		if (point > -1) {
			this.getCards()[point] = card;
		}
	}

	// An alternative to shuffle()
	public void fullShuffle(Card[] cards) {
		this.clear();
		
		for (Card card : cards) {
            this.incrementalShuffle(card);		  	
		}
	}

	// Get a spot in the array that is not set, i.e., it is null.
	private int getAvailableSpot(int p) {
		int r = -1;
		int c = p;
		int total = 1;

		out: while (true) {
			if (this.getCards()[c] == null) {
				r = c;
				break;
			} else {
				if (c == this.getCards().length - 1) {
					c = 0;
				} else if (total < this.getCards().length) {
					total++;
					c++;
				} else {
					break out;
				}
			}
		}

		return r;
	}

	private void swap(int one, int two) {
		Card x;
		x = cards[one];
		cards[one] = cards[two];
		cards[two] = x;
	}

	public static void main(String[] args) {
		Deck deck = new Deck();
		System.out.println(deck);

		Card card = new Card(CardRankE.ACE, CardSuitE.CLUBS);
		int index = deck.find(card);
		System.out.println(index);
		deck.clear();
		System.out.println(deck);
		deck.fillDeck();
		System.out.println(deck);
		deck.sort();
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
	}

	private static int findRandomIndex() {
		return (int) (Math.random() * Deck.SIZE);
	}
}

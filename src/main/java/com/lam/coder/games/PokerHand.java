package com.lam.coder.games;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.lam.annotation.Note;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 * 
 *         Problem 54: Poker hands
 * 
 *         In the card game poker, a hand consists of five cards and are ranked,
 *         from lowest to highest, in the following way:
 * 
 *         High Card: Highest value card. One Pair: Two cards of the same value.
 *         Two Pairs: Two different pairs. Three of a Kind: Three cards of the
 *         same value. Straight: All cards are consecutive values. Flush: All
 *         cards of the same suit. Full House: Three of a kind and a pair. Four
 *         of a Kind: Four cards of the same value. Straight Flush: All cards
 *         are consecutive values of same suit. Royal Flush: Ten, Jack, Queen,
 *         King, Ace, in same suit.
 * 
 *         The cards are valued in the order: 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack,
 *         Queen, King, Ace.
 * 
 *         If two players have the same ranked hands then the rank made up of
 *         the highest value wins; for example, a pair of eights beats a pair of
 *         fives (see example 1 below). But if two ranks tie, for example, both
 *         players have a pair of queens, then highest cards in each hand are
 *         compared (see example 4 below); if the highest cards tie then the
 *         next highest cards are compared, and so on.
 * 
 *         Consider the following five hands dealt to two players: Hand Player 1
 *         Player 2 Winner 1 5H 5C 6S 7S KD Pair of Fives 2C 3S 8S 8D TD Pair of
 *         Eights Player 2 2 5D 8C 9S JS AC Highest card Ace 2C 5C 7D 8S QH
 *         Highest card Queen Player 1 3 2D 9C AS AH AC Three Aces 3D 6D 7D TD
 *         QD Flush with Diamonds Player 2 4 4D 6S 9H QH QC Pair of Queens
 *         Highest card Nine 3D 6D 7H QD QS Pair of Queens Highest card Seven
 *         Player 1 5 2H 2D 4C 4D 4S Full House With Three Fours 3C 3D 3S 9S 9D
 *         Full House with Three Threes Player 1
 * 
 *         The file, poker.txt, contains one-thousand random hands dealt to two
 *         players. Each line of the file contains ten cards (separated by a
 *         single space): the first five are Player 1's cards and the last five
 *         are Player 2's cards. You can assume that all hands are valid (no
 *         invalid characters or repeated cards), each player's hand is in no
 *         specific order, and in each hand there is a clear winner.
 * 
 *         How many hands does Player 1 win?
 */

public class PokerHand implements Comparable<PokerHand> {
	public static final int SIZE = 5;
	
	private List<Card> cards;

	private Map<CardRankE, Integer> histogramValues;
	private Map<CardSuitE, Integer> histogramSuits;

	public PokerHand() {
		this.histogramValues = new HashMap<CardRankE, Integer>();
		this.histogramSuits = new HashMap<CardSuitE, Integer>();
	}

	public List<Card> getCards() {
		return this.cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
		this.checkArgumentLenth();

		Collections.sort(this.cards);
		this.setHistrogramSuits();
		this.setHistrogramValues();
	}

	public void setCards(String cardsS) {
		String[] array = cardsS.split(" ");
		this.cards = new ArrayList<Card>();

		for (String aCard : array) {
			this.cards.add(new Card(aCard));
		}

		this.checkArgumentLenth();
		Collections.sort(this.cards);
		this.setHistrogramSuits();
		this.setHistrogramValues();
	}

	public void checkArgumentLenth() {
		if (this.cards.size()!= SIZE) {
			throw new IllegalArgumentException("IllegalArgumentException: The size of the list must be " + SIZE + ".");
		}
	}

	private void setHistrogramValues() {
		this.histogramValues.clear();
		for (Card card : this.getCards()) {
			if (this.histogramValues.containsKey(card.getRank())) {
				this.histogramValues.put(card.getRank(),
						this.histogramValues.get(card.getRank()) + 1);
			} else {
				this.histogramValues.put(card.getRank(), 1);
			}
		}
	}

	private void setHistrogramSuits() {
		this.histogramSuits.clear();
		for (Card card : this.getCards()) {
			if (this.histogramSuits.containsKey(card.getSuit())) {
				this.histogramSuits.put(card.getSuit(),
						this.histogramSuits.get(card.getSuit()) + 1);
			} else {
				this.histogramSuits.put(card.getSuit(), 1);
			}
		}
	}

	public static void main(String[] string) {
		PokerHand hand = new PokerHand();
		hand.setCards("AC JS 9S 8C 5D");

		for (Card card : hand.getCards()) {
			System.out.println(card);
		}
	}

	public boolean isOnePair() {
		int count = 0;
		Set<CardRankE> set = this.histogramValues.keySet();
		Iterator<CardRankE> iterator = set.iterator();

		while (iterator.hasNext()) {
			CardRankE key = iterator.next();
			Integer i = this.histogramValues.get(key);
			if (i == 2) {
				count++;
			}
		}

		if (count == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean areTwoPairs() {
		int count = 0;
		Set<CardRankE> set = this.histogramValues.keySet();
		Iterator<CardRankE> iterator = set.iterator();

		while (iterator.hasNext()) {
			CardRankE key = iterator.next();
			Integer i = this.histogramValues.get(key);
			if (i == 2) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean areThreeOfAKind() {
		Set<CardRankE> set = this.histogramValues.keySet();
		Iterator<CardRankE> iterator = set.iterator();

		while (iterator.hasNext()) {
			CardRankE key = iterator.next();
			Integer i = this.histogramValues.get(key);
			if (i == 3) {
				return true;
			}
		}
		return false;
	}

	public boolean areFourOfAKind() {
		Set<CardRankE> set = this.histogramValues.keySet();
		Iterator<CardRankE> iterator = set.iterator();

		while (iterator.hasNext()) {
			CardRankE key = iterator.next();
			Integer i = this.histogramValues.get(key);
			if (i == 4) {
				return true;
			}
		}
		return false;
	}

	private CardRankE getValueFromFourOfAKind() {
		Set<CardRankE> set = this.histogramValues.keySet();
		Iterator<CardRankE> iterator = set.iterator();

		while (iterator.hasNext()) {
			CardRankE key = iterator.next();
			Integer i = this.histogramValues.get(key);
			if (i == 4) {
				return key;
			}
		}
		return null;
	}

	private CardRankE getValueThreeOfAKind() {
		Set<CardRankE> set = this.histogramValues.keySet();
		Iterator<CardRankE> iterator = set.iterator();

		while (iterator.hasNext()) {
			CardRankE key = iterator.next();
			Integer i = this.histogramValues.get(key);
			if (i == 3) {
				return key;
			}
		}
		return null;
	}

	private CardRankE getValueOfAPair() {
		Set<CardRankE> set = this.histogramValues.keySet();
		Iterator<CardRankE> iterator = set.iterator();

		while (iterator.hasNext()) {
			CardRankE key = iterator.next();
			Integer i = this.histogramValues.get(key);
			if (i == 2) {
				return key;
			}
		}
		return null;
	}

	private CardRankE getValueOfASecondPair() {
		Set<CardRankE> set = this.histogramValues.keySet();
		Iterator<CardRankE> iterator = set.iterator();

		int count = 0;

		while (iterator.hasNext()) {
			CardRankE key = iterator.next();
			Integer i = this.histogramValues.get(key);
			if (i == 2) {
				count++;
			}
			if (count == 2) {
				return key;
			}
		}
		return null;
	}

	private CardRankE getValueUnique() {
		Set<CardRankE> set = this.histogramValues.keySet();
		Iterator<CardRankE> iterator = set.iterator();

		while (iterator.hasNext()) {
			CardRankE key = iterator.next();
			Integer i = this.histogramValues.get(key);
			if (i == 1) {
				return key;
			}
		}
		return null;
	}

	public boolean isStraightFlush() {
		// Consecutive values ARE in the SAME suit
		if (!this.isSameSuit()) {
			return false;
		}
		return this.areConsecutiveValues();
	}

	public boolean isStraight() {
		// Consecutive values NOT in the SAME suit
		if (this.isSameSuit()) {
			return false;
		}
		return this.areConsecutiveValues();
	}

	private boolean areConsecutiveValues() {
		for (int i = 0; i < this.cards.size() - 1; i++) {
			if (this.cards.get(i).getRank().getValue() + 1 == this.cards
					.get(i + 1).getRank().getValue()) {

			} else {
				return false;
			}
		}
		return true;
	}

	public boolean isFlush() {
		boolean areConsecutiveValues = this.areConsecutiveValues();

		if (areConsecutiveValues) {
			return false;
		}
		return this.isSameSuit();
	}

	public boolean isFullHouse() {
		boolean isOnePair = this.isOnePair();

		if (!isOnePair) {
			return false;
		}
		return this.areThreeOfAKind();
	}

	public Card getHighestCard() {
		return this.cards.get(this.cards.size() - 1);
	}

	@Note(tested = true, note = "Tested")
	public boolean isRoyalFlush() {
		boolean isRoyalFlush = true;

		if (this.isSameSuit()) {
		} else {
			return false;
		}
		if (this.cards.get(0).getRank() == CardRankE.TEN
				&& this.cards.get(1).getRank() == CardRankE.JACK
				&& this.cards.get(2).getRank() == CardRankE.QUEEN
				&& this.cards.get(3).getRank() == CardRankE.KING
				& this.cards.get(4).getRank() == CardRankE.ACE) {
		} else {
			isRoyalFlush = false;
		}
		return isRoyalFlush;
	}

	private boolean isSameSuit() {
		Card card = this.getCards().get(0);
		boolean isSameSuit = true;

		for (Card aCard : this.getCards()) {
			if (card.getSuit() != aCard.getSuit()) {
				isSameSuit = false;
				break;
			}
		}
		return isSameSuit;
	}

	public int compareTo(PokerHand other) {
		Card mine = this.getHighestCard();
		Card alien = other.getHighestCard();
		CardRankE cvMine, cvOther;

		int result = 0;
		// Royal Flush
		if (this.isRoyalFlush() && !other.isRoyalFlush()) {
			return 1;
		} else if (!this.isRoyalFlush() && other.isRoyalFlush()) {
			return -1;
		} else if (this.isRoyalFlush() && other.isRoyalFlush()) {
			return 0;
		} // Straight Flush
		else if (this.isStraightFlush() && !other.isStraightFlush()) {
			return 1;
		} else if (!this.isStraightFlush() && other.isStraightFlush()) {
			return -1;
		} else if (this.isStraightFlush() && other.isStraightFlush()) {
			return mine.compareTo(alien);
		} // Four of a Kind
		else if (this.areFourOfAKind() && !other.areFourOfAKind()) {
			return 1;
		} else if (!this.areFourOfAKind() && other.areFourOfAKind()) {
			return -1;
		} else if (this.areFourOfAKind() && other.areFourOfAKind()) {
			cvMine = this.getValueFromFourOfAKind();
			cvOther = other.getValueFromFourOfAKind();
			result = (cvMine.getValue() > cvOther.getValue() ? 1 : cvMine
					.getValue() < cvOther.getValue() ? -1 : 0);
			if (result == 0) {
				cvMine = this.getValueUnique();
				cvOther = other.getValueUnique();
				result = (cvMine.getValue() > cvOther.getValue() ? 1 : cvMine
						.getValue() < cvOther.getValue() ? -1 : 0);
				return result;
			} else {
				return result;
			}
		} // Full House
		else if (this.isFullHouse() && !other.isFullHouse()) {
			return 1;
		} else if (!this.isFullHouse() && other.isFullHouse()) {
			return -1;
		} else if (this.isFullHouse() && other.isFullHouse()) {
			cvMine = this.getValueThreeOfAKind();
			cvOther = other.getValueThreeOfAKind();
			result = (cvMine.getValue() > cvOther.getValue() ? 1 : cvMine
					.getValue() < cvOther.getValue() ? -1 : 0);
			if (result == 0) {
				cvMine = this.getValueOfAPair();
				cvOther = other.getValueOfAPair();
				result = (cvMine.getValue() > cvOther.getValue() ? 1 : cvMine
						.getValue() < cvOther.getValue() ? -1 : 0);
				return result;
			} else {
				return result;
			}
		} // Flush
		else if (this.isFlush() && !other.isFlush()) {
			return 1;
		} else if (!this.isFlush() && other.isFlush()) {
			return -1;
		} else if (this.isFlush() && other.isFlush()) {
			return mine.compareTo(alien);
		} // Straight
		else if (this.isStraight() && !other.isStraight()) {
			return 1;
		} else if (!this.isStraight() && other.isStraight()) {
			return -1;
		} else if (this.isStraight() && other.isStraight()) {
			return mine.compareTo(alien);
		} // Three of a Kind
		else if (this.areThreeOfAKind() && !other.areThreeOfAKind()) {
			return 1;
		} else if (!this.areThreeOfAKind() && other.areThreeOfAKind()) {
			return -1;
		} else if (this.areThreeOfAKind() && other.areThreeOfAKind()) {
			cvMine = this.getValueThreeOfAKind();
			cvOther = other.getValueThreeOfAKind();
			result = (cvMine.getValue() > cvOther.getValue() ? 1 : cvMine
					.getValue() < cvOther.getValue() ? -1 : 0);
			if (result == 0) {
				for (int i = this.cards.size() - 1; i >= 0; i--) {
					result = this.cards.get(i).compareTo(
							other.getCards().get(i));
					if (result != 0) {
						return result;
					}
				}
				return result;
			} else {
				return result;
			}
		} // Two Pairs
		else if (this.areTwoPairs() && !other.areTwoPairs()) {
			return 1;
		} else if (!this.areTwoPairs() && other.areTwoPairs()) {
			return -1;
		} else if (this.areTwoPairs() && other.areTwoPairs()) {
			cvMine = this.getValueOfAPair();
			cvOther = other.getValueOfAPair();
			result = (cvMine.getValue() > cvOther.getValue() ? 1 : cvMine
					.getValue() < cvOther.getValue() ? -1 : 0);
			if (result == 0) {
				cvMine = this.getValueOfASecondPair();
				cvOther = other.getValueOfASecondPair();
				result = (cvMine.getValue() > cvOther.getValue() ? 1 : cvMine
						.getValue() < cvOther.getValue() ? -1 : 0);
				if (result == 0) {
					cvMine = this.getValueUnique();
					cvOther = other.getValueUnique();
					result = (cvMine.getValue() > cvOther.getValue() ? 1
							: cvMine.getValue() < cvOther.getValue() ? -1 : 0);
				}
				return result;
			} else {
				return result;
			}

		} // One Pair
		else if (this.isOnePair() && !other.isOnePair()) {
			return 1;
		} else if (!this.isOnePair() && other.isOnePair()) {
			return -1;
		} else if (this.isOnePair() && other.isOnePair()) {
			cvMine = this.getValueOfAPair();
			cvOther = other.getValueOfAPair();
			result = (cvMine.getValue() > cvOther.getValue() ? 1 : cvMine
					.getValue() < cvOther.getValue() ? -1 : 0);
			if (result == 0) {
				for (int i = this.cards.size() - 1; i >= 0; i--) {
					result = this.cards.get(i).compareTo(
							other.getCards().get(i));
					if (result != 0) {
						return result;
					}
				}
			} else {
				return result;
			}
		} else {
			return mine.compareTo(alien);
		}
		return result;
	}
}

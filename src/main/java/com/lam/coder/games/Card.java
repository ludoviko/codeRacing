package com.lam.coder.games;

import java.util.Comparator;

public class Card implements Comparable<Card> {
	private CardRankE rank;
	private CardSuitE suit;

	// Useful for sorting decks
	public static final Comparator<Card> SORT_COMPARATOR = new Comparator<Card>() {
		// Sorting by suit, then by rank.
		// 	CLUBS('C') < DIAMONDS('D') < HEARTS('H') < SPADES('S')
		// Ranks are compared as expected 2 <...9 < T < J < Q < K < A

		public int compare(Card first, Card second) {
			int result = first.getSuit().getValue()
					- second.getSuit().getValue() > 0 ? 1
					: first.getSuit().getValue() - second.getSuit().getValue() < 0 ? -1
							: first.getRank().getValue()
									- second.getRank().getValue() > 0 ? 1
									: first.getRank().getValue()
											- second.getRank().getValue() < 0 ? -1
											: 0;
			return result;
		}
	};
	
	public Card(CardRankE rank, CardSuitE suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public Card(String name) {
		for (CardRankE cr : CardRankE.values()) {
			if (cr.getRank() == name.charAt(0)) {
				this.rank = cr;
				break;
			}
		}

		if (this.rank == null) {
			throw new IllegalArgumentException(name
					+ " is not a valid Card. Wrong rank.");
		}

		for (CardSuitE cs : CardSuitE.values()) {
			if (cs.getValue() == name.charAt(1)) {
				this.suit = cs;
				break;
			}
		}
		if (this.suit == null) {
			throw new IllegalArgumentException(name
					+ " is not a valid Card. Wrong suit.");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.rank == null) ? 0 : this.rank.hashCode());
		result = prime * result + this.suit.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Card other = (Card) obj;
		if (this.rank == null) {
			if (other.rank != null) {
				return false;
			}
		} else if (!this.rank.equals(other.rank)) {
			return false;
		}
		if (this.suit != other.suit) {
			return false;
		}
		return true;
	}

	public CardRankE getRank() {
		return this.rank;
	}

	public CardSuitE getSuit() {
		return this.suit;
	}

	@Override
	public String toString() {
		return "Card [rank, suit] = " + this.rank.getRank() + this.suit.getValue();
	}

	public int compareTo(Card other) {
		int valueOther = other.getRank().getValue();
		int result = (this.getRank().getValue() - valueOther > 0 ? 1 : this
				.getRank().getValue() - valueOther < 0 ? -1 : 0);
		return result;
	}
}

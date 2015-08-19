package com.lam.coder.games;

public enum CardRankE {
	TWO('2'), THREE('3'), FOUR('4'), FIVE('5'), SIX('6'), SEVEN('7'), EIGHT('8'), NINE(
			'9'), TEN('T'), JACK('J'), QUEEN('Q'), KING('K'), ACE('A');

	private char rank;
	private int value;

	private CardRankE(char aRank) {
		this.rank = aRank;
		this.value = this.findValue(aRank);
	}

	private int findValue(char rank) {
		int v = 0;

		switch (rank) {
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			v = rank - '0';
			break;
		case 'T':
			v = 10;
			break;
		case 'J':
			v = 11;
			break;
		case 'Q':
			v = 12;
			break;
		case 'K':
			v = 13;
			break;
		case 'A':
			v = 14;
			break;
		default:
			break;
		}

		return v;
	}

	public char getRank() {
		return this.rank;
	}

	public int getValue() {
		return this.value;
	}
}

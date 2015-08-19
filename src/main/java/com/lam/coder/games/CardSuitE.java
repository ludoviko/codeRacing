package com.lam.coder.games;

public enum CardSuitE {
	CLUBS('C'), DIAMONDS('D'), HEARTS('H'), SPADES('S');

	private char value;

	private CardSuitE(char aValue) {
		this.value = aValue;
	}

	public char getValue() {
		return this.value;
	}

	public String getDescription(char aValue) {
		String description = "";

		switch (aValue) {
		case 'C':
			description = "Clubs";
			break;
		case 'D':
			description = "Diamonds";
			break;
		case 'H':
			description = "Hearts";
			break;
		case 'S':
			description = "Spades";
			break;

		default:
			break;
		}
		return description;
	}
}

package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Usuario
 * 
 *         Problem Statement
 * 
 *         Tommy is learning a simple card game called Circle. To play the game,
 *         the single player shuffles a deck of cards. He or she then flips
 *         through the deck, removing all instances of the 'K' card, and all
 *         consecutive pairs of cards that add up to 13. The deck does wrap
 *         around, so that if the last card remaining in the deck and the first
 *         card remaining in the deck add up to 13, they are both removed. The
 *         player keeps cycling through the deck until no more cards can be
 *         removed.
 * 
 *         Create a class CircleGame containing the method cardsLeft that takes
 *         a String deck representing a not-necessarily complete nor correct
 *         deck of cards. Each character of deck represents the value of a card
 *         without the suit. The values shown on the card represent the
 *         following numerical values:
 * 
 *         'A' - 1 '2' - 2 '3' - 3 '4' - 4 '5' - 5 '6' - 6 '7' - 7 '8' - 8 '9' -
 *         9 'T' - 10 'J' - 11 'Q' - 12 'K' - 13
 * 
 *         Given deck, return the number of cards remaining after the game has
 *         been played to its fullest such that no more cards can be removed.
 * 
 *         Definition
 * 
 *         Class: CircleGame Method: cardsLeft Parameters: String Returns: int
 *         Method signature: int cardsLeft(String deck) (be sure your method is
 *         public)
 * 
 * 
 *         Notes - There are no guarantees made about the contents of the deck.
 *         For example, there can be more than four of a given value of card. -
 *         Note that if a particular card can make a sum of 13 with the card
 *         before or after it, it does not matter which is chosen. For example,
 *         38582, whether you use the first 8 or the second 8, will still become
 *         382 after the two cards (5 and 8) are removed.
 * 
 *         Constraints - deck will have between 10 and 50 characters, inclusive.
 *         - each character of deck will be a character from the set
 *         {'2'-'9','A','T','J','Q','K'}.
 * 
 *         Examples 0)
 * 
 * 
 *         "KKKKKKKKKK"
 * 
 *         Returns: 0
 * 
 *         All K cards are always removed from the deck. 1)
 * 
 * 
 *         "KKKKKAQT23"
 * 
 *         Returns: 1
 * 
 *         The K cards are removed, leaving AQT23. AQ are then removed because
 *         they add up to 13, leaving T23. Since the deck wraps around and T and
 *         3 add up to 13, they are also removed, just leaving the 2. 2)
 * 
 * 
 *         "KKKKATQ23J"
 * 
 *         Returns: 6
 * 
 *         Only the K cards can be removed. 3)
 * 
 * 
 *         "AT68482AK6875QJ5K9573Q"
 * 
 *         Returns: 4
 * 
 *         The remaining deck is 6875. 4)
 * 
 * 
 *         "AQK262362TKKAQ6262437892KTTJA332"
 * 
 *         Returns: 24
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 148 Round 1 - Division
 *         I, Level One
 */

public class CircleGame {
	public int cardsLeft(String deck) {
		String deckClone = deck;
		int n;
		List<Character> list = new ArrayList<Character>();

		for (int j = 0; j < deck.length(); j++) {
			list.add(deck.charAt(j));
		}

		int i = 0;
		while (i < list.size()) {
			n = getValue(list.get(i));
			if (n == 13) {
				list.remove(i);
				i = 0;
				continue;
			}
			if (i == list.size() - 1) {
				n += getValue(list.get(0));
				if (n == 13) {
					list.remove(list.size() - 1);
					list.remove(0);
					i = 0;
				} else {
					i++;
				}
			} else {
				n += getValue(list.get(i + 1));
				if (n == 13) {
					list.remove(i);
					list.remove(i);
					i = 0;
				} else {
					i++;
				}
			}
		}
		return list.size();
	}

	private int getValue(char aChar) {
		int n = 0;

		switch (aChar) {
		case 'A': {
			n = 1;
			break;
		}
		case '2': {
			n = 2;
			break;
		}
		case '3': {
			n = 3;
			break;
		}
		case '4': {
			n = 4;
			break;
		}
		case '5': {
			n = 5;
			break;
		}
		case '6': {
			n = 6;
			break;
		}
		case '7': {
			n = 7;
			break;
		}
		case '8': {
			n = 8;
			break;
		}
		case '9': {
			n = 9;
			break;
		}
		case 'T': {
			n = 10;
			break;
		}
		case 'J': {
			n = 11;
			break;
		}
		case 'Q': {
			n = 12;
			break;
		}
		case 'K': {
			n = 13;
			break;
		}
		}
		return n;
	}
}

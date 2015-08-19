package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         "Omaha" is a variation of poker in which half of the pot goes to the
 *         player(s) with the lowest hand. The game is played with a deck of
 *         cards, each with a value between 1 through 13, inclusive. Each player
 *         is dealt 4 cards, and then 5 shared cards are dealt face up in the
 *         center of the table. Each player makes their lowest possible
 *         five-card hand by selecting exactly two of their own cards and
 *         exactly three of the shared cards.
 * 
 *         In order for a hand to qualify, all five cards must have a value of 8
 *         or lower, and all five cards must have different values. If a player
 *         cannot form such a hand, he/she is not eligible to win this half of
 *         the pot.
 * 
 *         Two low hands are compared by sorting the cards from highest to
 *         lowest. Starting from the highest card in each hand, compare
 *         corresponding cards in each hand until you find the first two with
 *         different values. The hand with the smaller of these two cards is the
 *         lower hand, and therefore the winner. For example, "76521" is lower
 *         than "86432", because 7 is less than 8. "75421" is lower than "75431"
 *         because 2 is less than 3. If both hands have the same five cards,
 *         they get an equal share of this half of the pot.
 * 
 *         You will be given the five shared cards, and the 4 cards held by one
 *         player. The cards will be given as Strings, with each character in
 *         each String representing one card. Characters '1' through '9'
 *         represent cards of values 1 through 9, 'T' is 10, 'J' is 11, 'Q' is
 *         12, and 'K' is 13. Return a String of 5 characters, representing the
 *         5 cards in this player's lowest hand (as defined above). The cards
 *         should be sorted highest to lowest. If the player does not have a
 *         qualifying low hand, return an empty String.
 * 
 *         NOTE: Ignore anything else you may know about cards and card games.
 *         For example, suits are not used to determine low hands, and are not
 *         considered in this problem. The cards of value 1 are also known as
 *         "aces", but we'll just call them '1' for this problem. Also, a
 *         standard deck of cards has 4 cards of each value, but this will not
 *         be enforced in the input.
 * 
 *         Definition
 * 
 *         Class: OmahaLow Method: low Parameters: String, String Returns:
 *         String Method signature: String low(String sharedCards, String
 *         playersCards) (be sure your method is public)
 * 
 * 
 *         Constraints - sharedCards will contain exactly 5 characters. -
 *         playersCards will contain exactly 4 characters. - All charaters in
 *         sharedCards and playersCards will be one of "123456789TJQK".
 * 
 *         Examples 0)
 * 
 * 
 *         "123QK"
 * 
 *         "45TJ"
 * 
 *         Returns: "54321"
 * 
 *         The lowest possible hand is "54321", and the player can make that
 *         hand by selecting the 1, 2, and 3 from the shared cards, and the 4
 *         and 5 from the player's cards. 1)
 * 
 * 
 *         "55443"
 * 
 *         "2345"
 * 
 *         Returns: ""
 * 
 *         There are only 4 unique cards in all (2, 3, 4, and 5), so it is
 *         impossible to form a low hand with 5 unique cards. 2)
 * 
 * 
 *         "1357Q"
 * 
 *         "345J"
 * 
 *         Returns: "75431"
 * 
 *         There are two ways to make the hand "75431": "731" and "54", or "751"
 *         and "43". 3)
 * 
 * 
 *         "76285"
 * 
 *         "4816"
 * 
 *         Returns: "65421"
 * 
 *         4)
 * 
 * 
 *         "12345"
 * 
 *         "3339"
 * 
 *         Returns: ""
 * 
 *         5)
 * 
 * 
 *         "58463"
 * 
 *         "947K"
 * 
 *         Returns: "76543"
 * 
 *         6)
 * 
 * 
 *         "67521"
 * 
 *         "J859"
 * 
 *         Returns: "86521"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for: Single Round Match 206 Round 1 - Division
 *         I, Level One Single Round Match 206 Round 1 - Division II, Level Two
 */

public class OmahaLow {

	public String low(String sharedCards, String playersCards) {
		String digits = "";
		String digitsPlayer = this.getDigits(playersCards);
		String digitsShared = this.getDigits(sharedCards);

		Set<Character> players = new TreeSet<Character>();

		int j = 0;
		int counter = 0;
		int moves = 0;

		for (int i = 0; i < digitsPlayer.length() && moves < 2; i++) {
			if ( digitsPlayer.charAt(i) <  digitsShared.charAt(j)) {
				players.add(digitsPlayer.charAt(i));
				moves++;
			} else if ( digitsPlayer.charAt(i) >  digitsShared.charAt(j) && digitsPlayer.charAt(i) <  digitsShared.charAt( digitsShared.length() -1 )) {
				players.add(digitsPlayer.charAt(i));
				moves++;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			players.add(digitsShared.charAt(i));
		}
   		
		List<Character> list = new ArrayList<Character>();
		list.addAll(players);

		Collections.reverse(list);

		for (Character aChar : list) {
			digits += aChar;
		}

		if (digits.length() < 5) {
			return "";
		}

		return digits;
		
	}

	
	public String low2(String sharedCards, String playersCards) {
		String digits = "";
		String digitsPlayer = this.getDigits(playersCards);
		String digitsShared = this.getDigits(sharedCards);

		Set<Character> players = new TreeSet<Character>();

		int j = 0;
		int counter = 0;

		out: for (int i = 0; i < digitsPlayer.length() - 1; i++) {
			players.add(digitsPlayer.charAt(i));
			players.add(digitsPlayer.charAt(i + 1));

			j = 0;
			while (counter < 3 && j < digitsShared.length()) {
				if (players.contains(digitsShared.charAt(j))) {
				} else {
					players.add(digitsShared.charAt(j));
					counter++;
				}
				j++;
			}
			if (players.size() == 5) {
				break out;
			}
		}

		List<Character> list = new ArrayList<Character>();
		list.addAll(players);

		Collections.reverse(list);

		for (Character aChar : list) {
			digits += aChar;
		}

		if (digits.length() < 5) {
			return "";
		}
		return digits;
	}

	private String getDigits(String cards) {
		String digits = "";
		List<Character> list = new ArrayList<Character>();

		for (int i = 0; i < cards.length(); i++) {
			if (cards.charAt(i) >= '0' && cards.charAt(i) <= '8') {
				list.add(cards.charAt(i));
			}
		}

		Collections.sort(list);
		for (Character aChar : list) {
			digits += aChar;
		}
		return digits;

	}
}

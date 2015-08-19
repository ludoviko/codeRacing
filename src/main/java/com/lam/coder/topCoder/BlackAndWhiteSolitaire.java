package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement for BlackAndWhiteSolitaire
 * 
 *         Manao has N cards arranged in a sequence. He numbered them from left
 *         to right with numbers from 0 to N-1. Each card is colored black on
 *         one side and white on the other. Initially, each of the cards may lie
 *         on a different side. That is, some of the cards (possibly none or all
 *         of them) will be black side up and others will be white side up.
 *         Manao wants to flip some cards over to obtain an alternating
 *         configuration: every pair of successive cards must be of different
 *         colors.
 * 
 *         You are given a String cardFront consisting of N characters. For each
 *         i, character i of cardFront is 'B' if card i lies black side up, and
 *         'W' otherwise. Count and return the minimum number of cards which
 *         must be flipped to obtain an alternating configuration.
 * 
 *         Definition
 * 
 *         Class: BlackAndWhiteSolitaire Method: minimumTurns Parameters: String
 *         Returns: int Method signature: int minimumTurns(String cardFront) (be
 *         sure your method is public)
 * 
 * 
 *         Constraints - cardFront will be between 3 and 50 characters long,
 *         inclusive. - Each character in cardFront will be either 'B' or 'W'.
 * 
 *         Examples 0)
 * 
 *         "BBBW" Returns: 1 The first three cards lie with their black side up
 *         and the fourth card lies with its white side up. Flipping the second
 *         card will give us the alternating configuration "BWBW". 1)
 * 
 *         "WBWBW" Returns: 0 The cards already form an alternating
 *         configuration. 2)
 * 
 *         "WWWWWWWWW" Returns: 4 Manao only needs to flip 4 cards to make the
 *         alternating configuration "WBWBWBWBW". 3)
 * 
 *         "BBWBWWBWBWWBBBWBWBWBBWBBW" Returns: 10
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 581 Round 1 - Division
 *         II, Level One
 * 
 * 
 *
 */

public class BlackAndWhiteSolitaire {
	private static final char BLACK = 'B';
	private static final char WHITE = 'W';

	public int minimumTurns(String cardFront) {

		int sum_1 = count(cardFront, true);
		int sum_2 = count(cardFront, false);

		return Math.min(sum_1, sum_2);
	}

	private int count(String cards, boolean blackFirst) {
		int sum = 0;

		if (blackFirst == true) {
			for (int i = 0; i < cards.length(); i++) {
				if (i % 2 == 0) {
					if (cards.charAt(i) == WHITE) {
						sum++;
					}
				} else {
					if (cards.charAt(i) == BLACK) {
						sum++;
					}
				}
			}
		} else {
			for (int i = 0; i < cards.length(); i++) {
				if (i % 2 == 0) {
					if (cards.charAt(i) == BLACK) {
						sum++;
					}
				} else {
					if (cards.charAt(i) == WHITE) {
						sum++;
					}
				}
			}
		}

		return sum;
	}
}

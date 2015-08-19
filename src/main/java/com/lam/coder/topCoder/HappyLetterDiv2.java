package com.lam.coder.topCoder;

import java.util.Stack;

/**
 * 
 * @author Ludoviko Azuaje
 *
 *         Problem Statement for HappyLetterDiv2
 * 
 *         The Happy Letter game is played as follows: At the beginning, several
 *         players enter the field. Each player has a lowercase English letter
 *         on their back. The game is played in turns. In each turn, you select
 *         two players with different letters, and both selected players leave
 *         the field. The game ends once it is impossible to take another turn.
 * 
 *         If there are some players left in the field at the end of the game,
 *         they must all have the same letter. That letter is called the winning
 *         letter. If there are no players left in the field at the end of the
 *         game, there is no winning letter.
 * 
 *         In general, there may be many different ways how to play the game,
 *         and these may lead to different outcomes of the game. However,
 *         sometimes we can look at the initial players and determine that each
 *         possible sequence of turns leads to the same winning letter. That
 *         winning letter is then called a happy letter.
 * 
 *         You are given a String letters. The characters in letters are the
 *         characters carried by the players at the beginning of the game.
 *         Return a String with one character: either the happy letter (if it
 *         exists), or a period ('.') if there is no happy letter.
 * 
 * 
 *         Definition
 * 
 *         Class: HappyLetterDiv2 Method: getHappyLetter Parameters: String
 *         Returns: char Method signature: char getHappyLetter(String letters)
 *         (be sure your method is public)
 * 
 * 
 *         Constraints - letters will contain between 1 and 50 elements. - Each
 *         element of letters will be a lowercase English letter ('a'-'z').
 * 
 *         Examples 0)
 * 
 *         "aacaaa" Returns: 'a' In the first turn we send away the player with
 *         the 'c' and one of the players with an 'a'. All remaining players
 *         have an 'a', hence the game ends and 'a' is the winning letter. 1)
 * 
 *         "dcdjx" Returns: '.' Each of the letters 'c', 'd', 'j', and 'x' can
 *         be the winning letter. Thus there is no happy letter. 2)
 * 
 *         "bcbbbbba" Returns: 'b' 3)
 * 
 *         "aabc" Returns: '.' Here, only 'a' can be the winning letter.
 *         However, it is also possible that there is no winning letter at the
 *         end of the game. Therefore 'a' is not considered to be the happy
 *         letter. This problem statement is the exclusive and proprietary
 *         property of TopCoder, Inc. Any unauthorized use or reproduction of
 *         this information without the prior written consent of TopCoder, Inc.
 *         is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 * 
 * 
 * 
 *         This problem was used for: Single Round Match 627 Round 1 - Division
 *         II, Level Two
 */

public class HappyLetterDiv2 {
	public static final char NO_LEADER = '.';

	// Complexity: O(n)
	public char getHappyLetter(String letters) {
		Stack<Character> stack = new Stack<Character>();
		Character last;
		Character leader = NO_LEADER;

		for (int i = 0; i < letters.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(letters.charAt(i));
			} else {
				last = stack.peek();
				if (last != letters.charAt(i)) {
					stack.pop();
				} else {
					stack.push(letters.charAt(i));
				}
			}
		}

		if (stack.isEmpty()) {
		} else {
			// count the candidate occurrences
			int c = countCandidate(letters, stack.peek());
			if (c > letters.length() / 2) {
				leader = stack.peek();
			}
		}

		return leader;
	}

	private int countCandidate(String letters, char candidate) {
		int c = 0;
		for (int i = 0; i < letters.length(); i++) {
			if (letters.charAt(i) == candidate) {
				c++;
			}
		}
		return c;
	}
}
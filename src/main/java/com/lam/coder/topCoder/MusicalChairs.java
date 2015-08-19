package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement for MusicalChairs
 * 
 * 
 *         In the game of Musical Chairs, n players walk around a circle of n-1
 *         chairs while music plays on the stereo. When the music stops,
 *         everyone hurries to claim a chair. The player who is left standing
 *         gets knocked out of the game.
 * 
 *         You are given a String[] playerNames containing the names of the
 *         players, ordered according to their position at the start of the
 *         game, such as the following.
 * 
 *         {"Emma Sue", "Billy Bob Thornton", "Joe", "Cassius Clay"} You are
 *         also given a String chairs describing the arrangement of chairs with
 *         an 'h' (lowercase letter H) for each chair and exactly one '.'
 *         (period) indicating a gap. The i-th character of chairs corresponds
 *         to the i-th element of playerNames. For instance, the chairs might be
 *         arranged as follows.
 * 
 *         "hh.h" The player by the gap is the one who gets knocked out. For
 *         example, if the four players above are in their starting order when
 *         the music stops, then Joe gets knocked out.
 * 
 *         For each second of music, the players advance one position. From the
 *         original order shown above, for example, the players' order changes
 *         to the following after one second.
 * 
 *         {"Cassius Clay", "Emma Sue", "Billy Bob Thornton", "Joe"} Given an
 *         int seconds specifying the number of seconds that the music is
 *         played, return the name of the player who gets knocked out.
 * 
 * 
 *         Definition
 * 
 *         Class: MusicalChairs Method: knockedOut Parameters: String[], String,
 *         int Returns: String Method signature: String knockedOut(String[]
 *         playerNames, String chairs, int seconds) (be sure your method is
 *         public)
 * 
 * 
 *         Constraints - playerNames will contain between 2 and 50 elements,
 *         inclusive. - Each element of playerNames will contain between 1 and
 *         50 characters, inclusive. - playerNames will contain only letters
 *         ('A'-'Z', 'a'-'z') and spaces (' '). - chairs will contain the same
 *         number of characters as the number of elements in playerNames. -
 *         Exactly one character in chairs will be '.', and all the other
 *         characters will be 'h'. - seconds will be between 0 and 600,
 *         inclusive.
 * 
 *         Examples 0)
 * 
 *         {"Emma Sue", "Billy Bob Thornton", "Joe", "Cassius Clay"} "hh.h" 1
 *         Returns: "Billy Bob Thornton" The example from the problem statement.
 *         1)
 * 
 *         {"Emma Sue", "Billy Bob Thornton", "Joe", "Cassius Clay"} "hh.h" 4
 *         Returns: "Joe" After 4 seconds, the players are exactly at the same
 *         positions as in the beginning. 2)
 * 
 *         {"Jack Dempsey", "Joe Louis", "Rocky Marciano", "Cassius Clay",
 *         "George Foreman", "Mike Tyson"} "h.hhhh" 500 Returns: "Mike Tyson" 3)
 * 
 *         {"  itchy   ", "SCRATCHY"} ".h" 0 Returns: "  itchy   " 4)
 * 
 *         {"Moe", "Larry", "Curly", "Moe"} "hh.h" 2 Returns: "Moe" This problem
 *         statement is the exclusive and proprietary property of TopCoder, Inc.
 *         Any unauthorized use or reproduction of this information without the
 *         prior written consent of TopCoder, Inc. is strictly prohibited.
 *         (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: 2008 TopCoder China Tournament Round 1B -
 *         Division I, Level Two
 */

public class MusicalChairs {
	public static final char DOT = '.';

	public String knockedOut(String[] playerNames, String chairs, int seconds) {

		int p = 0;
		for (char chair : chairs.toCharArray()) {
			if (chair == DOT) {
				break;
			}
			p++;
		}

		p = p - seconds % playerNames.length;

		if (p < 0) {
			p = p + playerNames.length;
		}

		return playerNames[p];
	}
}
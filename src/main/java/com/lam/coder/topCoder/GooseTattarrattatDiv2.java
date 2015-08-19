package com.lam.coder.topCoder;

import java.util.Arrays;

/**
 * 
 * @author Lazuaje
 *
 *         Problem Statement 
 *         
 *         Goose Tattarrattat has a String S of lowercase
 *         letters. A string is called smooth if all its letters are the same.
 *         Tattarrattat wants to change her string into a smooth one.
 * 
 * 
 *         She will do this in a series of steps. In each step, Tattarrattat
 *         will choose two letters of the alphabet: X and Y. She will then
 *         change each X in her string into an Y. Changing each single character
 *         takes 1 second.
 * 
 *         For example, if S="goose" and Tattarrattat chooses X='o' and Y='e' in
 *         the next step, the step will take 2 seconds (because there are two
 *         'o's in S) and after the step she would have S="geese".
 * 
 *         You are given the String S. Return the smallest number of seconds in
 *         which Tattarrattat can change S into a smooth string.
 * 
 *         Definition Class: GooseTattarrattatDiv2 Method: getmin Parameters:
 *         String Returns: int Method signature: int getmin(String S) (be sure
 *         your method is public)
 * 
 *         Limits Time limit (s): 2.000 Memory limit (MB): 64
 * 
 *         Constraints - S will contain between 1 and 50 characters, inclusive.
 *         - Each character in S will be a lowercase letter ('a'-'z'). Examples
 *         0) "geese"
 * 
 * 
 *         Returns: 2
 * 
 *         There are many ways how Tattarrattat can change this S into a smooth
 *         string. For example, she could do it in two steps as follows: Change
 *         all 'g's to 'e's: this takes 1 second and produces the string
 *         "eeese". Change all 'e's to 's's: this takes 4 seconds and produces
 *         the string "sssss". This way took her 1+4 = 5 seconds. However, there
 *         are faster ways. The best one only takes 2 seconds. For example, she
 *         can first change all 'g's to 'e's (1 second), and then change all
 *         's's to 'e's (1 second), obtaining the smooth string "eeeee".
 * 
 *         1) "tattarrattat"
 *         Returns: 6
 * 
 *         2) "www"
 *         Returns: 0
 * 
 *         This string is already smooth so no changes are needed.
 * 
 * 
 *         3) "topcoder"
 *         Returns: 6
 * 
 *         4) "xrepayuyubctwtykrauccnquqfuqvccuaakylwlcjuyhyammag"
 *         Returns: 43
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 589 Round 1 - Division
 *         II, Level One
 * 
 */

public class GooseTattarrattatDiv2 {
	private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public int getmin(String string) {
		int[] data = new int[CHARS.length()];

		for (int i = 0; i < string.length(); i++) {
			data[string.charAt(i) - 'a']++;
		}

		Arrays.sort(data);

		int max = data[data.length - 1];

		return string.length() - max;
	}
}

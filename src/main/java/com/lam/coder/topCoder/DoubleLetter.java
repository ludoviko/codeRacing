package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement for DoubleLetter
 * 
 *         You are given a String S. You can modify this
 *         string by repeating the following process: Find the leftmost
 *         occurrence of two consecutive letters in S that are the same. If you
 *         found a pair of identical letters in the first step, delete those two
 *         letters from S. For example, if S="aabccb", you can proceed as
 *         follows: Find and erase "aa", producing the string "bccb". Find and
 *         erase "cc", producing the string "bb". Find and erase "bb", producing
 *         the empty string. For S="axxyybac" you can do at most two steps,
 *         erasing "xx" first and "yy" next. Once you obtain the string "abac",
 *         you are done. Note that you cannot erase the two "a"s because they
 *         are not consecutive. You want to change S into an empty string by
 *         repeating the operation described above. Return "Possible" if you can
 *         do that, and "Impossible" otherwise.
 * 
 *         Definition
 * 
 *         Class: DoubleLetter Method: ableToSolve Parameters: String Returns:
 *         String Method signature: String ableToSolve(String S) (be sure your
 *         method is public)
 * 
 * 
 *         Constraints - S will contain between 1 and 50 characters. - Each
 *         character in S will be a lowercase English letter ('a'-'z').
 * 
 *         Examples 0)
 * 
 *         "aabccb" Returns: "Possible" 1)
 * 
 *         "aabccbb" Returns: "Impossible" The process will terminate with a
 *         single 'b'. 2)
 * 
 *         "abcddcba" Returns: "Possible" "abcddcba" -> "abccba" -> "abba" ->
 *         "aa" -> "". 3)
 * 
 *         "abab" Returns: "Impossible" No two successive letters are the same,
 *         so we can't do any operation. 4)
 * 
 *         "aaaaaaaaaa" Returns: "Possible" 5)
 * 
 *         "aababbabbaba" Returns: "Impossible" 6)
 * 
 *         "zzxzxxzxxzzx" Returns: "Possible" This problem statement is the
 *         exclusive and proprietary property of TopCoder, Inc. Any unauthorized
 *         use or reproduction of this information without the prior written
 *         consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder,
 *         Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 630 Round 1 - Division
 *         II, Level One
 */

public class DoubleLetter {
	public String ableToSolve(String string) {
		if (isAbleToSolve(string)) {
			return "Possible";
		} else {
			return "Impossible";
		}
	}

	public boolean isAbleToSolve(String string) {
		int index;

		while ((index = indexTwoConsecutiveLetters(string)) > -1) {
			string = string.substring(0, index) + string.substring(index + 2);
		}

		return string.isEmpty();
	}

	private int indexTwoConsecutiveLetters(String string) {
		int index = -1;

		for (int i = 0; i < string.length() - 1; i++) {
			if (string.charAt(i) == string.charAt(i + 1)) {
				index = i;
				break;
			}
		}

		return index;
	}
}

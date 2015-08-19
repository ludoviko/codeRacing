package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement Fox Ciel received a string as a birthday present.
 *         However, the string was too long for her, so she decided to make it
 *         shorter by erasing some characters.
 * 
 *         The erasing process will look as follows:
 * 
 *         Find the smallest i such that the i-th character and the (i+1)-th
 *         character of the string are same. If there is no such i, end the
 *         process. Remove the i-th and the (i+1)-th character of the string,
 *         and repeat from 1.
 * 
 *         For example, if she receives "cieeilll", she will change the string
 *         as follows: "cieeilll" -> "ciilll" -> "clll" -> "cl". You are given a
 *         String s. Return the string she will get after she erases characters
 *         as described above.
 * 
 *         Definition
 * 
 *         Class: ErasingCharacters Method: simulate Parameters: String Returns:
 *         String Method signature: String simulate(String s) (be sure your
 *         method is public)
 * 
 * 
 *         Constraints - s will contain between 1 and 50 characters, inclusive.
 *         - Each character in s will be a lowercase letter ('a'-'z').
 * 
 *         Examples 0)
 * 
 * 
 *         "cieeilll"
 * 
 *         Returns: "cl"
 * 
 *         This is the example from the statement. 1)
 * 
 * 
 *         "topcoder"
 * 
 *         Returns: "topcoder"
 * 
 *         She won't erase any characters at all. 2)
 * 
 * 
 *         "abcdefghijklmnopqrstuvwxyyxwvutsrqponmlkjihgfedcba"
 * 
 *         Returns: ""
 * 
 *         3)
 * 
 * 
 *         "bacaabaccbaaccabbcabbacabcbba"
 * 
 *         Returns: "bacbaca"
 * 
 *         4)
 * 
 * 
 *         "eel"
 * 
 *         Returns: "l"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 598 Round 1 - Division
 *         II, Level One
 * 
 */

public class ErasingCharacters {
	public String simulate(String string) {
		String output = "";
		boolean goOn = true;
		int i;
		int j;

		if (string.length() == 1) {
			return string;
		}

		while (goOn) {
			for (i = 0; i < string.length() - 1; i++) {
				if (string.charAt(i) == string.charAt(i + 1)) {
					j = i + 2;
					if (j <= string.length() - 1) {
						output += string.substring(j);
					}
					string = output;
					if (string.length() < 2) {
						goOn = false;
					}

					output = "";
					break;
				} else {
					output += string.charAt(i);
				}

				if (i == string.length() - 2) {
					goOn = false;
				} else {

				}
			}
		}
		return string;
	}
}

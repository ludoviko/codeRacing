package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Implement a class LetterSort, which contains a method doSort. doSort
 *         takes a String as a parameter and sorts the characters in the string
 *         in order of their first appearance in the string. For example
 *         CABCACCB sorts to CCCCAABB. The method doSort should return the
 *         sorted String.
 * 
 *         The method signature is: public String doSort(String input);
 * 
 *         input is a string of at least 1 character and at most 50 characters.
 *         The characters are letters or numbers.
 * 
 *         Note: -The sort is case sensitive. "A" is a different character than
 *         "a".
 * 
 *         Examples: If input="TopCoder", the method returns "ToopCder" If
 *         input="HiHowAreYou", the method returns "HHioowAreYu"
 * 
 *         Definition
 * 
 *         Class: LetterSort Method: doSort Parameters: String Returns: String
 *         Method signature: String doSort(String param0) (be sure your method
 *         is public)
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 2 Round 1 - Division I,
 *         Level Two Single Round Match 2 Round 1 - Division II, Level Two
 */

public class LetterSort {
	public String doSort(String input) {
		String output = "";
		char c;

		while (input.length() > 0) {
			c = input.charAt(0);
			while (input.contains(c + "")) {
				output += c;
				input = input.replaceFirst(c + "", "");
			}

		}

		return output;
	}
}

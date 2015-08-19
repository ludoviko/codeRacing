package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         The keycaps on a keyboard have been switched around, and the user is
 *         now trying to remember what he was trying to type.
 * 
 *         Create a class CeyKaps containing the method decipher that takes a
 *         String typed, representing the visible message on the screen, and a
 *         String[] switched, representing the keycap switches. The method
 *         should return the original intended message (what keys the user
 *         thought he was pressing).
 * 
 *         A keycap can be switched around more than once. For example, if
 *         someone switched around 'A' and 'S', then switched around 'S' and
 *         'D', then 'D' would be where 'A' originally was, 'S' where 'D' was,
 *         and 'A' where 'S' was.
 * 
 *         The elements of switches will be formatted as (quotes added for
 *         clarity) "*:*", where the *'s represent the keycaps to be switched.
 *         The above example would be represented as: {"A:S","S:D","D:A"}, or
 *         alternately as {"S:A","D:S","A:D"} or any other such combination. The
 *         order of the keycaps doesn't matter, but the order of the switches
 *         does.
 * 
 *         Definition
 * 
 *         Class: CeyKaps Method: decipher Parameters: String, String[] Returns:
 *         String Method signature: String decipher(String typed, String[]
 *         switches) (be sure your method is public)
 * 
 * 
 *         Notes - There is no restriction on how many times keycaps can be
 *         switched. It is perfectly possible to return to the original keyboard
 *         configuration.
 * 
 *         Constraints - typed will be between 1 and 50 characters in length,
 *         inclusive. - each character of typed will be an uppercase letter
 *         ('A'-'Z'). - switches will contain between 1 and 50 elements,
 *         inclusive. - each element of switched will be formatted as (quotes
 *         added for clarity) "*:*" where each * represents a single uppercase
 *         letter ('A'-'Z'), inclusive, but both *'s do not represent the same
 *         letter.
 * 
 *         Examples 0)
 * 
 * 
 *         "AAAAA"
 * 
 *         {"A:B","B:C","A:D"}
 * 
 *         Returns: "CCCCC"
 * 
 *         At first, all keys look right. After the A:B switch, A looks like B
 *         and B looks like A. After the B:C switch, A looks like C, B looks
 *         like A, and C looks like B. The third switch is irrelevant. Since
 *         "AAAAA" is what comes out, Timmy must have been pressing "CCCCC". 1)
 * 
 * 
 *         "ABCDE"
 * 
 *         {"A:B","B:C","C:D","D:E","E:A"}
 * 
 *         Returns: "AEBCD"
 * 
 *         2)
 * 
 * 
 *         "IHWSIOTCHEDMYKEYCAPSARWUND"
 * 
 *         {"W:O","W:I"}
 * 
 *         Returns: "WHOSWITCHEDMYKEYCAPSAROUND"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 148 Round 1 - Division
 *         II, Level Two
 */

public class CeyKaps {
	private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public String decipher(String word, String[] switches) {
		String lettersShifted = LETTERS;
		String decoded = "";
		String one, two, any = "0";
		for (int i = 0; i < switches.length; i++) {
			one = switches[i].split(":")[0];
			two = switches[i].split(":")[1];
			lettersShifted = lettersShifted.replace(one, any);
			lettersShifted = lettersShifted.replace(two, one);
			lettersShifted = lettersShifted.replace(any, two);
		}

		for (int i = 0; i < word.length(); i++) {
			int j = LETTERS.indexOf(word.charAt(i));
			decoded += lettersShifted.charAt(j);
		}
		return decoded;
	}
}

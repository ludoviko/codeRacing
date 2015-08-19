package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Two lines (or queues) of people often have to merge into a
 *         single-file line. But, chivalry is not dead! When a man and a woman
 *         are about to merge, the man will always let the woman go first.
 * 
 *         Given two lines of both men and women, write a method getOrder which
 *         will determine the genders of the people in the final line. If two
 *         women are at the front of both lines, the woman from the first line
 *         goes first. Likewise, if two men are at the front of both lines, the
 *         man from the first line goes first. Then, the people at the front of
 *         both lines are compared again.
 * 
 *         Each input line will be a String of letters, each one representing
 *         either a man or a woman. Each man will be represented by an 'M' and
 *         each woman by a 'W'. The output should be of the same form. The front
 *         of each line is the left-most character of the String.
 * 
 *         Definition
 * 
 *         Class: Chivalry Method: getOrder Parameters: String, String Returns:
 *         String Method signature: String getOrder(String first, String second)
 *         (be sure your method is public)
 * 
 * 
 *         Constraints - first and second will each be between 1 and 50
 *         characters long, inclusive. - first and second will consist of the
 *         characters 'M' and 'W' only.
 * 
 *         Examples 0)
 *         "M"
 * 
 *         "W"
 * 
 *         Returns: "WM"
 * 
 *         1)
 *         "MM"
 * 
 *         "MW"
 * 
 *         Returns: "MMMW"
 * 
 *         Because of the 'tie breaker' rules, the first man from the first line
 *         goes first. Then, the second man from the first line goes, then the
 *         rest of the people (both from the second line.) 2)
 * 
 * 
 *         "MMMM"
 * 
 *         "W"
 * 
 *         Returns: "WMMMM"
 * 
 *         3)
 *         "M"
 *         "WWW"
 * 
 *         Returns: "WWWM"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 213 Round 1 - Division
 *         II, Level One
 * 
 */

public class Chivalry {
	private static final char WOMAN = 'W';
	private static final char MAN = 'M';

	public String getOrder(String first, String second) {
		char[] out = new char[first.length() + second.length()];
		int f = 0;
		int s = 0;
		int i = 0;

		while (f < first.length() && s < second.length()) {
			if (first.charAt(f) == WOMAN) {
				out[i] = WOMAN;
				f++;
			} else if (first.charAt(f) == MAN) {
				if (second.charAt(s) == WOMAN) {
					out[i] = WOMAN;
					s++;
				} else {
					out[i] = MAN;
					f++;
				}
			}
			i++;
		}

		while (f < first.length()) {
			out[i++] = first.charAt(f++);
		}

		while (s < second.length()) {
			out[i++] = second.charAt(s++);
		}

		return new String(out);
	}
}

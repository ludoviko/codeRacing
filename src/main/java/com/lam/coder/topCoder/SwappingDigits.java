package com.lam.coder.topCoder;

/**
 * 
 * @author LAzuaje
 * 
 *         Problem Statement for SwappingDigits
 * 
 *         Given is a String num. This String contains the digits of a (possibly
 *         large) positive integer. For example, num="1147" represents the
 *         integer 1147. The String num will not have any leading zeros.
 * 
 *         You are allowed to swap one pair of digits in the given number. In
 *         other words, you may choose a pair of distinct indices i and j, and
 *         swap the characters num[i] and num[j]. Note that you may also leave
 *         the original number unchanged. The new String must again describe a
 *         valid positive integer, i.e., it must not have any leading zeros.
 * 
 *         Find and return the String that represents the smallest possible
 *         integer that can be obtained.
 * 
 *         Definition
 * 
 *         Class: SwappingDigits Method: minNumber Parameters: String Returns:
 *         String Method signature: String minNumber(String num) (be sure your
 *         method is public)
 * 
 *         Constraints - The length of num will be between 2 and 50, inclusive.
 *         - Each character of num will be between '0' and '9', inclusive. - The
 *         first character of num will not be '0'.
 * 
 *         Examples 0)
 * 
 *         "596" Returns: "569" You can swap num[1] and num[2] to get the
 *         minimum integer. 1)
 * 
 *         "93561" Returns: "13569" 2)
 * 
 *         "5491727514" Returns: "1491727554" 3)
 * 
 *         "10234" Returns: "10234" You can leave the original String num
 *         unchanged. Note that the result must not contain leading zeros. 4)
 * 
 *         "93218910471211292416" Returns: "13218910471211292496"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 583 Round 1 - Division
 *         II, Level One
 *
 */

public class SwappingDigits {
	public String minNumber(String string) {
		int index;
		int current = 1;
		boolean goOn = true;

		while (current < string.length() && goOn) {
			index = findSmallesDigitIndexBut(string.substring(current),
					current - 1);
			if (string.charAt(index + current) < string.charAt(current - 1)) {
				string = replace(string, current - 1, index + current);
				goOn = false;
			} else {
				goOn = true;
			}
			current++;
		}

		return string;
	}

	public static String replace(String string, int a, int b) {
		if (string == null || string.length() == 0) {
			return string;
		}

		char[] chars = string.toCharArray();
		char x = chars[a];
		chars[a] = chars[b];
		chars[b] = x;

		return new String(chars);
	}

	public static int findSmallesDigitIndexBut(String string, int except) {
		int index = -1;
		char aChar = '9';
		char some = ' ';

		if (except == 0) {
			some = '0';
		}

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) <= aChar && string.charAt(i) != some) {
				aChar = string.charAt(i);
				index = i;
			}
		}
		return index;
	}
}
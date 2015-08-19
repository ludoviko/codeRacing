package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement for Numerology
 * 
 *         Class Name: Numerology Method Name: getMagicNumber Parameters: String
 *         Returns: int
 * 
 *         Implement a class Numerology, which contains a method getMagicNumber.
 *         getMagicNumber takes a String that is a person's name and returns a
 *         "magic number" based upon that person's name.
 * 
 *         Here is the method signature: public int getMagicNumber(String
 *         strName); The input is a String of length 1 to 50, inclusive. The
 *         input contains characters A-Z, a-z, and spaces only.
 * 
 *         The "magic number" is computed in the following manner: - Each letter
 *         (regardless of case) of the name is given a value according to its
 *         position in the alphabet. Thus, "A" has a value of 1 because it is
 *         the 1st letter of the alphabet, and "Z" has a value of 26 because it
 *         is the 26th letter of the alphabet. - The name is given a total value
 *         based upon the sum of the values of the letters (ignore spaces) in
 *         it. Thus, the name "Joe" would have a value of 10+15+5, which is 30.
 *         - The digits of the total value are summed until the sum is less than
 *         10. So, a total value of 128 is summed to 11 (1+2+8), and 11 is
 *         summed to give 2 (1+1). This is the magic number returned.
 * 
 *         Examples (quotes are for clarity ONLY): "Mandy Dean Thompson" has a
 *         magic number of 3. (201 = 2+1 = 3) "Nate Tina Tanner" has a magic
 *         number of 3. (156 = 1+5+6 = 12 = 1+2 = 3) "Paul Tim Brown" has a
 *         magic number of 2. (164 = 1+6+4 = 11 = 1+1 = 2) "Ralph Amber Black"
 *         has a magic number of 6. (123 = 1+2+3 = 6) "Bill Susan Burton" has a
 *         magic number of 1. (199 = 1+9+9 = 19 = 1+9 = 10 = 1+0 = 1)
 * 
 *         Definition
 * 
 *         Class: Numerology Method: getMagicNumber Parameters: String Returns:
 *         int Method signature: int getMagicNumber(String param0) (be sure your
 *         method is public)
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for:
 * 
 *         Single Round Match 15 Round 1 - Division I, Level One
 * 
 *         Single Round Match 15 Round 1 - Division II, Level One
 */

public class Numerology {
	private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";;
	private static final int UPPER_SUMMA = 9;

	public int getMagicNumber(String string) {
		return reduce(sumLetters(string));
	}

	private static int reduce(int n) {
		while (n > UPPER_SUMMA) {
			n = sumDigits(n);
		}

		return n;
	}

	private static int sumDigits(int n) {
		int sum = 0;

		while (n > 0) {
			sum += n % 10;
			n = n / 10;
		}

		return sum;
	}

	private static int sumLetters(String string) {
		int sum = 0;

		string = string.toUpperCase();

		for (int i = 0; i < string.length(); i++) {
			sum += ALPHABET.contains(string.charAt(i) + "") ? ALPHABET
					.indexOf(string.charAt(i)) + 1 : 0;
		}

		return sum;
	}
}

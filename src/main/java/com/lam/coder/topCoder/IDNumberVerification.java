package com.lam.coder.topCoder;

/**
 * 
 * @author LAzuaje
 * 
 *         Problem Statement for IDNumberVerification
 * 
 *         This problem statement contains superscripts and/or subscripts. These
 *         may not display properly outside the applet.
 * 
 *         In People's Republic of China, every citizen has a unique ID string.
 *         The length of the ID is 18 characters. The first 17 characters
 *         (called the body code) are all digits, the last character (called the
 *         checksum code) can be either a digit or 'X'.
 * 
 *         The body code is then divided into three parts: from left to right,
 *         these are the region code, the birthday code, and the sequential
 *         code. They look as follows:
 * 
 *         The region code has 6 digits. Some 6-digit strings represent regions,
 *         other 6-digit strings are invalid. You are given the valid region
 *         codes as a String[] regionCodes. The birthday code has 8 digits. It
 *         gives the citizen's birthday in the form YYYYMMDD. That is, the first
 *         4 digits is the year of birth, the next 2 is the month (01 to 12,
 *         with a leading zero if necessary), and the last 2 digits is the day.
 *         When verifying the birthday code, you should consider leap years (see
 *         the Notes). Additionally, a valid birthday code must represent a date
 *         between Jan 1, 1900 and Dec 31, 2011, inclusive. The sequential code
 *         has 3 digits. These 3 digits may be arbitrary, with one exception:
 *         the sequential code "000" is invalid. If the sequential code
 *         represents an odd number (e.g., "007"), the person is a male.
 *         Otherwise (e.g., "420") the person is a female. The last character of
 *         an ID string is the checksum code. This is derived from the first 17
 *         digits. Let a1, a2, ..., a17 denote the body code from left to right.
 *         Consider the following modular equation: x + a1*217 + a2*216 + a3*215
 *         + ... + a16*22 + a17*21 = 1 (mod 11). This equation always has
 *         exactly one solution x such that 0 <= x <= 10. If x=10, the checksum
 *         code is 'X'. Otherwise, the checksum code is the corresponding digit.
 *         (E.g., if x=5, the checksum code is '5'.)
 * 
 *         You are given a String id. If this is not a valid ID string, return
 *         "Invalid" (quotes for clarity). If id represents a valid ID string of
 *         a male citizen, return "Male". Finally, if id represents a valid ID
 *         string of a female citizen, return "Female".
 * 
 * 
 *         Definition
 * 
 *         Class: IDNumberVerification Method: verify Parameters: String,
 *         String[] Returns: String Method signature: String verify(String id,
 *         String[] regionCodes) (be sure your method is public)
 * 
 * 
 *         Notes - A year is a leap year if and only if it satisfies one of the
 *         following two conditions: A: It is a multiple of 4, but not a
 *         multiple of 100. B: It is a multiple of 400. Therefore, 1904 and 2000
 *         are leap years, while 1900 and 2011 are not.
 * 
 *         Constraints - id will be 18 characters long. - First 17 characters of
 *         id will be between '0' and '9', inclusive. - Last character of id
 *         will be 'X' or between '0' and '9', inclusive. - regionCodes will
 *         contain between 1 and 50 elements, inclusive. - Each element of
 *         regionCodes will be 6 characters long. - Each element of regionCodes
 *         will consist of characters between '0' and '9', inclusive. - For each
 *         element of regionCodes, its first character will not be '0'. -
 *         Elements of regionCodes will be pairwise distinct.
 * 
 *         Examples 0)
 * 
 *         "441323200312060636" {"441323"} Returns: "Male" As you can see,
 *         region code, birthday code and sequential code are all valid. So we
 *         just need to check the equation of checksum code: 6 + 4*217 + 4*216 +
 *         1*215 + 3*214 + 2*213 + 3*212 + 2*211 + 0*210 + 0*29 + 3*28 + 1*27 +
 *         2*26 + 0*25 + 6*24 + 0*23 + 6*22 + 3*21 = 902276. It's easy to verify
 *         that 902276 mod 11 = 1. The sequential code ("063") is odd, thus this
 *         is a male. 1)
 * 
 *         "62012319240507058X" {"620123"} Returns: "Female" 2)
 * 
 *         "321669197204300886" {"610111","659004"} Returns: "Invalid" Region
 *         code '321669' is invalid. 3)
 * 
 *         "230231198306900162" {"230231"} Returns: "Invalid" Birthday code
 *         '19830690' is invalid. 4)
 * 
 *         "341400198407260005" {"341400"} Returns: "Invalid" Sequential code
 *         '000' is invalid. 5)
 * 
 *         "520381193206090891" {"532922","520381"} Returns: "Invalid" Checksum
 *         code is incorrect. This problem statement is the exclusive and
 *         proprietary property of TopCoder, Inc. Any unauthorized use or
 *         reproduction of this information without the prior written consent of
 *         TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All
 *         rights reserved.
 * 
 *         This problem was used for: Single Round Match 583 Round 1 - Division
 *         II, Level Two
 *
 */

public class IDNumberVerification {

	public static final String INVALID = "Invalid";
	public static final String MALE = "Male";
	public static final String FEMALE = "Female";

	public String verify(String id, String[] regionCodes) {

		if (this.verifyRegionCodes(id.substring(0, 6), regionCodes)) {
		} else {
			return INVALID;
		}

		if (isDateRight(Integer.parseInt(id.substring(6, 10)),
				Integer.parseInt(id.substring(10, 12)),
				Integer.parseInt(id.substring(12, 14)))) {
		} else {
			return INVALID;
		}

		if (id.substring(14, 17).equals("000")) {
			return INVALID;
		} else {
		}

		if (!checkControlDigit(id, id.charAt(17))) {
			return INVALID;
		}

		return Integer.valueOf(id.substring(14, 17)) % 2 == 0 ? FEMALE : MALE;
	}

	private boolean verifyRegionCodes(String code, String[] codes) {
		for (String c : codes) {
			if (c.equals(code)) {
				return true;
			}
		}

		return false;
	}

	private static boolean isLeapYear(int year) {
		if (isCentury(year)) {
			return year % 400 == 0 ? true : false;
		} else {
			return year % 4 == 0 ? true : false;
		}
	}

	private static boolean isCentury(int year) {
		return year % 100 == 0 ? true : false;
	}

	private static boolean isDateRight(int year, int month, int day) {
		int[] maxDayInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (year < 1900 || year > 2011) {
			return false;
		}

		if (month >= 1 & month <= 12) {
		} else {
			return false;
		}

		if (isLeapYear(year)) {
			maxDayInMonth[1]++;
		}

		if (day < 1 || day > maxDayInMonth[month - 1]) {
			return false;
		}

		return true;
	}

	private boolean checkControlDigit(String string, char aChar) {

		int summa = 0;
		if (aChar == 'X') {
			summa = 10;
		} else {
			summa = Integer.valueOf(aChar + "");
		}

		int start = 17;

		for (int i = 0; i < string.length() - 1; i++) {
			summa += Integer.valueOf(string.charAt(i) + "")
					* Math.pow(2, (start - i));
		}

		int c = summa % 11;

		if (c == 1) {
			return true;
		}

		return false;
	}
}

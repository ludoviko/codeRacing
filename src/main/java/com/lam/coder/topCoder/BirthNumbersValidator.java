package com.lam.coder.topCoder;

/**
 * @author LAzuaje
 * 
 *         Problem Statement for BirthNumbersValidator
 * 
 *         In Slovakia, every person is assigned a unique 10-digit string when
 *         he is born. This string is known as the birth number of the
 *         respective person.
 * 
 *         The birth number has the form "YYMMDDCCCC", where:
 * 
 *         YY are the last two digits of the year. For males, MM is a two-digit
 *         number of the month, i.e., a number between 01 and 12, inclusive.
 * 
 *         For females, MM is the number of the month increased by 50, i.e., a
 *         number between 51 and 62, inclusive. DD is a two digit number of the
 *         day in the month. CCCC are four arbitrary digits that are used both
 *         as a checksum and as a way to distinguish between different people
 *         born on the same day.
 * 
 *         The checksum property works as follows: the digits CCCC must be
 *         chosen in such a way that the entire 10-digit number is divisible by
 *         eleven (11). For example, the strings "8104121234" and "8154121239"
 *         represent valid birth numbers.
 * 
 *         (The first person is male, the second one female. Both of them are
 *         born on April 12th, ??81.)
 * 
 *         The strings "8134120005", "8102310007", and "8104121235" are not
 *         valid birth numbers.
 * 
 *         (In the first case, "34" can not be a valid month. In the second
 *         case, the day number is wrong, as the second month has less than 31
 *         days. In the third case, the date is valid but the number is not
 *         divisible by 11.)
 * 
 *         You will be given a String[] test containing several ten-digit
 *         strings. Write a method that will return a String[] with the same
 *         number of elements. If the i-th element of test is a valid birth
 *         number the i-th element of the return value shall be "YES", otherwise
 *         the i-th element of the return value shall be "NO". When checking
 *         whether the date is valid, assume that the year when the person was
 *         born is between 1907 and 2006, inclusive.
 * 
 * 
 *         Definition
 * 
 *         Class: BirthNumbersValidator Method: validate Parameters: String[]
 *         Returns: String[] Method signature: String[] validate(String[] test)
 *         (be sure your method is public)
 * 
 * 
 *         Notes - The number of days in each month of a non-leap year (from 1
 *         to 12): 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31. - Leap years
 *         have 29 days in the second month. - A year is a leap year if either
 *         (the year is divisible by 400) or (the year is divisible by 4, but
 *         not by 100).
 * 
 *         For example, 2000 and 2004 are leap years, 1900 and 1947 are not.
 * 
 *         Constraints - test will contain between 1 and 50 elements, inclusive.
 *         - Each element of test will contain exactly 10 characters. - Each
 *         element of test will contain only digits ('0'-'9').
 * 
 *         Examples 0)
 * 
 *         {"8104121234"} Returns: {"YES" } The first example from the problem
 *         statement. 1)
 * 
 *         {"8154121239"} Returns: {"YES" } The second example from the problem
 *         statement. 2)
 * 
 *         {"8134120005"} Returns: {"NO" } The third example from the problem
 *         statement. 3)
 * 
 *         {"8102310007","8104121235"} Returns: {"NO", "NO" } The last two
 *         examples from the problem statement. 4)
 * 
 *         {"0411131237"} Returns: {"YES" } Note that leading zeros may occur in
 *         a valid birth number. 
 *         
 *         This problem statement is the exclusive and
 *         proprietary property of TopCoder, Inc. Any unauthorized use or
 *         reproduction of this information without the prior written consent of
 *         TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All
 *         rights reserved.
 * 
 *         This problem was used for: Single Round Match 333 Round 1 - Division
 *         I, Level One Single Round Match 333 Round 1 - Division II, Level Two
 * 
 */
public class BirthNumbersValidator {

	public String[] validate(String[] test) {
		String[] validation = new String[test.length];

		int y, m, d;
		long c;

		int v = 0;

		for (String s : test) {
			y = Integer.parseInt(s.substring(0, 2));

			if (y <= 6) {
				y += 2000;
			} else {
				y += 1900;
			}

			m = Integer.parseInt(s.substring(2, 4));
			d = Integer.parseInt(s.substring(4, 6));
			c = Long.parseLong(s);

			if (c % 11 == 0 && isDateRight(m, d, y)) {
				validation[v++] = "YES";
			} else {
				validation[v++] = "NO";
			}
		}

		return validation;
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

	private static boolean isDateRight(int month, int day, int year) {
		int[] maxDayInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (year >= 1907 && year <= 2006) {
		} else {
			return false;
		}

		if (month >= 51) {
			month = month - 50;
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
}

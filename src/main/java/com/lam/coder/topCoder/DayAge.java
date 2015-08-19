/**
 * 
 */
package com.lam.coder.topCoder;

/**
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Class Name: DayAge Method Name: getDaysOld Parameters: String, String
 *         Returns: int
 * 
 *         Implement a class DayAge which contains a method getDaysOld. The
 *         method is passed, as Strings, someone's birth date and a current date
 *         and returns the number of days old the person is, as an int.
 * 
 *         The input Strings will be of form mm/dd/yyyy. m, d, and y represent
 *         digits (0 through 9). mm is between 01 and 12, inclusive. dd is
 *         between 01 and 31, inclusive. yyyy is between 1901 and 2001,
 *         inclusive.
 * 
 *         Keep in mind: Thirty days has September, April, June and November;
 *         all the rest have thirty-one, but February twenty-eight alone except
 *         in leap year once in four when February has one day more. From 1901
 *         to 2001, the leap years are 1904, 1908, ... 2000 (Every 4 years, no
 *         exceptions). There are 365 days in a non-leap year, 366 in a leap
 *         year.
 * 
 *         Assume the time the person was born is noon and the time on the
 *         current day is noon.
 * 
 *         Here is the method signature: public int getDaysOld(String birthdate,
 *         String currdate);
 * 
 *         Notes: - Both Strings are of the form given above. TopCoder will
 *         prevent improperly formatted input parameters from reaching your
 *         method. - Both dates exist (no february 30ths or anything) and the
 *         birthday is not after the current day. TopCoder will check this too.
 *         - If the birth date and current date are the same, the method should
 *         return 0. - The string "Calendar" cannot occur anywhere in your code.
 * 
 *         Examples: If birthdate="10/10/1999" and currdate="10/10/2000", the
 *         method returns 366. If birthdate="02/03/1940" and
 *         currdate="12/04/1999", the method returns 21854.
 * 
 *         Definition
 * 
 *         Class: DayAge Method: getDaysOld Parameters: String, String Returns:
 *         int Method signature: int getDaysOld(String param0, String param1)
 *         (be sure your method is public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for:
 * 
 *         Single Round Match 6 Round 1 - Division I, Level One
 * 
 *         Single Round Match 6 Round 1 - Division II, Level One
 * 
 */

public class DayAge {
	public static final int DAYS_365 = 365;
	public static final int CENTURY_20 = 1900;

	public int getDaysOld(String birthDate, String currentDate) {
		String[] bd = birthDate.split("/");
		String[] cd = currentDate.split("/");

		int daysBD = this.getDaysFromXXCentury(Integer.parseInt(bd[0]),
				Integer.parseInt(bd[1]), Integer.parseInt(bd[2]));
		int daysCD = this.getDaysFromXXCentury(Integer.parseInt(cd[0]),
				Integer.parseInt(cd[1]), Integer.parseInt(cd[2]));

		return daysCD - daysBD;
	}

	private boolean isLeapYear(int year) {
		return year % 4 == 0 ? true : false;
	}

	private boolean checkDate(int month, int day, int year) {
		if (year >= CENTURY_20) {
		} else {
			throw new RuntimeException("The year is out of boundaries");
		}

		if (month >= 1 & month <= 12) {
		} else {
			throw new RuntimeException("The month is out of boundaries");
		}

		if (day >= 1 & day <= 31) {
		} else {
			throw new RuntimeException("The days are out of boundaries");
		}

		if (day == 31) {
			if (month == 1 || month == 3 || month == 5 || month == 7
					|| month == 8 || month == 10 || month == 12) {
			} else {
				throw new RuntimeException(
						"The days are out of boundaries for this date:" + month
								+ " " + day + " " + year);
			}
		}
		if (day == 30) {
			if (month == 4 || month == 6 || month == 9 || month == 11) {
			} else {
				throw new RuntimeException(
						"The days are out of boundaries for this date:" + month
								+ " " + day + " " + year);
			}
		}
		if (day > 29) {
			if (month != 2) {
			} else {
				throw new RuntimeException(
						"The days are out of boundaries for this date:" + month
								+ " " + day + " " + year);
			}
		}
		if (day == 29) {
			if (month == 2 & this.isLeapYear(year)) {
			} else {
				throw new RuntimeException(
						"The days are out of boundaries for this date:" + month
								+ " " + day + " " + year);
			}
		}
		return true;
	}

	private int getDaysInMonths(int month, int year) {
		int m_31 = 31;
		int m_30 = 30;
		int m_28 = 28;
		int m_29 = 29;

		int result = 0;

		switch (month) {
		case 12: {
			result += m_30;
		}
		case 11: {
			result += m_31;
		}
		case 10: {
			result += m_30;
		}
		case 9: {
			result += m_31;
		}
		case 8: {
			result += m_31;
		}
		case 7: {
			result += m_30;
		}
		case 6: {
			result += m_31;
		}
		case 5: {
			result += m_30;
		}
		case 4: {
			result += m_31;
		}
		case 3: {
			if (this.isLeapYear(year)) {
				result += m_29;
			} else {
				result += m_28;
			}
		}
		case 2: {
			result += m_31;
		}
		case 1: {
			break;
		}
		default: {
			break;
		}
		}
		return result;
	}

	private int getDaysFromXXCentury(int month, int day, int year) {
		this.checkDate(month, day, year);

		int summa = 0;
		summa = day;
		summa += this.getDaysInMonths(month, year);
		summa += this.getDaysFrom1900(year);

		return summa;
	}

	private int getDaysFrom1900(int year) {
		int days = 0;
		int year_d = year - CENTURY_20;

		days = year_d * WeekDay.DAYS_365;
		for (int i = 1904; i < year; i = i + 4) {
			if (this.isLeapYear(i)) {
				++days;
			}
		}
		return days;
	}
}

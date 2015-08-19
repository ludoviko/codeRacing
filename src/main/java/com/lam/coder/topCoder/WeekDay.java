/**
 * 
 */
package com.lam.coder.topCoder;

/**
 * @author lazuajemolle
 *
 */
/**
 * 
 * Counting Sundays Problem 19
 * 
 * You are given the following information, but you may prefer to do some
 * research for yourself.
 * 
 * 1 Jan 1900 was a Monday. Thirty days has September, April, June and November.
 * All the rest have thirty-one, Saving February alone, Which has twenty-eight,
 * rain or shine. And on leap years, twenty-nine. A leap year occurs on any year
 * evenly divisible by 4, but not on a century unless it is divisible by 400.
 * 
 * How many Sundays fell on the first of the month during the twentieth century
 * (1 Jan 1901 to 31 Dec 2000)?
 * 
 * 
 */

// Compare is missing

public class WeekDay {
	public static final String SUNDAY = "Sunday";
	public static final String MONDAY = "Monday";
	public static final String TUESDAY = "Tuesday";
	public static final String WEDNESDAY = "Wednesday";
	public static final String THURSDAY = "Thursday";
	public static final String FRIDAY = "Friday";
	public static final String SATURDAY = "Saturday";

	public static final int DAYS_365 = 365;
	public static final int CENTURY_20 = 1900;

	public boolean isLeapYear(int year) {
		if (this.isCentury(year)) {
			return year % 400 == 0 ? true : false;
		} else {
			return year % 4 == 0 ? true : false;
		}
	}

	public boolean isCentury(int year) {
		return year % 100 == 0 ? true : false;
	}


	public String getDay(int month, int day, int year) {
		// 1 Jan 1900 was a Monday
//		this.checkDate(month, day, year);

		String day_week = "";
		int summa = 0;
		summa = day;
		summa += this.getDaysInMonths(month, year);
		summa += this.getDaysFrom1900(year);

		int module = summa % 7;

		switch (module) {
		case 0: {
			day_week = WeekDay.SUNDAY;
			break;
		}
		case 1: {
			day_week = WeekDay.MONDAY;
			break;
		}
		case 2: {
			day_week = WeekDay.TUESDAY;
			break;
		}
		case 3: {
			day_week = WeekDay.WEDNESDAY;
			break;
		}
		case 4: {
			day_week = WeekDay.THURSDAY;
			break;
		}
		case 5: {
			day_week = WeekDay.FRIDAY;
			break;
		}
		case 6: {
			day_week = WeekDay.SATURDAY;
			break;
		}
		}
		return day_week;
	}

	public int getDayAsNumber(int month, int day, int year) {
		// 1 Jan 1900 was a Monday
//		this.checkDate(month, day, year);

		int summa = 0;
		summa = day;
		summa += this.getDaysInMonths(month, year);
		summa += this.getDaysFrom1900(year);

		int module = summa % 7;

		// 0 is Sunday
		return module;
	}

	public int getDaysInMonths(int month, int year) {
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

	public int getDaysFrom1900(int year) {
		// 1 Jan 1900 was a Monday
		int days = 0;
		int year_d = year - CENTURY_20;

		days = year_d * WeekDay.DAYS_365;
		for (int i = 1904; i < year; i = i + 4) {
			if (this.isLeapYear(i)) {
				++days;
			}
		}
		return days;
	};

	public static void main(String[] string) {
		WeekDay weekDay = new WeekDay();
		int N = 20;
		int n = N;

		int SUNDAY = 0;
		int MONDAY = 0;
		int TUESDAY = 0;
		int WEDNESDAY = 0;
		int THURSDAY = 0;
		int FRIDAY = 0;
		int SATURDAY = 0;

		for (int i = CENTURY_20; i < CENTURY_20 + n; i++) {
			for (int j = 1; j < 13; j++) {
				int day = weekDay.getDayAsNumber(j, 13, i);

				switch (day) {
				case 0: {
					SUNDAY++;
					break;
				}
				case 1: {
					MONDAY++;
					break;
				}
				case 2: {
					TUESDAY++;
					break;
				}
				case 3: {
					WEDNESDAY++;
					break;
				}
				case 4: {
					THURSDAY++;
					break;
				}
				case 5: {
					FRIDAY++;
					break;
				}
				case 6: {
					SATURDAY++;
					break;
				}
				}
			}
		}
		
		System.out.print(SATURDAY + " ") ;
		System.out.print(SUNDAY + " ");
		System.out.print(MONDAY + " ");
		System.out.print(TUESDAY+ " ");
		System.out.print(WEDNESDAY + " ");
		System.out.print(THURSDAY + " ");
		System.out.print(FRIDAY + " ");
	}
}

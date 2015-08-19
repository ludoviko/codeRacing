package com.lam.coder.topCoder;

// First of January, 2002 is a Tuesday

//Given an int representing a year between 2002 and 9999, 
//return the closest future year with which it shares a calendar. 
//		Jane reminds you that there are 30 days in April, June, September, and November.
//		The remaining months, with the exception of February, have 31 days.
// February has 29 days in leap years, and 28 days otherwise. 
// Leap years are divisible by four, and not divisible by 100 unless 
// they are also divisible by 400. For example, 2004 and 2400 are leap years, 
//but 2003 and 2100 are not. Jane also points out that there are only 14 possible calendars.

public class CalendarRecycle {

	// First of January, 2002 is a Tuesday
	// Your Elvis calendar says that September 8 is a Sunday
	
	public static final int DAYS_365 = 365;
	public static final int YEAR_ELVIS = 2002;

	public int useAgain(int year) {
		return countDaysYearsFrom2002(year);
	}
	
	private int countDaysYearsFrom2002(int year) {
		long summa  = 0;
		int y  = 0;
		
//		System.out.println(1 % 7);
//		System.out.println(366 % 7);
		
		for (int i = YEAR_ELVIS; ; i++) {
			boolean isLeapYear = isLeapYear(i);
			
			if ( isLeapYear ) {
				summa += DAYS_365 + 1;
			} else {
				summa += DAYS_365;
			}
			
			y = i + 1;
			
			System.out.println( summa + 1 + " / " + ((summa + 1) % 7));

			if ( (summa + 1) %  7 == 1 && ! isLeapYear(y) && y > year) {
				break;
			}
			
		}
		
		return y;
		
	}
	
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
}

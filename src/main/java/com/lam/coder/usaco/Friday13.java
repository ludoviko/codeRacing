package com.lam.coder.usaco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Friday the Thirteenth
 * 
 *         Is Friday the 13th really an unusual event?
 * 
 *         That is, does the 13th of the month land on a Friday less often than
 *         on any other day of the week? To answer this question, write a
 *         program that will compute the frequency that the 13th of each month
 *         lands on Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and
 *         Saturday over a given period of N years. The time period to test will
 *         be from January 1, 1900 to December 31, 1900+N-1 for a given number
 *         of years, N. N is positive and will not exceed 400.
 * 
 *         Note that the start year is NINETEEN HUNDRED, not 1990.
 * 
 *         There are few facts you need to know before you can solve this
 *         problem:
 * 
 *         January 1, 1900 was on a Monday. Thirty days has September, April,
 *         June, and November, all the rest have 31 except for February which
 *         has 28 except in leap years when it has 29. Every year evenly
 *         divisible by 4 is a leap year (1992 = 4*498 so 1992 will be a leap
 *         year, but the year 1990 is not a leap year) The rule above does not
 *         hold for century years. Century years divisible by 400 are leap
 *         years, all other are not. Thus, the century years 1700, 1800, 1900
 *         and 2100 are not leap years, but 2000 is a leap year.
 * 
 *         Do not use any built-in date functions in your computer language.
 * 
 *         Don't just precompute the answers, either, please.
 * 
 *         PROGRAM NAME: friday
 * 
 *         INPUT FORMAT One line with the integer N. SAMPLE INPUT (file
 *         friday.in)
 * 
 *         20
 * 
 *         OUTPUT FORMAT Seven space separated integers on one line. These
 *         integers represent the number of times the 13th falls on Saturday,
 *         Sunday, Monday, Tuesday, ..., Friday. SAMPLE OUTPUT (file friday.out)
 * 
 *         36 33 34 33 35 35 34
 */

/*
ID: ludovik1
LANG: JAVA
TASK: Friday13
*/

public class Friday13 {
	public static final String DirIn = "./source/com/coder/usaco/dataIn/";
	public static final String DirOut = "./source/com/coder/usaco/dataOut/";

	public static final String DataIn =  DirIn +  Friday13.class.getSimpleName() + ".in";
	public static final String DataOut = DirOut + Friday13.class.getSimpleName() + ".out";
	
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

		public boolean checkDate(int month, int day, int year) {
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

		public String getDay(int month, int day, int year) {
			// 1 Jan 1900 was on a Monday
			this.checkDate(month, day, year);

			String day_week = "";
			int summa = 0;
			summa = day;
			summa += this.getDaysInMonths(month, year);
			summa += this.getDaysFrom1900(year);

			int module = summa % 7;

			switch (module) {
			case 0: {
				day_week = Friday13.SUNDAY;
				break;
			}
			case 1: {
				day_week = Friday13.MONDAY;
				break;
			}
			case 2: {
				day_week = Friday13.TUESDAY;
				break;
			}
			case 3: {
				day_week = Friday13.WEDNESDAY;
				break;
			}
			case 4: {
				day_week = Friday13.THURSDAY;
				break;
			}
			case 5: {
				day_week = Friday13.FRIDAY;
				break;
			}
			case 6: {
				day_week = Friday13.SATURDAY;
				break;
			}
			}
			return day_week;
		}

		public int getDayAsNumber(int month, int day, int year) {
			// 1 Jan 1900 was on a Monday
			this.checkDate(month, day, year);

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
			int days = 0;
			int year_d = year - CENTURY_20;

			days = year_d * Friday13.DAYS_365;
			for (int i = 1904; i < year; i = i + 4) {
				if (this.isLeapYear(i)) {
					++days;
				}
			}
			return days;
		}

		public static void main(String[] string) throws IOException {
			BufferedReader read = new BufferedReader(new FileReader(DataIn));
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
					DataOut)));

			int years = Integer.parseInt(read.readLine());
			String count = countFridayThe13(years);

			out.println(count);

			read.close();
			out.close();
			System.exit(0);
		}

		private static String countFridayThe13(int yearFrom) {
			Friday13 weekDay = new Friday13();

			int SUNDAY = 0;
			int MONDAY = 0;
			int TUESDAY = 0;
			int WEDNESDAY = 0;
			int THURSDAY = 0;
			int FRIDAY = 0;
			int SATURDAY = 0;

			for (int i = CENTURY_20; i < CENTURY_20 + yearFrom; i++) {
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
			
			String output = "";
			output += String.valueOf(SATURDAY) + " " + 
					String.valueOf(SUNDAY) + " " +
					String.valueOf(MONDAY) + " " + 
					String.valueOf(TUESDAY) + " " + 
					String.valueOf(WEDNESDAY) + " " + 
					String.valueOf(THURSDAY) + " " + 
							String.valueOf(FRIDAY);
			
			return output;
		}
	}

package com.lam.coder.projectEuler;

import com.lam.utilDate.WeekDay;

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
 * Answer: 171.
 */

public class CountingSundays {
	public CountingSundays() {
	}

	public static int find(int from, int upTo) {
		WeekDay weekDay = new WeekDay();
		int counter = 0;

		for (int year = from; year <= upTo; year++) {
			for (int month = 1; month <= 12; month++) {
				if (weekDay.getDay(month, 1, year).equals(WeekDay.SUNDAY)) {
//					System.out.println(weekDay.getDay(month, 1, year) + "/"
//							+ month + "/" + year);
					counter++;
				}
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		int result = CountingSundays.find(1901, 2000);
		System.out.println(result);
	}
}

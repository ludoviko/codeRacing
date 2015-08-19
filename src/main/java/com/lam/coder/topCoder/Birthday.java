package com.lam.coder.topCoder;

import java.util.Arrays;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement Forgetting a close friend's birthday is quite
 *         embarrassing, but forgetting it two years in a row is a catastrophe.
 *         So what can a coder do to prevent this from happening again? Well,
 *         the thing he possibly can do best: code...
 * 
 *         Given a String date (the current date) and a String[] birthdays, a
 *         list of people's birthdays and names, return a String, the date of
 *         the next occurring birthday, starting from the current date.
 * 
 *         date is in the format "MM/DD" (quotes for clarity), where MM
 *         represents the two-digit month and DD represents the two-digit day
 *         (leading zero if necessary). Each element of birthdays is in the
 *         format "MM/DD <Name>" (quotes for clarity), where MM/DD is the date
 *         of <Name>'s birthday. <Name> is a sequence of characters from 'A'-'Z'
 *         and 'a'-'z'. There is exactly one space character between the date
 *         and <Name>. The date returned also has to be in the format "MM/DD"
 *         (quotes for clarity).
 * 
 *         Definition
 * 
 *         Class: Birthday Method: getNext Parameters: String, String[] Returns:
 *         String Method signature: String getNext(String date, String[]
 *         birthdays) (be sure your method is public)
 * 
 *         Constraints - birthdays contains between 1 and 50 elements,
 *         inclusive. - Each element of birthdays contains between 7 and 50
 *         characters, inclusive. - date and each element of birthdays follow
 *         the format described in the problem statement. - All dates are legal
 *         dates and neither date nor any date in birthdays is the 29th of
 *         February.
 * 
 *         Examples 0)
 * 
 * 
 *         "06/17"
 * 
 *         {"02/17 Wernie", "10/12 Stefan"}
 * 
 *         Returns: "10/12"
 * 
 *         1)
 * 
 * 
 *         "06/17"
 * 
 *         {"10/12 Stefan"}
 * 
 *         Returns: "10/12"
 * 
 *         2)
 * 
 * 
 *         "02/17"
 * 
 *         {"02/17 Wernie", "10/12 Stefan"}
 * 
 *         Returns: "02/17"
 * 
 *         3)
 * 
 * 
 *         "12/24"
 * 
 *         {"10/12 Stefan"}
 * 
 *         Returns: "10/12"
 * 
 *         4)
 * 
 * 
 *         "01/02"
 * 
 *         {"02/17 Wernie", "10/12 Stefan", "02/17 MichaelJordan",
 *         "10/12 LucianoPavarotti", "05/18 WilhelmSteinitz"}
 * 
 *         Returns: "02/17"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for: Single Round Match 151 Round 1 - Division
 *         II, Level Two
 */

public class Birthday {
	public String getNext(String date, String[] birthdays) {
		boolean flag = false;
		int index = 0, comparation;

		Arrays.sort(birthdays, String.CASE_INSENSITIVE_ORDER);

		for (int i = 0; i < birthdays.length; i++) {
			comparation = this.compare(date, birthdays[i].split(" ")[0]);
			if (comparation <= 0) {
				flag = true;
				index = i;
				break;
			} else {
			}
		}

		if (flag) {
			return birthdays[index].split(" ")[0];
		} else {
			return birthdays[0].split(" ")[0];
		}
	}

	public int getDaysInMonths(int month) {
		int m_31 = 31;
		int m_30 = 30;
		int m_28 = 28;

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
			result += m_28;
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

	public int compare(String date, String date2) {
		int m = Integer.parseInt(date.split("/")[0]);
		int d = Integer.parseInt(date.split("/")[1]);
		int m2 = Integer.parseInt(date2.split("/")[0]);
		int d2 = Integer.parseInt(date2.split("/")[1]);

		if (m > m2) {
			return 1;
		} else if (m < m2) {
			return -1;
		} else { // m == m2
			if (d > d2) {
				return 1;
			} else if (d < d2) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	public int getDayAsNumber(int month, int day, int year) {
		int summa = 0;
		summa = day;
		summa += this.getDaysInMonths(month);
		summa += 365 * year;

		return summa;
	}
}

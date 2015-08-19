package com.lam.coder.topCoder;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement In documents, it is frequently necessary to write
 *         monetary amounts in a standard format. We have decided to format
 *         amounts as follows:
 * 
 *         the amount must start with '$' the amount should have a leading '0'
 *         if and only if it is less then 1 dollar. the amount must end with a
 *         decimal point and exactly 2 following digits. the digits to the left
 *         of the decimal point must be separated into groups of three by commas
 *         (a group of one or two digits may appear on the left).
 * 
 *         Create a class FormatAmt that contains a method amount that takes two
 *         int's, dollars and cents, as inputs and returns the properly
 *         formatted String.
 * 
 *         Definition
 * 
 *         Class: FormatAmt Method: amount Parameters: int, int Returns: String
 *         Method signature: String amount(int dollars, int cents) (be sure your
 *         method is public)
 * 
 * 
 *         Notes - One dollar is equal to 100 cents.
 * 
 *         Constraints - dollars will be between 0 and 2,000,000,000 inclusive -
 *         cents will be between 0 and 99 inclusive
 * 
 *         Examples 0)
 * 
 * 
 *         123456
 * 
 *         0
 * 
 *         Returns: "$123,456.00"
 * 
 *         Note that there is no space between the $ and the first digit. 1)
 * 
 * 
 *         49734321
 * 
 *         9
 * 
 *         Returns: "$49,734,321.09"
 * 
 *         2)
 * 
 * 
 *         0
 * 
 *         99
 * 
 *         Returns: "$0.99"
 * 
 *         Note the leading 0. 3)
 * 
 * 
 *         249
 * 
 *         30
 * 
 *         Returns: "$249.30"
 * 
 *         4)
 * 
 * 
 *         1000
 * 
 *         1
 * 
 *         Returns: "$1,000.01"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 149 Round 1 - Division
 *         II, Level One
 */

public class FormatAmt {
	public String amount2(int dollars, int cents) {
		String zero = "0";
		String centsS = "";
		String amount = "";
		String remainderS;
		int remainder;

		if (cents == 0) {
			centsS = zero + zero;
		} else if (cents < 10) {
			centsS = zero + cents;
		} else {
			centsS = cents + "";
		}

		centsS = "." + centsS;

		while (dollars > 999) {
			remainder = dollars % 1000;
			dollars /= 1000;
			remainderS = remainder + "";

			while (remainderS.length() < 3) {
				remainderS = zero + remainderS;
			}
			amount = "," + remainderS + amount;
		}

		amount = "$" + dollars + amount + centsS;
		return amount;
	}
	
	public String amount(int dollars, int cents) {
		DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance(Locale.US);
		String pattern = "$###,##0.00";
		df.applyPattern(pattern);
		String output = df.format(dollars + cents / 100.0);
		return output;
	}
}

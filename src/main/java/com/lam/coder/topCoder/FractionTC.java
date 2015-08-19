package com.lam.coder.topCoder;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Problem Statement
 * 
 * Implement a class Fraction, which contains a method getXSmallest. The method
 * is passed two integers: an index and a maximum denominator. The program
 * should find all fractions of the form a / b where b is less than or equal to
 * the maximum denominator and a / b is less than 1 and then return the index-th
 * smallest of these fractions. The method should return the fraction as a
 * double value, rounded to 3 decimal points (use the supplied formatDouble
 * function).
 * 
 * Note:
 * 
 * - If index value is greater than the number of fractions that are less than
 * 1, the method should return 1. - Fractions should not be simplified. 1/2 and
 * 2/4 are two unique fractions, despite their equal double values - The class
 * and method must be declared as public - The index must be between 1 and 70,
 * inclusive. The max denominator must be between 2 and 12, inclusive. (TopCoder
 * will check these constraints, you need not.)
 * 
 * The method signature is :
 * 
 * public double getXSmallest(int, int);
 * 
 * Example:
 * 
 * For example, if index = 3 and max denominator = 4, all the fractions of the
 * form a / b are 1/4, 1/3, 1/2, 2/4, 2/3, 3/4, and the method should return the
 * third smallest, as a double: 0.5.
 * 
 * 
 * Definition
 * 
 * Class: Fraction Method: getXSmallest Parameters: int, int Returns: double
 * Method signature: double getXSmallest(int param0, int param1) (be sure your
 * method is public)
 * 
 * 
 * This problem statement is the exclusive and proprietary property of TopCoder,
 * Inc. Any unauthorized use or reproduction of this information without the
 * prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010,
 * TopCoder, Inc. All rights reserved.
 * 
 * This problem was used for: Single Round Match 1 Round 1 - Division I, Level
 * Two Single Round Match 1 Round 1 - Division II, Level Two
 * 
 * 
 */

public class FractionTC {
	public double getXSmallest(int index, int denominator) {
		List<Double> list = this.getList(denominator);
		
		if ( index > list.size() ) {
			return 1;
		}
		
		double d = list.get(index - 1); 
		return d;
	}

	private List<Double> getList(int d) {
		List<Double> list = new ArrayList<Double>();
		for (int numerator = 1; numerator < d; numerator++) {
			for (int denominator = numerator + 1; denominator <= d; denominator++) {
				list.add(this.formatDouble( (double) numerator  / denominator));
			}
		}

		Collections.sort(list);
		return list;
	}

	 private double formatDouble (double in)  {
	//	String data = String.format("%.3f", in);
	    DecimalFormat threeDigits = new DecimalFormat("#.###");
	    String n = threeDigits.format(in).replace(',', '.');
	    return (new Double(n));
	  }
}

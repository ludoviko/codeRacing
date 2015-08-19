package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Class Name: MagicSeries Method Name: lookup Parameters: int Returns:
 *         int
 * 
 *         Define a magic series of numbers to be the series of non-negative
 *         numbers divisible by 2,3, or 5. The magic series starts with 0, 2, 3,
 *         4, 5, 6, 8, 9, 10, 12 . . .
 * 
 *         Implement a class MagicSeries that contains a method lookup. lookup
 *         takes an index k as a parameter and returns an int that is the kth
 *         term of this magic series of numbers. 0 is the 1st term of the
 *         series, 2 is the second, etc...
 * 
 *         Here is the method signature: public int lookup(int k);
 * 
 *         k is greater than 0 and less than 1000000.
 * 
 *         Examples: If k=1, the method returns 0. If k=2, the method returns 2.
 *         If k=20, the method returns 26.
 * 
 *         Definition
 * 
 *         Class: MagicSeries Method: lookup Parameters: int Returns: int Method
 *         signature: int lookup(int param0) (be sure your method is public)
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 11 Round 1 - Division
 *         I, Level One Single Round Match 11 Round 1 - Division II, Level One
 */

public class MagicSeries {
	public int lookup(int term) {
		int i = 0;
		int k = 0;
		while (k < term) {
			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
				k++;
			}
			i++;
		}

		return i - 1;
	}
}

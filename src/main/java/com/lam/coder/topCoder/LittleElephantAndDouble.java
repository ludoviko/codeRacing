package com.lam.coder.topCoder;


/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Little Elephant from the Zoo of Lviv likes integers.
 * 
 *         You are given an int[] A. On a single turn, Little Elephant can
 *         double (i.e., multiply by 2) any element of A. He may double the same
 *         element more than once, if he wants to. He wants to obtain an array
 *         in which all elements are equal. Return "YES" (quotes for clarity) if
 *         it is possible to do that and "NO" otherwise.
 * 
 *         Definition
 * 
 *         Class: LittleElephantAndDouble Method: getAnswer Parameters: int[]
 *         Returns: String Method signature: String getAnswer(int[] A) (be sure
 *         your method is public)
 * 
 * 
 *         Notes - The return value is case-sensitive. Make sure that you return
 *         the exact strings "YES" and "NO".
 * 
 *         Constraints - A will contain between 1 and 50 elements, inclusive. -
 *         Each element of A will be between 1 and 1,000,000,000, inclusive.
 * 
 *         Examples 0)
 * 
 * 
 *         {1, 2}
 * 
 *         Returns: "YES"
 * 
 *         One possible way of making all elements equal is to double the
 *         element at index 0. 1)
 * 
 * 
 *         {1, 2, 3}
 * 
 *         Returns: "NO"
 * 
 *         It's impossible to make all three elements equal in this case. 2)
 * 
 * 
 *         {4, 8, 2, 1, 16}
 * 
 *         Returns: "YES"
 * 
 *         3)
 * 
 * 
 *         {94, 752, 94, 376, 1504}
 * 
 *         Returns: "YES"
 * 
 *         4)
 * 
 * 
 *         {148, 298, 1184}
 * 
 *         Returns: "NO"
 * 
 *         5)
 * 
 * 
 *         {7, 7, 7, 7}
 * 
 *         Returns: "YES"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 597 Round 1 - Division
 *         II, Level One
 */

public class LittleElephantAndDouble {
	String YES = "YES";
	String NO = "NO";

	public String getAnswer(int[] array) {
		for (int i = 0; i < array.length; i++) {
			while ( array[i] % 2 == 0 ) {
				array[i] =  array[i]/2;
			}

			if ( array[i] != array[0]) {
				return this.NO;
			} else {
				
			}
		}
		return this.YES;
	}
}

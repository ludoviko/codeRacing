package com.lam.coder.topCoder;


/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Class Name: Series Method Name: increasingLength Paramaters: int[]
 *         Returns: int
 * 
 *         Implement a class Series, which contains a method increasingLength.
 *         increasingLength takes an int[] and returns the length of the largest
 *         strictly increasing sequence in the int[]. A strictly increasing
 *         sequence is a sequence of numbers such that every number in the
 *         sequence after the first is strictly greater than the number before
 *         it.
 * 
 *         Here is the method signature: public int increasingLength(int[]
 *         data);
 * 
 *         The int[] will contain Integers between -10000 and 10000, inclusive.
 *         The int[] will have at least 1 element and at most 1000 elements.
 * 
 *         Note: A single element of the int[] is a strictly increasing sequence
 *         of size 1. Read the int[] in the order in which element 0 is before
 *         element 1...
 * 
 *         Examples: If the int[] is {-4, 5, -2, 0 , 4 , 5 , 9 ,9}, the method
 *         should return 5.
 * 
 *         If the int[] is {1,0} the method should return 1.
 * 
 * 
 *         Definition
 * 
 *         Class: Series Method: increasingLength Parameters: int[] Returns: int
 * 
 *         Method signature: public int increasingLength(int[] param0)
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for:
 * 
 *         Collegiate Challenge Semifinals - Division I, Level One
 * 
 */

public class Series {
	public int increasingLength(int[] array) {
		int c = 1;
		int max = 1;

		if (array.length == 0) {
			return 0;
		}

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] > array[i]) {
				c++;
			} else {
				c = 1;
			}
			if (c > max) {
				max = c;
			}
		}
		return max;
	}

}

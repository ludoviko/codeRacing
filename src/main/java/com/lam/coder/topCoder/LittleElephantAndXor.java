package com.lam.coder.topCoder;

import java.util.BitSet;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement     
 * 
 *         Little Elephant from the Zoo of Lviv likes integers.
 * 
 *         You are given three ints A, B and C. Return the number of ordered
 *         pairs (X,Y) of integers such that 0 <= X <= A, 0 <= Y <= B, and the
 *         value (X XOR Y) is less than or equal to C. Definition      Class:
 *         LittleElephantAndXor Method: getNumber Parameters: int, int, int
 *         Returns: long Method signature: long getNumber(int A, int B, int C)
 *         (be sure your method is public)     
 * 
 *         Notes - XOR (exclusive or) is a binary operation, performed on two
 *         numbers in binary notation. First, the shorter number is prepended
 *         with leading zeroes until both numbers have the same number of digits
 *         (in binary). Then, the result is calculated as follows: for each bit
 *         where the numbers differ the result has 1 in its binary
 *         representation. It has 0 in all other positions. - For example 42 XOR
 *         7 is performed as follows. First, the numbers are converted to
 *         binary: 42 is 101010 and 7 is 111. Then the shorter number is
 *         prepended with leading zeros until both numbers have the same number
 *         of digits. This means 7 becomes 000111. Then 101010 XOR 000111 =
 *         101101 (the result has ones only in the positions where the two
 *         numbers differ). Then the result can be converted back to decimal
 *         notation. In this case 101101 = 45, so 42 XOR 7 = 45. Constraints -
 *         A, B and C will each be between 1 and 1,000,000,000 (109), inclusive.
 *         Examples 0)
 * 
 *              2 2 1 Returns: 5 There are 9 possible pairs in this case: 0 XOR
 *         0 = 0 0 XOR 1 = 1 0 XOR 2 = 2 1 XOR 0 = 1 1 XOR 1 = 0 1 XOR 2 = 3 2
 *         XOR 0 = 2 2 XOR 1 = 3 2 XOR 2 = 0 Among them, only 5 have XOR less
 *         than or equal to 1. Note that (0,1) and (1,0) are two different
 *         pairs.
 * 
 *         1)
 * 
 *              4 7 3 Returns: 20
 * 
 *         2)
 * 
 *              10 10 5 Returns: 57
 * 
 *         3)
 * 
 *              774 477 447 Returns: 214144
 * 
 *         4)
 * 
 *              1000000000 1000000000 500000000 Returns: 468566946385621507
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
 * 
 *         // XXX to slow. See dynamic programming.
 */
public class LittleElephantAndXor {
	int[][] array; 
	
	public long getNumber(int a, int b, int c) {
		
		array = new int[a + 1][b + 1];
		for (int i = 0; i  < array.length ; i++) {
			for (int j = 0; j  < array[0].length ; j++) {
				array[i][j] = -1;
			}
		}
		
		long count = 0;
		int result;

		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				result = XOrCalculator(i, j);
				if (result <= c) {
					count++;
				}
			}
		}
		return count;
	}

	public int XOrCalculator(int a, int b) {
		if ( array[a][b] == -1 ) {
			array[a][b] = a ^ b; 
		} else {
		}
		return array[a][b];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LittleElephantAndXor el = new LittleElephantAndXor();
		System.out.println(el.getNumber(0, 0, 1) + "/ 1");
		System.out.println(el.getNumber(2, 2, 1) + "/ 5");
		 System.out.println(el.getNumber(4, 7, 3) + "/ 20");
		 System.out.println(el.getNumber(10, 10, 5) + "/ 57");
		 System.out.println(el.getNumber(774, 477, 447) + "/ 214144");
		 System.out.println(el.getNumber(7740, 4770, 447) + "/ XXX");
//		 System.out.println(el.getNumber(
//		 1000000000,
//		 1000000000, 500000000 ) +
//		 "/ 468566946385621507");
//
//		XOrCalculator(5, 3);
	}

}

package com.lam.coder.topCoder;

import java.math.BigInteger;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement The top few rows of Pascal's triangle are drawn
 *         below:
 * 
 *         . 
 *         1 
 *         1 1 
 *         1 2 1 
 *         1 3 3 1
 *          1 4 6 4 1
 * 
 *         The leftmost and rightmost values of a particular row are always 1.
 *         An inner value v can be found by adding together the 2 numbers found
 *         immediately above v, on its right and left sides. For example, the 6
 *         in the above figure is the sum of the two 3s above it. Return the
 *         number of values in row i of Pascal's triangle that are evenly
 *         divisible by d. The rows are 0-based, so row 3 contains 1,3,3,1.
 * 
 *         Definition
 * 
 *         Class: PascalCount Method: howMany Parameters: int, int Returns: int
 * 
 *         Method signature: public int howMany(int i, int d) (be sure your
 *         method is public)
 * 
 * 
 *         Notes - The jth element (0-based) of row i can be computed by the
 *         formula:
 * 
 *         i!
 * 
 *         ---------------
 * 
 *         j! * (i-j)!
 * 
 *         where k! = 1*2*...*k and 0! = 1.
 * 
 *         Constraints - i will be between 0 and 5000000 inclusive. - d will be
 *         between 2 and 6 inclusive.
 * 
 *         Examples 0)
 * 
 * 
 *         3
 * 
 *         3
 * 
 *         Returns: 2
 * 
 *         Row 3 is 1,3,3,1 so there are 2 elements divisible by 3. 1)
 * 
 * 
 *         3
 * 
 *         4
 * 
 *         Returns: 0
 * 
 *         Row 3 has no elements that are divisible by 4. 2)
 * 
 * 
 *         4
 * 
 *         2
 * 
 *         Returns: 3
 * 
 *         1,4,6,4,1 has 3 elements divisible by 2. 3)
 * 
 * 
 *         4
 * 
 *         6
 * 
 *         Returns: 1
 * 
 *         Row 4 has a single element divisible by 6. 4)
 * 
 * 
 *         0
 * 
 *         3
 * 
 *         Returns: 0
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 230 Round 1 - Division
 *         I, Level Two
 */

public class PascalCount {
	public int howMany(int row, int divisor) {
		BigInteger[] array = findPascalRow(row);
		
		int count = 0;

		for (int i = 0; i < array.length; i++) {
				if (array[i].mod( new BigInteger(divisor + "")).equals(new BigInteger("0"))) {
					count++;
			}
		}

		return count;
	}

	public BigInteger[] findPascalRow(int row) {
		BigInteger[] array = new BigInteger[row + 1]; 
		
		for (int i = 0; i < array.length; i++) {
			array[i] = findPascalElement(row, i);
		}
			
		return array;
	}

	public static BigInteger factorialdBI(int n) {
		BigInteger big = new BigInteger("1");

		if (n == 0 || n == 1) {
			return big;
		}

		for (int i = n; i >= 1 ; i--) {
			big = big.multiply(new BigInteger(i + ""));
		}
		return big;
	}
	
	public BigInteger findPascalElement(int row, int column) {
		int d = row-column;
		BigInteger element = factorialDivide(row, d);
		
		element = element.divide(factorialdBI(column)); 

		return element;
	}

	public static BigInteger factorialDivide(int a, int b) {
		BigInteger big = new BigInteger("1");

		for (int i = a; i > b ; i--) {
			big = big.multiply(new BigInteger(i + ""));
		}
		return big;
	}

}

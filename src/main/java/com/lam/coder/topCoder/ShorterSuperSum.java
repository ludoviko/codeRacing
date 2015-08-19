package com.lam.coder.topCoder;

/**
 * 
 * @author Usuario
 *
 *         Problem Statement SuperSum is a function defined as:
 * 
 * 
 *         SuperSum(0 , n) = n, for all positive n. SuperSum(k , n) =
 *         SuperSum(k-1 , 1) + SuperSum(k-1 , 2) + ... + SuperSum(k-1 , n), for
 *         all positive k, n. Given k and n, return the value for SuperSum(k ,
 *         n).
 * 
 *         Definition Class: ShorterSuperSum Method: calculate Parameters: int,
 *         int Returns: int Method signature: int calculate(int k, int n) (be
 *         sure your method is public)
 * 
 *         Limits Time limit (s): 2.000 Memory limit (MB): 64
 * 
 *         Constraints - k will be between 1 and 14, inclusive. - n will be
 *         between 1 and 14, inclusive. Examples 0) 1
 * 
 *         3
 * 
 * 
 *         Returns: 6
 * 
 *         When k = 1, SuperSum is equal to the sum of the first n = 3 numbers:
 *         1 + 2 + 3 = 6.
 * 
 * 
 *         1) 2
 * 
 *         3
 * 
 * 
 *         Returns: 10
 * 
 *         SuperSum(2 , 3) = SuperSum(1 , 1) + SuperSum(1 , 2) + SuperSum(1 , 3)
 *         = 1 + 3 + 6 = 10.
 * 
 * 
 *         2) 4
 * 
 *         10
 * 
 * 
 *         Returns: 2002
 * 
 * 
 * 
 * 
 *         3) 10
 * 
 *         10
 * 
 * 
 *         Returns: 167960
 * 
 * 
 * 
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
 * 
 *
 */

public class ShorterSuperSum {
	public int calculate(int k, int n) {
		int[] data = new int[n+1];

		int s = 0;
		if (k == 0) {
			return n;
		} else {
			for (int i = 1; i <= n; i++) {
				if (data[i] != 0) {
				   s = data[i];	
				}
				data[i] = this.calculate(k - 1, i);
				s += data[i];
			}
			return s;
		}

	}
}

package com.lam.coder.projectEuler;

import java.io.IOException;
import java.math.BigInteger;

import com.lam.mathematics.Combinatorics;

/**
 * 
 * @author Ludoviko Azuaje 
 * 
 *  Problem 53: Combinatoric selections
 * 
 *         There are exactly ten ways of selecting three from five, 12345:
 * 
 *         123, 124, 125, 134, 135, 145, 234, 235, 245, and 345
 * 
 *         In combinatorics, we use the notation, 5C3 = 10.
 * 
 *         In general, nCr = n! r!(n−r)! ,where r ≤ n, n! = n×(n−1)×...×3×2×1,
 *         and 0! = 1.
 * 
 *         It is not until n = 23, that a value exceeds one-million: 23C10 =
 *         1144066.
 * 
 *         How many, not necessarily distinct, values of nCr, for 1 ≤ n ≤ 100,
 *         are greater than one-million?
 *         
 *         Answer: 4075.
 *         
 */

public class CombinatoricSelections {
	public static final BigInteger MORE_THAN = new BigInteger("1000000");
	public static final int UpTo = 100;

	public static int find() {
		int count = 0;
		BigInteger data;

		for (int i = 1; i <= UpTo; i++) {
			for (int j = 1; j <= i; j++) {
				data = Combinatorics.combinationsBI(i, j);
				if (data.compareTo(MORE_THAN) > 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		int data = find();
		System.out.println(data);
	}
}

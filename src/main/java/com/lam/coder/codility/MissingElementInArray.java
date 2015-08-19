package com.lam.coder.codility;

import java.math.BigInteger;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 * A zero-indexed array A consisting of N different integers is given. The array
 * contains integers in the range [1..(N + 1)], which means that exactly one
 * element is missing. Your goal is to find that missing element. Write a
 * function: class Solution { public int solution(int[] A); } that, given a
 * zero-indexed array A, returns the value of the missing element.
 * 
 * For example, given array A such that: A[0] = 2 A[1] = 3 A[2] = 1 A[3] = 5 the
 * function should return 4, as it is the missing element.
 * 
 * Assume that: N is an integer within the range [0..100,000]; the elements of A
 * are all distinct; each element of array A is an integer within the range
 * [1..(N + 1)].
 * 
 * Complexity: expected worst-case time complexity is O(N); expected worst-case
 * space complexity is O(1), beyond input storage (not counting the storage
 * required for input arguments). Elements of input arrays can be modified.
 * 
 * Copyright 2009–2013 by Codility Limited. All Rights Reserved. Unauthorized
 * copying, publication or disclosure prohibited.
 * 
 */

public class MissingElementInArray {
	public int solution(int[] array) {
		BigInteger sum = new BigInteger((array.length + 1) + "");
		sum = sum.multiply(new BigInteger(array.length + ""));
		sum = sum.divide(new BigInteger("2")).add(
				new BigInteger((array.length + 1) + ""));

		BigInteger sumA = new BigInteger("0");

		for (int n : array) {
			sumA = sumA.add(new BigInteger(n + ""));
		}

		BigInteger result = sum.subtract(sumA);

		return Integer.parseInt(result.toString());
	}
}

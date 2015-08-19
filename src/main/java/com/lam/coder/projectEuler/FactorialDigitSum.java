package com.lam.coder.projectEuler;

import java.math.BigInteger;

import com.lam.mathematics.Combinatorics;
import com.lam.mathematics.Digits;

/**
 * 
 * Problem 20: Factorial digit sum 
 * 
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * 
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800, and the sum of the
 * digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * 
 * Find the sum of the digits in the number 100!
 * 
 * Answer: 648.
 * 
 **/
public class FactorialDigitSum {
	public static void main(String[] args) {
		int sum = find(100);
		System.out.println(sum);
	}

	public static int find(int n) {
		BigInteger result = Combinatorics.factorialBI(n);
		int sum =  Digits.sum(result.toString());
		return sum;
	}
}

package com.lam.coder.projectEuler;

import java.math.BigInteger;

/**
 * 
 * Problem 25: 1000-digit Fibonacci number
 * 
 * The Fibonacci sequence is defined by the recurrence relation:
 * 
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 * 
 * Hence the first 12 terms will be:
 * 
 * F1 = 1 F2 = 1 F3 = 2 F4 = 3 F5 = 5 F6 = 8 F7 = 13 F8 = 21 F9 = 34 F10 = 55
 * F11 = 89 F12 = 144
 * 
 * The 12th term, F12, is the first term to contain three digits.
 * 
 * What is the first term in the Fibonacci sequence to contain 1000 digits?
 * 
 * Answer: 4782.
 */

public class OneThousandDigitFibonacciNumber {
	private static final int LIMIT_DIGITS = 1000;

	public static int find() {
		String numberChain = "";

		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		BigInteger result = new BigInteger("0");
		String term = "";
		int iTerm = 3;
		do {
			result = a.add(b);
			a = b;
			b = result;
			term = "Term: " + iTerm;
			numberChain = result.toString();
			if (numberChain.length() >= LIMIT_DIGITS) {
//				System.out.println(term);
//				System.out.println("LEN: " + numberChain.length());
				break;
			}
			iTerm++;
		} while (true);
	//	System.out.println(numberChain);
		return iTerm;
	}

	public static void main(String[] args) {
		System.out.println(OneThousandDigitFibonacciNumber.find());
	}
}

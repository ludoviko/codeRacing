package com.lam.coder.projectEuler;

import com.lam.mathematics.CheckIsPrime;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 7: 10001st prime 
 * 
 *         By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we
 *         can see that the 6th prime is 13.
 * 
 *         What is the 10 001st prime number?
 * 
 *         Answer: 104743.
 *
 */

public class Find10001stPrime {
	public static int LIMIT = 10001;
	
	public static int go() {
		return go(LIMIT); 
	}

	public static int go(int limit) {
		// 2 is prime
		int count = 1;
		int number = 1;
		do {
			number += 2;
			if (CheckIsPrime.go(number)) {
				++count;
			}
		} while (count < limit);
	//	System.out.println(number);
		return number;
	}
	
	public static void main(String[] args) {
		int LIMIT = 10001;
		Find10001stPrime.go(LIMIT);
	};

}

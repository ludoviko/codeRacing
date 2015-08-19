package com.lam.coder.projectEuler;

import java.util.ArrayList;
import java.util.List;

import com.lam.mathematics.CheckIsPrime;
import com.lam.mathematics.Digits;
import com.lam.mathematics.Primes;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 35: Circular primes
 * 
 *         The number, 197, is called a circular prime because all rotations of
 *         the digits: 197, 971, and 719, are themselves prime.
 * 
 *         There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31,
 *         37, 71, 73, 79, and 97.
 * 
 *         How many circular primes are there below one million?
 * 
 *         Answer: 55.
 */
public class CircularPrimes {
	public static int find(int n) {
		List<Long> circularPrimes = new ArrayList<Long>();
		Primes aPrimes = new Primes();
		aPrimes.find(n);

		long[] primes = aPrimes.getArray();
		Long[] rotates;
		boolean flag = false;

		for (int i = 0; i < primes.length; i++) {
			if (primes[i] < 10) {
				circularPrimes.add(primes[i]);
			} else {
				rotates = Digits.rotate(primes[i]);
				for (int j = 0; j < rotates.length; j++) {
					if (CheckIsPrime.go(rotates[j])) {
						flag = true;
					} else {
						flag = false;
						break;
					}
				}
				if (flag) {
					circularPrimes.add(primes[i]);
				}
			}

		}
		// System.out.println(circularPrimes);
		return circularPrimes.size();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Answer: " + CircularPrimes.find(100));
		System.out.println("Answer: " + CircularPrimes.find(1000000));
	}

}

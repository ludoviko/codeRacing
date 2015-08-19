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
 *         Problem 37: Truncatable primes
 * 
 *         The number 3797 has an interesting property. Being prime itself, it
 *         is possible to continuously remove digits from left to right, and
 *         remain prime at each stage: 3797, 797, 97, and 7. Similarly we can
 *         work from right to left: 3797, 379, 37, and 3.
 * 
 *         Find the sum of the only eleven primes that are both truncatable from
 *         left to right and right to left.
 * 
 *         NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
 *         
 *         Answer: 748317.
 * 
 */

public class TruncatablePrimes {
	private static final int UPTO = 11;

	public static int find(int n) {
		Primes aPrimes = new Primes();
		long[] primes;
		List<Long> list = new ArrayList<Long>();
		Long[] truncatables;
		int sum = 0;

		aPrimes.find(n);
		primes = aPrimes.getArray();
		boolean flag = false;

		for (int i = 0; i < primes.length; i++) {
			if (primes[i] < 10) {
				continue;
			} else {
				truncatables = Digits.truncate(primes[i]);
				for (int j = 0; j < truncatables.length; j++) {
					if (CheckIsPrime.go(truncatables[j])) {
						flag = true;
					} else {
						flag = false;
						break;
					}
				}
				if (flag) {
					list.add(new Long(primes[i]));
					if (list.size() == UPTO) {
						break;
					}
				}
			}
		}

//		System.out.println(list);

		for (long number : list) {
			sum += number;
		}
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 1000000;
		System.out.println("Answer: " + TruncatablePrimes.find(n));
	}

}

package com.lam.coder.projectEuler;

import com.lam.mathematics.CheckIsPrime;
import com.lam.mathematics.Primes;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 46: Goldbach's other conjecture 
 * 
 *         It was proposed by Christian Goldbach that every odd composite number
 *         can be written as the sum of a prime and twice a square.
 * 
 *         9 = 7 + 2×1^2, 15 = 7 + 2×2^2, 21 = 3 + 2×3^2 25 = 7 + 2×3^2, 27 = 19
 *         + 2×2^2, 33 = 31 + 2×1^2
 * 
 *         It turns out that the conjecture was false.
 * 
 *         What is the smallest odd composite that cannot be written as the sum
 *         of a prime and twice a square?
 * 
 *         Answer: 5777.
 * 
 */

public class GoldbachsOtherConjecture {
	public static long findBreak() {
		int number = 6000;

		Primes aPrime = new Primes();
		aPrime.find(number * number);

		long[] primes = aPrime.getArray();
		long sum = 0;
		long sumInner = 0;
		int ii = 0;
		boolean flag = false;

		for (int i = 9; i < number; i = i + 2) {
			 next_i: if ( CheckIsPrime.go(i)) {
			} else {
				 ii = i;
				for (int j = 0; j < number; j++) {
					for (int k = 1; k < number; k++) {
						if (i > sum) {
							sum = primes[j] + 2 * k * k;
						} else {
							if (sum < i) {
								break;
							} else if (sum == i) {
							//	System.out.println("Match: " + sum + "/" + i);
								sumInner = sum;
								break next_i;
							}
						}
					}
					sum = 0;
				}
			}
			if (ii != sumInner) {
		//		System.out.println("************* Break Match: " + ii);
				flag = true;
				break;
			} else {
			}
		}

		if ( flag ) {
			return ii;
		} else {
			return 0;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(	"Answer: " + GoldbachsOtherConjecture.findBreak());
	}
}

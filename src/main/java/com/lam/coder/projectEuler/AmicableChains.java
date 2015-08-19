package com.lam.coder.projectEuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.lam.mathematics.Factors;


/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 95: Amicable chains
 * 
 *         The proper divisors of a number are all the divisors excluding the
 *         number itself. For example, the proper divisors of 28 are 1, 2, 4, 7,
 *         and 14. As the sum of these divisors is equal to 28, we call it a
 *         perfect number.
 * 
 *         Interestingly the sum of the proper divisors of 220 is 284 and the
 *         sum of the proper divisors of 284 is 220, forming a chain of two
 *         numbers. For this reason, 220 and 284 are called an amicable pair.
 * 
 *         Perhaps less well known are longer chains. For example, starting with
 *         12496, we form a chain of five numbers:
 * 
 *         12496 → 14288 → 15472 → 14536 → 14264 (→ 12496 → ...)
 * 
 *         Since this chain returns to its starting point, it is called an
 *         amicable chain.
 * 
 *         Find the smallest member of the longest amicable chain with no
 *         element exceeding one million.
 * 
 * 
 *         Answer: 14316.
 */

// XXX to slow
public class AmicableChains {
	public static final int UPPER_LIMIT = 1000000;

	// Array for memorization
	private BigInteger[] array;

	public int find(int upTo) {
		List<BigInteger> chain = new ArrayList<BigInteger>();
		List<BigInteger> chainLongest = new ArrayList<BigInteger>();

		BigInteger element;
		int from = 14000;
		int i = from;
		int ii = i;

		array = new BigInteger[1000000];
		Arrays.fill(array, BigInteger.valueOf(-1));

		for (i = from; i < upTo; i++) {
			chain.add(BigInteger.valueOf(i));
			element = this.getSumProperDivisors(i);

			while (true) {
				if (element.equals(BigInteger.ZERO)) {
					// The chain is finite.
					chain.clear();
					break;
				}
				if (element.longValue() > AmicableChains.UPPER_LIMIT) {
					// The chain is discarded as its element goes behind upper
					// limit.
					chain.clear();
					break;
				} else {
					if (chain.contains(element)) {
						if (chain.get(chain.size() - 1).compareTo(element) == 0) {
							// The chain is cycled and amicable.
						} else {
							// The chain is cycled but not amicable.
							chain.clear();
						}
						break;
					} else {
						chain.add(0, element);
					}
				}
				element = this.getSumProperDivisors(chain.get(0).intValue());
			}
			if (chain.size() > chainLongest.size()) {
				ii = i;
				chainLongest.clear();
				chainLongest.addAll(chain);
			}
			chain.clear();
		}

		Collections.sort(chainLongest);
		System.out.println("Solution: i: " + ii + ", size "
				+ chainLongest.size() + ", " + chainLongest);

		return ii;
	}

	public BigInteger getSumProperDivisors(int n) {
		Factors factors = new Factors();
		factors.find(n);
		BigInteger summa = BigInteger.ZERO;

		if (array[n].compareTo(BigInteger.valueOf(-1)) != 0) {
			summa = array[n];
		} else {
			for (long a : factors.getProperDivisors()) {
				summa = summa.add(BigInteger.valueOf(a));
			}
			array[n] = summa;
		}

		return summa;
	}

	/**
	 * @param args
	 */
	// Solution: i: 14316, size 28, [14316, 17716, 19116, 19916, 22744, 22976,
	// 31704, 45946, 47616, 48976, 83328, 97946, 122410, 152990, 177792, 243760,
	// 274924, 275444, 285778, 294896, 295488, 358336, 366556, 376736, 381028,
	// 418904, 589786, 629072]

	public static void main(String[] args) {
		int n = 15000;
		int i = new AmicableChains().find(n);
		System.out.println("Solution: i: " + i);
	}
}

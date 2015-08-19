package com.lam.coder.projectEuler;

import java.math.BigInteger;

/**
 * 
 * @author Usuario
 * 
 *         Problem 97: Large non-Mersenne prime
 * 
 *         The first known prime found to exceed one million digits was
 *         discovered in 1999, and is a Mersenne prime of the form 26972593−1;
 *         it contains exactly 2,098,960 digits. Subsequently other Mersenne
 *         primes, of the form 2p−1, have been found which contain more digits.
 * 
 *         However, in 2004 there was found a massive non-Mersenne prime which
 *         contains 2,357,207 digits: 28433 ( 2^7830457) + 1 .
 * 
 *         Find the last ten digits of this prime number.
 * 
 *         Answer: 27580(8739992577).
 */

public class LargeNonMersennePrime {
	public static String find() {
		int showLastDigits = 10;
		BigInteger divisor = new BigInteger("10000000000");
		BigInteger one = new BigInteger("1");
		BigInteger exp = new BigInteger("7830457");
		BigInteger factor = new BigInteger("28433");

		BigInteger data = new BigInteger("2").modPow(exp, divisor)
				.multiply(factor).add(one);

		return data.toString().substring(data.toString().length() - showLastDigits);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(find());
	}
}

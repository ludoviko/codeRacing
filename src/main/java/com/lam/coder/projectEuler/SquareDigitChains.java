package com.lam.coder.projectEuler;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 92: Square digit chains
 * 
 *         A number chain is created by continuously adding the square of the
 *         digits in a number to form a new number until it has been seen
 *         before.
 * 
 *         For example,
 * 
 *         44 → 32 → 13 → 10 → 1 → 1 85 → 89 → 145 → 42 → 20 → 4 → 16 → 37 → 58
 *         → 89
 * 
 *         Therefore any chain that arrives at 1 or 89 will become stuck in an
 *         endless loop. What is most amazing is that EVERY starting number will
 *         eventually arrive at 1 or 89.
 * 
 *         How many starting numbers below ten million will arrive at 89?
 * 
 *         Answer: 8581146.
 * 
 */

public class SquareDigitChains {
	public static long UPTO = 10000000;

	private static long chain(long n) {
		do {
			n = powerOfDigits(n);
		} while (n != 1 && n != 89);
		return n;
	}

	private static long powerOfDigits(long n) {
		long sum = 0;
		long aux = 0;
		while (n > 0) {
			aux = n % 10;
			sum = sum + aux * aux;
			n /= 10;
		}
		return sum;
	}

	public static long find() {
		long sum = 0;
		for (int i = 1; i < UPTO; i++) {
			if (SquareDigitChains.chain(i) == 89) {
				sum++;
			}
		}
		return sum;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Answer: " + find());
	}
}

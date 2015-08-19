package com.lam.coder.projectEuler;

import com.lam.mathematics.PanDigital;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 104: Pandigital Fibonacci ends
 * 
 *         The Fibonacci sequence is defined by the recurrence relation:
 * 
 *         Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 * 
 *         It turns out that F541, which contains 113 digits, is the first
 *         Fibonacci number for which the last nine digits are 1-9 pandigital
 *         (contain all the digits 1 to 9, but not necessarily in order).
 * 
 *         And F2749, which contains 575 digits, is the first Fibonacci number
 *         for which the first nine digits are 1-9 pandigital.
 * 
 *         Given that Fk is the first Fibonacci number for which the first nine
 *         digits AND the last nine digits are 1-9 pandigital, find k.
 * 
 *         Answer: 329468.
 */

public class PanDigitalFibonacciEnds {
	public static long find() {
		long number = 0;
		long i = 2;
		long head;
		long tailcut = 1000000000;
		int digits;
		long a0 = 0;
		long a1 = 1;
		double phi = Math.log10((1 + Math.sqrt(5)) / 2);
		double aux = Math.log10(5) / 2;
		double exponent;

		do {
			number = (a0 + a1) % (tailcut);
			digits = (number + "").toString().length();

			if (digits >= 9) {
				if (PanDigital.isPanDigital(number)) {
					exponent = i * (phi) - aux;
					exponent = exponent - (int) exponent;
					head = (long) (Math.pow(10, exponent + 8));
//					System.out.println("i: " + i);
//					System.out.println("Tail: " + number);
//					System.out.println("Head: " + head);
					if (PanDigital.isPanDigital(head)) {
				//		System.out.println("Answer: " + i);
						break;
					}
				}
			}
			a0 = a1;
			a1 = number;
			i++;
		} while (true);
		return i;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Answer: " + PanDigitalFibonacciEnds.find());
	}
}

package com.lam.coder.projectEuler;

import com.lam.mathematics.BouncyNumber;

/***
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 112: Bouncy numbers
 * 
 *         Working from left-to-right if no digit is exceeded by the digit to
 *         its left it is called an increasing number; for example, 134468.
 * 
 *         Similarly if no digit is exceeded by the digit to its right it is
 *         called a decreasing number; for example, 66420.
 * 
 *         We shall call a positive integer that is neither increasing nor
 *         decreasing a "bouncy" number; for example, 155349.
 * 
 *         Clearly there cannot be any bouncy numbers below one-hundred, but
 *         just over half of the numbers below one-thousand (525) are bouncy. In
 *         fact, the least number for which the proportion of bouncy numbers
 *         first reaches 50% is 538.
 * 
 *         Surprisingly, bouncy numbers become more and more common and by the
 *         time we reach 21780 the proportion of bouncy numbers is equal to 90%.
 * 
 *         Find the least number for which the proportion of bouncy numbers is
 *         exactly 99%.
 * 
 *         Answer: 1587000.
 * 
 */

public class BouncyNumbers {
	public static long find(int proportion) {
		int sum = 0;
		long number = 0;

		for (int i = 1;; i++) {
			if (BouncyNumber.isBouncy(i)) {
				sum++;
			}
			if (100 * sum / ++number == proportion)
				break;
		}
	//	System.out.println((number));
		return number;
	}

	public static void main(String[] args) {
		System.out.println("Answer: " + BouncyNumbers.find(99));
	}
}

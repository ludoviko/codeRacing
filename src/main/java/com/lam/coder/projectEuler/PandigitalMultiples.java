package com.lam.coder.projectEuler;

import com.lam.mathematics.PanDigital;

/***
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 38: Pandigital multiples
 * 
 *         Take the number 192 and multiply it by each of 1, 2, and 3:
 * 
 *         192 × 1 = 192 192 × 2 = 384 192 × 3 = 576
 * 
 *         By concatenating each product we get the 1 to 9 pandigital,
 *         192384576. We will call 192384576 the concatenated product of 192 and
 *         (1,2,3)
 * 
 *         The same can be achieved by starting with 9 and multiplying by 1, 2,
 *         3, 4, and 5, giving the pandigital, 918273645, which is the
 *         concatenated product of 9 and (1,2,3,4,5).
 * 
 *         What is the largest 1 to 9 pandigital 9-digit number that can be
 *         formed as the concatenated product of an integer with (1,2, ... , n)
 *         where n > 1 ?
 * 
 *         Answer: 932718654.
 * 
 */

public class PandigitalMultiples {
	public static final int FROM = 1;
	public static final int UPTO = 9999;

	public static int isProduct() {
		int sumProduct = 0;
		StringBuilder sumChars = new StringBuilder();
		int max = 0;
		int j = 1;

		for (int i = 1; i <= UPTO; i++) {
			while (true) {
				if (sumChars.length() > 10) {
				//	System.out.println(i + "/" + j);
					break;
				}
				sumProduct = i * j++;
				sumChars.append(sumProduct);
				if (PanDigital.isPanDigital(sumChars.toString())) {
					if (Integer.parseInt(sumChars.toString()) > max) {
						max = Integer.parseInt(sumChars.toString());
					}
					break;
				}
			}
			sumChars.delete(0, sumChars.length());
			j = 1;
		}
		return max;
	}

	public static void main(String[] args) {
		int result = PandigitalMultiples.isProduct();
		System.out.println(result);
	}
}

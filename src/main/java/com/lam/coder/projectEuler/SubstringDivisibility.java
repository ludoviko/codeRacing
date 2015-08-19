package com.lam.coder.projectEuler;

import java.util.ArrayList;
import java.util.List;

import com.lam.mathematics.PanDigital;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 43: Sub-string divisibility
 * 
 *         The number, 1406357289, is a 0 to 9 pandigital number because it is
 *         made up of each of the digits 0 to 9 in some order, but it also has a
 *         rather interesting sub-string divisibility property.
 * 
 *         Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way,
 *         we note the following:
 * 
 *         d2d3d4=406 is divisible by 2 
 *         d3d4d5=063 is divisible by 3 
 *         d4d5d6=635 is divisible by 5 
 *         d5d6d7=357 is divisible by 7 
 *         d6d7d8=572 is divisible by 11 
 *         d7d8d9=728 is divisible by 13 
 *         d8d9d10=289 is divisible by 17
 * 
 *         Find the sum of all 0 to 9 pandigital numbers with this property.
 * 
 *         Answer: 16695334890.
 *         [4160357289, 1460357289, 4106357289, 1406357289, 4130952867, 1430952867]
 *         
 */

public class SubstringDivisibility {

	public static int[] factors = { 2, 3, 5, 7, 11, 13, 17 };

	public static boolean isDivisible(long number) {
		long triada = 0;
		long digit;

		long position = (int) Math.log10(number);

		digit = (long) (number / Math.pow(10, position));
		number = (long) (number - digit * Math.pow(10, position));

		for (int i = factors.length - 1; i >= 0; i--) {
			triada = number % 1000;
			number = number / 10;
			if (triada % factors[i] == 0) {
			} else {
				return false;
			}
		}
		return true;
	};

	
	public static long findSum() {
		long sum = 0;
		List<Long> list = new ArrayList<Long>();

		long k = 0;
		long triada;
		for (long i17 = 102; i17 <= 986; i17 += 17) {
			for (long i13 = 0; i13 <= 9; i13++) {
				triada = i13 * 100 + i17 / 10;
				if (triada % 13 == 0) {
				//	System.out.println("triada by 13: " + triada);
				} else {
					continue;
				}
				for (long i11 = 0; i11 <= 9; i11++) {
					triada = i11 * 100 + i13 * 10 + i17 / 100;
					if (triada % 11 == 0) {
					//	System.out.println("triada by 11: " + triada);
					} else {
						continue;
					}
					for (long i7 = 0; i7 <= 9; i7++) {
						triada = i7 * 100 + i11 * 10 + i13;
						if (triada % 7 == 0) {
						//	System.out.println("triada by 7: " + triada);
						} else {
							continue;
						}
						for (long i5 = 0; i5 <= 9; i5++) {
							triada = i5 * 100 + i7 * 10 + i11;
							if (triada % 5 == 0) {
							//	System.out.println("triada by 5: " + triada);
							} else {
								continue;
							}
							for (long i3 = 0; i3 <= 9; i3++) {
								triada = i3 * 100 + i5 * 10 + i7;
								if (triada % 3 == 0) {
								//	System.out.println("triada by 3: " + triada);
								} else {
									continue;
								}
								for (long i2 = 0; i2 <= 9; i2++) {
									triada = i2 * 100 + i3 * 10 + i5;
									if (triada % 2 == 0) {
										// System.out.println("triada by 2: " + triada);
									} else {
										continue;
									}
									for (long i = 0; i <= 9; i++) {
										triada = i * 100 + i2 * 10 + i3;
									//	System.out.println("triada by 1: " + triada);
										k = (i *  1000000000 + 
											i2 *  100000000 + 
										    i3 *  10000000 + 
										    i5 *  1000000 +
											i7 *  100000 + 
											i11 * 10000 +
											i13 * 1000 + 
											i17);
									//	System.out.println("K: " + k);
										if (PanDigital
												.isPanDigitalIncludingZero(k)) {
										//	System.out.println("In inner:" + k);
											sum += k;
											list.add(new Long(k));
										}
									}
								}
							}
						}
					}

				}
			}
		}

//		System.out.println( "Sum: " + sum);
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Answer: " + SubstringDivisibility.findSum());
	}

}

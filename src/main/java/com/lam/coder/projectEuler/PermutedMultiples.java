package com.lam.coder.projectEuler;

import com.lam.mathematics.SortDigits;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 52: Permuted multiples
 * 
 *         It can be seen that the number, 125874, and its double, 251748,
 *         contain exactly the same digits, but in a different order.
 * 
 *         Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and
 *         6x, contain the same digits as x.
 * 
 *         Answer: 142857.
 * 
 */

public class PermutedMultiples {
	public static int find() {
		int start = 1;
		boolean exit = false;
		SortDigits i_1 = new SortDigits();
		SortDigits i_2 = new SortDigits();

		while (true) {
			start *= 10;

			for (int i = start; i < start * 10 / 6; i++) {
				exit = true;
				for (int j = 1; j < 6; j++) {
					i_1.setDigits((long) j * i);
					i_2.setDigits((j + 1L) * i);
					i_1.go();
					i_2.go();
					if  ( i_1.getNumberAsString().equals(i_2.getNumberAsString())) { 
					} else {
						exit = false;
						break;
					}
				};
			//	System.out.println("i: " + i);
				if (exit) {
					return i;	
				}
			} // end for
		} // end while
	//	return 0;
	}

	public static void main(String[] args) {
		System.out.println("Answer: " + PermutedMultiples.find());
	}
}

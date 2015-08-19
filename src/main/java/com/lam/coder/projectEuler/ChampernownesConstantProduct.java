package com.lam.coder.projectEuler;

import com.lam.mathematics.ChampernownesConstant;

/***
 * 
 * @author Ludoviko Azuaje
 * 
 *         Champernowne's constant Problem 40
 * 
 *         An irrational decimal fraction is created by concatenating the
 *         positive integers:
 * 
 *         0.123456789101112131415161718192021...
 * 
 *         It can be seen that the 12th digit of the fractional part is 1.
 * 
 *         If dn represents the nth digit of the fractional part, find the value
 *         of the following expression.
 * 
 *         d1 × d10 × d100 × d1000 × d10000 × d100000 × d 1 000 000
 * 
 *         Answer: 210.
 * 
 */

public class ChampernownesConstantProduct {
	public static int find() {
		ChampernownesConstant champer = new ChampernownesConstant(1000000, "./src/main/java/com/lam/coder/projectEuler/dataIn/champernownesNumber");
		StringBuilder string = champer.getChampernownes();
		// System.out.println(string.length());

		int product = 1;
		int i = 0;
		int position = 0;
		while (true) {
			position = (int) Math.pow(10, i++);
			// System.out.println(string.charAt( position + 1));
			product *= Integer.parseInt(string.charAt(position + 1) + "");
			if (position >= 100000) {
				break;
			}
		}
		return product;
	}

	public static void main(String[] args) {
		System.out.println("Answer: " + find());
	}
}

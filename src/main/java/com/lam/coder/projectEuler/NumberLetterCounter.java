package com.lam.coder.projectEuler;

import com.lam.utilString.NumberToLetters;

/**
 * 
 * Problem 17: Number letter counts 
 * 
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out
 * in words, how many letters would be used?
 * 
 * NOTE: Do not count spaces or hyphens.
 * 
 * For example, 342 (three hundred and forty-two) contains 23 letters and 115
 * (one hundred and fifteen) contains 20 letters.
 * 
 * The use of "and" when writing out numbers is in compliance with British
 * usage.
 * 
 * Answer: 21124.
 * 
 * 
 */

public class NumberLetterCounter {
	public static int find() {
		String string = "";
		int len = 0;
		NumberToLetters counter = new NumberToLetters();
		for (int i = 1; i <= 1000; i++) {
			string = (counter.find(i) + "").replaceAll("[-\\s]", "");
			len += string.length();
		}
		return len;
	}

	public static void main(String[] args) {
		int len = find();
		System.out.println(len);
	}
}

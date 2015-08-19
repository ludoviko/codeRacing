package com.lam.coder.projectEuler;

import java.util.ArrayList;
import java.util.List;

import com.lam.mathematics.Digits;

/**
 * @author Ludoviko Azuaje
 * 
 *         Problem 36: Double-base palindromes
 * 
 *         The decimal number, 585 = 10010010012 (binary), is palindromic in
 *         both bases.
 * 
 *         Find the sum of all numbers, less than one million, which are
 *         palindromic in base 10 and base 2.
 * 
 *         (Please note that the palindromic number, in either base, may not
 *         include leading zeros.)
 * 
 *         Answer: 872187.
 * 
 */

public class DoubleBasePalindromes {
	public static int LIMIT = 1000000;
	private List<Integer> list;

	public DoubleBasePalindromes(List<Integer> list) {
		this.list = list;
	}

	public int find() {
		int sum = 0;
		long pali = 0;
		
		for (int i = 1; pali < LIMIT; i++) {
			pali = Digits.makePalindrome(i, true);
			if (Digits.isPalindromeBinary(pali)) {
				this.list.add(i);
				sum += pali;
			}

			pali = Digits.makePalindrome(i, false);
			if (Digits.isPalindromeBinary(pali)) {
				this.list.add(i);
				sum += pali;
			}
		}
		return sum;
	}

	public List<Integer> getList() {
		return this.list;
	}

	public static void main(String[] args) {
		DoubleBasePalindromes palis = new DoubleBasePalindromes(
				new ArrayList<Integer>());
		int sum = palis.find();
		System.out.println(872187 == sum);
	}
}

package com.lam.coder.projectEuler;

import com.lam.mathematics.Digits;

/**
 * @author Ludoviko Azuaje
 * 
 *         Problem 4: Largest palindrome product
 * 
 *         A palindromic number reads the same both ways. The largest palindrome
 *         made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 *         Find the largest palindrome made from the product of two 3-digit
 *         numbers.
 * 
 *         Answer: 993 * 913 = 906609.
 * 
 * */

public class LargestPalindromeProduct {

	int order;
	int upperBound;
	int lowerBound;

	public LargestPalindromeProduct(int order) {
		this.order = order;
		this.upperBound = (int) (Math.pow(10, order) - 1);
		this.lowerBound = (int) (Math.pow(10, order - 1));
	};

	public LargestPalindromeProduct() {
	};

	public void setOrder(int order) {
		this.order = order;
		this.upperBound = (int) (Math.pow(10, this.order) - 1);
		this.lowerBound = (int) (Math.pow(10, this.order - 1));
	};

	public int find() {
		if (this.order == 0) {
			throw new RuntimeException("Set the order");
		}

		int upper_11_multiple = (this.upperBound / 11) * 11;

		int product = -1;
		int max = -1;
		for (int i = this.upperBound; i >= this.lowerBound; i--) {
			for (int j = upper_11_multiple; j >= this.lowerBound; j -= 11) {
				product = i * j;
				// System.out.println(i + " * " + j + " = " + product);
				if (product <= max) {
					// System.out.println(" Break:    prod / max  " + product +
					// "/" + max );
					// Break the inner loop.
					break;
				}
				if (Digits.isPalindrome(product)) {
					if (product > max) {
						max = product;
					} else {
					}
				} else {
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		LargestPalindromeProduct findPalindrome = new LargestPalindromeProduct(
				3);
		int result = findPalindrome.find();
		System.out.println(result);
	}

}

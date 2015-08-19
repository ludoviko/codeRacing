package com.lam.coder.topCoder;

/**
 * Problem Statement
 * 
 * A palindrome is a string that reads the same from left to right as it does
 * from right to left. Given a String s, return the shortest palindrome that can
 * be produced by adding zero or more characters to the right end of s. There is
 * always one unique answer.
 * 
 * Definition
 * 
 * Class: Palindromize Method: minAdds Parameters: String Returns: String Method
 * signature: String minAdds(String s) (be sure your method is public)
 * 
 * 
 * Constraints - s will contain between 1 and 50 characters, inclusive. - Each
 * character of s will be a lowercase letter ('a'-'z').
 * 
 * Examples 0)
 * 
 * 
 * "add"
 * 
 * Returns: "adda"
 * 
 * Add 'a' to make a palindrome. "adddda" is also a valid palindrome, but it is
 * not the shortest possible one. 1)
 * 
 * 
 * "cigartragic"
 * 
 * Returns: "cigartragic"
 * 
 * This is already a palindrome, so the shortest solution is to add 0 letters.
 * 2)
 * 
 * 
 * "redocpot"
 * 
 * Returns: "redocpotopcoder"
 * 
 * 3)
 * 
 * 
 * "acaba"
 * 
 * Returns: "acabaca"
 * 
 * 4)
 * 
 * 
 * "abczyxyz"
 * 
 * Returns: "abczyxyzcba"
 * 
 * This problem was used for: Single Round Match 335 Round 1 - Division II,
 * Level One
 * 
 */

public class Palindromize {
	public String minAdds(String word) {
		String palindrome = "";
		String begin = "";
		String nigeb;

		int i = 0;
		while (i < word.length()) {
			begin = word.substring(0, i);
			nigeb = new StringBuilder(begin).reverse().toString();
			if (Palindromize.isPalindrome(word.substring(i))) {
				palindrome = word + nigeb;
				break;
			} else {
			}
			i++;
		}
		return palindrome;
	}

	public static boolean isPalindrome(String string) {
		StringBuilder builder = new StringBuilder(string);
		builder = builder.reverse();
		return builder.toString().equals(string);
	}
}

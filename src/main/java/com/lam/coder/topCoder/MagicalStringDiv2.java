package com.lam.coder.topCoder;

public class MagicalStringDiv2 {

	public int minimalMoves(String string) {
		int left = 0;
		int right = 0;
		int half = string.length() / 2;

		for (int i = 0; i < half; i++) {
			if (string.charAt(i) == '<') {
				left++;
			}
			if (string.charAt(i + half) == '>') {
				right++;
			}
		}
		return left + right;
	}

}

package com.lam.coder.topCoder;


/**
 * 
 * @author Ludoviko Azuaje
 *
 */

public class PairGame {
	public static String ABLE = "Able to generate";
	public static String NOT_ABLE = "Not able to generate";

	public String able(int a, int b, int c, int d) {
		return check(a, b, c, d) == true ? ABLE : NOT_ABLE;
	}

	private static boolean check(int a, int b, int c, int d) {
		if (a == c && b == d) {
			return true;
		} else if (a > c || b > d) {
			return false;
		} else if (a == c && b < d) {
			return check(a, a + b, c, d);
		} else if (a < c && b == d) {
			return check(a + b, b, c, d);
		} else {
			return check(a, a + b, c, d) || check(a + b, b, c, d);
		}
	}

}

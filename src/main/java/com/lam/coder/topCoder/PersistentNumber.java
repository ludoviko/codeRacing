package com.lam.coder.topCoder;

public class PersistentNumber {
	public int getPersistence(int n) {
//		if (n < 10) {
//			return 0;
//		}
		int c = 0;
		while (n > 9) {
			n = multiplyDigits(n);
			c++;
		}
		return c;
	}

	private int multiplyDigits(int n) {
		if ( n == 0 ) {
			return 0;
		}

		int p = 1;
		int d = 1;
		while (n != 0) {
			d = n % 10;
			p *= d;
			n = n / 10;
		}
		return p;
	}

}
// Powered by [KawigiEdit] 2.0!
package com.lam.coder.topCoder;

public class TheArithmeticProgression {

	public double minimumChange(int a, int b, int c) {
        double d = 0.0;
		
		
		if ( isAsc(a,b,c)  || isDesc(a,b,c) ) {
			return d;
		}
		
		if ( mightBeAsc(a,b,c) ) {
			d = b - ( (c - a) / 2.0 );
		}

		if ( mightBeDesc(a,b,c) ) {
			d = b - ( (c - a) / 2.0 );
		}
		
		return d;
	}
	
	private static boolean mightBeAsc(int a, int b, int c) {
		if ( a <= b && b >= c  && a < c ) {
			return true;
		} else if ( ( a <= b && b <= c  ) ) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean mightBeDesc(int a, int b, int c) {
		if ( a >= b && b <= c  && a > c ) {
			return true;
		} else if ( ( a >= b && b >= c  ) ) {
			return true;
		} else {
			return false;
		}
		
	}

	
	
	private static boolean isAsc(int a, int b, int c) {
		if ( a < b && b < c  ) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isDesc(int a, int b, int c) {
		if ( a > b && b > c  ) {
			return true;
		} else {
			return false;
		}
	}

}

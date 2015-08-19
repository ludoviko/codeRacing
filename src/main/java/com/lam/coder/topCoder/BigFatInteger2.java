package com.lam.coder.topCoder;

public class BigFatInteger2 {

	public String isDivisible(int a, int b, int c, int d) {

		double i = (float) (b * Math.log10(a) - d * Math.log10(c));

		i = Math.pow(10, i);

		double iRound = Math.round(i); 
		
		if ( Math.abs(i-iRound)  <= 0.00001) {
			return "divisible";
		} else {
			return "not divisible";
		}
	}
}

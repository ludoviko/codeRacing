package com.lam.coder.projectEuler;

import java.math.BigInteger;

/**
 * @author Ludoviko Azuaje
 * 
 *         Problem 48: Self powers 
 * 
 *         The series, 11 + 22 + 33 + ... + 1010 = 10405071317.
 * 
 *         Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... +
 *         1000^1000.
 * 
 *         Answer: 4629110846700.
 *
 */

public class SelfPowers {
	public static final String find() {
		  BigInteger mod = new BigInteger("10000000000");
		  BigInteger sum = new BigInteger("0");
		  BigInteger power = new BigInteger("0");
			
		  BigInteger big = new BigInteger("1000");
		  big.modPow(big, mod);
		  
		  for (int i = 1; i <= 1000; i++ ) {
			  big = new BigInteger(i + "");
			  power = big.modPow(big, mod);
			  sum = sum.add(power);
		  }
		  return sum.toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  System.out.println(find());
	}
}

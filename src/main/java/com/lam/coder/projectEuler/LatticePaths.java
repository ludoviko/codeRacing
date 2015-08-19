package com.lam.coder.projectEuler;

import java.math.BigInteger;

import com.lam.mathematics.Combinatorics;

/**
 * 
 * Problem 15: Lattice paths 
 * 
 * Starting in the top left corner of a 2×2 grid, and only being able to move to
 * the right and down, there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20×20 grid?
 * 
 * The number of lattice paths from the origin (0,0) to a point (a,b) is the
 * binomial coefficient (a+b; a)
 * 
 * Answer = ( a + b ) ! / (( a! ) ( b! )) Answer = 137846528820.
 */

public class LatticePaths {
	public static final int A = 20;
	public static final int B = 20;

	public static BigInteger find() {
		BigInteger n = Combinatorics.factorialBI(A + B);
		BigInteger x = Combinatorics.factorialBI(A);
		BigInteger y = Combinatorics.factorialBI(B);
		BigInteger z = x.multiply(y);
		n = n.divide(z);
		return n;
	}
	
	public static void main(String[] args) {
		BigInteger n = find();
		System.out.println(n);
	}
}

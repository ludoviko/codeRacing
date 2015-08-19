package com.lam.coder.projectEuler;

import java.util.HashSet;
import java.util.Set;

import com.lam.mathematics.Fraction;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 71: Ordered fractions
 * 
 *         Consider the fraction, n/d, where n and d are positive integers. If
 *         n<d and HCF(n,d)=1, it is called a reduced proper fraction.
 * 
 *         If we list the set of reduced proper fractions for d ≤ 8 in ascending
 *         order of size, we get:
 * 
 *         1/8, 1/7, 1/6, 1/5, 1/4, 2/7, 1/3, 3/8, 2/5, 3/7, 1/2, 4/7, 3/5, 5/8,
 *         2/3, 5/7, 3/4, 4/5, 5/6, 6/7, 7/8
 * 
 *         It can be seen that 2/5 is the fraction immediately to the left of
 *         3/7.
 * 
 *         By listing the set of reduced proper fractions for d ≤ 1,000,000 in
 *         ascending order of size, find the numerator of the fraction
 *         immediately to the left of 3/7.
 *         
 *         Answer: 
 */

public class CountingFractions {

	public static void go(int d) {
		Set<Fraction> set = new HashSet<Fraction>(); 
		Fraction f;
		
	//	d = top;
		
		for (int numerator = 1; numerator < d; numerator++ ) {
			for (int denominator = numerator + 1; denominator <= d; denominator++ ) {
				f = new Fraction(numerator, denominator);
				f.reduce();
				set.add(f);
				System.out.println(numerator + "/" + denominator + " ");
			}
	//		System.out.println();
		}
		
//		System.out.println(set);
	//	List<Fraction> list = new ArrayList<Fraction>();
	//	list.addAll(set);
	//	Collections.sort(list);
		
		System.out.println( set.size());
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
       go(1000000);
	}

}

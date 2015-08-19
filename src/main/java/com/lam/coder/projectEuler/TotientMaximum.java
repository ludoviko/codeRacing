package com.lam.coder.projectEuler;

import com.lam.mathematics.EulersTotientFunction;
import com.lam.mathematics.Fraction;

/**
 * @author Ludoviko Azuaje
 * 
 *         Problem 69: Totient maximum
 * 
 *         Euler's Totient function, φ(n) [sometimes called the phi function],
 *         is used to determine the number of numbers less than n which are
 *         relatively prime to n. For example, as 1, 2, 4, 5, 7, and 8, are all
 *         less than nine and relatively prime to nine, φ(9)=6. n
 * 
 *         n Relatively Prime φ(n) n/φ(n) 
 *         2 1 1 2 
 *         3 1,2 2 1.5 
 *         4 1,3 2 2 
 *         5 1,2,3,4 4 1.25 
 *         6 1,5 2 3 
 *         7 1,2,3,4,5,6 6 1.1666... 
 *         8 1,3,5,7 4 2 
 *         9 1,2,4,5,7,8 6 1.5 
 *         10 1,3,7,9 4 2.5
 * 
 *         It can be seen that n=6 produces a maximum n/φ(n) for n ≤ 10.
 * 
 *         Find the value of n ≤ 1,000,000 for which n/φ(n) is a maximum.
 *         
 *         Answer: 510510. 
 */

// XXX this solution is not optimal.
public class TotientMaximum {
	public static int find(int upTo) {
		int n = 1;
		int m = 0;
        Fraction max = new Fraction(0);
        Fraction current;
				
		while ( n <= upTo ) {
			current = EulersTotientFunction.findNDividedByPhi(n);
			if ( current.compareTo(max) >= 0) {
                max = current;
                m = n;
              //  System.out.println(n);
			}
			n++;
		}
		return m;
	}
}

package com.lam.coder.projectEuler;

import java.util.Arrays;

import com.lam.mathematics.EulersTotientFunction;
import com.lam.mathematics.Fraction;
import com.lam.mathematics.SortDigits;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 70: Totient permutation
 * 
 *         Euler's Totient function, φ(n) [sometimes called the phi function],
 *         is used to determine the number of positive numbers less than or
 *         equal to n which are relatively prime to n. For example, as 1, 2, 4,
 *         5, 7, and 8, are all less than nine and relatively prime to nine,
 *         φ(9)=6. The number 1 is considered to be relatively prime to every
 *         positive number, so φ(1)=1.
 * 
 *         Interestingly, φ(87109)=79180, and it can be seen that 87109 is a
 *         permutation of 79180.
 * 
 *         Find the value of n, 1 < n < 10^7, for which φ(n) is a permutation of
 *         n and the ratio n/φ(n) produces a minimum.
 *         
 *         Answer: 8319823.
 */

public class TotientPermutation {
	// XXX to slow, see forum.
	
	public static int find(int upTo) {
		int n = 8000000;
		int m = 0;
		float c, minF;
		minF = Float.MAX_VALUE;
		long euler;
        Fraction min = new Fraction(Integer.MAX_VALUE);
        Fraction current;
        SortDigits sd = new SortDigits(), sd2 = new SortDigits();		
        
		while ( n <= upTo ) {
			euler = EulersTotientFunction.findPhi(n);
			
			sd.setDigits(euler);
			sd.go();
			
			sd2.setDigits(n);
			sd2.go();
			
			if ( Arrays.equals(sd.getDigits(), sd2.getDigits()) ) {
				System.out.println("Match: **************** " + euler + "/" + n);
				c = ((float) n )/ euler;
				if ( c <= minF) {
	                minF = c;
	                m = n;
	            	System.out.println(minF);
				}
//				current = EulersTotientFunction.findNDividedByPhi(n);
//				if ( current.compareTo(min) <= 0) {
//	                min = current;
//	                m = n;
//				}
			} else {
			}
			n++;
		//	System.out.println(n);
		}
		return m;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(TotientPermutation.find(10000000 - 1));
	}
}

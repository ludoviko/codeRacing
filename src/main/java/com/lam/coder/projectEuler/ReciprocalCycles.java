package com.lam.coder.projectEuler;

import com.lam.mathematics.FindRepeatingDecimal;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 26: Reciprocal cycles 
 * 
 *         A unit fraction contains 1 in the numerator. The decimal
 *         representation of the unit fractions with denominators 2 to 10 are
 *         given:
 * 
 *         1/2 = 0.5 
 *         1/3 = 0.(3) 
 *         1/4 = 0.25 
 *         1/5 = 0.2 
 *         1/6 = 0.1(6) 
 *         1/7 = 0.(142857) 
 *         1/8 = 0.125 
 *         1/9 = 0.(1) 
 *         1/10 = 0.1
 * 
 *         Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It
 *         can be seen that 1/7 has a 6-digit recurring cycle.
 * 
 *         Find the value of d < 1000 for which 1/d contains the longest
 *         recurring cycle in its decimal fraction part.
 * 
 *  Answer = 1/983, length 982.
 * 
 */

public class ReciprocalCycles {
	public static int find() {
		FindRepeatingDecimal cycle = new FindRepeatingDecimal();
        int len;
        int max = 0;
        int j = 0;

        for (int i = 2; i < 1001; i++) {
			cycle.findRepeatingDecimal(i);
			len = cycle.getLength();
			if (len > max) {
			//	System.out.println("**** I = " + i + " ");
				max = len;
				j = i;
			}
		}
		// System.out.println("**** I = " + j + ", len " + max );
        return j;
	}
	
	public static void main(String[] args) {
        int j = find();
		System.out.println("**** I = " + j );
	}
}

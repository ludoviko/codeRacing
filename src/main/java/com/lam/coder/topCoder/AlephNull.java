package com.lam.coder.topCoder;

 import java.util.ArrayList;
import java.util.List;

import com.lam.mathematics.Fraction;
 

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         PROBLEM STATEMENT
 * 
 *         The logician Charles Sanders Pierce proposed a procedure for
 *         generating and ordering all of the positive rational numbers. A
 *         rational number is an integer divided by an integer (n/m where both n
 *         and m are integers and m does not equal zero).
 * 
 *         The procedure proceeds as follows. Start with the two rationals 0/1
 *         and 1/0 (disregarding the fact that 1/0 is not a valid number). Call
 *         this generation 1. To produce the next generation, insert a new
 *         rational in between each pair of rationals in the current generation
 *         by summing the numerators (the number being divided) of the adjacent
 *         rationals to produce the new numerator, and by summing the
 *         denominators (the number doing the dividing) of the adjacent
 *         rationals to produce the new denominator. By repeating this procedure
 *         indefinitely, all of the positive rational numbers will be produced
 *         in order in their simplest rational form.
 * 
 *         The first few generations proceed as follows:
 * 
 *         G1: 0/1 1/0 G2: 0/1 1/1 1/0 G3: 0/1 1/2 1/1 2/1 1/0 G4: 0/1 1/3 1/2
 *         2/3 1/1 3/2 2/1 3/1 1/0 G5: 0/1 1/4 1/3 2/5 1/2 3/5 2/3 3/4 1/1 4/3
 *         3/2 5/3 2/1 5/2 3/1 4/1 1/0
 * 
 *         Code a method that given a generation number and a zero based index,
 *         returns the numerator and denominator of the rational number at the
 *         position indicated by the index within the generation. If the index
 *         is not within the range of values for the given generation, return
 *         the special error value having zero for both the numerator and
 *         denominator.
 * 
 *         DEFINITION Class: AlephNull Parameters: int, int Returns: int[]
 *         Method signature: int[] rational(int generation, int item)
 * 
 *         (be sure your method is public)
 * 
 *         TopCoder will ensure the validity of the inputs. Inputs are valid if
 *         all of the following criteria are met:
 * 
 *         generation is from 1 to 30 inclusive. item is from 0 to 999999999
 *         inclusive.
 * 
 *         HINT The number of elements in a given generation can be computed as
 *         follows: elements = (2 ^ (generation - 1)) + 1. (The '^' symbol
 *         indicates exponentiation. For example: Generation 1: 2^0 + 1 = 2
 *         Generation 2: 2^1 + 1 = 3 Generation 3: 2^2 + 1 = 5 Generation 4: 2^3
 *         + 1 = 9 Generation 9: 2^8 + 1 = 257
 * 
 *         EXAMPLES E1: 1,0 ==> [0,1] E2: 1,1 ==> [1,0] E3: 1,2 ==> [0,0]
 *         //error value E4: 4,1 ==> [1,3] E5: 4,6 ==> [2,1] E6: 5,11 ==> [5,3]
 *         E7: 8,70 ==> [9,7] E8: 10,467 ==> [43,12] E9: 23,4190316 ==> [438,43]
 *         E10: 30,100 ==> [7,157]
 * 
 * 
 *         Definition
 * 
 *         Class: AlephNull Method: rational Parameters: int, int Returns: int[]
 *         Method signature: int[] rational(int param0, int param1) (be sure
 *         your method is public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Sun Microsystems / TopCoder Collegiate
 *         Challenge Regional Quarterfinal W/MW - Division I, Level Three
 */

public class AlephNull {

	List<Fraction> elements; 
	
	public AlephNull() {
		elements = new ArrayList<Fraction>();
	}
	
	public int[] rational(int generation, int item) {
		elements.clear(); 
		elements.add(new Fraction(0,1)); 
		elements.add(new Fraction(1,0)); 
		
		
		for (int i = 2; i <= generation; i++) {
			List<Fraction> aux = new ArrayList<Fraction>();
			aux.addAll(elements);
			
			for (int j = 0; j < elements.size() - 1; j++) {
				long a,b;
				a = elements.get(j).getNumerator() + elements.get(j+1).getNumerator();
				b = elements.get(j).getDenominator() + elements.get(j+1).getDenominator();
				aux.add(1 + 2*j, new Fraction(a,b));
			}
			elements.clear();
			elements.addAll(aux);
			aux.clear();
		}

		
		Fraction result;
		
		if (item >= elements.size()) {
			// Error result
			result = new Fraction(0,0);
		} else {
		   result = elements.get(item);
		}
		
//		for (int i = 0; i < elements.size(); i++) {
//			System.out.println(i + 1 + " " + elements.get(i));
//		}
		
		return new int[] { (int)result.getNumerator(), (int)result.getDenominator()};
	} 
	
	public static void main(String[] args) {
		   AlephNull aleph = new AlephNull();
		   int[] result = aleph.rational(4, 6);
		   for (int n : result) {
			   System.out.println(n);
		   }
		   
	}

}


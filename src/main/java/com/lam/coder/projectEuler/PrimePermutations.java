package com.lam.coder.projectEuler;

import java.util.ArrayList;
import java.util.List;

import com.lam.mathematics.CheckIsPrime;
import com.lam.mathematics.Primes;
import com.lam.mathematics.SortDigits;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 49: Prime permutations
 * 
 *         The arithmetic sequence, 1487, 4817, 8147, in which each of the terms
 *         increases by 3330, is unusual in two ways: (i) each of the three
 *         terms are prime, and, (ii) each of the 4-digit numbers are
 *         permutations of one another.
 * 
 *         There are no arithmetic sequences made up of three 1-, 2-, or 3-digit
 *         primes, exhibiting this property, but there is one other 4-digit
 *         increasing sequence.
 * 
 *         What 12-digit number do you form by concatenating the three terms in
 *         this sequence?
 *         
 *         Answer: 2969 6299 9629
 *          
 */

public class PrimePermutations {
	public static String find() {
		String data = "";
		Primes aPrime = new Primes();
		aPrime.find(10000);
		long[] primes = aPrime.getArray();
		SortDigits s1 = new SortDigits();
		SortDigits s2 = new SortDigits();
		SortDigits s3 = new SortDigits();
		long n1 = 0;
		long n2 = 0;
		long n3 = 0;
        long k = 0;
		List<Long> primes_1000 = new ArrayList<Long>();
		List<Long> out = new ArrayList<Long>();
        long dif = 0;
		
		for (long number : primes)
			if (number > 1011 && number < 9999)
				primes_1000.add((long) number);
		for (int i = 0; i < primes_1000.size(); i++) {
			for (int j = i + 1; j < primes_1000.size(); j++) {
					s1.setDigits((long) primes_1000.get(i));
					s2.setDigits((long) primes_1000.get(j));
					s1.go();
					s2.go();
					n1 = s1.getNumber();
					n2 = s2.getNumber();
					if (n1 == n2 ) {
				           dif = Math.abs(primes_1000.get(i) - primes_1000.get(j));
				           k = Math.max(primes_1000.get(i), primes_1000.get(j)) + dif;
						   s3.setDigits(k); s3.go();
						   n3 = s3.getNumber(); 
				           if (CheckIsPrime.go(k) && n1 == n3 && k < 10000) {
//								System.out.println("********* Match *********");
//								System.out.println(primes_1000.get(i));
//								System.out.println(primes_1000.get(j));
//								System.out.println(k); 
				        	    data = primes_1000.get(i) + "" + primes_1000.get(j) + "" + k;
								out.add(primes_1000.get(i)); out.add(primes_1000.get(j)); out.add(k); 
				           }			
					    // return 0;
					}
			//	}

			}

		}
	//	System.out.println(out);
		return data;
	}

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println( "Data:  " + PrimePermutations.find());
	}

}

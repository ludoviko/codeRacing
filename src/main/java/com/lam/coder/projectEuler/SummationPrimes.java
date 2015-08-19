package com.lam.coder.projectEuler;

import com.lam.mathematics.Primes;

public class SummationPrimes {

	/**
* Summation of primes
* Problem 10
* 
* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
* 
* Find the sum of all the primes below two million.	 
* 
* Answer:  142 913 828 922.
* 
*/

	public static long go(int upTo) {
    	Primes calculate = new Primes();
    	calculate.find(upTo);
    	long[] array = calculate.getArray();
    	long sum= 0;
    	for ( long n : array ) {
    		sum += n;    
    	//	System.out.println("Sum: " + sum + ", n = " + n);
    	}

    	return sum;
	}
	
	public static void main(String[] args) {
		long result = SummationPrimes.go(2000000);
		System.out.println(result);
		

	}

}

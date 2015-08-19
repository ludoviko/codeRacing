package com.lam.coder.projectEuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.lam.mathematics.CheckIsPrime;
import com.lam.mathematics.Primes;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 50: Consecutive prime sum
 * 
 *         The prime 41, can be written as the sum of six consecutive primes: 41
 *         = 2 + 3 + 5 + 7 + 11 + 13
 * 
 *         This is the longest sum of consecutive primes that adds to a prime
 *         below one-hundred.
 * 
 *         The longest sum of consecutive primes below one-thousand that adds to
 *         a prime, contains 21 terms, and is equal to 953.
 * 
 *         Which prime, below one-million, can be written as the sum of the most
 *         consecutive primes?
 * 
 *         Answer: 997651.
 */

public class ConsecutivePrimeSum {
	public static BigInteger findBI(int n) {
		BigInteger sum = new BigInteger("0");
		int counter = 0;
		int maxCounter = 0;
		BigInteger max = new BigInteger(0 + "");
		Primes aPrime = new Primes();
		aPrime.find(n);
		long[] primes = aPrime.getArray();
	//	List<BigInteger> primesSum = new ArrayList<BigInteger>();
	//	List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < primes.length; i++) {
		//	System.out.println(i);
exit:			for (int j = i; j < primes.length; j++) {
				sum = sum.add(new BigInteger(primes[j] + ""));
		//		list.add(primes[j]);
				counter++;
				if (CheckIsPrime.go(sum)) {
					if (sum.compareTo(new BigInteger( 1000000 + "")) == 1) {
						break exit;
					}
			//		primesSum.add(sum);
					if (counter >= maxCounter) {
						max = sum;
						maxCounter = counter;
					}
				} else {
				}
			}
			sum = new BigInteger(0 + "");
			counter = 0;
		//	list.clear();
		}

//		Collections.sort(primesSum);
//		System.out.println(primesSum);
//		System.out.println(maxCounter + "/" + max);
		return max;
	}
	
	public static long find(int n) {
		long sum = 0;
		int counter = 0;
		int maxCounter = 0;
		long max = 0;
		Primes aPrime = new Primes();
		aPrime.find(n);
		long[] primes = aPrime.getArray();
		List<Long> primesSum = new ArrayList<Long>();
		List<Long> list = new ArrayList<Long>();

		for (int i = 0; i < primes.length; i++) {
exit:			for (int j = i; j < primes.length; j++) {
				sum += primes[j];
				list.add(primes[j]);
				counter++;
				if (CheckIsPrime.go(sum)) {
					if (sum > 1000000) {
						break exit;
					}
					primesSum.add(sum);
					if (counter >= maxCounter) {
						max = sum;
						maxCounter = counter;
					}
				} else {
				}
			}
			sum = 0;
			counter = 0;
			list.clear();
		}
		Collections.sort(primesSum);
//		System.out.println(primesSum);
//		System.out.println(maxCounter + "/" + max);
		return max;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 4000;
	//	System.out.println("Answer: " + ConsecutivePrimeSum.findBI(n));
		System.out.println("Answer: " + ConsecutivePrimeSum.find(n));
	}
}

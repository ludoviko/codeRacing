package com.lam.coder.projectEuler;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.lam.mathematics.Factorize;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 47: Distinct primes factors 
 * 
 *         The first two consecutive numbers to have two distinct prime factors
 *         are:
 * 
 *         14 = 2 × 7 
 *         15 = 3 × 5
 * 
 *         The first three consecutive numbers to have three distinct prime
 *         factors are:
 * 
 *         644 = 2² × 7 × 23 
 *         645 = 3 × 5 × 43 
 *         646 = 2 × 17 × 19.
 * 
 *         Find the first four consecutive integers to have four distinct prime
 *         factors. What is the first of these numbers?
 * 
 *        Answer: 134043.
 * 
 */

public class DistinctPrimesFactors {
	public static int find() {
		Set<Long> set = new HashSet<Long>();
		int n = 50000;
		List<Long> list;
		boolean former = false;
		int counter = 1;
		int output = 0;
		int REPEAT = 4;

		while (true) {
//			System.out.println(n);
			if (counter == REPEAT && former) {
				output = n - REPEAT;
		//		System.out.println("Break: " + output);
				break;
			}

			list = Factorize.find(n++);
			set.clear();
			set.addAll(list);

			if (set.size() == REPEAT) {
				former = true;
				counter++;
			} else {
				former = false;
				counter = 0;
			}
		}
		return output;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Answer: " + DistinctPrimesFactors.find());
	}
}

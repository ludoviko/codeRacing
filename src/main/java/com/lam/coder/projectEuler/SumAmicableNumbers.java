package com.lam.coder.projectEuler;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.lam.mathematics.AmicableNumber;

/**
 * 
 * Problem 21: Amicable numbers
 * 
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n
 * which divide evenly into n). If d(a) = b and d(b) = a, where a ≠ b, then a
 * and b are an amicable pair and each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44,
 * 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4,
 * 71 and 142; so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 * 
 * Answer: 31626.
 * 
 */

public class SumAmicableNumbers {
	private int upTo;
	private Map<Long, Long> map;

	public SumAmicableNumbers(int upTo) {
		this.upTo = upTo;
		map = new HashMap<Long, Long>();
	}

	public long find() {
		AmicableNumber amicable = new AmicableNumber();
		for (int i = 2; i <= upTo; i++) {
			if (amicable.isAmicable(i)) {
				map.put((long) i, amicable.getAmicable());
			}
		}
		return this.findSum();
	}

	private long findSum() {
		Set<Long> set = map.keySet();
		long sum = 0;
		for (Long number : set) {
			sum += number;
		}
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int upto = 9999;
		SumAmicableNumbers sumAmics = new SumAmicableNumbers(upto);
		long result = sumAmics.find();
		System.out.println(result);
	}
}

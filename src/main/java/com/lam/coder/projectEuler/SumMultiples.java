package com.lam.coder.projectEuler;

/**
 * 
 * @author Usuario
 * 
 *         Problem 1: Multiples of 3 and 5
 * 
 *         If we list all the natural numbers below 10 that are multiples of 3
 *         or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find
 *         the sum of all the multiples of 3 or 5 below 1000.
 * 
 *         Answer: 233168
 */

public class SumMultiples {
	private int upperBound;

	public SumMultiples(int upperBound) {
		this.upperBound = upperBound;
	}

	public int getSum(int n) {
		int i = 1;
		int summa = 0;
		do {
			summa += n * i;
			i++;
		} while (n * i <= this.upperBound);
		return summa;
	}

	public int getSumImproved(int n) {
		int p = this.upperBound / n;

		int summa = n * p * (p + 1) / 2;
		return summa;
	}

	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}

	public static void main(String[] strings) {
		SumMultiples summa = new SumMultiples(999);
		int result = summa.getSum(3);
		int result_2 = summa.getSum(5);
		int result_3 = summa.getSum(15);

		int result_4 = summa.getSumImproved(3);
		int result_5 = summa.getSumImproved(5);
		int result_33 = summa.getSumImproved(15);

		System.out.println(result + result_2 - result_3);
		System.out.println(result_4 + result_5 - result_33);
	}

}

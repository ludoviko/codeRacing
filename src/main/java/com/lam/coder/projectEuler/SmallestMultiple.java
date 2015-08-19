package com.lam.coder.projectEuler;

import java.util.ArrayList;
import java.util.List;

import com.lam.mathematics.Primes;

/**
 *  TODO Add to library. 
 * 
 * @author Ludoviko Azuaje Problem 5: Smallest multiple
 * 
 *         2520 is the smallest number that can be divided by each of the
 *         numbers from 1 to 10 without any remainder.
 * 
 *         What is the smallest positive number that is evenly divisible by all
 *         of the numbers from 1 to 20?
 * 
 *         Answer: 232792560.
 *         
 *         
 * 
 */

public class SmallestMultiple {
	private int number;
	private long answer;

	public SmallestMultiple(int number) {
		this.number = number;
	}

	public SmallestMultiple() {
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		this.answer = 0;
	}

	public long getAnswer() {
		return answer;
	}

	public void start_old() {
		Primes calculate = new Primes();
		calculate.find(this.number);
		long[] array = calculate.getArray();

		List<Long> list = new ArrayList<Long>();

		long factor = 1;
		for (int i = 0; i < array.length; i++) {
			while (factor * array[i] < this.number) {
				factor *= array[i];
			}
			
			list.add(factor);
			factor = 1;
		}

		Object[] arrayFactors = list.toArray();

		long multiple = 1;
		for (Object n : arrayFactors) {
			multiple *= (Long) n;
		}

		this.answer = multiple;
	}

	public void start() {
		Primes calculate = new Primes();
		calculate.find(this.number);

		long[] array = calculate.getArray();

		int i = 0;
		long multiple = 1;

		int power;
		while (i < array.length) {
			power = 1;
			if (array[i] * array[i] <= this.number) {
				power = (int) (Math.log(this.number) / Math.log(array[i]));
			} else {
			}
			multiple *= (Math.pow(array[i], power));
			i++;
		}

		this.answer = multiple;
	}

	public static void main(String[] args) {
		SmallestMultiple multiple = new SmallestMultiple(20);
		multiple.start();
		System.out.println(multiple.getAnswer());
	}

}

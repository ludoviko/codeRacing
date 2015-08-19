package com.lam.coder.projectEuler;

import java.util.List;

import com.lam.mathematics.CheckIsPrime;
import com.lam.mathematics.SpiralDiagonal;

public class SpiralPrimes {
	private SpiralDiagonal spiral;

	public SpiralPrimes(int n) {
		this.spiral = new SpiralDiagonal(n);
	}

	public double getPercentPrimes() {
		List<Integer> diagonal = this.spiral.getDiagonal();
		double count = 0;

		for (int i = 0; i < diagonal.size(); i++) {
			if (CheckIsPrime.go(diagonal.get(i))) {
				count++;
			}
		}

		return count / diagonal.size();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//26591 XXX
		int i = 26507;
		SpiralPrimes spiralPrimes;
		 do  {
			spiralPrimes = new SpiralPrimes( i = i + 2 );
			System.out.println(spiralPrimes.getPercentPrimes() + ", i: " + i);
		} while (( spiralPrimes.getPercentPrimes() > 0.1 ));
		
		System.out.println(spiralPrimes.getPercentPrimes() + ", i: " + i);
	}
}

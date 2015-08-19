package com.lam.coder.topCoder;

import java.util.Arrays;

public class Bonuses {

	public int[] getDivision(int[] points) {

		int summation = 0;
		int sumBonuses = 0;
		int[] bonuses = new int[points.length];
		int[] solution = new int[points.length];
		int[] bonusesSorted = new int[points.length];
		int[] bonusesHistogram;
		
		for (int point : points) {
			summation += point;
		}
		
		for (int i = 0; i < points.length; i++ ) {
			bonuses[i] = points[i] * 100 / summation;
			bonusesSorted[i] = bonuses[i]; 
			sumBonuses += bonuses[i]; 
			
		}
		
		Arrays.sort(bonusesSorted);
		
		bonusesHistogram = findHistogram(points);
		int index = bonusesHistogram.length; 
		int counter = 0;
		int draws = 0; 
		int k;
		int auxDraws;
		
		if ( 100 - sumBonuses != 0 ) {
		 // Count units to share
			while ( counter < 100 - sumBonuses && index > 0) {
				if ( bonusesHistogram[--index] == 0 ) {
				} else {
					counter++;
					draws += bonusesHistogram[index];
				}
			}
			auxDraws = draws;
			if (draws <= 100 - sumBonuses) {
				for (int i = 1; i <= draws; i++) {
					k = findGreatestValueByIndex(bonuses);
					solution[ k ] = bonuses [ k ] + 1;
					auxDraws--;
					bonuses[k] = -1;
				}
				for (int i = 0; i < bonuses.length; i++) {
					if (bonuses [ i ] != -1) {
						solution[ i ] = bonuses [ i ];  
					}
				}
			} else {
				// XXX
				for (int i = 0; i < 100 - sumBonuses ; i++) {
					solution[ i ] = bonuses [ i ] + 1;
					auxDraws--;
				}
				for (int i = 100 - sumBonuses; i < bonuses.length ; i++) {
					solution[ i ] = bonuses [ i ];
				}
			}
		} else {
			
		}
		
		return solution;

		/*
		 * {1,2,3,4,5}
		 * 
		 * Returns: { 6, 13, 20, 27, 34 }
		 * 
		 * The total points in the point pool is 1+2+3+4+5 = 15.
		 * 
		 * Employee 1 gets 1/15 of the total pool, or 6.66667%, Employee 2 gets
		 * 13.33333%, Employee 3 gets 20% (exactly), Employee 4 gets 26.66667%,
		 * and Employee 5 gets 33.33333%. After truncating, the percentages look
		 * like:
		 * 
		 * {6,13,20,26,33}
		 * 
		 * Adding up all the fractional percentages, we see there is 2% in extra
		 * bonuses, which go to the top two scorers. These are the employees who
		 * received 4 and 5 points.
		 */
	}
	
	public static int findGreatestValueByIndex(int[] array) {
		int max = Integer.MIN_VALUE;
		int index = -1;

		for (int i = 0; i < array.length; i++) {
			if ( array[i] >= max) {
				max = Math.abs(array[i]);
				index = i;
			}
		}
		return index;
	}

	
	public static int[] findHistogram(int[] array) {

		int size = findRightSize(array);

		int[] data = new int[size];

		for (int i = 0; i < array.length; i++) {
			data[array[i]] += 1;
		}
		return data;
	}

	private static int findRightSize(int... array) {
		int greatest = findGreatest(array) + 1;
		int size = array.length + 1;

		size = size > greatest ? size : greatest;
		return size;
	}

	public static int findGreatest(int... array) {
		int max = Integer.MIN_VALUE;

		// checkArrayLength(array.length);

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max) {
				max = array[i];
			}
		}
		return max;
	}

}

package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement A 100 meter long pipe must be cut in two places. It
 *         can only be cut at certain places, where it was originally welded
 *         from smaller pipes. If the two cut locations are chosen at random
 *         (each potential location has equal probability of being chosen), find
 *         the probability of a resulting pipe being longer than L meters.
 * 
 * 
 *         Create a method named probability that accepts a int[] weldLocations
 *         and int L as parameters. It should calculate the probability of one
 *         or more resulting pipes being strictly longer than L if the two cut
 *         locations are chosen at random from weldLocations. Each element in
 *         weldLocations represents the number of meters from the left end of
 *         the pipe.
 * 
 *         Definition
 * 
 *         Class: PipeCuts Method: probability Parameters: int[], int Returns:
 *         double Method signature: double probability(int[] weldLocations, int
 *         L) (be sure your method is public)
 * 
 * 
 *         Notes - Your return value must have a relative or absolute error less
 *         than 1e-9.
 * 
 *         Constraints - weldLocations will have between 2 and 50 elements,
 *         inclusive. - Each element in weldLocations will be between 1 and 99,
 *         inclusive. - weldLocations will not contain duplicate elements. - L
 *         will be between 1 and 100, inclusive.
 * 
 *         Examples 0)
 * 
 * 
 *         {25, 50, 75}
 * 
 *         25
 * 
 *         Returns: 1.0
 * 
 *         Any random set of cuts results in a pipe being longer than 25 meters.
 *         1)
 * 
 * 
 *         {25, 50, 75}
 * 
 *         50
 * 
 *         Returns: 0.0
 * 
 *         This time, it is impossible to cut the pipe such that some resulting
 *         pipe is longer than 50 meters. 2)
 * 
 * 
 *         {25, 50, 75}
 * 
 *         24
 * 
 *         Returns: 1.0
 * 
 *         3)
 * 
 * 
 *         {99, 88, 77, 66, 55, 44, 33, 22, 11}
 * 
 *         50
 * 
 *         Returns: 0.7222222222222222
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for: Single Round Match 233 Round 1 - Division
 *         I, Level One Single Round Match 233 Round 1 - Division II, Level Two
 */

public class PipeCuts {

	public static final int TOTAL_LENGTH = 100;

	public double probability(int[] locations, int target) {

		int[] weldLocations = new int[locations.length];
		List<Integer> list = new ArrayList<Integer>();

		for (int n : locations) {
			list.add(n);
		}

		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			weldLocations[i] = list.get(i);
		}

		// Permutaciones de dos en dos sin repetiones
		double sum = factorial(weldLocations.length)
				/ (factorial(weldLocations.length - 2) * 2);

		int matches = 0;

		for (int i = 0; i < weldLocations.length - 1; i++) {
			for (int j = i + 1; j < weldLocations.length; j++) {
				if (weldLocations[i] > target
						|| (weldLocations[j] - weldLocations[i]) > target
						|| TOTAL_LENGTH - weldLocations[j] > target) {
					matches++;
				}
			}

		}
		return matches / sum;
	}

	public static long factorial(long n) {
		long factorial = 1;
		if (n == 0 || n == 1) {
			return 1;
		}
		for (int i = 2; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
}

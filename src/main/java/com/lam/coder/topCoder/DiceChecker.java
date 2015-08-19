package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         PROBLEM STATEMENT
 * 
 *         The results of rolling a die a number of times is given. If one
 *         particular value comes up more than 1/4 of the time, or comes up less
 *         than 1/10 of the time, the die is considered to be loaded (Loaded
 *         means weighted in such a way as to make the die show a particular
 *         number more or less often than is statistically acceptable).
 * 
 *         Given a sample of die rolls, decide whether or not the die is loaded,
 *         and if so, return the numbers that came up too many or too few times.
 * 
 *         DEFINITION
 * 
 *         Class Name: DiceChecker Method Name: badValues Parameters: int[]
 *         Returns: int[]
 * 
 *         Method signature: int[] badValues(int[] values) Be sure your method
 *         is public.
 * 
 *         TopCoder will ensure the validity of the inputs. Inputs are valid if
 *         all of the following criteria are met: values has between 1 and 50
 *         elements, inclusive. each element of values is between 1 and 6,
 *         inclusive.
 * 
 *         Return an int[] that contains the numbers between 1 and 6 (inclusive)
 *         that were in the int[] too few or too many times.
 * 
 *         NOTES - If the die is not loaded, return an empty int[]. - Sort the
 *         output ascending ( { 1, 2 }, not { 2, 1 } ).
 * 
 *         Examples:
 * 
 *         values: { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4 } 1 comes up 1/5 of the time.
 *         2 comes up 1/5 of the time. 3 comes up 1/5 of the time. 4 comes up
 *         1/5 of the time. 5 comes up 1/10 of the time. 6 comes up 1/10 of the
 *         time. No value comes up more than 1/4 of the time or less than 1/10
 *         of the time. The die is not loaded so return {} (empty int[]).
 * 
 *         values: { 3, 1, 5 } 1 comes up 1/3 of the time. 2 does not comes up.
 *         3 comes up 1/3 of the time. 4 does not comes up. 5 comes up 1/3 of
 *         the time. 6 does not comes up. 2, 4, and 6 come up less than 1/10 of
 *         the time, and 1, 2, and 3 come up more than 1/4 of the time so return
 *         { 1, 2, 3, 4, 5, 6 }.
 * 
 *         values : { 1, 1, 1, 1, 1, 1, 1, 2, 2, 2 } 1 comes up 7/10 of the
 *         time. 2 comes up 3/10 of the time. 3 does not comes up. 4 does not
 *         comes up. 5 does not comes up. 6 does not comes up. All values are
 *         out of the range specified for an unloaded die (> 1/4 or < 1/10).
 *         return { 1, 2, 3, 4, 5, 6 }.
 * 
 *         values : { 1, 1, 3, 3, 4, 4, 2, 2, 5, 5, 6, 6 } 1 comes up 1/6 of the
 *         time. 2 comes up 1/6 of the time. 3 comes up 1/6 of the time. 4 comes
 *         up 1/6 of the time. 5 comes up 1/6 of the time. 6 comes up 1/6 of the
 *         time.
 * 
 *         All values are in the range specified for an unloaded die (> 1/4 or <
 *         1/10) return {}.
 * 
 * 
 *         Definition
 * 
 *         Class: DiceChecker Method: badValues Parameters: int[] Returns: int[]
 *         Method signature: int[] badValues(int[] param0) (be sure your method
 *         is public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for: Sun Microsystems / TopCoder Collegiate
 *         Challenge Regional Semifinal - Division I, Level One
 * 
 * 
 */

public class DiceChecker {

	double LOW_THRESHOLD = 0.1;
	double UPPER_THRESHOLD = 0.25;

	public int[] badValues(int[] values) {
		int[] histogram = new int[7];
		boolean[] deviations = new boolean[7];

		for (int i = 0; i < values.length; i++) {
			histogram[values[i]]++;
		}

		for (int i = 1; i < histogram.length; i++) {
			if (1.0 * histogram[i] / (values.length) > UPPER_THRESHOLD
					|| 1.0 * histogram[i] / (values.length) < LOW_THRESHOLD) {
				deviations[i] = true;
			}
		}

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < deviations.length; i++) {
			if (deviations[i]) {
				list.add(i);
			}
		}

		int[] loadings = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			loadings[i] = list.get(i);
		}

		return loadings;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

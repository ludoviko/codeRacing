package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         You have acquired a list of the math and verbal test scores from all
 *         the children in the county. Write a class Average that contains a
 *         method belowAvg that takes two int[], math and verbal, representing
 *         the math and verbal scores of all of the children in the county, and
 *         returns the number of children who have a composite score which is
 *         below average in the county.
 * 
 *         The composite score is defined to be the sum of a child's math and
 *         verbal scores.
 * 
 *         Definition
 * 
 *         Class: Average Method: belowAvg Parameters: int[], int[] Returns: int
 *         Method signature: int belowAvg(int[] math, int[] verbal) (be sure
 *         your method is public)
 * 
 * 
 *         Notes - each element of math corresponds to the element with the same
 *         index in verbal. - the number of children is the length of math and
 *         verbal.
 * 
 *         Constraints - math and verbal will contain the same number of
 *         elements. - math will contain between 1 and 50 elements, inclusive. -
 *         each value in math and in verbal is between 200 and 800, inclusive.
 * 
 *         Examples 
 *         
 *         0)
 *         {200,250,700,700}
 * 
 *         {400,400,400,400}
 * 
 *         Returns: 2
 * 
 *         The composite scores of the 4 children are 600, 650, 1100, and 1100
 *         and the average composite score is 862.5, so 2 of the children are
 *         below average. 
 *         
 *         1)
 *         {500,400}
 * 
 *         {300,400}
 * 
 *         Returns: 0
 * 
 *         Both children have the same composite score 800 which is also the
 *         average. Neither are below average 
 *         
 *         2)
 *         {293}
 * 
 *         {799}
 * 
 *         Returns: 0
 * 
 *         3)
 *         {400,400,400,400,400,400,401}
 * 
 *         {400,400,400,400,400,400,400}
 * 
 *         Returns: 6
 * 
 *         The average composite score is just above 800, so 6 of the 7 children
 *         are below average.
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 89 Round 1 - Division
 *         II, Level One Single Round Match 205 Round 1 - Division II, Level One
 */

public class Average {
	public int belowAvg(int[] math, int[] verbal) {
		int count = 0;
		int summa = 0;

		for (int i = 0; i < math.length; i++) {
			summa += math[i] + verbal[i];
		}

		double average = (double) summa / math.length;

		for (int i = 0; i < math.length; i++) {
			if (math[i] + verbal[i] < average) {
				count++;
			}
		}

		return count;
	}
}

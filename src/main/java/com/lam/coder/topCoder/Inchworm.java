package com.lam.coder.topCoder;


/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         The inchworm is a creature of regular habits. She inches forward some
 *         distance along the branch of a tree, then stops to rest. If she has
 *         stopped at a leaf, she makes a meal of it. Then she inches forward
 *         the same distance as before, and repeats this routine until she has
 *         reached or passed the end of the branch.
 * 
 *         Consider an inchworm traveling the length of a branch whose leaves
 *         are spaced at uniform intervals. Depending on the distance between
 *         her resting points, the inchworm may or may not be able to eat all of
 *         the leaves. There is always a leaf at the beginning of the branch,
 *         which is where the inchworm rests before setting out on her journey.
 * 
 *         You are given three int values that specify, in inches: the length of
 *         the branch; the distance traveled by the inchworm between rests; and
 *         the distance between each consecutive pair of leaves. Given that the
 *         inchworm only eats at rest, calculate the number of leaves she will
 *         consume.
 * 
 *         Definition
 * 
 *         Class: Inchworm Method: lunchtime Parameters: int, int, int Returns:
 *         int Method signature: int lunchtime(int branch, int rest, int leaf)
 *         (be sure your method is public)
 * 
 *         Notes - The inchworm starts by gobbling up the leaf at the beginning
 *         of the branch. - If there is a leaf at the end of the branch, the
 *         inchworm eats it only if it falls at a resting point.
 * 
 *         Constraints - branch is between 1 and 1000000 (one million),
 *         inclusive - rest is between 1 and 1000, inclusive - leaf is between 1
 *         and 1000, inclusive
 * 
 *         Examples 0)
 *         11
 * 
 *         2
 * 
 *         4
 * 
 *         Returns: 3
 * 
 *         Leaves grow 0, 4, and 8 inches from the beginning of the branch. The
 *         inchworm eats them all. 1)
 * 
 * 
 *         12
 * 
 *         6
 * 
 *         4
 * 
 *         Returns: 2
 * 
 *         The inchworm misses the leaves growing at distances 4 and 8, but eats
 *         those at 0 and 12. 2)
 * 
 * 
 *         20
 * 
 *         3
 * 
 *         7
 * 
 *         Returns: 1
 * 
 *         The inchworm eats only the leaf at the outset. 3)
 * 
 * 
 *         21
 * 
 *         7
 * 
 *         3
 * 
 *         Returns: 2
 * 
 *         The inchworm eats the leaves at the beginning and end of the branch.
 *         4)
 * 
 * 
 *         15
 * 
 *         16
 * 
 *         5
 * 
 *         Returns: 1
 * 
 *         The inchworm eats only the leaf at the outset. 5)
 * 
 * 
 *         1000
 * 
 *         3
 * 
 *         7
 * 
 *         Returns: 48
 * 
 *         6)
 * 
 * 
 *         1000
 * 
 *         7
 * 
 *         3
 * 
 *         Returns: 48
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 163 Round 1 - Division
 *         II, Level One
 * 
 */

public class Inchworm {
	// Optimal approach
	public int lunchtimeOptimal(int branch, int rest, int leaf) {
		return branch / LCM(rest, leaf) + 1;
	}

	// Brute force approach
	public int lunchtime(int branch, int rest, int leaf) {
		int count = 0;

		for (int i = 0; i <= branch; i += rest) {
			if (i % leaf == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static int GCD(int a, int b) {
		int x;
		
		while ( b != 0) {
                x = a % b;
                a = b;
                b = x;
		}
		return (a);
	}

	public static int LCM(int m, int n) {
		return m * n / Inchworm.GCD(m, n);
	}
}

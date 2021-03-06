package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement for ManySquares
 * 
 *         You found a box from an old game. The box contains
 *         a lot of sticks and a manual. Frustrated by the fact the manual was
 *         unreadable, you decided to invent your own game with the sticks. In
 *         your game, the goal is to use the sticks to build as many squares as
 *         possible. There are only two rules: Each stick can only be used in
 *         one square. Each square must consist of exactly 4 sticks. That is,
 *         you cannot combine two or more sticks to create one side of the
 *         square. You are given a int[] sticks. The elements of sticks are the
 *         lengths of the sticks you have. Return the maximum number of squares
 *         you can make.
 * 
 *         Definition
 * 
 *         Class: ManySquares Method: howManySquares Parameters: int[] Returns:
 *         int Method signature: int howManySquares(int[] sticks) (be sure your
 *         method is public)
 * 
 * 
 *         Notes - If you can't make any square, return 0.
 * 
 *         Constraints - sticks will contain between 1 and 50 elements. - Each
 *         element of sticks will be between 1 and 1000, inclusive.
 * 
 *         Examples 0)
 * 
 *         {1,1,2,2,1,1,2} Returns: 1 You can build a square with side 1. 1)
 * 
 *         {3, 1, 4, 4, 4, 10, 10, 10, 10} Returns: 1 You can build a square
 *         with side 10. You cannot build a square with side 4. (Note that you
 *         are not allowed to use 3+1 instead of a 4.) 2)
 * 
 *         {1,2,3,4,1,2,3,4,1,2,3,1,2,3,4,1,2,3,3,3} Returns: 3 3)
 * 
 *         {1,1,1,2,2,2,3,3,3,4,4,4} Returns: 0 Sometimes you can't make any
 *         square. 4)
 * 
 *         {1,1,1,2,1,1,1,3,1,1,1} Returns: 2 5)
 * 
 *         {2,2,4,4,8,8} Returns: 0 You are also not allowed to break the
 *         sticks. This problem statement is the exclusive and proprietary
 *         property of TopCoder, Inc. Any unauthorized use or reproduction of
 *         this information without the prior written consent of TopCoder, Inc.
 *         is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 627 Round 1 - Division
 *         II, Level One
 */

public class ManySquares {
	public int howManySquares(int[] sticks) {
		int sum = 0;

		// Each element of sticks will be between 1 and 1000, inclusive.
		int[] count = new int[1000 + 1];

		for (int i : sticks) {
			count[i]++;
		}

		for (int i : count) {
			sum += i / 4;
		}

		return sum;
	}
}

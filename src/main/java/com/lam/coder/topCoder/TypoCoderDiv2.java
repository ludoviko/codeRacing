package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement TypoCoder is a programming contest like TopCoder.
 *         TypoCoder also has a rating system. There are two types of coders in
 *         TypoCoder: brown coders and ciel coders. A brown coder is a coder
 *         whose rating is greater than or equal to 1200. A ciel coder is a
 *         coder whose rating is less than 1200.
 * 
 * 
 * 
 *         Whenever a new contestant joins TypoCoder, their rating is 500. Cat
 *         Lower joined TypoCoder and then competed in some contests. You are
 *         given a int[] rating. For each i (0-based index), rating[i] is Cat
 *         Lower's rating after he competed in (i+1) contests.
 * 
 * 
 * 
 *         Return the number of times Cat Lower changed his color (i.e., changed
 *         from being a ciel coder to being a brown coder or back).
 * 
 *         Definition
 * 
 *         Class: TypoCoderDiv2 Method: count Parameters: int[] Returns: int
 *         Method signature: int count(int[] rating) (be sure your method is
 *         public)
 * 
 * 
 *         Constraints - rating will contain between 1 and 50 elements,
 *         inclusive. - Each element of rating will be between 0 and 4000,
 *         inclusive.
 * 
 *         Examples 0)
 * 
 * 
 *         {1000,1200,1199}
 * 
 *         Returns: 2
 * 
 *         After the first contest Cat Lower was still a ciel coder. After the
 *         second contest his new rating was 1200 which made him a brown coder.
 *         (This was the first color change.) After the third contest his new
 *         rating was 1199 which made him a ciel coder again. (This was the
 *         second color change.) 1)
 * 
 * 
 *         {1500,2200,900,3000}
 * 
 *         Returns: 3
 * 
 *         The color changed after the first, the third and the fourth
 *         competition. 2)
 * 
 * 
 *         {600,700,800,900,1000,1100,1199}
 * 
 *         Returns: 0
 * 
 *         Cat Lower wasn't a brown coder at any time in this case. 3)
 * 
 * 
 *         {0,4000,0,4000,4000,0,0}
 * 
 *         Returns: 4
 * 
 *         4)
 * 
 * 
 *         {575,1090,3271,2496,859,2708,3774,2796,1616,2552,3783,2435,1111,526,
 *         562}
 * 
 *         Returns: 4
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 602 Round 1 - Division
 *         II, Level One
 */

public class TypoCoderDiv2 {
	public static int TOP = 1200;

	public int count(int[] rating) {
		boolean isLow = true;
		boolean isTop = false;
		boolean formerLow = true;
		int count = 0;

		for (int i = 0; i < rating.length; i++) {
			if (rating[i] >= TOP) {
				isTop = true;
				isLow = false;
			} else {
				isTop = false;
				isLow = true;
			}
			if (isLow ^ formerLow) {
				count++;
			}
			formerLow = isLow;
		}
		return count;
	}
}

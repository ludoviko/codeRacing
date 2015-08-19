package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Little Gretchen is making tin soldiers stand at attention in a single
 *         line. She is an egalitarian general, freely mixing soldiers of
 *         different ranks. For example, if she had two lieutenants, two
 *         sergeants, and one private, she could line them up in the following
 *         16 ways.
 * 
 *         llpss llsps llssp lplss lpsls lslps lslsp lspls lspsl lsslp lsspl
 *         pllss sllps sllsp slpls slslp
 * 
 *         Before you object that the list is incomplete, you should know that
 *         Gretchen considers mirror images to be equivalent. For example, since
 *         "sspll" is the same as "llpss" from back to front, she counts them as
 *         one.
 * 
 *         You are given a int[] containing the number of soldiers of each rank.
 *         Return an int stating the number of ways they can be lined up,
 *         ignoring reflections.
 * 
 *         Definition
 * 
 *         Class: TinSoldiers 
 *         Method: lineUps 
 *         Parameters: int[] 
 *         Returns: int
 *         
 *         Method signature: 
 *         public int lineUps(int[] rankCounts)
 * 
 *         Constraints - rankCounts contains between 1 and 5 elements, inclusive
 *         - each element of rankCounts is between 1 and 5, inclusive - there
 *         are fewer than 2^31 ways for Gretchen to line up the soldiers
 * 
 *         Examples 
 *         0)
 *         {2, 2, 1}
 * 
 *         Returns: 16
 * 
 *         This case is illustrated above. 
 *         
 *         1)
 *         {2, 2, 2}
 * 
 *         Returns: 48
 * 
 *         One more private makes for many more line-ups. 
 *         
 *         2)
 *         {5}
 * 
 *         Returns: 1
 * 
 *         There is only one way to line up five soldiers of the same rank. 
 *         
 *         3)
 *         {5, 1}
 * 
 *         Returns: 3
 * 
 *         Look out for reflections! 
 *         
 *         4)
 *         {4, 5}
 * 
 *         Returns: 66
 * 
 *         Here we have four soldiers of one rank, and five soldiers of another.

 *         5)
 *         {4, 2, 2, 5, 4}
 * 
 *         Returns: 643245120
 * 
 *         In this case, Gretchen can spend months and years lining up her
 *         soldiers.
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: 
 *         Single Round Match 203 Round 1 - Division I, Level Two
 *         
 */

public class TinSoldiers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

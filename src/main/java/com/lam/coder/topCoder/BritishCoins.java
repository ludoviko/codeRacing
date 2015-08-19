package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Prior to 1971, Britain used a system of coins that can be traced back
 *         to the time of Charlemagne. The three main units of coinage were the
 *         penny, the shilling, and the pound. There were 12 pennies in a
 *         shilling and 20 shillings in a pound. Given a number pence of
 *         pennies, convert this amount into pounds, shillings, and pennies by
 *         first converting as many pennies as possible into pounds, and then
 *         converting as many of the remaining pennies as possible into
 *         shillings. Return a int[] of size three containing the number of
 *         pounds, the number of shillings, and the number of pennies, in that
 *         order.
 * 
 *         Definition
 * 
 *         Class: BritishCoins Method: coins Parameters: int Returns: int[]
 *         Method signature: int[] coins(int pence) (be sure your method is
 *         public)
 * 
 * 
 *         Constraints - pence is between 0 and 10000, inclusive.
 * 
 *         Examples 0)
 * 
 * 
 *         533
 * 
 *         Returns: { 2, 4, 5 }
 * 
 *         First, we make 2 pounds, leaving 53 pence. Then, we make 4 shillings,
 *         leaving 5 pence. 1)
 * 
 * 
 *         0
 * 
 *         Returns: { 0, 0, 0 }
 * 
 *         2)
 * 
 * 
 *         6
 * 
 *         Returns: { 0, 0, 6 }
 * 
 *         3)
 * 
 * 
 *         4091
 * 
 *         Returns: { 17, 0, 11 }
 * 
 *         4)
 * 
 * 
 *         10000
 * 
 *         Returns: { 41, 13, 4 }
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 165 Round 1 - Division
 *         II, Level One Single Round Match 232 Round 1 - Division II, Level One
 */

public class BritishCoins {
	public int[] coins(int pence) {
		int pounds = pence / 240;
		int shellings = (pence % 240) / 12;
		int pennies = (pence % 240) % 12;

		return new int[] { pounds, shellings, pennies };
	}
}

package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement Nick likes to play the lottery. The cost of a
 *         single lottery ticket is price. Nick has exactly four banknotes with
 *         values b1, b2, b3 and b4 (some of the values may be equal). He wants
 *         to know if it's possible to buy a single lottery ticket without
 *         getting any change back. In other words, he wants to pay the exact
 *         price of a ticket using any subset of his banknotes. Return
 *         "POSSIBLE" if it is possible or "IMPOSSIBLE" if it is not (all quotes
 *         for clarity). Definition Class: LotteryTicket Method: buy Parameters:
 *         int, int, int, int, int Returns: String Method signature: String
 *         buy(int price, int b1, int b2, int b3, int b4) (be sure your method
 *         is public)
 * 
 *         Limits Time limit (s): 2.000 Memory limit (MB): 64
 * 
 *         Constraints - price will be between 1 and 4000, inclusive. - b1, b2,
 *         b3 and b4 will each be between 1 and 1000, inclusive. Examples 0) 10
 * 
 *         1
 * 
 *         5
 * 
 *         10
 * 
 *         50
 * 
 * 
 *         Returns: "POSSIBLE"
 * 
 *         Nick can use the banknote with value b3.
 * 
 * 
 *         1) 15
 * 
 *         1
 * 
 *         5
 * 
 *         10
 * 
 *         50
 * 
 * 
 *         Returns: "POSSIBLE"
 * 
 *         Here he can use the banknotes with values b2 and b3.
 * 
 * 
 *         2) 65
 * 
 *         1
 * 
 *         5
 * 
 *         10
 * 
 *         50
 * 
 * 
 *         Returns: "POSSIBLE"
 * 
 *         b2 + b3 + b4 is 65.
 * 
 * 
 *         3) 66
 * 
 *         1
 * 
 *         5
 * 
 *         10
 * 
 *         50
 * 
 * 
 *         Returns: "POSSIBLE"
 * 
 *         All four banknotes must be used.
 * 
 * 
 *         4) 1000
 * 
 *         999
 * 
 *         998
 * 
 *         997
 * 
 *         996
 * 
 * 
 *         Returns: "IMPOSSIBLE"
 * 
 * 
 * 
 *         5) 20
 * 
 *         5
 * 
 *         5
 * 
 *         5
 * 
 *         5
 * 
 * 
 *         Returns: "POSSIBLE"
 * 
 *         Some of the banknote values may be equal.
 * 
 * 
 *         6) 2
 * 
 *         1
 * 
 *         5
 * 
 *         10
 * 
 *         50
 * 
 * 
 *         Returns: "IMPOSSIBLE"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
 *
 */

public class LotteryTicket {
	public String buy(int price, int b1, int b2, int b3, int b4) {

		int[] b = { b1, b2, b3, b4 };
		int k;
		int s = 0;

		for (int i = 1; i < 16; i++) {
			for (int j = 0; j < 4; j++) {
				k = i & (1 << j);
				if (k > 0) {
					s += b[j];
				}
			}
			if (s == price) {
				return "POSSIBLE";
			}
			s = 0;
		}

		return "IMPOSSIBLE";
	}

}

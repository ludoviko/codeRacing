package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 *
 *         Problem Statement for FixedDiceGameDiv2
 * 
 *         Alice and Bob are playing a game. Alice has an a-sided die. Bob has a
 *         b-sided die. (The faces of an n-sided die have numbers 1 through n
 *         written on them.)
 * 
 *         The game is simple: Each player rolls their die, and the player who
 *         rolls a strictly larger number wins. (It is possible that neither
 *         player wins.)
 * 
 *         You are given the ints a and b. The players already rolled their
 *         dice. You do not know what numbers they rolled, but you know that
 *         Alice won the game. Compute and return the expected value of the
 *         number Alice rolled.
 * 
 * 
 *         Definition
 * 
 *         Class: FixedDiceGameDiv2 Method: getExpectation Parameters: int, int
 *         Returns: double Method signature: double getExpectation(int a, int b)
 *         (be sure your method is public)
 * 
 * 
 *         Notes - Your return value must have absolute or relative error
 *         smaller than 1e-9. - The expected value can be seen as the average of
 *         many experiments. In our case, suppose that you folow a lot of games,
 *         and each time Alice wins, you write down her score. As you watch more
 *         and more games, the average of all numbers you have written down will
 *         converge to the expected value you should return.
 * 
 *         Constraints - a and b will each be between 2 and 1000, inclusive.
 * 
 *         Examples 0)
 * 
 *         2 2 Returns: 2.0 Alice can only win if she rolls a 2 and Bob rolls a
 *         1. Thus, if we know Alice wins, we know she rolled a 2. 1)
 * 
 *         4 2 Returns: 3.2 2)
 * 
 *         3 3 Returns: 2.6666666666666665 3)
 * 
 *         11 13 Returns: 7.999999999999999 This problem statement is the
 *         exclusive and proprietary property of TopCoder, Inc. Any unauthorized
 *         use or reproduction of this information without the prior written
 *         consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder,
 *         Inc. All rights reserved.
 * 
 * 
 * 
 * 
 *         This problem was used for: Single Round Match 626 Round 1 - Division
 *         II, Level Two
 */

public class FixedDiceGameDiv2 {
	public double getExpectation(int a, int b) {
		int sum = 0;
		double n = 0;

		for (int i = 2; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (i > j) {
					sum += i;
					n++;
				}

			}
		}
		return sum / n;
	}
}

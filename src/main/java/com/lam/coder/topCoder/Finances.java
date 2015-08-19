package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Implement a class Finances, which contains a function timeLeft.
 *         timeLeft is passed three int values. The initial value of the bank
 *         account is initialValue. Interest is compounded monthly at a rate of
 *         interest percent. Every month monthly dollars is taken out from the
 *         account (immediately after the Interest has been added). timeLeft
 *         must return an int that is the number of months the account can
 *         support the full monthly withdrawal. If the account will last longer
 *         than 1200 months, the function should return 1200.
 * 
 *         The method signature is: int timeLeft(int initialValue, int interest,
 *         int monthly).
 * 
 *         NOTE: initialValue and monthly are greater than or equal to 0 and
 *         less than or equal to 100,000. interest is greater than or equal to 0
 *         and less than or equal to 1000.
 * 
 *         Examples: (100, 0, 100) -> 1 (200, 1, 300) -> 0 (3453, 8, 200) ->
 *         1200
 * 
 *         Definition
 * 
 *         Class: Finances Method: timeLeft Parameters: int, int, int Returns:
 *         int Method signature: int timeLeft(int param0, int param1, int
 *         param2) (be sure your method is public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 1 Round 1 - Division I,
 *         Level One Single Round Match 1 Round 1 - Division II, Level One
 * 
 */

public class Finances {
	public static final int MAX = 1200;
	
	public int timeLeft(int initialValue, int interest, int monthly) {
		int timeLeft = 0;
		double total = initialValue;
		
		while ( total >= monthly ) {
			total += total * interest / 100; 
			total -= monthly;
			timeLeft++;
			if ( timeLeft > MAX ) {
				return MAX;
			}
		}
		
		return timeLeft;
	}
}

package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 * 
 *         Class Name: Profit Method Name: maxProfit Parameters: int,int[]
 *         Returns: int
 * 
 *         George owns a circus and brings his circus from town to town. He
 *         knows how much revenue he can take in on any day in a series of days
 *         in a town. He also knows the constant daily cost to run his circus.
 *         George wants to bring his circus to town for the series of days that
 *         results in the highest profit.
 * 
 *         Implement a class Profit which contains a method maxProfit. The
 *         method takes an int and an int[] as parameters. The int is the
 *         constant daily cost of operating the circus. The int[] contains
 *         elements representing the revenue the circus will earn on given days.
 *         The 0th element of the int[] is "Day 1". Index 1 is "Day 2", etc...
 *         The method returns an int that is the maximum profit George's circus
 *         can make by bringing the circus to town for a series of sequential
 *         days that is a subset of the days in the int[].
 * 
 *         For example, if the circus costs $20 a day to run, and the revenue
 *         per day is {$18,$35,$6,$80,$15,$21}, George can make the most money
 *         by bringing his circus to town from Day 2 to Day 4. He will make
 *         (35+6+80)-(3*20) = $61.
 * 
 *         Note: -The series of days George brings his circus to town can be
 *         between 0 days and the int[] size days, inclusive. -If George brings
 *         his circus to town for 0 days, he makes 0 profit.
 * 
 *         Here is the method signature: int maxProfit(int perDayCost, int[]
 *         revenues); Be sure your method is public.
 * 
 *         perDayCost is a postive integer less than 1000. revenues is a int[]
 *         of between 1 and 50 elements, inclusive. Each element is a positive
 *         integer less than 1000.
 * 
 *         Examples: If perDayCost=20 and revenues={18,35,6,80,15,21}, the most
 *         money can be made by bringing the circus to town from Day 2 to Day 4.
 *         The method returns the maximum profit, 61. If perDayCost=40 and
 *         revenues={30,20,10,38}, George will make no money by bringing his
 *         circus to the town, so George will bring his circus to town for 0
 *         days and make 0 profit. The method returns 0. If perDayCost=10 and
 *         revenues={30,20,10,38}, George will make the most money by bringing
 *         his circus to town for all four days. The method returns the profit,
 *         58.
 * 
 * 
 *         Definition
 * 
 *         Class: Profit Method: maxProfit Parameters: int, int[] Returns: int
 *         Method signature: int maxProfit(int param0, int[] param1) (be sure
 *         your method is public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for: Single Round Match 9 Round 1 - Division I,
 *         Level One Single Round Match 9 Round 1 - Division II, Level One
 */


// Maximum slice problem
public class Profit {

	public int maxProfit(int dailyCost, int[] revenueOnDays) {
		return goldenMaxSlice(Profit.reduce(dailyCost, revenueOnDays));
	}
	
	private static int goldenMaxSlice(int[] array) { 
        int maxEnding = 0;
        int maxSlice = 0;
        for (int a : array) {
        	maxEnding = Math.max(0, maxEnding + a);
        	maxSlice = Math.max(maxSlice, maxEnding);
        }
        
        return  maxSlice;
   }

    private static int[] reduce(int min, int[] array) {
        for (int i = 0; i < array.length  ; i++) {
        	array[i] = array[i] - min; 
        }
        return array;
    }
}

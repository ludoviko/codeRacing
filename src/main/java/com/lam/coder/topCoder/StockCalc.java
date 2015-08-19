package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Implement a class StockCalc, which contains a method getProfit. This
 *         method takes an int[] representing the stock price for a given stock
 *         on a sequence of days, and returns, as an int, the maximum profit
 *         that can be reaped by buying on one of those days and selling on a
 *         later day.
 * 
 *         Here is the method signature: public int getProfit(int[] prices);
 * 
 *         prices is an int[]. Each Integer must be greater than 0 and less than
 *         1000. There must be at least 1 element in the int[] and at most 100
 *         elements.
 * 
 *         Note: -If no profit can be made, return 0.
 * 
 *         Examples: -prices={3,5,10,20,80,70,40,1}, returns 77
 *         -prices={80,70,40,3,2,1}, returns 0
 * 
 *         Definition
 * 
 *         Class: StockCalc Method: getProfit Parameters: int[] Returns: int
 *         Method signature: int getProfit(int[] param0) (be sure your method is
 *         public)
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 2 Round 1 - Division I,
 *         Level One Single Round Match 2 Round 1 - Division II, Level One *
 * 
 */

//Maximum slice problem
public class StockCalc {
	public int getProfit(int... array) {
		if (array.length == 0 || array.length == 1) {
			return 0;
		}
		
		int r = goldenMaxSlice(this.reduce(array));

		if ( r < 0 ) {
			r = 0;
		}
		
		return r;
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

	/**
	 * @param array
	 * @return array of increments
	 */
    private int[] reduce(int... array) {
        for (int i = array.length - 1; i >= 1  ; i--) {
        	array[i] = array[i] - array[i-1]; 
        }
        
        array[0] = 0;
    	return array;
    }
}


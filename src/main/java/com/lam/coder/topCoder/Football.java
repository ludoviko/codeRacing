package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 * 
 *         Create a class called Football. In football, scores are incremented
 *         by either 2, 3, or 7 points. Given a numerical input (integer between
 *         1 and 75) representing a final score, calculate the number of all
 *         possible combinations of (2, 3, 7) which add up to that score. The
 *         output should be the number of combinations found. Here are a couple
 *         of examples:
 * 
 *         input | output | combinations 
 *         1       0                
 *         4       1          (2, 2) 
 *         9       3          (2, 7), (2, 2, 2,3)  (3, 3, 3) 
 *         11      3          (2, 2, 7), (2, 2, 2, 2, 3), (2, 3, 3, 3)
 * 
 *         Here is the method signature (be sure your method is public: int
 *         fetchCombinations(int input)
 * 
 *         We will check to make sure the input to this problem is valid.
 * 
 * 
 *         Definition
 * 
 *         Class: Football 
 *         Method: fetchCombinations Parameters: int Returns: int
 *         
 *         Method signature: int fetchCombinations(int param0) (be sure your
 *         method is public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Collegiate Challenge Round 2 - Division I,
 *         Level Three
 * 
 * 
 */

public class Football {
		public static int ONE = 1;
		public static int TWO = 2;
		public static int THREE = 3;
		public static int SEVEN = 7;

		private int[] data;
		private int sum;
		private List<Integer> summands;

		public Football(int sum, List<Integer> summands) {
			this.sum= sum; 
			this.summands = summands;
			this.data = new int[sum + 1];
			
			for (int i = 1; i < this.data.length; i++) {
			  this.data[i] = Integer.MAX_VALUE;	
			}
			
		}
		
		public void find() {
			for (int i = 1; i <= this.sum; i++) {
				for (int j = 0; j <= this.summands.size() - 1; j++) {
					if ( this.summands.get(j) <= i && this.data[i-this.summands.get(j)] < this.data[i] ) {
						this.data[i] = this.data[i-this.summands.get(j)] + 1;
						if (i == this.sum) {
							System.out.println("Ways to made " + i + " : " + this.data[i]);
						}
					}
				}
			}
			
			System.out.println("Sum up");
			for (int i = 0; i <= this.sum; i++ ) {
				System.out.println(i + " " + this.data[i]);
			}
			
		}
		
		
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			
			List<Integer> summands = new ArrayList<Integer>();
			
			
			summands.add(2);
			summands.add(3);
			summands.add(7);
			
			Football ball = new Football(9, summands);
			ball.find();
			
		}
	}

package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Class Name: Race Method Name: public closestCheckPoint Parameters:
 *         int[], int[], int[] Returns: int
 * 
 *         Three runners are running a race. There are n checkpoints numbered 0
 *         through n-1 along the course of the race. The time each runner
 *         crosses each checkpoint is recorded, in seconds since the beginning
 *         of the race. As the race progresses, the time counts up. Implement a
 *         class Race, which contains a method closestCheckPoint. The method
 *         takes three int[]'s as parameters. The int[]'s contain the times the
 *         runners crossed the checkpoints, in seconds, one int[] for each
 *         runner. The 0th element of the first int[] is the time the first
 *         runner crossed the 0th checkpoint. The 0th element of the second
 *         int[] is the time the second runner crossed the 0th checkpoint,
 *         etc... The method returns an int that is the number of the checkpoint
 *         at which the three runners are closest (the time between the first
 *         and last runners' arrivals at the checkpoint is the minimum). If
 *         there are multiple checkpoints with the same closeness, the last
 *         (highest numbered) of these checkpoints is returned.
 * 
 *         The method signature is: public int closestCheckPoint(int[] runner1,
 *         int[] runner2, int[] runner3);
 * 
 *         runner1, runner2, and runner3 will have the same number of elements.
 *         There will be at least 1 element and at most 100 elements in each
 *         int[]. The elements will be between 0 and 30000.
 * 
 *         Note: -Keep in mind runners may cheat and therefore the int[] may not
 *         be an increasing sequence.
 * 
 *         Examples: runner1 = {10,40,90} runner2 = {12,37,87} runner3 =
 *         {15,32,88} returns: 2
 * 
 *         runner1 = {3,4,5,8} runner2 = {3,4,6,8} runner3 = {3,5,7,8} returns:
 *         3
 * 
 *         Definition
 * 
 *         Class: Race Method: closestCheckPoint Parameters: int[], int[], int[]
 *         Returns: int Method signature: int closestCheckPoint(int[] param0,
 *         int[] param1, int[] param2) (be sure your method is public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for:
 * 
 *         Collegiate Challenge Semifinals - Division I, Level One.
 * 
 */

public class Race {

		public int closestCheckPoint(int[]... runners) {
		
		int index = -1;
		int max = 0;
		int min = Integer.MAX_VALUE;
		int dif;
		int difMin = Integer.MAX_VALUE;
			
		for (int i = 0; i < runners[0].length; i++) {
			max = 0;
			min = Integer.MAX_VALUE;
			for (int j = 0; j < runners.length; j++) {
				if ( runners[j][i] > max ) {
					max = runners[j][i];
				}  
				if ( runners[j][i] < min ) {
					min = runners[j][i];
				} 
			}
			dif = max - min;
			if ( dif <= difMin ) {
				difMin = dif;
				index = i;
			}
		}	
			
		return index;
	}


}

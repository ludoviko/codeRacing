package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         You are writing firmware for an exercise machine. Each second, a
 *         routine in your firmware is called which decides whether it should
 *         display the percentage of the workout completed. The display does not
 *         have any ability to show decimal points, so the routine should only
 *         display a percentage if the second it is called results in a whole
 *         percentage of the total workout.
 * 
 *         Given a String time representing how long the workout lasts, in the
 *         format "hours:minutes:seconds", return the number of times a
 *         percentage will be displayed by the routine. The machine should never
 *         display 0% or 100%.
 * 
 *         Definition
 * 
 *         Class: ExerciseMachine Method: getPercentages Parameters: String
 *         Returns: int Method signature: int getPercentages(String time) (be
 *         sure your method is public)
 * 
 * 
 *         Constraints - time will be a String formatted as "HH:MM:SS", HH =
 *         hours, MM = minutes, SS = seconds. - The hours portion of time will
 *         be an integer with exactly two digits, with a value between 00 and
 *         23, inclusive. - The minutes portion of time will be an integer with
 *         exactly two digits, with a value between 00 and 59, inclusive. - The
 *         seconds portion of time will be an integer with exactly two digits,
 *         with a value between 00 and 59, inclusive - time will not be
 *         "00:00:00".
 * 
 *         Examples 0)
 * 
 * 
 *         "00:30:00"
 * 
 *         Returns: 99
 * 
 *         The standard 30 minute workout. Each one percent increment can be
 *         displayed every 18 seconds. 1)
 * 
 * 
 *         "00:28:00"
 * 
 *         Returns: 19
 * 
 *         The 28 minute workout. The user completes 5 percent of the workout
 *         every 1 minute, 14 seconds. 2)
 * 
 * 
 *         "23:59:59"
 * 
 *         Returns: 0
 * 
 *         This is the longest workout possible, given the constraints. No
 *         percentages are ever displayed on the screen. 3)
 * 
 * 
 *         "00:14:10"
 * 
 *         Returns: 49
 * 
 *         4)
 * 
 * 
 *         "00:19:16"
 * 
 *         Returns: 3
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for: Single Round Match 145 Round 1 - Division
 *         II, Level Two
 */

public class ExerciseMachine {
	public int getPercentages(String time) {
		int n = 0;
		String[] data = time.split(":");

		int seconds = Integer.parseInt(data[0]) * 3600
				+ Integer.parseInt(data[1]) * 60 + Integer.parseInt(data[2]);

		for (int i = 1; i < 100; i++) {
			if ((seconds * i) % 100 == 0) {
				n = i;
				break;
			}
		}

		if (n == 0) {
			n = 100;
		}

		return 100 / n - 1;
	}
}

package com.lam.coder.topCoder;

/**
 * 
 * @author LAzuaje
 * 
 *         Problem Statement for MovingAverages
 * 
 *         Moving averages are well known in stock charts
 *         analysis. They are used to emphasize the direction of a trend and to
 *         smooth out fluctuations. Athletes may use moving averages to analyze
 *         their training results.
 * 
 *         Given a String[] times containing the times from successive training
 *         sessions (e.g. the time to cycle a certain leg) and an int n, return
 *         a int[] containing the n-moving averages in seconds for these times,
 *         with each average rounded down.
 * 
 *         Each element of times is in the format "hh:mm:ss" (quotes for
 *         clarity), where hh, mm and ss are two digit numbers (with a leading
 *         zero if necessary) indicating the number of hours, minutes and
 *         seconds, respectively.
 * 
 *         A n-moving average is the average (i.e. the arithmetic mean) of n
 *         consecutive times. So for t times given, t-n+1 n-moving averages are
 *         to be calculated. The first average is composed from the times 1 to
 *         n, the second average from the times 2 to n+1 and so on, the last
 *         average is composed from the times t-n+1 to t.
 * 
 * 
 *         Definition
 * 
 *         Class: MovingAverages Method: calculate Parameters: String[], int
 *         Returns: int[] Method signature: int[] calculate(String[] times, int
 *         n) (be sure your method is public)
 * 
 * 
 *         Constraints - times contains between 1 and 50 elements, inclusive. -
 *         Each element of times is in the format "hh:mm:ss" (quotes for
 *         clarity), where
 * 
 *         hh is a two digit number (with a leading zero if necessary) between 0
 *         and 23, inclusive,
 * 
 *         mm is a two digit number (with a leading zero if necessary) between 0
 *         and 59, inclusive,
 * 
 *         ss is a two digit number (with a leading zero if necessary) between 0
 *         and 59, inclusive. - n is between 1 and the number of elements in
 *         times, inclusive.
 * 
 *         Examples 0)
 * 
 *         {"01:19:10", "01:17:40", "01:19:44", "01:17:23", "01:17:07"} 3
 *         Returns: { 4731, 4695, 4684 } 4731 (01:18:51) is the average of of
 *         the first three times, namely 01:19:10, 01:17:40, and 01:19:44.
 * 
 *         4695 (01:18:15) is the average of the middle three times (01:17:40,
 *         01:19:44, 01:17:23).
 * 
 *         Finally, 4684 (01:18:04) is the average of the last three times
 *         (01:19:44, 01:17:23, 01:17:07). 1)
 * 
 *         {"01:19:10", "01:17:40", "01:19:44", "01:17:23", "01:17:07"} 1
 *         Returns: { 4750, 4660, 4784, 4643, 4627 } The 1-moving averages are
 *         just the times given. 2)
 * 
 *         {"01:19:10", "01:17:40", "01:19:44", "01:17:23", "01:17:07"} 5
 *         Returns: { 4692 } The 5-moving averages of five times is just one
 *         value, the average of all the five values.
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 209 Round 1 - Division
 *         II, Level One
 * 
 */

public class MovingAverages {

	public int[] calculate(String[] times, int n) {

		int len = times.length + 1 - n;

		int[] averages = new int[len];
		int average = 0;

		for (int i = 0; i < len; i++) {
			for (int j = i; j < n + i; j++) {
				average += convertToSeconds(times[j]);
			}
			averages[i] = average / n;
			average = 0;
		}

		return averages;
	}

	private int convertToSeconds(String time) {
		String data[] = time.split(":");
		int seconds = Integer.parseInt(data[0]) * 3600
				+ Integer.parseInt(data[1]) * 60 + Integer.parseInt(data[2]);
		return seconds;
	}

}

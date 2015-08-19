package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Class Name: MetricClock Method Name: convertToMetric Parameters:
 *         String Returns: String
 * 
 *         Implement a class MetricClock, which contains a method
 *         convertToMetric. convertToMetric takes a String in the form
 *         "HH:MM:SS" (where HH is between 00 and 23, MM is between 00 and 59
 *         and SS is between 00 and 59) representing the current time of day
 *         according to standard clocks (in military time), and returns a String
 *         in the form "H:MM:SS" (where H is between 0 and 9, MM is between 00
 *         and 99, and SS is between 00 and 99) representing the current time of
 *         day according to the metric clock.
 * 
 *         According to the metric clock, there are 10 metric hours in a day,
 *         100 metric minutes in a metric hour, and 100 metric seconds in a
 *         metric minute. There are 86400 standard seconds in a day, thus 86400
 *         standard seconds make up 1 metric day (100000 metric seconds). The
 *         metric clock day starts at 0:00:00 and ends at 9:99:99.
 * 
 *         When converting to the metric clock, partial seconds are always
 *         truncated, not rounded. (9:20:38.833... returns 9:20:38.)
 * 
 *         Here is the method signature: public String convertToMetric(String
 *         strStandardTime);
 * 
 *         strStandardTime is of the form above.
 * 
 *         Examples: Given the String "01:45:17", the method returns "0:73:11"
 *         Given the String "03:17:45", the method returns "1:37:32" Given the
 *         String "08:12:22", the method returns "3:41:92" Given the String
 *         "12:00:00", the method returns "5:00:00" Given the String "12:15:21",
 *         the method returns "5:10:65" Given the String "19:58:59", the method
 *         returns "8:32:62" Given the String "23:59:59", the method returns
 *         "9:99:98"
 * 
 *         Definition
 * 
 *         Class: MetricClock Method: convertToMetric Parameters: String
 *         Returns: String Method signature: String convertToMetric(String
 *         param0) (be sure your method is public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 10 Round 1 - Division
 *         I, Level One Single Round Match 10 Round 1 - Division II, Level One
 */

public class MetricClock {
	public static final int SECONDS_PER_DAY = 86400;

	public String convertToMetric(String time) {
		return convertToDecimal(time);
	}

	private String convertToDecimal(String time) {
		String[] data = time.split(":");

		long seconds = Integer.parseInt(data[0]) * 3600
				+ Integer.parseInt(data[1]) * 60 + Integer.parseInt(data[2]);
		seconds = 10 * 100 * 100 * seconds / SECONDS_PER_DAY;
		String time_10 = "" + seconds;

		while (time_10.length() < 5) {
			time_10 = "0" + time_10;
		}

		return time_10.substring(0, 1) + ":" + time_10.substring(1, 3) + ":"
				+ time_10.substring(3, 5);
	}
}

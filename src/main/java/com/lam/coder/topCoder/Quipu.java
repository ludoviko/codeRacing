package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement for Quipu Problem Statement
 * 
 *         The Incas used a sophisticated system of record keeping consisting of
 *         bundles of knotted cords. Such a bundle of cords is called a quipu.
 *         Each individual cord represents a single number. Surprisingly, the
 *         Incas used a base-10 positional system, just like we do today. Each
 *         digit of a number is represented by a cluster of adjacent knots, with
 *         spaces between neighboring clusters. The digit is determined by the
 *         number of knots in the cluster. For example, the number 243 would be
 *         represented by a cord with knots tied in the following pattern
 * 
 *         -XX-XXXX-XXX-
 * 
 *         where each uppercase 'X' represents a knot and each '-' represents an
 *         unknotted segment of cord (all quotes for clarity only).
 * 
 *         Unlike many ancient civilizations, the Incas were aware of the
 *         concept of zero, and used it in their quipus. A zero is represented
 *         by a cluster containing no knots. For example, the number 204003
 *         would be represented by a cord with knots tied in the following
 *         pattern
 * 
 *         -XX--XXXX---XXX-
 *          two zeros between these three segments 
 *          one zero between these two segments
 * 
 *         Notice how adjacent dashes signal the presence of a zero.
 * 
 *         Your task is to translate a single quipu cord into an integer. The
 *         cord will be given as a String knots containing only the characters
 *         'X' and '-'. There will be a single '-' between each cluster of 'X's,
 *         as well as a leading '-' and a trailing '-'. The first cluster will
 *         not be empty.
 * 
 *         Definition
 * 
 *         Class: Quipu Method: readKnots Parameters: String Returns: int Method
 *         signature: public int readKnots(String knots)
 * 
 * 
 *         Constraints - knots contains between 3 and 50 characters, inclusive.
 *         - knots contains only the characters 'X' and '-'. Note that 'X' is
 *         uppercase. - The first and last characters of knots are '-'s. The
 *         second character is 'X'. - knots does not contain 10 consecutive
 *         'X's. - knots will represent a number between 1 and 1000000,
 *         inclusive.
 * 
 *         Examples 
 *         
 *         0)
 *         "-XX-XXXX-XXX-"
 * 
 *         Returns: 243
 * 
 *         The first example above.
 * 
 *         1) "-XX--XXXX---XXX-"
 * 
 *         Returns: 204003
 * 
 *         The second example above.
 * 
 *         2) "-X-"
 * 
 *         Returns: 1
 * 
 *         3) "-X-------"
 * 
 *         Returns: 1000000
 * 
 *         4) "-XXXXXXXXX--XXXXXXXXX-XXXXXXXXX-XXXXXXX-XXXXXXXXX-"
 * 
 *         Returns: 909979
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 155 Round 1 - Division
 *         II, Level One
 * 
 *         Score: 244.5/250.
 * 
 */
public class Quipu {
	public int readKnots(String knots) {
		String translation = "";
		int numberNotZero = 0;
		int dashes = 0;

		for (int i = 1; i < knots.length(); i++) {
			if (knots.charAt(i) == 'X') {
				numberNotZero++;
				if (dashes > 1) {
					for (int j = 1; j < dashes; j++)
						translation += 0;
				}
				dashes = 0;
			} else if (knots.charAt(i) == '-') {
				dashes++;
				if (numberNotZero != 0) {
					translation += numberNotZero;
				}
				numberNotZero = 0;
			}
		}

		// End of String, there might be trailing zeroes not saved
		if (dashes > 1) {
			for (int j = 1; j < dashes; j++)
				translation += 0;
		}
		return Integer.parseInt(translation);
	}
}

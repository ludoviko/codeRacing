package com.lam.coder.topCoder;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         This task is about the scoring in the first phase of the die-game
 *         Yahtzee, where five dice are used. The score is determined by the
 *         values on the upward die faces after a roll. The player gets to
 *         choose a value, and all dice that show the chosen value are
 *         considered active. The score is simply the sum of values on active
 *         dice.
 * 
 *         Say, for instance, that a player ends up with the die faces showing
 *         2, 2, 3, 5 and 4. Choosing the value two makes the dice showing 2
 *         active and yields a score of 2 + 2 = 4, while choosing 5 makes the
 *         one die showing 5 active, yielding a score of 5.
 * 
 *         Your method will take as input an int[] toss, where each element
 *         represents the upward face of a die, and return the maximum possible
 *         score with these values.
 * 
 *         Definition
 * 
 *         Class: Yahtzee Method: maxPoints Parameters: int[] Returns: int
 *         Method signature: int maxPoints(int[] toss)
 * 
 *         Constraints - toss will contain exactly 5 elements. - Each element of
 *         toss will be between 1 and 6, inclusive.
 * 
 *         Examples 0) { 2, 2, 3, 5, 4 }
 * 
 *         Returns: 5
 * 
 *         The example from the text.
 * 
 *         1) { 6, 4, 1, 1, 3 }
 * 
 *         Returns: 6
 * 
 *         Selecting 1 as active yields 1 + 1 = 2, selecting 3 yields 3,
 *         selecting 4 yields 4 and selecting 6 yields 6, which is the maximum
 *         number of points.
 * 
 *         2) { 5, 3, 5, 3, 3 }
 * 
 *         Returns: 10
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for:
 * 
 *         Single Round Match 146 Round 1 - DivisionII, Level One
 * 
 *         Single Round Match 212 Round 1 - Division II, Level One
 * 
 *         Practice Room Score: 236,62
 */

public class Yahtzee {

	public int maxPoints(int[] toss) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		Integer value;
		Integer max = 0;

		for (int i = 0; i < toss.length; i++) {
			if (map.containsKey(toss[i])) {
				value = map.get(toss[i]);
				value += toss[i];
				map.put(toss[i], value);
			} else {
				map.put(toss[i], toss[i]);
			}
		}

		Iterator<Integer> itera = map.values().iterator();
		while (itera.hasNext()) {
			value = itera.next();
			if (value > max) {
				max = value;
			}
		}
		return max;
	}
}

package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author LAzuaje
 *
 *         Problem Statement for VolumeGuess
 * 
 *         Problem Statement You are given a certain number of boxes
 *         (numberOfBoxes) of different volumes. The boxes are numbered 1 to
 *         numberOfBoxes. After this, I then make comparisions between every
 *         pair of boxes and, for each pair, tell you the volume of the smaller
 *         box. Given this data, you have to tell me the size of the box
 *         numbered ithBox. (The box numbered ithBox will not be one of the two
 *         largest boxes.)
 * 
 *         You are given a String[], queries, each element of which describes a
 *         single comparision and is of the form "box1,box2,volume" (quotes for
 *         clarity) where box1 and box2 are the numbers of the two boxes being
 *         compared and volume is the volume of the smaller box. For instance,
 *         if I compare the boxes numbered 5 and 6, which have volumes 10 and
 *         99, respectively, the query will be represented as "5,6,10" (quotes
 *         for clarity).
 * 
 *         Definition
 * 
 *         Class: VolumeGuess Method: correctVolume Parameters: String[], int,
 *         int Returns: int Method signature: int correctVolume(String[]
 *         queries, int numberOfBoxes, int ithBox) (be sure your method is
 *         public)
 * 
 * 
 *         Notes - Keep in mind, the volume of the largest box is irrelevant.
 * 
 *         Constraints - numberOfBoxes will be between 3 and 9, inclusive. -
 *         queries will contain exactly numberOfBoxes*(numberOfBoxes-1)/2
 *         elements. - Every element of queries will be in the given format
 *         ("box1,box2,volume", quotes for clarity). - Each element of queries
 *         will contain between 5 and 50 characters, inclusive. - Each box1 will
 *         be an integer between 1 and numberOfBoxes, inclusive, with possible
 *         leading zeros. - Each box2 will be an integer between 1 and
 *         numberOfBoxes, inclusive, with possible leading zeros. - Each volume
 *         will be an integer between 1 and 500, inclusive, with possible
 *         leading zeros. - queries will contain no duplicates, that is, no pair
 *         of boxes will be compared twice. - No two boxes will have the same
 *         volume. - ithBox will be between 1 and numberOfBoxes, inclusive. -
 *         The given data will be consistent. - The box numbered ithBox will not
 *         be one of the two largest boxes.
 * 
 *         Examples 0)
 * 
 *         {"1,2,10","1,3,10","2,3,20"} 3 1 Returns: 10 If box 1 has volume 10,
 *         box 2 has volume 20 and box 3 has volume 30, we get the given data.
 *         Another possibility is box 1 has volume 10, box 2 has volume 30 and
 *         box 3 has volume 20. Another is box 1 has volume 10, box 2 has volume
 *         45 and box 3 has volume 20. There are many possibilities (infinite in
 *         fact). However, in all of them box 1 has to have size 10. 1)
 * 
 *         {"1,02,10","2,3,010","1,3,20"} 3 2 Returns: 10 If box 1 has volume
 *         20, box 2 has volume 10 and box 3 has volume 30, we get the given
 *         data. (Note that leading zeros are allowed.) 2)
 * 
 *         {"1,2,31","1,3,9","1,4,31","2,4,32","3,4,9","3,2,9"} 4 1 Returns: 31
 *         One possibility is box 1 has volume 31, box 2 has volume 50, box 3
 *         has volume 9 and box 4 has volume 32. 3)
 * 
 *         {"1,2,31","1,3,9","1,4,31","2,4,32","3,4,9","3,2,9"} 4 3 Returns: 9
 *         Same situation as above, but asks for a different ithbox. This
 *         problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 191 Round 1 - Division
 *         I, Level One Single Round Match 191 Round 1 - Division II, Level Two
 */

public class VolumeGuess {
	public int correctVolume(String[] queries, int numberOfBoxes, int ithBox) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		int volume = -1;

		for (int i = 0; i < queries.length; i++) {
			int[] data = this.splitInts(queries[i]);

			String key;
			if (data[0] == ithBox) {
				key = ithBox + "-" + data[2];
				map.put(key, map.get(key) == null ? 1 : map.get(key) + 1);
			} else if (data[1] == ithBox) {
				key = ithBox + "-" + data[2];
				map.put(key, map.get(key) == null ? 1 : map.get(key) + 1);
			}
		}

		Collection<Integer> collection = map.values();

		List<Integer> list = new ArrayList<Integer>();
		list.addAll(collection);
		Collections.sort(list);

		int frequency = list.get(list.size() - 1);

		Set<Entry<String, Integer>> pairs = map.entrySet();

		Iterator<Entry<String, Integer>> iterator = pairs.iterator();

		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			if (entry.getValue() == frequency) {
				volume = Integer.parseInt(entry.getKey().split("-")[1]);
				break;
			}
		}

		return volume;
	}

	private int[] splitInts(String s) {
		String[] split = s.split("[ ,]+");
		int[] ret = new int[split.length];

		for (int i = 0; i < ret.length; i++)
			ret[i] = Integer.parseInt(split[i]);

		return ret;
	}
}

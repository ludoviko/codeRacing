package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WinterAndCandies {

	public int getNumber(int[] type) {
		int count = 0;
		int len = type.length;
		int upTo = (int) Math.pow(2, len);
		String bin;
		int max = 0;
		int min = 0;

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < upTo; i++) {
			bin = Integer.toBinaryString(i);
			for (int j = bin.length() - 1, n = 0; j >= 0; j--) {
				if (bin.charAt(j) == '1') {
					list.add(type[bin.length() - 1 - j]);
				}
			}
			min = min(list);
			max = max(list);
			Collections.sort(list);
			boolean fine = true;
			if (list.size() == 1) {
				if (list.get(0) == 1) {
					count++;
				} else {
				}
			} else {
				for (int k = 0; k < list.size(); k++) {
					if (list.get(k) == min + k  && list.size() == max) {
					} else {
						fine = false;
					}
				}
				if (fine) {
					count++;
				}
			}
			list.clear();

		}

		// {1, 3, 2}
		// Returns: 3
		// There are 7 possible non-empty subsets in this case:
		// (1)
		// (3)
		// (2)
		// (1, 3)
		// (1, 2)
		// (3, 2)
		// (1, 3, 2)
		// Out of them, only first, fifth and seventh are valid. Thus, the
		// answer is 3.
		return count;
	}

	private int max(List<Integer> list) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}

		return max;
	}

	private int min(List<Integer> list) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}

		return min;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

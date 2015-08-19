package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniatureDachshund {
	public int MAX_WEIGHT = 5000;

	public int maxMikan(int[] mikan, int weight) {
		int count = 0;
		int target = weight;
		int i = 0;

		List<Integer> mikans = new ArrayList<Integer>();
		
		for (int j = 0; j < mikan.length; j++) {
			mikans.add(new Integer(mikan[j]));
		}
		
		Collections.sort(mikans);
		
		while (target < MAX_WEIGHT  && i < mikans.size()) {
			target += mikans.get(i++);
			if (target <= MAX_WEIGHT) {
				count++;
			} else {
				break;
			}
		}
		return count;
	}
}

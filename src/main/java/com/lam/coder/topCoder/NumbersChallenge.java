package com.lam.coder.topCoder;

import java.util.Set;
import java.util.TreeSet;

public class NumbersChallenge {
	public int minNumber(int[] numbers) {
		int top = (int) Math.pow(2, numbers.length);
		String bin;
		int d;
		int s = 0;
		int p;
		Set<Integer> set = new TreeSet<Integer>();

		for (int i = 1; i < top; i++) {
			bin = Integer.toBinaryString(i);
			while (bin.length() < numbers.length) {
				bin = 0 + bin;
			}
			for (int j = 0; j < bin.length(); j++) {
				d = Integer.parseInt(bin.charAt(j) + "");
				p = d * (j + 1);
				if (p == 0) {
					continue;
				}
				s += numbers[p - 1];
			}
			set.add(s);
			s = 0;
		}

		int i = 1;
		while (true) {
			if (set.contains(new Integer(i))) {
			} else {
				break;
			}
			i++;
		}

		return i;
	}
}

package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Every schoolgirl (and the occasional schoolboy) likes to skip rope.
 *         It's fine to go solo, but it's better still to have partners who can
 *         swing the rope and chant along. Ideally, the two children holding the
 *         rope are about as tall as the one doing the skipping.
 * 
 *         In this problem, we shall measure height in centimeters. Given a
 *         int[] containing the heights of your prospective partners, return the
 *         two that are closest to your own height, which is specified by a
 *         separate int. Break ties in favor of taller candidates, and sort the
 *         return values in non-descending order.
 * 
 *         Definition
 * 
 *         Class: SkipRope Method: partners Parameters: int[], int Returns:
 *         int[] Method signature: int[] partners(int[] candidates, int height)
 *         (be sure your method is public)
 * 
 * 
 *         Notes - It's possible for multiple candidates to have the same
 *         height.
 * 
 *         Constraints - candidates contains between 2 and 50 elements,
 *         inclusive - each element of candidates is between 75 and 175,
 *         inclusive - height is between 75 and 175, inclusive
 * 
 *         Examples 0)
 * 
 * 
 *         {102, 99, 104}
 * 
 *         100
 * 
 *         Returns: { 99, 102 }
 * 
 *         The closest height is 99, and the second closest is 102. 1)
 * 
 * 
 *         {102, 97, 104}
 * 
 *         100
 * 
 *         Returns: { 97, 102 }
 * 
 *         Now the closest is 102, and second closest is 97. 2)
 * 
 * 
 *         {101, 100, 99}
 * 
 *         100
 * 
 *         Returns: { 100, 101 }
 * 
 *         The closest height is 100, while 99 and 101 are tied for second
 *         closest. Since we favor larger values in the event of a tie, our
 *         choice for second closest is 101. 3)
 * 
 * 
 *         {75, 117, 170, 175, 168, 167, 167, 142, 170, 85, 89, 170}
 * 
 *         169
 * 
 *         Returns: { 170, 170 }
 * 
 *         The two heights closest to 169 are both 170. 4)
 * 
 * 
 *         {134, 79, 164, 86, 131, 78, 99, 150, 105, 163, 150, 110, 90, 137,
 *         127, 130, 121, 93, 97, 131, 170, 137, 171, 153, 137, 138, 92, 103,
 *         149, 110, 156}
 * 
 *         82
 * 
 *         Returns: { 79, 86 }
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for:
 * 
 *         Single Round Match 172 Round 1 - Division II, Level One
 * 
 */

public class SkipRope {
	public int[] partners(int[] candidates, int height) {
		List<Complex> list = new ArrayList<Complex>();
		int[] reduced = new int[2];

		for (int i = 0; i < candidates.length; i++) {
			list.add(new Complex(Math.abs(height - candidates[i]),
					candidates[i]));
		}

		Collections.sort(list);
		for (int i = 0; i < 2; i++) {
			reduced[i] = list.get(i).getLen();
		}
		Arrays.sort(reduced);
		return reduced;
	}

	private class Complex implements Comparable<Complex> {
		int dif;
		int len;

		public Complex(int dif, int len) {
			super();
			this.dif = dif;
			this.len = len;
		}

		int getLen() {
			return this.len;
		}

		int getDif() {
			return this.dif;
		}

		@Override
		public String toString() {
			return "Complex [dif=" + this.dif + ", len=" + this.len + "]";
		}

		public int compareTo(Complex o) {
			if (this.dif > o.dif) {
				return 1;
			} else if (this.dif < o.dif) {
				return -1;
			}

			if (this.len > o.len) {
				return -1;
			} else if (this.len < o.len) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}

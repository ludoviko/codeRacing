package com.lam.coder.projectEuler;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 39: Integer right triangles
 * 
 *         If p is the perimeter of a right angle triangle with integral length
 *         sides, {a,b,c}, there are exactly three solutions for p = 120.
 * 
 *         {20,48,52}, {24,45,51}, {30,40,50}
 * 
 *         a = 2mn b = m*m - n*n c = m*m + n*n
 * 
 *         where m, n, and k are positive integers with m > n, m − n odd, and
 *         with m and n coprime.
 * 
 *         For which value of p ≤ 1000, is the number of solutions maximised?
 * 
 *         Answer: 840, 8 times.
 * 
 *         TODO: Apply better algorithm
 * 
 */

public class IntegerRightTriangles {
	private static Map<Integer, Integer> getMap() {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int p;
		double h;
		p = 0;
		int value;
		for (int i = 1; i < 500; i++) {
			for (int j = i + 1; j < 500; j++) {
				h = Math.sqrt(i * i + j * j);
				if ((h - (int) h) == 0) {
				} else {
					continue;
				}
				p = i + j + (int) h;
				if (p > 1000) {
					break;
				}
				if (map.containsKey(new Integer(p))) {
					value = map.get(new Integer(p));
					value++;
					map.put(new Integer(p), new Integer(value));
				} else {
					map.put(new Integer(p), new Integer(1));
				}
			}
		}
		return map;
	}

	public static int findMaxKey() {
		int max = 0;
		int n = 0;
		Map<Integer, Integer> map = IntegerRightTriangles.getMap();
		Set<Entry<Integer, Integer>> set = map.entrySet();

		for (Entry<Integer, Integer> entry : set) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				n = entry.getKey();
			}
		}
		return n;
	}

	public static void main(String[] args) {
		int max = findMaxKey();
		System.out.println(max);
	}
}

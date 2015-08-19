package com.lam.coder.projectEuler;

/**
 * 
 * 
 * Lexicographic permutations Problem 24
 * 
 * A permutation is an ordered arrangement of objects. For example, 3124 is one
 * possible permutation of the digits 1, 2, 3 and 4. If all of the permutations
 * are listed numerically or alphabetically, we call it lexicographic order. The
 * lexicographic permutations of 0, 1 and 2 are:
 * 
 * 012 021 102 120 201 210
 * 
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4,
 * 5, 6, 7, 8 and 9?
 * 
 * Answer: 2783915460.
 * 
 */

public class LexicographicPermutations {
	public static final int ONE_MILLION = 1000000;

	public static String go() {
		String permutation = "0";
		int counter = 1;

		out: for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				if (a == b) {
					continue;
				}
				for (int c = 0; c < 10; c++) {
					if (c == a || c == b) {
						continue;
					}
					for (int d = 0; d < 10; d++) {
						if (d == a || d == b || d == c) {
							continue;
						}
						for (int e = 0; e < 10; e++) {
							if (e == a || e == b || e == c || e == d) {
								continue;
							}
							for (int f = 0; f < 10; f++) {
								if (f == a || f == b || f == c || f == d
										|| f == e) {
									continue;
								}
								for (int g = 0; g < 10; g++) {
									if (g == a || g == b || g == c || g == d
											|| g == e || g == f) {
										continue;
									}
									for (int i = 0; i < 10; i++) {
										if (i == a || i == b || i == c
												|| i == d || i == e || i == f
												|| i == g) {
											continue;
										}
										for (int j = 0; j < 10; j++) {
											if (j == a || j == b || j == c
													|| j == d || j == e
													|| j == f || j == g
													|| j == i) {
												continue;
											}
											for (int k = 0; k < 10; k++) {
												if (k == a || k == b || k == c
														|| k == d || k == e
														|| k == f || k == g
														|| k == i || k == j) {
													continue;
												}
												// System.out.println("Counter: "
												// + counter);
												permutation = a + "" + b + ""
														+ c + "" + d + "" + e
														+ "" + f + "" + g + ""
														+ i + "" + j + "" + k;
												// System.out.println(
												// a + "" + b + "" + c + "" +
												// d + "" + e + "" + f + "" +
												// g + "" + i + "" + j + "" +
												// k);
												if (counter++ == ONE_MILLION) {
													break out;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return permutation;
	}

	public static void main(String[] args) {
		String permutation = go();
		System.out.println(permutation);
	}
}

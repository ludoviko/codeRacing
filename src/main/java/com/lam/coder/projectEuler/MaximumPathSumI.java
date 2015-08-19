package com.lam.coder.projectEuler;

/**
 * 
 Maximum path sum I Problem 18
 * 
 * By starting at the top of the triangle below and moving to adjacent numbers
 * on the row below, the maximum total from top to bottom is 23.
 * 
 * 3 7 4 2 4 6 8 5 9 3
 * 
 * That is, 3 + 7 + 4 + 9 = 23.
 * 
 * Find the maximum total from top to bottom of the triangle below:
 * 
 * 75 95 64 17 47 82 18 35 87 10 20 04 82 47 65 19 01 23 75 03 34 88 02 77 73 07
 * 63 67 99 65 04 28 06 16 70 92 41 41 26 56 83 40 80 70 33 41 48 72 33 47 32 37
 * 16 94 29 53 71 44 65 25 43 91 52 97 51 14 70 11 33 28 77 73 17 78 39 68 17 57
 * 91 71 52 38 17 14 91 43 58 50 27 29 48 63 66 04 68 89 53 67 30 73 16 69 87 40
 * 31 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
 * 
 * NOTE: As there are only 16384 routes, it is possible to solve this problem by
 * trying every route. However, Problem 67, is the same challenge with a
 * triangle containing one-hundred rows; it cannot be solved by brute force, and
 * requires a clever method! ;o)
 * 
 * Answer: 1074.
 * 
 * Utilities for copy and printing arrays in java standard libraries ??
 */

public class MaximumPathSumI {
	private int max;
	private int[][] array;
	private int ROWS;
	private int COLUMNS;

	private int[][] arrayClone;

	public MaximumPathSumI() {
	}

	private void copyArray() {
		arrayClone = new int[ROWS][COLUMNS];
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < i + 1; j++) {
				arrayClone[i][j] = this.array[i][j];
			}
		}
	}

	public void find() {
		int maxInner;

		this.copyArray();
		
		for (int i = ROWS - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				maxInner = Math.max(this.arrayClone[i][j],
						this.arrayClone[i][j + 1]);
				this.arrayClone[i - 1][j] = maxInner
						+ this.arrayClone[i - 1][j];
			}
		}
		this.max = arrayClone[0][0];
	}

	// To slow
	public int findRecursiveMax(int i, int j) {
		if (i == array.length) {
			return 0;
		}

		int max = this.array[i][j]
				+ Math.max(findRecursiveMax(i + 1, j),
						findRecursiveMax(i + 1, j + 1));
		return max;
	}

	// Too slow.
	public void findRecursive() {
		max = findRecursiveMax(0, 0);
	}

	public void printArray(int[][] data) {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int[][] getArray() {
		return array;
	}

	public int getROWS() {
		return ROWS;
	}

	public int getCOLUMNS() {
		return COLUMNS;
	}

	public int[][] getArrayClone() {
		return arrayClone;
	}

	public void setArray(int[][] array) {
		this.array = array;
		ROWS = array.length;
		COLUMNS = array[ROWS - 1].length;
	}

	public int getMax() {
		return max;
	}

	public static void main(String[] args) {
		MaximumPathSumI maxPath = new MaximumPathSumI();
		int[][] array = { { 75 }, { 95, 64 }, { 17, 47, 82 },
				{ 18, 35, 87, 10 }, { 20, 04, 82, 47, 65 },
				{ 19, 01, 23, 75, 03, 34 }, { 88, 02, 77, 73, 07, 63, 67 },
				{ 99, 65, 04, 28, 06, 16, 70, 92 },
				{ 41, 41, 26, 56, 83, 40, 80, 70, 33 },
				{ 41, 48, 72, 33, 47, 32, 37, 16, 94, 29 },
				{ 53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14 },
				{ 70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57 },
				{ 91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48 },
				{ 63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31 },
				{ 04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23 } };
		maxPath.setArray(array);
		maxPath.find();
		System.out.println(maxPath.getMax());
	}
}

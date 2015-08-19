package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement for Snaky
 * 
 * 
 *         Problem Statement
 * 
 *         xxxxx... ....xxxx .x.....x .xxxxxxx Your are given a picture of a
 *         snake. Lowercase 'x' characters indicate parts of the snake, and '.'
 *         characters represent empty areas. The snake consists of a sequence of
 *         horizontal and vertical segments. Successive segments in the snake
 *         share an 'x', which is considered to be in both segments. No two 'x's
 *         from different segments of the snake are horizontally or vertically
 *         adjacent. Given a String[] snake, return the length of the longest
 *         segment in the snake. The picture is formed using successive elements
 *         of snake as successive rows in the picure.
 * 
 * 
 *         Definition
 * 
 *         Class: Snaky Method: longest Parameters: String[] Returns: int Method
 *         signature: int longest(String[] snake) (be sure your method is
 *         public)
 * 
 * 
 *         Constraints - snake contains between 1 and 50 elements, inclusive. -
 *         Each element of snake contains the same number of characters. - Each
 *         element of snake contains between 1 and 50 characters, inclusive. -
 *         Each character in each element of snake is a period ('.') or a
 *         lowercase 'x'. - If two 'x's are adjacent to each other in the
 *         picture, they are in the same segment. - The picture shows just one
 *         connected snake, using at least 2 'x's.
 * 
 *         Examples 0)
 * 
 *         {"x.xxx.xxx", "x.x.x.x.x", "xxx.xxx.x"} Returns: 3 This snake
 *         consists of 9 segments, each of length 3. 1)
 * 
 *         {"xxxx..", "...x..", "...x..", "......"} Returns: 4 One segment is
 *         length 4, the other is length 3. 2)
 * 
 *         {"...x................", "...x................",
 *         "....................", "...................."} Returns: 2 This
 *         problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 * 
 * 
 * 
 *         This problem was used for: 2007 TopCoder Open Qualification Round 1 -
 *         Division I, Level One
 *
 */

public class Snaky {
	public int longest(String[] snake) {
		int max = 0;

		for (String string : snake) {
			if (this.count(string) > max) {
				max = this.count(string);
			}
		}

		String[] data = trans(snake);
		for (String string : data) {
			if (this.count(string) > max) {
				max = this.count(string);
			}
		}

		return max;
	}

	private int count(String string) {
		int max = 0;
		int n = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'x') {
				n++;
			} else {
				if (n > max) {
					max = n;
				}
				n = 0;
			}
		}

		if (n > max) {
			max = n;
		}
		n = 0;
		return max;
	}

	private static String[] trans(String[] snake) {
		String[] data = new String[snake[0].length()];

		String line = "";
		for (int j = 0; j < snake[0].length(); j++) {

			for (int i = 0; i < snake.length; i++) {
				line += snake[i].charAt(j);
			}
			data[j] = line;
			line = "";
		}

		return data;
	}
}

package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author
 *
 *         You've got a 5 × 5 matrix, consisting of 24 zeroes and a single
 *         number one. Let's index the matrix rows by numbers from 1 to 5 from
 *         top to bottom, let's index the matrix columns by numbers from 1 to 5
 *         from left to right. In one move, you are allowed to apply one of the
 *         two following transformations to the matrix:
 * 
 *         Swap two neighboring matrix rows, that is, rows with indexes i and
 *         i + 1 for some integer i (1 ≤ i < 5). Swap two neighboring matrix
 *         columns, that is, columns with indexes j and j + 1 for some integer j
 *         (1 ≤ j < 5). You think that a matrix looks beautiful, if the single
 *         number one of the matrix is located in its middle (in the cell that
 *         is on the intersection of the third row and the third column). Count
 *         the minimum number of moves needed to make the matrix beautiful.
 * 
 *         Input The input consists of five lines, each line contains five
 *         integers: the j-th integer in the i-th line of the input represents
 *         the element of the matrix that is located on the intersection of the
 *         i-th row and the j-th column. It is guaranteed that the matrix
 *         consists of 24 zeroes and a single number one.
 * 
 *         Output Print a single integer — the minimum number of moves needed to
 *         make the matrix beautiful.
 *
 */

public class VasyaAndSocks {

	public int find(String string) {

		String[] data = string.split(" ");

		float a = Float.parseFloat(data[0]);
		float b = Float.parseFloat(data[1]);
		float c = a;

		while (true) {
			c += a / b;
			a = a / b;

			if (a / b < (1 - (c - (int) c))) {
				break;
			}
		}

		return (int) c;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		VasyaAndSocks main = new VasyaAndSocks();

		String string = scanner.next();
		out.println(main.find(string));

		scanner.reader.close();
		out.close();
	}

	// -----------MyScanner class for faster input----------
	public static class MyScanner {
		BufferedReader	reader;

		public MyScanner() {
			this.reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public void close() throws IOException {
			this.reader.close();
		}

		int nextInt() {
			return Integer.parseInt(this.next());
		}

		long nextLong() {
			return Long.parseLong(this.next());
		}

		double nextDouble() {
			return Double.parseDouble(this.next());
		}

		String next() {
			String str = "";
			try {
				str = this.reader.readLine().trim();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		String[] nextStringArray() {
			String[] str = null;
			try {
				str = this.reader.readLine().trim().split(" ");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
}

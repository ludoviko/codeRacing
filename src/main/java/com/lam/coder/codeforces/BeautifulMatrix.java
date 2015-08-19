package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
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
 *         Sample test(s) input 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 *         0 output 3 input 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0
 *         output 1
 * 
 * 
 */

public class BeautifulMatrix {

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int n = 5;

		String string;
		char data[];

		int i, j;
		int x = 0, y = 0;

		for (i = 0; i < n; i++) {
			string = scanner.next();
			data = string.toCharArray();

			for (j = 0; j < 2 * n; j += 2) {
				if (data[j] == '1') {
					x = i;
					y = j / 2;
					break;
				}
			}
		}

		out.println(Math.abs(2 - x) + Math.abs(2 - y));

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

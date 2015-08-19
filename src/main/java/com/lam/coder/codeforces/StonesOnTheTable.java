package com.lam.coder.codeforces;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 
 * @author LAzuaje.
 *
 *         A. Stones on the Table time limit per test2 seconds memory limit per
 *         test256 megabytes inputstandard input outputstandard output There are
 *         n stones on the table in a row, each of them can be red, green or
 *         blue. Count the minimum number of stones to take from the table so
 *         that any two neighboring stones had different colors. Stones in a row
 *         are considered neighboring if there are no other stones between them.
 * 
 *         Input The first line contains integer n (1 ≤ n ≤ 50) — the number of
 *         stones on the table.
 * 
 *         The next line contains string s, which represents the colors of the
 *         stones. We'll consider the stones in the row numbered from 1 to n
 *         from left to right. Then the i-th character s equals "R", if the i-th
 *         stone is red, "G", if it's green and "B", if it's blue.
 * 
 *         Output Print a single integer — the answer to the problem.
 * 
 *         Sample test(s) input 3 RRG output 1 input 5 RRRRR output 4 input 4
 *         BRBG output 0
 */

public class StonesOnTheTable {

	public int find(String s) {

		int count = 0;
		int n = 0;
		char old, c;
		old = ' ';

		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);

			if (c == old) {
				n++;
			} else {
				count += n;
				n = 0;
			}

			old = c;
		}

		if (n > 0) {
			count += n;
			n = 0;
		}

		return count;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StonesOnTheTable main = new StonesOnTheTable();

		int n = scanner.nextInt();
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

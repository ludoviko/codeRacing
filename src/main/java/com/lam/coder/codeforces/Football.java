package com.lam.coder.codeforces;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 
 * @author L.Azuaje
 * 
 *         A. Football time limit per test2 seconds memory limit per test256
 *         megabytes inputstandard input outputstandard output Petya loves
 *         football very much. One day, as he was watching a football match, he
 *         was writing the players' current positions on a piece of paper. To
 *         simplify the situation he depicted it as a string consisting of
 *         zeroes and ones. A zero corresponds to players of one team; a one
 *         corresponds to players of another team. If there are at least 7
 *         players of some team standing one after another, then the situation
 *         is considered dangerous. For example, the situation 00100110111111101
 *         is dangerous and 11110111011101 is not. You are given the current
 *         situation. Determine whether it is dangerous or not.
 * 
 *         Input The first input line contains a non-empty string consisting of
 *         characters "0" and "1", which represents players. The length of the
 *         string does not exceed 100 characters. There's at least one player
 *         from each team present on the field.
 * 
 *         Output Print "YES" if the situation is dangerous. Otherwise, print
 *         "NO".
 * 
 *         Sample test(s) input 001001 output NO input 1000000001 output YES
 * 
 *
 */
public class Football {
	public String find(String s) {
		char old = s.charAt(1);
		char c;
		int n = 1;

		for (int i = 1; i < s.length(); i++) {
			c = s.charAt(i);

			if (c == old) {
				n++;
				if (n >= 7) {
					return "YES";
				}
			} else {
				n = 1;
			}

			old = c;
		}

		return "NO";
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		Football main = new Football();

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

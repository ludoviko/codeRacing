package com.lam.coder.codeforces;

import java.io.*;

/**
 * 
 * @author LAzuaje
 * 
 *         A. Domino piling
 * 
 *         time limit per test2 seconds memory limit per test256 megabytes
 * 
 *         inputstandard input outputstandard output
 * 
 *         You are given a rectangular board of M × N squares. Also you are
 *         given an unlimited number of standard domino pieces of 2 × 1 squares.
 *         You are allowed to rotate the pieces. You are asked to place as many
 *         dominoes as possible on the board so as to meet the following
 *         conditions:
 * 
 *         1. Each domino completely covers two squares.
 * 
 *         2. No two dominoes overlap.
 * 
 *         3. Each domino lies entirely inside the board. It is allowed to touch
 *         the edges of the board.
 * 
 *         Find the maximum number of dominoes, which can be placed under these
 *         restrictions.
 * 
 *         Input In a single line you are given two integers M and N — board
 *         sizes in squares (1 ≤ M ≤ N ≤ 16).
 * 
 *         Output Output one number — the maximal number of dominoes, which can
 *         be placed.
 * 
 *         Sample test(s) input 2 4 output 4 input 3 3 output 4
 * 
 *
 *
 */

public class DominoPiling {

	public int find(int m, int n) {
		return (m * n) / 2;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		DominoPiling main = new DominoPiling();

		String[] string = scanner.next().split(" ");

		out.println(main.find(Integer.parseInt(string[0]),
				Integer.parseInt(string[1])));

		scanner.reader.close();
		out.close();
	}

	// -----------MyScanner class for faster input----------
	public static class MyScanner {
		BufferedReader reader;

		public MyScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public void close() throws IOException {
			reader.close();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			String str = "";
			try {
				str = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
}

package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje
 * 
 *         George has recently entered the BSUCP (Berland State University for
 *         Cool Programmers). George has a friend Alex who has also entered the
 *         university. Now they are moving into a dormitory.
 * 
 *         George and Alex want to live in the same room. The dormitory has n
 *         rooms in total. At the moment the i-th room has pi people living in
 *         it and the room can accommodate qi people in total (pi ≤ qi). Your
 *         task is to count how many rooms has free place for both George and
 *         Alex.
 * 
 *         Input The first line contains a single integer n (1 ≤ n ≤ 100) — the
 *         number of rooms.
 * 
 *         The i-th of the next n lines contains two integers pi and qi
 *         (0 ≤ pi ≤ qi ≤ 100) — the number of people who already live in the
 *         i-th room and the room's capacity.
 * 
 *         Output Print a single integer — the number of rooms where George and
 *         Alex can move in.
 * 
 *         Sample test(s) input 3 1 1 2 2 3 3 output 0 input 3 1 10 0 10 10 10
 *         output 2
 * 
 *
 */

public class GeorgeAndAccommodation {

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int n = scanner.nextInt();
		int c = 0;
		String[] data;

		for (int i = 0; i < n; i++) {
			data = scanner.next().split(" ");

			if (Integer.parseInt(data[1]) - Integer.parseInt(data[0]) >= 2) {
				c++;
			}
		}
		out.println(c);

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

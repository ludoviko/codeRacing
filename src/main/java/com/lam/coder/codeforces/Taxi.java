package com.lam.coder.codeforces;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * @author LAzuaje
 *
 *         B. Taxi
 * 
 *         time limit per test3 seconds memory limit per test256 megabytes
 * 
 *         inputstandard input outputstandard output
 * 
 *         After the lessons n groups of schoolchildren went outside and decided
 *         to visit Polycarpus to celebrate his birthday. We know that the i-th
 *         group consists of si friends (1 ≤ si ≤ 4), and they want to go to
 *         Polycarpus together. They decided to get there by taxi. Each car can
 *         carry at most four passengers. What minimum number of cars will the
 *         children need if all members of each group should ride in the same
 *         taxi (but one taxi can take more than one group)?
 * 
 *         Input The first line contains integer n (1 ≤ n ≤ 105) — the number of
 *         groups of schoolchildren. The second line contains a sequence of
 *         integers s1, s2, ..., sn (1 ≤ si ≤ 4). The integers are separated by
 *         a space, si is the number of children in the i-th group.
 * 
 *         Output Print the single number — the minimum number of taxis
 *         necessary to drive all children to Polycarpus.
 * 
 *         Sample test(s) input 5 1 2 4 3 3 output 4 input 8 2 3 4 4 2 1 3 1
 *         output 5 Note In the first test we can sort the children into four
 *         cars like this:
 * 
 *         the third group (consisting of four children), the fourth group
 *         (consisting of three children), the fifth group (consisting of three
 *         children), the first and the second group (consisting of one and two
 *         children, correspondingly). There are other ways to sort the groups
 *         into four cars.
 *
 */

public class Taxi {
	public static int CAPACITY = 4;

	// A better algorithm wanted, solution provided is rather hard coded, not scalable.
	public int find(Integer[] data) {
		int t = 0;
		int bag = 0;
		int bagOnes = 0;

		Arrays.sort(data, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		for (int i = 0; i < data.length; i++) {
			if (data[i] == CAPACITY) {
				t++;
			} else if (data[i] == 3) {
				bagOnes += 1;
				t++;
			} else if (data[i] == 2) {
				bag += 2;
				if (bag >= CAPACITY) {
					t++;
					bag -= CAPACITY;
				}
			} else if (data[i] == 1) {
				if (bagOnes > 0) {
					bagOnes--;
				} else {
					bag++;
				}
				if (bag >= CAPACITY) {
					t++;
					bag -= CAPACITY;
				}
			}
		}

		if (bag > 0) {
			t++;
		}

		return t;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		Taxi main = new Taxi();

		int n = scanner.nextInt();
		String[] data = scanner.next().split(" ");

		Integer[] array = new Integer[n];

		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(data[i]);
		}

		out.println(main.find(array));

		scanner.reader.close();
		out.close();
	}

	// -----------MyScanner class for faster input----------
	public static class MyScanner {
		BufferedReader reader;

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
				str = this.reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
}
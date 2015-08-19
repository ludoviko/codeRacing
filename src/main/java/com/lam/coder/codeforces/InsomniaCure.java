package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author L. Azuaje.
 * 
 *         «One dragon. Two dragon. Three dragon», — the princess was counting.
 *         She had trouble falling asleep, and she got bored of counting lambs
 *         when she was nine.
 * 
 *         However, just counting dragons was boring as well, so she entertained
 *         herself at best she could. Tonight she imagined that all dragons were
 *         here to steal her, and she was fighting them off. Every k-th dragon
 *         got punched in the face with a frying pan. Every l-th dragon got his
 *         tail shut into the balcony door. Every m-th dragon got his paws
 *         trampled with sharp heels. Finally, she threatened every n-th dragon
 *         to call her mom, and he withdrew in panic.
 * 
 *         How many imaginary dragons suffered moral or physical damage tonight,
 *         if the princess counted a total of d dragons?
 * 
 *         Input Input data contains integer numbers k, l, m, n and d, each
 *         number in a separate line (1 ≤ k, l, m, n ≤ 10, 1 ≤ d ≤ 105).
 * 
 *         Output Output the number of damaged dragons
 *
 */

public class InsomniaCure {

	public int find(int k, int l, int m, int n, int d) {

		if (k == 1 || l == 1 || m == 1 | n == 1) {
			return d;
		}

		Set<Integer> set = new HashSet<Integer>();

		set.addAll(this.findMultiples(k, d));
		set.addAll(this.findMultiples(l, d));
		set.addAll(this.findMultiples(m, d));
		set.addAll(this.findMultiples(n, d));

		return set.size();
	}

	private Set<Integer> findMultiples(int a, int d) {

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 1; i <= d / a; i++) {
			set.add(i * a);
		}

		return set;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		InsomniaCure main = new InsomniaCure();

		int k = scanner.nextInt();
		int l = scanner.nextInt();
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int d = scanner.nextInt();

		out.println(main.find(k, l, m, n, d));

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

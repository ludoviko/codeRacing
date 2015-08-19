package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author L.Azuaje.
 *
 *         Valera the Horse is going to the party with friends. He has been
 *         following the fashion trends for a while, and he knows that it is
 *         very popular to wear all horseshoes of different color. Valera has
 *         got four horseshoes left from the last year, but maybe some of them
 *         have the same color. In this case he needs to go to the store and buy
 *         some few more horseshoes, not to lose face in front of his stylish
 *         comrades.
 * 
 *         Fortunately, the store sells horseshoes of all colors under the sun
 *         and Valera has enough money to buy any four of them. However, in
 *         order to save the money, he would like to spend as little money as
 *         possible, so you need to help Valera and determine what is the
 *         minimum number of horseshoes he needs to buy to wear four horseshoes
 *         of different colors to a party.
 * 
 *         Input The first line contains four space-separated integers
 *         s1, s2, s3, s4 (1 ≤ s1, s2, s3, s4 ≤ 109) — the colors of horseshoes
 *         Valera has.
 * 
 *         Consider all possible colors indexed with integers.
 * 
 *         Output Print a single integer — the minimum number of horseshoes
 *         Valera needs to buy.
 * 
 *         Sample test(s) input 1 7 3 3 output 1 input 7 7 7 7 output 3
 * 
 */

public class IsYourHorseshoe {

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		String string = scanner.next();

		String[] data = string.split(" ");

		Set<String> set = new HashSet<String>();

		set.addAll(Arrays.asList(data));

		out.println(4 - set.size());

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

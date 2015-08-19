package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 * 
 *         Petya loves lucky numbers. We all know that
 *         lucky numbers are the positive integers whose decimal representations
 *         contain only the lucky digits 4 and 7. For example, numbers 47, 744,
 *         4 are lucky and 5, 17, 467 are not.
 * 
 *         Unfortunately, not all numbers are lucky. Petya calls a number nearly
 *         lucky if the number of lucky digits in it is a lucky number. He
 *         wonders whether number n is a nearly lucky number.
 * 
 *         Input The only line contains an integer n (1 ≤ n ≤ 1018).
 * 
 *         Please do not use the %lld specificator to read or write 64-bit
 *         numbers in С++. It is preferred to use the cin, cout streams or the
 *         %I64d specificator.
 * 
 *         Output Print on the single line "YES" if n is a nearly lucky number.
 *         Otherwise, print "NO" (without the quotes).
 * 
 *         Sample test(s) input 40047 output NO input 7747774 output YES input
 *         1000000000000000000 output NO Note In the first sample there are 3
 *         lucky digits (first one and last two), so the answer is "NO".
 * 
 *         In the second sample there are 7 lucky digits, 7 is lucky number, so
 *         the answer is "YES".
 * 
 *         In the third sample there are no lucky digits, so the answer is "NO".
 */

public class NearlyLuckyNumber {

	public String find(String s) {

		int c = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '7' || s.charAt(i) == '4') {
				c++;
			}
		}
		return (c == 7 || c == 4) ? "YES" : "NO";
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		NearlyLuckyNumber main = new NearlyLuckyNumber();

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

package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @Author L.Azuaje
 * 
 *         Little Petya loves presents. His mum bought him two strings of the
 *         same size for his birthday. The strings consist of uppercase and
 *         lowercase Latin letters. Now Petya wants to compare those two strings
 *         lexicographically. The letters' case does not matter, that is an
 *         uppercase letter is considered equivalent to the corresponding
 *         lowercase letter. Help Petya perform the comparison.
 * 
 *         Input Each of the first two lines contains a bought string. The
 *         strings' lengths range from 1 to 100 inclusive. It is guaranteed that
 *         the strings are of the same length and also consist of uppercase and
 *         lowercase Latin letters.
 * 
 *         Output If the first string is less than the second one, print "-1".
 *         If the second string is less than the first one, print "1". If the
 *         strings are equal, print "0". Note that the letters' case is not
 *         taken into consideration when the strings are compared.
 * 
 *         Sample test(s) input aaaa aaaA output 0 input abs Abz output -1 input
 *         abcdefg AbCdEfF output 1
 * 
 * 
 */

public class PetyaAndStrings {

	public int find(String s1, String s2) {
		return s1.compareToIgnoreCase(s2) > 0 ? 1
				: s1.compareToIgnoreCase(s2) < 0 ? -1 : 0;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();

		PrintStream out = System.out;

		PetyaAndStrings main = new PetyaAndStrings();

		String s1 = scanner.next();
		String s2 = scanner.next();

		out.println(main.find(s1, s2));

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

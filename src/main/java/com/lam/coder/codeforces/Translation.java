package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 *
 *         The translation from the Berland language into the Birland language
 *         is not an easy task. Those languages are very similar: a berlandish
 *         word differs from a birlandish word with the same meaning a little:
 *         it is spelled (and pronounced) reversely. For example, a Berlandish
 *         word code corresponds to a Birlandish word edoc. However, it's easy
 *         to make a mistake during the «translation». Vasya translated word s
 *         from Berlandish into Birlandish as t. Help him: find out if he
 *         translated the word correctly.
 * 
 *         Input The first line contains word s, the second line contains word
 *         t. The words consist of lowercase Latin letters. The input data do
 *         not consist unnecessary spaces. The words are not empty and their
 *         lengths do not exceed 100 symbols.
 * 
 *         Output If the word t is a word s, written reversely, print YES,
 *         otherwise print NO.
 * 
 *         Sample test(s) input code edoc output YES input abb aba output NO
 *         input code code output NO
 * 
 *
 */

public class Translation {

	public static String reverse(String word) {
		StringBuilder reverse = new StringBuilder();

		for (int i = 0; i < word.length(); i++) {
			reverse.append(word.charAt(word.length() - i - 1));
		}

		return reverse.toString();
	};

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		String string = scanner.next();
		String s2 = scanner.next();

		out.println(string.equals(reverse(s2)) ? "YES" : "NO");

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

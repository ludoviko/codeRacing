package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 *
 *         Capitalization is writing a word with its first letter as a capital
 *         letter. Your task is to capitalize the given word.
 * 
 *         Note, that during capitalization all the letters except the first one
 *         remains unchanged.
 * 
 *         Input A single line contains a non-empty word. This word consists of
 *         lowercase and uppercase English letters. The length of the word will
 *         not exceed 103.
 * 
 *         Output Output the given word after capitalization.
 * 
 *         Sample test(s) input ApPLe output ApPLe input konjac output Konjac
 */

public class WordCapitalization {

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		String string = scanner.next();

		out.println(string.substring(0, 1).toUpperCase() + string.substring(1));

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

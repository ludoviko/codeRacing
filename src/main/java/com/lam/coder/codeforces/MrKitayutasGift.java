package com.lam.coder.codeforces;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MrKitayutasGift {

	// Wrong answer on test seven.
	
	public String find(String string) {
		String vowel = "a";
		String na = "NA";

		if (isPalindrome(string)) {
			if (string.length() % 2 == 0) {
				string = string.substring(0, string.length() / 2) + vowel
						+ string.substring(string.length() / 2);
				
				return string;
			} else {
				string = string.substring(0, string.length() / 2)
						+ string.charAt(string.length() / 2)
						+ string.substring(string.length() / 2);
				return string;
			}
		}

		if (string.length() % 2 == 0) {
			// even
			StringBuilder builder = new StringBuilder(string.substring(0,
					string.length() / 2));
			builder = builder.reverse();
			String rev = builder.toString();
			String tail = string.substring(string.length() / 2 + 1);

			if (rev.indexOf(tail) >= 0 ) {
				string = string + string.charAt(0);
			} else {
				string = na;
			}
		} else {
			// odd
			StringBuilder builder = new StringBuilder(string.substring(0,
					string.length() / 2 + 1));
			builder = builder.reverse();
			String rev = builder.toString();
			String tail = string.substring(string.length() / 2 + 1);

			if (rev.indexOf(tail) >= 0 ) {
				string = string + string.charAt(0);
			} else {
				string = na;
			}
		}

		return string;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		MrKitayutasGift main = new MrKitayutasGift();

		String string = scanner.next();

		out.println(main.find(string));

		scanner.reader.close();
		out.close();
	}

	public static boolean isPalindrome(String string) {
		boolean isPalindrome = true;

		if (string == null) {
			return true;
		}

		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
			} else {
				isPalindrome = false;
				break;
			}
		}

		return isPalindrome;
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
				str = this.reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
}

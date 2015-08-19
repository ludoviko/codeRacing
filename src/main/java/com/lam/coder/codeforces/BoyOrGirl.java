package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author L.Azuaje.
 *
 *         Those days, many boys use beautiful girls' photos as avatars in
 *         forums. So it is pretty hard to tell the gender of a user at the
 *         first glance. Last year, our hero went to a forum and had a nice chat
 *         with a beauty (he thought so). After that they talked very often and
 *         eventually they became a couple in the network.
 * 
 *         But yesterday, he came to see "her" in the real world and found out
 *         "she" is actually a very strong man! Our hero is very sad and he is
 *         too tired to love again now. So he came up with a way to recognize
 *         users' genders by their user names.
 * 
 *         This is his method: if the number of distinct characters in one's
 *         user name is odd, then he is a male, otherwise she is a female. You
 *         are given the string that denotes the user name, please help our hero
 *         to determine the gender of this user by his method.
 * 
 *         Input The first line contains a non-empty string, that contains only
 *         lowercase English letters — the user name. This string contains at
 *         most 100 letters.
 * 
 *         Output If it is a female by our hero's method, print "CHAT WITH HER!"
 *         (without the quotes), otherwise, print "IGNORE HIM!" (without the
 *         quotes).
 * 
 *         Sample test(s) input wjmzbmr output CHAT WITH HER! input xiaodao
 *         output IGNORE HIM! input sevenkplus output CHAT WITH HER!
 */

public class BoyOrGirl {

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		String string = scanner.next();

		char[] data = string.toCharArray();

		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < data.length; i++) {
			set.add(new Character(data[i]));
		}

		out.println(set.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");

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

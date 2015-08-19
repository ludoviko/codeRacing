package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 *
 *         Vasya has recently learned to type and log on to the Internet. He
 *         immediately entered a chat room and decided to say hello to
 *         everybody. Vasya typed the word s. It is considered that Vasya
 *         managed to say hello if several letters can be deleted from the typed
 *         word so that it resulted in the word "hello". For example, if Vasya
 *         types the word "ahhellllloou", it will be considered that he said
 *         hello, and if he types "hlelo", it will be considered that Vasya got
 *         misunderstood and he didn't manage to say hello. Determine whether
 *         Vasya managed to say hello by the given word s.
 * 
 *         Input The first and only line contains the word s, which Vasya typed.
 *         This word consisits of small Latin letters, its length is no less
 *         that 1 and no more than 100 letters.
 * 
 *         Output If Vasya managed to say hello, print "YES", otherwise print
 *         "NO".
 * 
 *         Sample test(s) input ahhellllloou output YES input hlelo output NO
 */

public class ChatRoom {

	public String find(String string) {

		int i = 0;
		String a = "";

		while (i < string.length()) {
			if (i < string.length() && string.charAt(i) == 'h') {
				a += "h";
				i++;
				while (i < string.length() && string.charAt(i) != 'e') {
					i++;
				}
				if (i < string.length() && string.charAt(i) == 'e') {
					a += "e";
					i++;
					while (i < string.length() && string.charAt(i) != 'l') {
						i++;
					}
					if (i < string.length() && string.charAt(i) == 'l') {
						a += "l";
						i++;
						while (i < string.length() && string.charAt(i) != 'l') {
							i++;
						}
						if (i < string.length() && string.charAt(i) == 'l') {
							a += "l";
							i++;
							while (i < string.length()
									&& string.charAt(i) != 'o') {
								i++;
							}
							if (i < string.length() && string.charAt(i) == 'o') {
								a += "o";
								i++;
							}
						}
					}
				}
			}
			i++;
		}

		return a.contains("hello") ? "YES" : "NO";
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		ChatRoom main = new ChatRoom();

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

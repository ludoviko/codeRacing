package com.lam.coder.codeforces;

import java.io.*;

/**
 * 
 * @author LAzuaje
 * 
 *         A. String Task time limit per test2 seconds memory limit per test256
 *         megabytes inputstandard input outputstandard output Petya started to
 *         attend programming lessons. On the first lesson his task was to write
 *         a simple program. The program was supposed to do the following: in
 *         the given string, consisting if uppercase and lowercase Latin
 *         letters, it:
 * 
 *         deletes all the vowels, inserts a character "." before each
 *         consonant, replaces all uppercase consonants with corresponding
 *         lowercase ones. Vowels are letters "A", "O", "Y", "E", "U", "I", and
 *         the rest are consonants. The program's input is exactly one string,
 *         it should return the output as a single string, resulting after the
 *         program's processing the initial string.
 * 
 *         Help Petya cope with this easy task.
 * 
 *         Input The first line represents input string of Petya's program. This
 *         string only consists of uppercase and lowercase Latin letters and its
 *         length is from 1 to 100, inclusive.
 * 
 *         Output Print the resulting string. It is guaranteed that this string
 *         is not empty.
 * 
 *         Sample test(s) input tour output .t.r input Codeforces output
 *         .c.d.f.r.c.s input aBAcAba output .b.c.b
 * 
 */

public class StringTask {
	public String transform(String string) {
		StringBuilder out = new StringBuilder();
		String dot = ".";

		string = string.toLowerCase().replaceAll("[aeiouy]", "");

		for (int i = 0; i < string.length(); i++) {
			out.append(dot);
			out.append(string.charAt(i));
		}

		return out.toString();
	}

	public static void main(String[] args) throws IOException {
		StringTask task = new StringTask();
		MyScanner scanner = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		String string = scanner.next();

		out.println(task.transform(string));

		scanner.reader.close();
		out.close();
	}

	// -----------MyScanner class for faster input----------
	public static class MyScanner {
		BufferedReader reader;

		public MyScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public void close() throws IOException {
			reader.close();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			String str = "";
			try {
				str = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
}

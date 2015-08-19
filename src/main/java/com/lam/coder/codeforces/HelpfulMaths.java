package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * 
 * @author L.Azuaje
 *
 *         Xenia the beginner mathematician is a third year student at
 *         elementary school. She is now learning the addition operation.
 * 
 *         The teacher has written down the sum of multiple numbers. Pupils
 *         should calculate the sum. To make the calculation easier, the sum
 *         only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia.
 *         She is only beginning to count, so she can calculate a sum only if
 *         the summands follow in non-decreasing order. For example, she can't
 *         calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.
 * 
 *         You've got the sum that was written on the board. Rearrange the
 *         summans and print the sum in such a way that Xenia can calculate the
 *         sum.
 * 
 *         Input The first line contains a non-empty string s — the sum Xenia
 *         needs to count. String s contains no spaces. It only contains digits
 *         and characters "+". Besides, string s is a correct sum of numbers 1,
 *         2 and 3. String s is at most 100 characters long.
 * 
 *         Output Print the new sum that Xenia can count.
 * 
 *         Sample test(s) input 3+2+1 output 1+2+3 input 1+1+3+1+3 output
 *         1+1+1+3+3 input 2 output 2
 */

public class HelpfulMaths {
	public String find(String string) {
		String[] data = string.split("\\+");

		Arrays.sort(data);

		String answer = "";

		for (String s : data) {
			answer += s + "+";
		}

		return answer.substring(0, answer.length() - 1);
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		HelpfulMaths main = new HelpfulMaths();

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

package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class LinelandMail {

	public String find(int i, long[] array) {
		long min = 1000000000;
		long max = 0;
        long r  = 0;
		
		for (int j = 0; j < array.length; j++) {
			if (i == j) {
				continue;
			}
			r = Math.abs(array[i] - array[j]);

			min = Math.min(min, r);
			max = Math.max(max, r);
		}

		return min + " " + max;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		LinelandMail main = new LinelandMail();

		int n = scanner.nextInt();
		String string = scanner.next();

		String[] data = string.split(" ");

		long[] array = new long[n];

		int i = 0;
		for (String s : data) {
			array[i++] = Long.parseLong(s);
		}

		
		for (i = 0; i < n; i++) {
			out.println(main.find(i, array));
		}

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

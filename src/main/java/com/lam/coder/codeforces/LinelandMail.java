package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LinelandMail {

	public String find(int i, Long[] array) {
		long min = Long.MAX_VALUE;
		long max = 0;

        Long from = array[i];

        int j = 0;
        for (Long data: array) {
            if (i == j++) {
                continue;
            }

            if ( Math.abs(data -from) >= max) {
                max = Math.abs(data -from);
            }
            if ( Math.abs(data -from) <= min) {
                min = Math.abs(data -from);
            }
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

		Long[] array = new Long[n];

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

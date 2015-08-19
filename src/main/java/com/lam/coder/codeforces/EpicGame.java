package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class EpicGame {

	public String find(int a, int b, int n) {
		String s = "";
		
		while (true) {
			n -= findGCD(a, n);
			if (n == 0  ) {
				s = "0";
				break;
			}
			n -= findGCD(b, n);
			if (n == 0  ) {
				s = "1";
				break;
			}
		}
		return s;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		EpicGame main = new EpicGame();

		String[] string = scanner.next().split(" ");

		out.println(main.find(Integer.parseInt(string[0]), Integer.parseInt(string[1]), Integer.parseInt(string[2])));

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

	public static int findGCD(int a, int b) {
		if (a == 0 || b == 0 && (a != b)) {
			return a + b;
		}

		return findGCD(b, a % b);
	}
}

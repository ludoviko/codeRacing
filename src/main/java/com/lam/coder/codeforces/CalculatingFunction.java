package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigInteger;

/**
 * 
 * @author L.Azuaje.
 *
 *         For a positive integer n let's define a function f:
 * 
 *         f(n) =  - 1 + 2 - 3 + .. + ( - 1)^n*n
 * 
 *         Your task is to calculate f(n) for a given integer n.
 * 
 *         Input The single line contains the positive integer n (1 ≤ n ≤ 1015).
 * 
 *         Output Print f(n) in a single line.
 *         
 */

public class CalculatingFunction {

	public BigInteger find(BigInteger n) {
		BigInteger s = BigInteger.ZERO;

		if (n.mod(new BigInteger("2")).compareTo(BigInteger.ZERO) == 0) {
			s = n.divide(new BigInteger("2"));
		} else {
			n = n.add(BigInteger.ONE);
			s = n.divide(new BigInteger("2"));
			s = s.multiply(new BigInteger("-1"));
		}

		return s;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		CalculatingFunction main = new CalculatingFunction();

		String n = scanner.next();

		out.println(main.find(new BigInteger(n)));

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

package com.lam.coder.urioj;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class ThreebonacciSequence {
	private long[]	fibonacci;
	private int		n;

	public ThreebonacciSequence() {
	}

	public ThreebonacciSequence(int n) {
		this.reset(n);
	}

	public void reset(int n) {
		this.n = n;
		this.fibonacci = new long[n + 1];

		Arrays.fill(this.fibonacci, -1);

		this.fibonacci[0] = 0;
		this.fibonacci[1] = 1;
	}

	public long find() {
		return this.calculate(this.n);
	}

	private long calculate(int n) {
		if (this.fibonacci[n] != -1) {
			return this.fibonacci[n];
		}
		this.fibonacci[n] = this.calculate(n - 1) + this.calculate(n - 2);

		return this.fibonacci[n];
	}

	public long[] getFibonacci() {
		return this.fibonacci;
	}

	public static void main(String[] strings) throws IOException {
		ThreebonacciSequence fibonacci = new ThreebonacciSequence(90);
		fibonacci.find();

		long[] fib = fibonacci.getFibonacci();

		long[] data = new long[60];
		int i = 0;

		for (long f : fib) {
			if (f % 3 == 0 || ThreebonacciSequence.containsThree(f)) {
				data[i++] = f;
			}
		}

		MyScanner scanner = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		new Main();

		int n = scanner.nextInt();

		out.println(data[n]);

		scanner.reader.close();
		out.close();
	}

	public static boolean containsThree(long n) {
		long digit = 0;
		while (n > 0) {
			digit = n % 10;
			n /= 10;
			if (digit == 3) {
				return true;
			}
		}

		return false;
	}


	public static class MyScanner {
		BufferedReader reader;

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

package com.lam.coder.rosalind;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ComplementingDNA {
	public static final char A = 'A';
	public static final char C = 'C';
	public static final char G = 'G';
	public static final char T = 'T';

	public String getComplement(String chain) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < chain.length(); i++) {
			switch (chain.charAt(i)) {
			case A:
				builder.append(T);
				break;
			case C:
				builder.append(G);
				break;
			case G:
				builder.append(C);
				break;
			case T:
				builder.append(A);
				break;
			default:
				break;
			}
		}
		return builder.reverse().toString();
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		ComplementingDNA main = new ComplementingDNA();
		
		String string = scanner.next();

		out.println(main.getComplement(string));

		scanner.reader.close();
		out.close();
	}

	// -----------MyScanner class for faster input----------
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


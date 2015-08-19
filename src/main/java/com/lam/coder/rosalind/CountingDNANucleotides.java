package com.lam.coder.rosalind;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CountingDNANucleotides {

	public String count(String string) {
		int a = 0;
		int c = 0;
		int g = 0;
		int t = 0;
		
		for (int i = 0; i < string.length(); i++) {
		  	switch (string.charAt(i)) {
				case 'A':
					a++;
					break;
				case 'C':
					c++;
					break;

				case 'G':
					g++;
					break;

				case 'T':
					t++;
					break;
				default:
					break;
			}
		}
		
		return a + " " + c + " " + g + " " + t;
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		CountingDNANucleotides main = new CountingDNANucleotides();
		
		String string = scanner.next();

		out.println(main.count(string));

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
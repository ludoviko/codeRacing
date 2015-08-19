package com.lam.coder.codeforces;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ChewbaAndTheNumber {
	
	public String find(String string) {
		char[] data = string.toCharArray();
		char min  = data[0];
		
		for (int i = 0; i < data.length; i++) {
			if ( data[i] == '0' ) {
				continue;
			}
			min = data[i] < min ? data[i] : min;
		}

		for (int i = 0; i < data.length; i++) {
			if ( data[i] == '0' ) {
				continue;
			}
			data[i] = data[i] > min ? min : data[i];
		}
		
		
		return new String(data);
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		ChewbaAndTheNumber main = new ChewbaAndTheNumber();
		
		String string = scanner.next();

		out.println(main.find(string));

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
				str = this.reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
}


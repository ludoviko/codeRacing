package com.lam.coder.rosalind;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputingGCContent {

	public BigDecimal find(String string) {
		BigInteger c = BigInteger.ZERO;
		BigInteger g = BigInteger.ZERO;
		BigInteger cg = BigInteger.ZERO;

		char aChar;

		for (int i = 0; i < string.length(); i++) {
			aChar = string.charAt(i);
			if (aChar == 'G') {
				g = g.add(BigInteger.ONE);
			} else if (aChar == 'C') {
				c = c.add(BigInteger.ONE);
			}
		}

		cg = cg.add(c);
		cg = cg.add(g);

		BigDecimal decimal = new BigDecimal(cg);

		decimal = decimal.multiply(new BigDecimal(new BigInteger("100")));

		decimal = decimal.divide(new BigDecimal(string.length()), 6,
				RoundingMode.DOWN);

		return decimal;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		ComputingGCContent main = new ComputingGCContent();

		String line = scanner.next();
		String header = line;
		String nucleotides = "";

		List<String> list = new ArrayList<String>(); 
		
		while (!line.equals("")) {
			if (line.startsWith(">")) {
				if (  nucleotides.length() > 0) {
					list.add(main.find(nucleotides) + "/" + header );
					header = line;
					nucleotides = "";
				}
			} else {
				nucleotides += line;
			}
			line = scanner.next();
		}

		if ( nucleotides.length() > 0 ) {
			list.add(main.find(nucleotides) + "/" + header );
		}

		Collections.sort(list);
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println();
		System.out.println(list.get(list.size() -1));
		
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

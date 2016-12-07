package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem:  454A	    Little Pony and Crystal Mine  .
 *
 * Used at Codeforces: #259 Div-2.
 *
 */

public class LittlePonyAndCrystalMine {
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		LittlePonyAndCrystalMine main = new LittlePonyAndCrystalMine();
		
		int n = scanner.nextInt();
		String d = "";
		String stars = "";

        for (int i = 1; i <= n; i = i + 2) {
            d = repeat('D',i );
            stars = repeat('*', (n - i)/2);
            out.format("%s%s%s%n", stars, d, stars);

        }

        for (int i = n - 2; i > 0; i = i - 2) {
            d = repeat('D',i );
            stars = repeat('*', (n - i)/2);
            out.format("%s%s%s%n", stars, d, stars);
        }

		scanner.close();
		out.close();
	}

	public static String repeat(char c, int n ) {
	    String d = "";
        for (int i = 0; i < n; i++) {
            d += c;
        }
        return d;
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

		int[] nextIntArray() {
			String[] data  = nextStringArray();
			int[] a  = new int[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(data[i]);
			}

			return a;
		}

		Integer[] nextIntegerArray() {
			String[] data  = nextStringArray();
			Integer[] a  = new Integer[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(data[i]);
			}

			return a;
		}

		long[] nextLongArray() {
			String[] data  = nextStringArray();
			long[] a  = new long[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Long.parseLong(data[i]);
			}

			return a;
		}
	}
}


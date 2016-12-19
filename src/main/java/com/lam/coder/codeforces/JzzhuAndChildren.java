package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: 450A   Jzzhu and Children.
 *
 * Used at Codeforces: #257 Div-2.
 *
 */

public class JzzhuAndChildren {
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

        int[] data1 = scanner.nextIntArray();
        int[] data2 = scanner.nextIntArray();
        int n = data1[1];
        int max = Integer.MIN_VALUE;

        int i = 0;
        int last = -1;
        while (true) {
            data2[i] -= n;
            if ( data2[i] > 0 ) {
                last = i;
            } else {
            }
            i++;
            if (i == data2.length) {
                i = 0;
                if (last == -1) {
                    last = data2.length - 1;
                    break;
                }
                if ( data2[last] <= 0 ) {
                    break;
                }
            }
        }

		out.println(last + 1);

		scanner.close();
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


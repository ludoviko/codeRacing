package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: 746B Decoding.
 *
 * Used at Codeforces: #386 Div-2.
 *
 */

public class Decoding {
	public static String decode(String string) {
	    String decode = "";

        char[] data = null;
        int middle = -1;

	    if (string.length() < 3) {
	        return string;
        }

	    if (string.length() % 2 == 0) {
            middle = string.length() / 2 - 1;
            data = new char[string.length()];

            for (int i = 0; i < string.length(); i++) {
                if (i % 2 == 0) {
                    middle -= i;
                    data[middle] = string.charAt(i);
                } else {
                    middle += i;
                    data[middle] = string.charAt(i);
                }
            }
            decode = String.valueOf(data);
        } else {
            middle = string.length() / 2;
            data = new char[string.length()];

            for (int i = 0; i < string.length(); i++) {
                if (i % 2 == 0) {
                    middle += i;
                    data[middle] = string.charAt(i);
                } else {
                    middle -= i;
                    data[middle] = string.charAt(i);
                }
            }
            decode = String.valueOf(data);
        }

	    return decode;
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

        int n  = scanner.nextInt();
        String string = scanner.next();

		out.println(Decoding.decode(string));

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


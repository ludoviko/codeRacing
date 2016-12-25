package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: 680A  Bear and Five Cards.
 *
 * Used at Codeforces: #356 Div-2.
 *
 */

public class BearAndFiveCards {
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		BearAndFiveCards main = new BearAndFiveCards();

		int n = 101;
		int[] histogram = new int[n];
        int[] data = scanner.nextIntArray();
        int sum = 0;

        for (int i = 0; i < data.length; i++) {
                histogram[data[i]]++;
                sum += data[i];
        }

        int twiceIndex = -1;
        int twiceIndex2= -1;
        int thriceIndex = -1;

        int twiceValue = 0;
        int twiceValue2 = 0;
        int thriceValue = 0;

        for (int i = 1; i < n; i++) {
            if ( histogram[i] == 2 ) {
                if ( twiceIndex == -1 ) {
                    twiceIndex = i;
                }  else {
                    twiceIndex2 = i;
                }
            } else if ( histogram[i] >= 3 ) {
                thriceIndex = i;
            }
        }

        twiceValue = twiceIndex * 2;
        twiceValue2 = twiceIndex2 * 2;
        thriceValue = thriceIndex * 3;

        int max = Math.max( Math.max(twiceValue, twiceValue2), thriceValue );

        if (max > 0) {
            out.println(sum-max);
        } else {
            out.println(sum);
        }

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


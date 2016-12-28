package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: 496A  Minimum Difficulty.
 *
 * Used at Codeforces: #283 Div-2 .
 *
 */

public class MinimumDifficulty {

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int n = scanner.nextInt();
        int[] data = scanner.nextIntArray();
        int j1 = 1;
        int j2 = data.length - 1;
        int[] subData = new int[data.length-1];
        int si = 0;
        int min = Integer.MAX_VALUE;
        int i_max = -1;

        for (int j = j1; j < j2; j++) {
            for (int i = 0; i < data.length; i++) {
                if (i == j) {
                    continue;
                } else {
                    subData[si++] = data[i];
                }
            }
            // Find maximum.
            i_max = findMax(subData);
            if (i_max < min) {
                min = i_max;
            }
            si = 0;
            Arrays.fill(subData, 0);
        }

		out.println(min);

		scanner.close();
		out.close();
	}

	private static int findMax(int[] data) {
	    int max = -1;

        for (int i = 1; i < data.length; i++) {
            if (data[i] - data[i-1] > max) {
                max = data[i] - data[i-1];
            }
        }

        return max;
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


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
 * Problem:  GukiZ And Contest.
 *
 * Codeforces: 551A	  #307 Div-2.
 *
 */

public class GukiZAndContest {
	
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int len = scanner.nextInt();
        int[] data = scanner.nextIntArray();
        int[] sorted = new int[len];

        System.arraycopy(data, 0, sorted, 0, len);

        Arrays.sort(sorted);

        int index = -1;
        int position = -1;

        for (int i = 0; i < data.length; i++) {
            index = searchIndex(sorted, data[i]);
            position =  len - index;
            out.format("%d ", position);
        }

		scanner.close();
		out.close();
	}


    private static int searchIndex(int[] sorted, int x) {
        int index = -1;

        for (int i = 0; i < sorted.length &&  x >= sorted[i]; i++) {
            index = i;
        }

        return index;
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


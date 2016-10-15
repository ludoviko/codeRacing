package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Solution by: L.Azuaje.
 *
 * Codeforces: 583A, Round  #323 Div 2, Asphalting Roads.
 *
 */

public class AsphaltingRoads {
	
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int n = scanner.nextInt();
        n = n * n;

        List<Integer> horizontal = new ArrayList<Integer>();
        List<Integer> vertical = new ArrayList<Integer>();
        List<Integer> days = new ArrayList<Integer>();

        Integer[] data;

        data = scanner.nextIntegerArray();
        days.add(1);
        horizontal.add(data[0]);
        vertical.add(data[1]);

        for (int i = 2; i <= n; i++) {
            data = scanner.nextIntegerArray();
            if ( ! horizontal.contains(data[0]) && ! vertical.contains(data[1])) {
                days.add(i);
                horizontal.add(data[0]);
                vertical.add(data[1]);
            }
        }

        for (Integer d : days) {
            out.format("%d ", d);
        }

		out.println();

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


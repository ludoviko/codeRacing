package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: 706B	  #367 Div-2              Interesting drink.
 *
 * Used at Codeforces:  #367 Div-2 .
 *
 */

public class InterestingDrink706B {
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int n = scanner.nextInt();

        int[] data = scanner.nextIntArray();

        Arrays.sort(data);
        int m = scanner.nextInt();
        int index = 0;
        int c = 0;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int x = 0;
        for (int i = 0; i < m; i++) {
            x = scanner.nextInt();
            index = Arrays.binarySearch(data, x);

            if (map.containsKey(x)) {
                out.println(map.get(x));
            } else {
                if (index < 0) {
                    if (x < data[0]) {
                        out.println(0);
                        map.put(x, 0);
                    } else {
                        out.println(Math.abs(index) - 1);
                        map.put(x, Math.abs(index) - 1);
                    }
                } else {
                    c = 0;
                    while ( (index + c + 1) < data.length && data[index] == data[index + c + 1] ) {
                        c++;
                    }
                    out.println(index + 1 + c);
                    map.put(x, index + 1 + c);
                }
            }
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


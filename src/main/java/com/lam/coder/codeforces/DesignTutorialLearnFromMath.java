package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author 
 *
 * 472A	Design Tutorial: Learn from Math.
 *
 */

public class DesignTutorialLearnFromMath {
	
	public static int[] find(int a) {
        int[] data = new int[2];
        int k3 = 0;
        int k2 = 0;
        int i = 1;

        if ( a % 2 == 0) {
            data[0] = a/2;
            data[1] = a/2;
            if ( data[0] % 2 != 0 ) {
                data[0] = a/2 + 1;
                data[1] = a/2 - 1;
            }
        } else {
                while ( k3 % 2 == 0 ) {
                    k3 = a / 3 - i++;
                }
                k2 = a - k3 * 3;

                data[0] = k2;
                data[1] = k3 *3;
        }
        return data;
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		DesignTutorialLearnFromMath main = new DesignTutorialLearnFromMath();
		
		int n = scanner.nextInt();

        int[] data = find(n);

		out.format("%d %d", data[0], data[1]);

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


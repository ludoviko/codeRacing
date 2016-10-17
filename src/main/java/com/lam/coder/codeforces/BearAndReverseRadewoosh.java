package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author 
 *
 *
 *
 */

public class BearAndReverseRadewoosh {
	
	public String  find(int[] points, int times[], int losingFactor) {
        String limak = "Limak";
        String radewoosh = "Radewoosh";
        String tie = "Tie";

        int lim = 0;
        int rad = 0;
        int t;

        t = 0;
        for (int i = 0; i < points.length ; i++) {
            t += times[i];
            if (t * losingFactor > points[i]) {
            } else {
                lim += points[i] - t * losingFactor;
            }
        }

        t = 0;
        for (int i = points.length - 1; i > 0 ; i--) {
            t += times[i];
            if (t * losingFactor > points[i]) {
            } else {
                rad += points[i] - t * losingFactor;
            }
        }

        return lim > rad ? limak : lim < rad ? radewoosh : tie;
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		BearAndReverseRadewoosh main = new BearAndReverseRadewoosh();
		
        int[] data  = scanner.nextIntArray();
        int[] points = scanner.nextIntArray();
        int[] times = scanner.nextIntArray();

		out.println(main.find(points, times, data[1]));

		scanner.reader.close();
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


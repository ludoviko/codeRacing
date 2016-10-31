package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: 489B  BerSU Ball .
 *
 * Used at Codeforces: #277.5 Div-2.
 *
 */

public class BerSUBall {
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		BerSUBall main = new BerSUBall();
		
		int m = scanner.nextInt();
        int[] men = scanner.nextIntArray();
        int w = scanner.nextInt();
        int[] women = scanner.nextIntArray();

        List<Integer> listWomen = new ArrayList<Integer>();

        for (int woman  : women) {
            listWomen.add(new Integer(woman));
        }

        Arrays.sort(men);
        Collections.sort(listWomen);
        int count = 0;

        int index = -1;
        for (int i = 0; i < men.length; i++) {
            index = Collections.binarySearch(listWomen, men[i] - 1);
            if (index < 0) {
                index = Collections.binarySearch(listWomen, men[i]);
                 if (index < 0) {
                     index = Collections.binarySearch(listWomen, men[i] + 1);
                     if (index < 0) {
                     } else {
                         listWomen.remove(index);
                         count++;
                     }
                } else {
                     listWomen.remove(index);
                     count++;
                }
            } else  {
                listWomen.remove(index);
                count++;
            }
        }

		out.println(count);

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


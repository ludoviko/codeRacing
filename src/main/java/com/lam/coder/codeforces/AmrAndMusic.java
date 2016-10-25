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
 * Problem: 507A Amr and Music.
 *
 * Used at Codeforces: #287 Div-2.
 *
 */

public class AmrAndMusic {
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

        int[] data0 = scanner.nextIntArray();
        int instruments = data0[0];
        int days = data0[1];
        
        int[] data = scanner.nextIntArray();
        int[] clone = new int[instruments];
        System.arraycopy(data, 0, clone, 0, instruments);

        Arrays.sort(clone);

        int[] values = new int[instruments];
        int count = 0;
        int sum = 0;
        for (int i = 0; i < clone.length; i++) {
            sum += clone[i];
            if (sum > days) {
                break;
            } else {
                values[count++] = clone[i];
            }
        }

        int index = -1;

        out.println(count);
        if (count > 0) {
            for (int i = 0; i < values.length ; i++) {
                index = findIndex(data, values[i]);
                if (index != -1) {
                    out.format("%d ", index + 1);
                    data[index] = -1;
                }
            }
        }

		scanner.close();
		out.close();
	}

    private static int findIndex(int[] data,int value) {
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                index = i;
                break;
            }
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


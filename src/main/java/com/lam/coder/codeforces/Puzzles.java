package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * 
 * @author: Solution by L.Azuaje.
 *
 * 337A	    Puzzles
 *
 */

public class Puzzles {
    private int[] array;
    private int n;

    public Puzzles(int n, int[] array) {
        this.array = array;
        this.n = n;
    }

    public Puzzles() {
    }

    public void setArray(int[] array) {
      this.array = array;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int find() {
        Arrays.sort(array);

        int min = array[array.length-1] - array[0];

        for (int i = 0; i  < array.length - (n-1); i++ ) {
            if  ( dif(i, i + n - 1)  < min )  {
                min = dif(i, i + n - 1);
            }
        }

     return min;
	}

    private int dif(int from, int  upTo) {
        int dif = this.array[upTo] - this.array[from];
        return dif;
    }
	
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int[] data  = scanner.nextIntArray();
        int[] array  = scanner.nextIntArray();

        Puzzles main = new Puzzles(data[0], array);

		out.println(main.find());

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


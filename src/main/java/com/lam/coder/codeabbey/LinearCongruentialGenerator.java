package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 *
 *
 * Linear Congruential Generator
 *
 * Xnext = (A * Xcur + C) % M
 *
 *
 */

public class LinearCongruentialGenerator {
    private final long A;
    private final long X0;
    private final long C;
    private final long M;
    private long next;

    public LinearCongruentialGenerator(long a, long c, long m, long x0) {
        this.A = a;
        this.X0 = x0;
        this.next = x0;
        this.C = c;
        this.M = m;
    }

	public void findNext() {
        next = (this.A * next +this.C) % this.M;
    }

    public long findNext(long n) {
        for (int i = 0; i < n; i++) {
            findNext();
        }
        return this.next;
    }

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		LinearCongruentialGenerator main;
		int[] data;
		
		int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            data = scanner.nextIntArray();
            main = new LinearCongruentialGenerator(data[0], data[1], data[2], data[3] );
            out.format("%d ", main.findNext(data[4]));
        }

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

          float[] nextFloatArray() {
            String[] data  = nextStringArray();
            float[] a  = new float[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Float.parseFloat(data[i]);
            }

            return a;
        }

        double[] nextDoubleArray() {
            String[] data  = nextStringArray();
            double[] a  = new double[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Double.parseDouble(data[i]);
            }

            return a;
        }
    }
}


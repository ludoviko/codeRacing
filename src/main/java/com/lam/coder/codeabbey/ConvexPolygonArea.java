package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Locale;

/**
 * 
 * @author : L.Azuaje.
 *
 * Find the area of a convex polygon using the Heron's formula.
 *
 */

public class ConvexPolygonArea {
    public static double findDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt( (x1 - x2)*(x1 - x2) + (y1-y2)*(y1-y2) );
    }

    public static double findArea(double a, double b, double c) {
        double k = (a + b + c)/2;
        return Math.sqrt( k * (k-a) * (k-b) * (k-c));
    }

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int n = scanner.nextInt();
		int m = 0;
		double area = 0;

		// m: number of triangles.
		if (n > 3) {
		    m = n - 2;
        }

        String[] data  = new String[n];

        for (int i = 0; i < n; i++) {
            data[i] = scanner.next();
        }

        double a, b, c;

        for (int i = 1; i < n - 1; i++) {
            a = findDistance(Integer.parseInt(data[0].split(" ")[0]), Integer.parseInt(data[0].split(" ")[1]),
                    Integer.parseInt(data[i].split(" ")[0]), Integer.parseInt(data[i].split(" ")[1]));

            b = findDistance(Integer.parseInt(data[0].split(" ")[0]), Integer.parseInt(data[0].split(" ")[1]),
                    Integer.parseInt(data[i+1].split(" ")[0]), Integer.parseInt(data[i+1].split(" ")[1]));

            c = findDistance(Integer.parseInt(data[i].split(" ")[0]), Integer.parseInt(data[i].split(" ")[1]),
                    Integer.parseInt(data[i+1].split(" ")[0]), Integer.parseInt(data[i+1].split(" ")[1]));

            area += findArea(a, b, c);
        }

        out.format(Locale.US, "%f ", area);

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


package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Locale;

/**
 * 
 * @author L.Azuaje.
 *
 *  Square Root                  Heron's method.
 *
 */

public class SquareRoot {
    public static final double POWER_10 = Math.pow(10, 8);
    public static final double PRECISION = 1.0 / POWER_10;
    public static final double FIRST_APPROXIMATION = 1.0;
    private double n;
    private int steps;
    private double solution;

    public SquareRoot(double n, int steps) {
        this.n = n;
        this.steps = steps;
        this.solution = FIRST_APPROXIMATION;
    }

    public double getSolution() {
        return this.solution;
    }

	public void calculate() {
        double squareRoot = 0.0;

        for (int i = 0; i < this.steps; i++) {
            squareRoot = this.n / this.solution;
            if (Math.abs(squareRoot - solution) < PRECISION) {
                break;
            }
            this.solution = (this.solution + squareRoot)/2;
        }
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		SquareRoot main;
		
		int n = scanner.nextInt();
		int[] data;

        for (int i = 0; i <n ; i++) {
            data = scanner.nextIntArray();
            main = new SquareRoot(data[0], data[1]);
            main.calculate();
            out.format(Locale.US, "%.10f ", main.getSolution());
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


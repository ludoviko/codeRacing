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
 *
 */

public class BubbleInArray {
    private long[] array;

    public BubbleInArray(long[] array) {
        this.array = array;
    }

	public int findSwappings() {
	    int swappings = 0;
	    long aux;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1] ) {
               aux = array[i+1];
                array[i+1] = array[i];
                array[i] = aux;
                swappings++;
            }
        }

        return swappings;
    }

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int[] data = scanner.nextIntArray();
        long[] array = new long[data.length-1];

        for (int i = 0; i < data.length - 1; i++) {
            array[i] = data[i];
        }

        BubbleInArray main = new BubbleInArray(array);
        ArrayChecksum checksum = new ArrayChecksum(113, 10000007, array);

		out.format("%d %s", main.findSwappings(), checksum.find());

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


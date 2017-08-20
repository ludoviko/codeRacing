package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 *
 * Selection sort implementation.
 *
 */

public class SelectionSort {
    private int[] data;

    public int[] getData() {
        return data;
    }

    SelectionSort(int[] data) {
        this.data = data;
    }

	public int findMaximumIndex(int upTo) {
        int max = data[0];
        int index = 0;

        for (int i = 1; i <= upTo ; i++) {
            if (data[i] > max) {
                max = data[i];
                index = i;
            }
        }

        return index;
    }

    public void sort() {
        int maxIndex = -1;

        System.out.println();
        for (int i = this.data.length - 1; i >= 1; i--) {
            maxIndex = findMaximumIndex(i);
            swapLastWith(maxIndex, i);
            System.out.print(maxIndex + " ");
        }
    }

    public void swapLastWith(int index, int lastIndex) {
        int x = this.data[lastIndex];
        this.data[lastIndex] = data[index];
        this.data[index] = x;
    }

    public void print() {
        System.out.println();
        System.out.println();
        for (int i = 0; i < this.getData().length; i++) {
          System.out.format("%d ", this.getData()[i]);
         }
    }

    public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int n = scanner.nextInt();
		int[] data = scanner.nextIntArray();

		SelectionSort main = new SelectionSort( data );

		main.sort();
        main.print();

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


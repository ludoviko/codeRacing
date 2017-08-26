package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 *
 */

public class QuickSort {
    private int[] data;

    public QuickSort(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return this.data;
    }

    public void sort( int left, int right)  {
        System.out.format("%d-%d ", left, right);
        int pivot_pos = partition(left, right);
        if ( pivot_pos - left > 1 ) {
            sort( left, pivot_pos - 1);
        }
        if ( right - pivot_pos > 1 ) {
            sort(pivot_pos + 1, right);
        }
    }

    public  int partition( int left, int right) {
        int emptyCell = left;
        int pivotValue = data[left];

        do {
            while (data[right] > pivotValue  && right > left) {
                right--;
            }
            swap(data, emptyCell, right);
            emptyCell = right;

            while (data[left] < pivotValue && right > left) {
                left++;
            }
            swap(data, emptyCell, left);
            emptyCell = left;

            if (right == left) {
               // data[emptyCell] = pivotValue;
                return right;
            }

        } while (true);
    }

    public  void print() {
        System.out.println();
        for (int d : data) {
            System.out.format("%d ", d);
        }
    }

    public static void swap(int[] data, int pos1, int pos2) {
        int x = data[pos1];
        data[pos1] = data[pos2];
        data[pos2] = x;
    }

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int n = scanner.nextInt();
		int[] data = scanner.nextIntArray();

		QuickSort quickSort = new QuickSort(data);

        quickSort.sort( 0, data.length - 1);

        quickSort.print();

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


package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class BubbleSortArray {
	private int array[];
	private int passes;
	private int swaps;
	
	public BubbleSortArray(int array[]) {
		this.array = array;
	}

    public BubbleSortArray() {
    }

    private void swap(int i, int j) {
		int t = array[i];
		array[i] = array[j];
		array[j] = t;
	}
	
	public int[] getArray() {
		return array;
	}

	public int getPasses() {
		return passes;
	}

	public int getSwaps() {
		return swaps;
	}

	public void setArray(int[] array) {
        this.array = array;
        this.passes = 0;
        this.swaps = 0;
    }

	public void sort() {
		boolean sorted = false;

		while (! sorted) {
			sorted = true;
			for (int i = 0; i < array.length -1; i++) {
				if ( array[i] >  array[i+1] ) {
					this.swap(i, i+1);
					this.swaps++;
					sorted = false;
				} else {
				}
			}
			this.passes++;
		}
	}

	public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int n = scanner.nextInt();
        int[] data  = scanner.nextIntArray();

        BubbleSortArray main  = new BubbleSortArray(data);

        main.sort();

        out.format("%d %d", main.getPasses(), main.getSwaps());

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

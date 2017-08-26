package com.lam.coder.codeforces;

import java.io.*;
import java.util.InputMismatchException;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: 451A #258 Div-2: Sort the array.
 *
 */

public class SortTheArray {
    private int[] array;

    public SortTheArray(int[] array) {
        this.array = array;
    }

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int n = scanner.nextInt();
        int[] data = scanner.nextIntArray();
        int[] indexes;

        SortTheArray main = new SortTheArray(data);
        if (main.isSortedInAsc()) {
            out.println("yes");
            out.println(1 + " " + 1);
        } else if (main.isSortedInDesc()) {
            out.println("yes");
            out.println(1 + " " + data.length);
        } else {
            indexes = main.findSubArrayIndexes();
            main.swaps(indexes[0], indexes[1]);
            if (main.isSortedInAsc()) {
                out.println("yes");
                out.format("%d %d", indexes[0] + 1, indexes[1] + 1);
            } else {
                out.println("no");
            }
        }

		scanner.close();
		out.close();
	}

	public boolean isSortedInAsc() {
        for (int i = 0; i < this.array.length -1; i++) {
            if (this.array[i] > this.array[i+1]) {
                return false;
            }
        }

        return true;
    }

    public boolean isSortedInDesc() {
        for (int i = 0; i < this.array.length -1; i++) {
            if (this.array[i] < this.array[i+1]) {
                return false;
            }
        }

        return true;
    }

    public int[] findSubArrayIndexes() {
        boolean isA0 = true;
        int[] indexes = new int[2];
        indexes[1] = this.array.length - 1;
        boolean goOn = true;

        for (int i = 0; i < this.array.length -1 && goOn; i++) {
            if (this.array[i] > this.array[i + 1]) {
                if (isA0) {
                    indexes[0] = i;
                    isA0 = false;
                }
            } else if ( ! isA0) {
                indexes[1] = i;
                goOn = false;
            }
        }

        return indexes;
    }

    public void swap(int pos1, int pos2) {
        int x = this.array[pos1];
        this.array[pos1] = this.array[pos2];
        this.array[pos2] = x;
    }

    public void swaps(int pos1, int pos2) {
        int swaps = (int)Math.ceil((pos2 - pos1)/2.0);

        for (int i = 0; i < swaps; i++) {
            swap(pos1++, pos2--);
        }
    }


    // -----------MyScanner class for faster input----------
    public static class FastInputReader {
        private byte[] buf = new byte[16384];
        private int    curChar;
        private int    numChars;

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = System.in.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public String nextString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        public long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }
    }

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

        float nextFloat() {
            return Float.parseFloat(this.next());
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


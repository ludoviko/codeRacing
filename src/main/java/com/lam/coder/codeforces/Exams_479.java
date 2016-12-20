package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: 479C Exams .
 *
 * Used at Codeforces: #274 Div-2.
 *
 */

public class Exams_479 {
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		int n = scanner.nextInt();
		Pair[] data = new Pair[n];
		Pair p;

        for (int i = 0; i < n; i++) {
            p = new Pair(scanner.nextLongArray());
            data[i] = p;
        }

        Arrays.sort(data);
        long best = data[0].b;

        for(int i = 0; i < n; i++) {
            if (best <= data[i].b) {
                best = data[i].b;
            } else {
                best = data[i].a;
            }
        }

        out.println(best);

		scanner.close();
		out.close();
	}

	static class Pair implements  Comparable<Pair> {
	    long a;
	    long b;

	    public Pair(long a, long b) {
	        this.a = a;
	        this.b = b;
        }

        public Pair(long[] array ) {
            this.a = array[0];
            this.b = array[1];
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (a != pair.a) return false;
            return b == pair.b;
        }

        @Override
        public int hashCode() {
            int result = (int)a;
            result = 31 * result + (int) b;
            return result;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }

        public int compareTo(Pair o) {
            if (this.a > o.a) {
                return 1;
            } else if (this.a < o.a) {
                return -1;
            } else {
                if ( this.b > o.b) {
                    return 1;
                } else if ( this.b < o.b) {
                    return  -1;
                } else {
                    return 0;
                }
            }
        }
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


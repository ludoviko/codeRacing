package com.lam.coder.codeforces;

import java.io.*;
import java.util.*;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: 785B   #392 Div-2              Anton and Classes.
 *
 *
 */

public class AntonAndClasses {
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

        AntonAndClasses anton = new AntonAndClasses();

		int c = scanner.nextInt();

		List<Chess> chesses = new ArrayList<Chess>();
        List<Programming> ps = new ArrayList<Programming>();

        Chess chess;
        Programming programming;

        int[] data;

        for (int i = 0; i < c; i++) {
            data = scanner.nextIntArray();
            chess = anton.new Chess(data[0], data[1]);
            chesses.add(chess);
        }

        int p = scanner.nextInt();
        for (int i = 0; i < p; i++) {
            data = scanner.nextIntArray();
            programming = anton.new Programming(data[0], data[1]);
            ps.add(programming);
        }

        Collections.sort(chesses);
        Collections.sort(ps);

        int s1 =  ps.get(0).a - chesses.get(0).b  >= 0 ? ps.get(0).a - chesses.get(0).b  : 0;

        Collections.sort(chesses, new Comparator<Chess>() {
            public int compare(Chess o1, Chess o2) {
                if (o1.a > o2.a) {
                    return -1;
                } else if (o1.a < o2.a) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        Collections.sort(ps, new Comparator<Programming>() {
            public int compare(Programming o1, Programming o2) {
                if (o1.b > o2.b) {
                    return 1;
                } else if (o1.b < o2.b) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        int s2 =  chesses.get(0).a - ps.get(0).b  >= 0 ? chesses.get(0).a - ps.get(0).b   : 0;

        int s = (s1>=s2) ? s1: s2;

        out.println(s);

		scanner.close();
		out.close();
	}

	class Chess implements Comparable<Chess> {
	    int a;
	    int b;
        Chess(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int compareTo(Chess other) {
            if ( this.b > other.b ) {
                return 1;
            } else if ( this.b < other.b  ) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    class Programming implements Comparable<Programming> {
        int a;
        int b;
        Programming(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int compareTo(Programming other) {
            if ( this.a < other.a ) {
                return 1;
            } else if ( this.a > other.a  ) {
                return -1;
            } else {
                return 0;
            }
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


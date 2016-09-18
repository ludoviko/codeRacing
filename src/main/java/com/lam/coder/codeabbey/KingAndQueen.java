package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author: Solution by L.Azuaje.
 *
 * There is a chessboard with 8 x 8 squares.
 * There are the White King and Black Queen on it.
 * Check whether the Queen could take the King.
 *
 *
 *
21
a4 e1
c4 g1
b3 g4
b1 a7
g4 g3
f8 e6
d5 a1
c6 b4
a6 d3
b3 c3
f2 g7
c8 f1
c5 d8
d1 f8
e6 h7
c1 b3
g6 f8
a1 b6
b8 e5
h2 e2
f1 b2
N N N N Y N N N Y Y N N N N N N N N Y Y N


8
b4 b8
b4 e7
b4 d2
b4 g4
f2 b1
f2 c4
f2 d5
f2 g7

 *
 */

public class KingAndQueen {

    /**
     *
     * Method to determine whether the queen can take the king.
     *
     * All indexes are one-based, that is, they are numerated from 1 to n.
     *
     * @param ki: Row of que king.
     * @param kj: Column of the king.
     * @param qi: Row of que queen.
     * @param qj: Column of the queen.
     * @return Whether the queen from the position can take the king's position.
     */
	public static  boolean find(int ki, int kj, int qi, int qj) {
        return areOnDiagonal(ki, kj, qi, qj) || areOnTheSameLine(ki, kj, qi, qj);
	}

    public static boolean find(String positions) {
        int ki, kj, qi, qj;
        String data[] = positions.split(" ");
        ki = getIndex(data[0].charAt(0));
        kj = Character.getNumericValue(data[0].charAt(1));;

        qi = getIndex(data[1].charAt(0));
        qj = Character.getNumericValue(data[1].charAt(1));
        return find(ki, kj, qi, qj);
    }

    private static boolean areOnTheSameLine(int ki, int kj, int i, int j) {
        return ki == i || kj == j;
    }

    private static boolean areOnDiagonal(int ki, int kj, int i, int j) {
        return Math.abs(ki-i) ==  Math.abs(kj-j);
    }

    private static int getIndex(char c) {
        return  c - 'a' + 1;
    }

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;
        String string;

		int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            string = scanner.next();

            if ( find(string) ) {
                out.format("%s ", "Y" );
            } else {
                out.format("%s ", "N" );
            }
        }

		out.println();
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
	}
}


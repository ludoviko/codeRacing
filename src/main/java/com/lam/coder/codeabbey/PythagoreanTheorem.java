package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * 
 * @author L.Azuaje.
 *
 * Check whether a triangle is obtuse, right or acute.
 *
 *
 */

public class PythagoreanTheorem {
	private int[] sides;
	public static final char RIGHT = 'R';
    public static final char OBTUSE = 'O';
    public static final char ACUTE = 'A';

    public PythagoreanTheorem (int[] sides) {
        this.sides = sides;
        Arrays.sort(this.sides);
    }

    public boolean isAcute() {
        return this.sides[0]*this.sides[0] + this.sides[1]*this.sides[1] > this.sides[2]*this.sides[2];
    }

    public boolean isObtuse() {
        return this.sides[0]*this.sides[0] + this.sides[1]*this.sides[1] < this.sides[2]*this.sides[2];
    }

    public boolean isRight() {
        return this.sides[0]*this.sides[0] + this.sides[1]*this.sides[1] == this.sides[2]*this.sides[2];
    }

    public char typeOfTriangle() {
        if (isAcute()) {
            return 'A';
        } else if (isObtuse()) {
            return  'O';
        } else {
            return 'R';
        }
    }

    public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		PythagoreanTheorem main;
		
		int n = scanner.nextInt();
		int data[];

        for (int i = 0; i < n; i++) {
            data = scanner.nextIntArray();
            main = new PythagoreanTheorem(data);
            out.format("%s ", main.typeOfTriangle());
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
	}
}


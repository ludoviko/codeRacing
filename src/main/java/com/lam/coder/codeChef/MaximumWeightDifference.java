package com.lam.coder.codeChef;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.InputMismatchException;

/**
 * @author Code Chef.
 *         <p/>
 *         Solution by: L.Azuaje.
 *         <p/>
 *         CodeChef Problem: Maximum Weight Difference Problem Code: MAXDIFF.
 */

public class MaximumWeightDifference {
    public static final String YES = "YES";
    public static final String NO = "NO";

    public MaximumWeightDifference() {
    }

    public static void main(String[] args) throws IOException {
        FastInputReader scanner = new FastInputReader();
        PrintStream out = System.out;

        MaximumWeightDifference main = new MaximumWeightDifference();

        int cases = scanner.nextInt();

        for (int i = 0; i < cases; i++) {
            int child = 0;
            int child2 = 0;
            int s = 0;

            int[] data = scanner.nextIntArray(2);
            int[] weights = scanner.nextIntArray(data[0]);

            Arrays.sort(weights);

            for (int j = 0; j < data[0]; j++) {
                s += weights[j];

                if (j < data[1]) {
                    child += weights[j];
                    child2 += weights[data[0] - 1 - j];
                } else {
                }
            }
            // s - 2 * Math.min(child, child2)
            out.println(Math.max(Math.abs(s - 2 * child), Math.abs(s - 2 * child2)));
        }

        out.close();
    }

    // -----------MyScanner class for faster input----------
    public static class FastInputReader {
        private byte[] buf = new byte[16384];
        private int curChar;
        private int numChars;

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

        public Integer[] nextIntegerArray(int n) {
            Integer[] arr = new Integer[n];
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
}


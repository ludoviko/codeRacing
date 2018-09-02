package com.lam.coder.codeChef;

import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;

/**
 * @author Code Chef.
 *         <p/>
 *         Solution by: L.Azuaje.
 *         <p/>
 *         Problem: COPS       Beginner      Cops and the Thief Devu.
 */

public class CopsAndTheThiefDevu {
    public static final String YES = "YES";
    public static final String NO = "NO";

    public CopsAndTheThiefDevu() {
    }

    public static void main(String[] args) throws IOException {
        FastInputReader scanner = new FastInputReader();
        PrintStream out = System.out;

        int cases = scanner.nextInt();

        for (int c = 0; c < cases; c++) {
            int safe = 0;
            // Array one based, 0 position is just ignored.
            int[] houses = new int[101];
            int[] data = scanner.nextIntArray(3);
            int scope = data[1] * data[2];

            int[] copHouses = scanner.nextIntArray(data[0]);

            for (int i = 0; i < data[0]; i++) {
                int down = copHouses[i] - scope;
                int up = copHouses[i] + scope;

                down = down < 1 ? 1 : down;
                up = (up > 100) ? 100 : up;

                for (int j = down; j <= up; j++) {
                    houses[j] = 1;
                }
            }
            // Count positions with 0.
            for (int j = 1; j <= 100; j++) {
                if (houses[j] == 0) {
                    safe++;
                }
            }

            System.out.println(safe);
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


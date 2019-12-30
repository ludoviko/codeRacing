package com.lam.coder.uva;

import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;


/**
 *
 * @author UVA on Line.
 *
 * Solution by L.Azuaje.
 *
 *  UVA Vol/Cod/Name: 5 573  The Snail.
 *
 */

public class TheSnail {
    public static final String YES = "YES";
    public static final String NO = "NO";

    public  TheSnail() {
    }

    public static void main(String[] args) throws IOException {
        FastInputReader scanner = new FastInputReader();
        PrintStream out = System.out;

        int n = 4;
        while (true) {
            int[] data = scanner.nextIntArray(n);
            if (data[0] == 0) {
                break;
            }
            double h = data[0];
            int u = data[1];
            double sliding = data[2];

            int day = 1;
            double distance = 0;
            while (true) {
                double fatigue = (u * 100 - (day-1)*data[3]*u)/100.0;
                fatigue = (fatigue >= 0 ? fatigue : 0);
                distance += fatigue;
                if (distance> h) {
                    out.format("success on day %d%n", day);
                    break;
                }
                distance -= sliding;
                if (distance < 0) {
                    out.format("failure on day %d%n", day);
                    break;
                }
                day++;
            }
        }

        out.close();
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


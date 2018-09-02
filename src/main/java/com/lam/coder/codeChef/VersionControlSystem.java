package com.lam.coder.codeChef;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

/**
 * @author Code Chef.
 *         <p/>
 *         Solution by: L.Azuaje.
 *         <p/>
 *         Problem: VCS        Beginner      Version Control System.
 */

public class VersionControlSystem {
    public static final String YES = "YES";
    public static final String NO = "NO";

    public VersionControlSystem() {
    }

    public static void main(String[] args) throws IOException {
        FastInputReader scanner = new FastInputReader();
        PrintStream out = System.out;

        int cases = scanner.nextInt();

        for (int c = 0; c < cases; c++) {
            int[] metaData = scanner.nextIntArray(3);

            Integer[] ignoredFiles = scanner.nextIntegerArray(metaData[1]);
            Integer[] trackedFiles = scanner.nextIntegerArray(metaData[2]);

            Integer[] allFiles = new Integer[metaData[0]];

            for (int i = 0; i < metaData[0]; i++) {
                allFiles[i] = i + 1;
            }

            Set<Integer> ignoredSet = new HashSet<Integer>();
            ignoredSet.addAll(Arrays.asList(ignoredFiles));

            Set<Integer> ignoredSetCopy = new HashSet<Integer>();
            ignoredSetCopy.addAll(ignoredSet);

            Set<Integer> trackedSet = new HashSet<Integer>();
            trackedSet.addAll(Arrays.asList(trackedFiles));

            Set<Integer> set = new HashSet<Integer>();
            set.addAll(Arrays.asList(allFiles));

            Set<Integer> set2 = new HashSet<Integer>();
            set2.addAll(set);

            Set<Integer> set3 = new HashSet<Integer>();
            set3.addAll(set);

            ignoredSetCopy.retainAll(trackedSet);

            set2.removeAll(ignoredSet);
            set3.removeAll(trackedSet);

            set2.retainAll(set3);

            out.format("%d %d %n", ignoredSetCopy.size(), set2.size());
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


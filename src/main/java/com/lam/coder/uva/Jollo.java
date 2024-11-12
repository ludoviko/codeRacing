package com.lam.coder.uva;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;


/**
 *
 * @author UVA on Line.
 *
 * Solution by L.Azuaje.
 *
 *  UVA Vol/Cod/Name: 12247     Jollo .
 *
 */

public class Jollo {
    public static final String YES = "YES";
    public static final String NO = "NO";

    public  Jollo() {
    }

    public static boolean inArray(int value, int[] array) {
        boolean inside = false;

        for ( int a: array ) {
            if (a == value) {
                inside = true;
                break;
            }
        }

        return inside;
    }

    public static void main2(String[] args) throws IOException {
        FastInputReader scanner = new FastInputReader();
        PrintStream out = System.out;

        int n = 5;

        while (true) {
            int[] data = scanner.nextIntArray(n);
            if (data[0] == 0) {
                break;
            }

            int max = Math.max(Math.max(data[0], data[1]), data[2]);
            int min = Math.min(Math.min(data[0], data[1]), data[2]);
            int middle = data[0] +data[1] + data[2] - max - min;

            data[0] = max;
            data[1] = middle;
            data[2] = min;

            max = Math.max(data[3], data[4]);
            min = Math.min(data[3], data[4]);

            data[3] = min;
            data[4] = max;

            int card = 0;
            int counter = 0;

            if (data[3] >  data[0]) {
                counter++;
            }
            if (data[4] >  data[1]) {
                counter++;
            }
            if (counter == 0) {
                card = -1;
            } else {
                card = data[2] + 1;
                while ( inArray(card, data)) {
                    card++;
                };
                if (card > 52) {
                    card = -1;
                }
            }
            out.println(card);
        }

        out.close();
    }


    public static void main(String[] args) throws IOException {
        Main.FastInputReader scanner = new Main.FastInputReader();
        PrintStream out = System.out;

        int n = 5;

        while (true) {
            int[] data = scanner.nextIntArray(n);
            if (data[0] == 0) {
                break;
            }

            int max = Math.max(Math.max(data[0], data[1]), data[2]);
            int min = Math.min(Math.min(data[0], data[1]), data[2]);
            int middle = data[0] +data[1] + data[2] - max - min;

            data[0] = min;
            data[1] = middle;
            data[2] = max;

            List<Integer> princess = new ArrayList<>(3);
            List<Integer> princessTaken = new ArrayList<>(3);

            princess.add(min);
            princess.add(middle);
            princess.add(max);

            max = Math.max(data[3], data[4]);
            min = Math.min(data[3], data[4]);

            data[3] = min;
            data[4] = max;

            int counter = 0;
            int card = 0;

            for (int i = 0; i < princess.size(); i++) {
                if (princess.get(i) > data[3]) {
                    princessTaken.add(princess.remove(i));
                    break;
                } else {
                    if (i == princess.size() -1) {
                        counter++;
                        princessTaken.add(princess.remove(0));
                    }
                }
            }

            for (int i = 0; i < princess.size(); i++) {
                if (princess.get(i) > data[4]) {
                    princessTaken.add(princess.remove(i));
                    break;
                } else {
                    if (i == princess.size() -1) {
                        counter++;
                        princessTaken.add(princess.remove(0));
                    }
                }
            }

            if (counter == 0) {
                card = -1;
            } else {
                card = princess.get(0) + 1;
                while ( inArray(card, data)) {
                    card++;
                };
                if (card > 52) {
                    card = -1;
                }
            }
            out.println(card);
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


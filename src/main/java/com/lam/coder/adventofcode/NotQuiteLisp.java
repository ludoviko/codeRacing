package com.lam.coder.adventofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Locale;

/**
 * Problem Author:  Advent of Code (AdventOfCode.com).
 *
 * @author Solution by: L.Azuaje.
 *         <p>
 *         AdventOfCode.com: 2015-001      Not Quite Lisp
 */

public class NotQuiteLisp {
    private String string;

    public NotQuiteLisp(String string) {
        this.string = string;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        String string = scanner.next().trim();

        NotQuiteLisp notQuiteLisp = new NotQuiteLisp(string);

        out.format(Locale.US, "%d %n", notQuiteLisp.countFloor());
        out.format(Locale.US, "%d %n", notQuiteLisp.enterTheBasementAt());
        out.println();

        scanner.reader.close();
        out.close();
    }

    public int countFloor() {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                sum++;
            } else {
                sum--;
            }
        }

        return sum;
    }

    public int enterTheBasementAt() {
        int sum = 0;
        int j = -1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                sum++;
            } else {
                sum--;
            }
            if (sum == -1) {
                j = i;
                break;
            }
        }

        return j + 1;
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
            String[] data = nextStringArray();
            int[] a = new int[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        Integer[] nextIntegerArray() {
            String[] data = nextStringArray();
            Integer[] a = new Integer[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        long[] nextLongArray() {
            String[] data = nextStringArray();
            long[] a = new long[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Long.parseLong(data[i]);
            }

            return a;
        }

        float[] nextFloatArray() {
            String[] data = nextStringArray();
            float[] a = new float[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Float.parseFloat(data[i]);
            }

            return a;
        }

        double[] nextDoubleArray() {
            String[] data = nextStringArray();
            double[] a = new double[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Double.parseDouble(data[i]);
            }

            return a;
        }
    }
}


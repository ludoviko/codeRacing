package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p/>
 *         An n × n table a is defined as follows:
 *         <p/>
 *         The first row and the first column contain ones, that is: ai, 1 = a1, i = 1 for all i = 1, 2, ..., n.
 *         Each of the remaining numbers in the table is equal to the sum of the number above it and the number to the left of it. In other words, the remaining elements are defined by the formula ai, j = ai - 1, j + ai, j - 1.
 *         These conditions define all the values in the table.
 *         <p/>
 *         You are given a number n. You need to determine the maximum value in the n × n table defined by the rules above.
 *         <p/>
 *         Input
 *         The only line of input contains a positive integer n (1 ≤ n ≤ 10) — the number of rows and columns of the table.
 *         <p/>
 *         Output
 *         Print a single line containing a positive integer m — the maximum value in the table.
 *         <p/>
 *         Sample test(s)
 *         input
 *         1
 *         output
 *         1
 *         input
 *         5
 *         output
 *         70
 *         Note
 *         In the second test the rows of the table look as follows:
 *         <p/>
 *         {1, 1, 1, 1, 1},
 *         {1, 2, 3, 4, 5},
 *         {1, 3, 6, 10, 15},
 *         {1, 4, 10, 20, 35},
 *         {1, 5, 15, 35, 70}.
 */

public class MaximunInTable {

    public int find(int n) {
        int[][] data = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    data[i][j] = 1;
                } else {
                    data[i][j] = data[i - 1][j] + data[i][j - 1];
                }
            }
        }

        return data[n - 1][n - 1];
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        MaximunInTable main = new MaximunInTable();

        int n = scanner.nextInt();

        out.println(main.find(n));

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
    }
}


package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author Code Forces.  Solution by: L.Azuaje.
 *         <p>
 *         Problem: 732B  Cormen, The Best Friend Of a Man.
 *         <p>
 *         Used at Codeforces: #377 Div-2 .
 */

public class CormenTheBestFriendOfAMan {
    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int[] data = scanner.nextIntArray();
        int[] walkDays = scanner.nextIntArray();
        int days = data[0];
        int walks = data[1];
        int wantedDays = 0;
        int summa = 0;

        for (int i = 1; i < walkDays.length; i++) {
            wantedDays = walks - walkDays[i - 1] - walkDays[i];
            if (wantedDays > 0) {
                walkDays[i] += wantedDays;
                summa += wantedDays;
            }
        }

        out.format("%d%n", summa);

        for (int i = 0; i < walkDays.length; i++) {
            out.format("%d ", walkDays[i]);
        }

        scanner.close();
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


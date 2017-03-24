package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author Code Forces.  Solution by: L.Azuaje.
 *         <p>
 *         Problem: 43C   Lucky Tickets.
 *         <p>
 *         Used at Codeforces: Beta #42 Div-2 .
 */

public class LuckyTickets {
    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int n = scanner.nextInt();
        int[] data = scanner.nextIntArray();

        int c = 0;

        for (int i = 0; i < n - 1; i++) {
            if (data[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (data[j] == 0) {
                    continue;
                }
                if (isMultipleOfThree(findSumDigits(data[i]) + findSumDigits(data[j]))) {
                    c++;
                    data[i] = 0;
                    data[j] = 0;
                    break;
                }
            }
        }

        out.println(c);

        scanner.close();
        out.close();
    }

    private static boolean isMultipleOfThree(int n) {
        return n % 3 == 0;
    }

    private static int findSumDigits(int n) {
        int s = 0;

        while (n > 0) {
            s += n % 10;
            n = n / 10;
        }
        return s;
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


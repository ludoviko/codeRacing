package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Solution by: L.Azuaje.
 *
 * Codeforces:  567A Lineland Mail.
 *
 */

public class LinelandMail {

    public static String find(int index, long[] array) {
        long min = Long.MAX_VALUE;
        long max = 0;

        if (index == 0) {
            min = Math.abs(array[index] - array[index + 1]);
            max = Math.abs(array[index] - array[array.length - 1]);
        } else if (index == array.length - 1) {
            min = Math.abs(array[index] - array[index - 1]);
            max = Math.abs(array[index] - array[0]);
        } else {
            min = Math.min(Math.abs(array[index] - array[index - 1]), Math.abs(array[index] - array[index + 1])) ;
            max = Math.max(Math.abs(array[index] - array[0]), Math.abs(array[index] - array[array.length - 1])) ;
        }

        return min + " " + max;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

       int n = scanner.nextInt();
        long[] array = scanner.nextLongArray();

        for (int i = 0; i < n; i++) {
            out.println(LinelandMail.find(i, array));
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

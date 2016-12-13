package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem:    572A	 Arrays.
 *
 * Used at Codeforces:  #317 Div-2.
 *
 */

public class ArraysCF {
    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int[] lens = scanner.nextIntArray();
        int[] km = scanner.nextIntArray();
        Integer[] array = scanner.nextIntegerArray();
        Integer[] array2 = scanner.nextIntegerArray();

        List<Integer> list = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();

        for (int i = 0; i < km[0]; i++) {
            list.add(array[i]);
        }

        for (int i = 0; i < km[1]; i++) {
            list2.add(array2[array2.length - 1 -i]);
        }

        Collections.sort(list2);

        if (list.isEmpty() || list2.isEmpty()) {
            out.println("NO");
        } else {
            if (list.get(list.size()- 1) < list2.get(0)) {
                out.println("YES");
            } else {
                out.println("NO");
            }
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
            String[] data  = nextStringArray();
            int[] a  = new int[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        Integer[] nextIntegerArray() {
            String[] data  = nextStringArray();
            Integer[] a  = new Integer[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        long[] nextLongArray() {
            String[] data  = nextStringArray();
            long[] a  = new long[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Long.parseLong(data[i]);
            }

            return a;
        }
    }
}


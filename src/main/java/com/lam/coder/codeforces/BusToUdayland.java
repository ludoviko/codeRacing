package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author Solution by: L.Azuaje.
 *         <p>
 *         Codeforces: 711A	    Bus To Udaylan.
 */

public class BusToUdayland {

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        BusToUdayland main = new BusToUdayland();

        int n = scanner.nextInt();

        boolean check = true;
        char[] chars;
        String[] data = new String[n];

        for (int i = 0; i < n; i++) {
            data[i] = scanner.next();
            chars = data[i].toCharArray();

            if (check) {
                check = change(chars, 0);
                data[i] = new String(chars);
            }
            if (check) {
                check = change(chars, 3);
                data[i] = new String(chars);
            }
        }

        if (check) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                System.out.println(data[i]);
            }
        }

        scanner.close();
        out.close();
    }

    private static boolean change(char[] chars, int position) {
        boolean check = true;

        if (chars[position] == 'O' && chars[position + 1] == 'O') {
            chars[position] = '+';
            chars[position + 1] = '+';
            check = false;
        }

        return check;
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


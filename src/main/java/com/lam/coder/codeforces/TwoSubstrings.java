package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author Code Forces.  Solution by: L.Azuaje.
 *         <p>
 *         Problem:  550A  Two Substrings.
 *         <p>
 *         Used at Codeforces:  #306 Div-2 .
 */

public class TwoSubstrings {
    public static String find(String string) {
        String result = "";
        int indexAB = string.indexOf("AB");
        int indexBA = string.indexOf("BA");

        if (indexAB < 0 || indexBA < 0) {
            result = "NO";
        } else {
            if (indexAB < string.length() - 2) {
                result = (searchResult(string, "AB", "BA"));
            } else if (indexBA < string.length() - 2) {
                result = (searchResult(string, "BA", "AB"));
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        String string = scanner.next();
        out.println(find(string));

        scanner.close();
        out.close();
    }

    private static String searchResult(String string, String a, String b) {
        String output = "";
        int indexAB = string.indexOf(a);
        int indexBA;

        indexBA = string.indexOf(b, indexAB + 2);
        if (indexBA >= 0) {
            output = "YES";
        } else {
            indexBA = string.indexOf(b);
            if (indexBA < string.length() - 2 && indexBA >= 0) {
                indexAB = string.indexOf(a, indexBA + 2);
                if (indexAB >= 0) {
                    output = "YES";
                } else {
                    output = "NO";
                }
            } else {
                output = "NO";
            }
        }

        return output;
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


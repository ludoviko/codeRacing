package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p/>
 *         Bizon the Champion is called the Champion for a reason.
 *         <p/>
 *         Bizon the Champion has recently got a present — a new glass cupboard with n shelves and he decided to put all his presents there. All the presents can be divided into two types: medals and cups. Bizon the Champion has a1 first prize cups, a2 second prize cups and a3 third prize cups. Besides, he has b1 first prize medals, b2 second prize medals and b3 third prize medals.
 *         <p/>
 *         Naturally, the rewards in the cupboard must look good, that's why Bizon the Champion decided to follow the rules:
 *         <p/>
 *         any shelf cannot contain both cups and medals at the same time;
 *         no shelf can contain more than five cups;
 *         no shelf can have more than ten medals.
 *         Help Bizon the Champion find out if we can put all the rewards so that all the conditions are fulfilled.
 *         <p/>
 *         Input
 *         The first line contains integers a1, a2 and a3 (0 ≤ a1, a2, a3 ≤ 100). The second line contains integers b1, b2 and b3 (0 ≤ b1, b2, b3 ≤ 100). The third line contains integer n (1 ≤ n ≤ 100).
 *         <p/>
 *         The numbers in the lines are separated by single spaces.
 *         <p/>
 *         Output
 *         Print "YES" (without the quotes) if all the rewards can be put on the shelves in the described manner. Otherwise, print "NO" (without the quotes).
 *         <p/>
 *         Sample test(s)
 *         input
 *         1 1 1
 *         1 1 1
 *         4
 *         output
 *         YES
 *         input
 *         1 1 3
 *         2 3 4
 *         2
 *         output
 *         YES
 *         input
 *         1 0 0
 *         1 0 0
 *         1
 *         output
 *         NO
 */

public class Rewards {

    public String find(int[] a, int[] b, int n) {

        int sum = 0;
        int sa = 0;
        int sb = 0;

        for (int s : a) {
            sa += s;
        }

        for (int s : b) {
            sb += s;
        }

        if (sa % 5 > 0) {
            sum += sa / 5 + 1;
        } else {
            sum += sa / 5;
        }

        if (sb % 10 > 0) {
            sum += sb / 10 + 1;
        } else {
            sum += sb / 10;
        }

        if (sum <= n) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        Rewards main = new Rewards();

        out.println(main.find(scanner.nextIntArray(), scanner.nextIntArray(), scanner.nextInt()));

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


package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p/>
 *         Vanya got n cubes. He decided to build a pyramid from them. Vanya wants to build the pyramid as follows: the top level of the pyramid must consist of 1 cube, the second level must consist of 1 + 2 = 3 cubes, the third level must have 1 + 2 + 3 = 6 cubes, and so on. Thus, the i-th level of the pyramid must have 1 + 2 + ... + (i - 1) + i cubes.
 *         <p/>
 *         Vanya wants to know what is the maximum height of the pyramid that he can make using the given cubes.
 *         <p/>
 *         Input
 *         The first line contains integer n (1 ≤ n ≤ 104) — the number of cubes given to Vanya.
 *         <p/>
 *         Output
 *         Print the maximum possible height of the pyramid in the single line.
 *         <p/>
 *         Sample test(s)
 *         input
 *         1
 *         output
 *         1
 *         input
 *         25
 *         output
 *         4
 */

public class VanyaAndCubes {
    public int find(int n) {
        int sum = 0;
        int k = 0;
        int e = 0;
        int i = 1;
        while (true) {
            e = i * (i + 1) / 2;
            sum += e;
            if (sum > n) {
                break;
            }
            k++;
            ++i;
        }
        ;

        return k;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        VanyaAndCubes main = new VanyaAndCubes();

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


    }
}


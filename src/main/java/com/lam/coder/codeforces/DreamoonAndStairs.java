package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p/>
 *         476A  Dreamoon and Stairs
 *         <p/>
 *         Dreamoon wants to climb up a stair of n steps. He can climb 1 or 2 steps at each move. Dreamoon wants the number of moves to be a multiple of an integer m.
 *         <p/>
 *         What is the minimal number of moves making him climb to the top of the stairs that satisfies his condition?
 *         <p/>
 *         Input
 *         The single line contains two space separated integers n, m (0 < n ≤ 10000, 1 < m ≤ 10).
 *         <p/>
 *         Output
 *         Print a single integer — the minimal number of moves being a multiple of m. If there is no way he can climb satisfying condition print  - 1 instead.
 *         <p/>
 *         Sample test(s)
 *         input
 *         10 2
 *         output
 *         6
 *         input
 *         3 5
 *         output
 *         -1
 *         Note
 *         For the first sample, Dreamoon could climb in 6 moves with following sequence of steps: {2, 2, 2, 2, 1, 1}.
 *         <p/>
 *         For the second sample, there are only three valid sequence of steps {2, 1}, {1, 2}, {1, 1, 1} with 2, 2, and 3 steps respectively. All these numbers are not multiples of 5.
 */

public class DreamoonAndStairs {

    public int find(int n, int m) {

        if (n < m) {
            return -1;
        } else {
        }

        int evenSteps = n / 2;
        int unevenSteps = unevenSteps = n - evenSteps * 2;;
        int sum = evenSteps + unevenSteps;;
        int q = evenSteps * 2 + unevenSteps;;

        while (q <= n) {
            if (sum % m == 0) {
                break;
            } else {
                evenSteps--;
            }
            unevenSteps = n - evenSteps * 2;
            sum = evenSteps + unevenSteps;
            q = evenSteps * 2 + unevenSteps;
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        DreamoonAndStairs main = new DreamoonAndStairs();

        int[] data = scanner.nextIntArray();

        out.println(main.find(data[0], data[1]));

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


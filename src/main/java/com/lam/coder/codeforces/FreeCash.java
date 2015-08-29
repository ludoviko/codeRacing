package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L. Azuaje.
 *         <p/>
 *         Valera runs a 24/7 fast food cafe. He magically learned that next day n people will visit his cafe. For each person we know the arrival time: the i-th person comes exactly at hi hours mi minutes. The cafe spends less than a minute to serve each client, but if a client comes in and sees that there is no free cash, than he doesn't want to wait and leaves the cafe immediately.
 *         <p/>
 *         Valera is very greedy, so he wants to serve all n customers next day (and get more profit). However, for that he needs to ensure that at each moment of time the number of working cashes is no less than the number of clients in the cafe.
 *         <p/>
 *         Help Valera count the minimum number of cashes to work at his cafe next day, so that they can serve all visitors.
 *         <p/>
 *         Input
 *         The first line contains a single integer n (1 ≤ n ≤ 105), that is the number of cafe visitors.
 *         <p/>
 *         Each of the following n lines has two space-separated integers hi and mi (0 ≤ hi ≤ 23; 0 ≤ mi ≤ 59), representing the time when the i-th person comes into the cafe.
 *         <p/>
 *         Note that the time is given in the chronological order. All time is given within one 24-hour period.
 *         <p/>
 *         Output
 *         Print a single integer — the minimum number of cashes, needed to serve all clients next day.
 *         <p/>
 *         Sample test(s)
 *         input
 *         4
 *         8 0
 *         8 10
 *         8 10
 *         8 45
 *         output
 *         2
 *         input
 *         3
 *         0 12
 *         10 11
 *         22 22
 *         output
 *         1
 *         Note
 *         In the first sample it is not enough one cash to serve all clients, because two visitors will come into cafe in 8:10. Therefore, if there will be one cash in cafe, then one customer will be served by it, and another one will not wait and will go away.
 *         <p/>
 *         In the second sample all visitors will come in different times, so it will be enough one cash.
 */

public class FreeCash {

//	public find() {
//	}

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        FreeCash main = new FreeCash();

        int c = 1;
        int max = 1;

        int n = scanner.nextInt();

        String old = scanner.next();
        String current;

        for (int i = 1; i < n; i++) {
            current = scanner.next();
            if (old.equals(current)) {
                c++;
                if (c > max) {
                    max = c;
                }
            } else {
                c = 1;
            }
            old = current;
        }

        out.println(max);

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


package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author Ann has recently started commuting by subway. We know that a one ride subway ticket costs a rubles. Besides, Ann found out that she can buy a special ticket for m rides (she can buy it several times). It costs b rubles. Ann did the math; she will need to use subway n times. Help Ann, tell her what is the minimum sum of money she will have to spend to make n rides?
 *         <p/>
 *         Input
 *         The single line contains four space-separated integers n, m, a, b (1 ≤ n, m, a, b ≤ 1000) — the number of rides Ann has planned, the number of rides covered by the m ride ticket, the price of a one ride ticket and the price of an m ride ticket.
 *         <p/>
 *         Output
 *         Print a single integer — the minimum sum in rubles that Ann will need to spend.
 *         <p/>
 *         Sample test(s)
 *         input
 *         6 2 1 2
 *         output
 *         6
 *         input
 *         5 2 2 3
 *         output
 *         8
 *         Note
 *         In the first sample one of the optimal solutions is: each time buy a one ride ticket. There are other optimal solutions. For example, buy three m ride tickets.
 */

public class CheapTravel {

    public int find(int[] data) {
        int sam = 0;
        int sa = 0;
        int qm = 0;

        while (sam < data[0]) {
            if (data[2] * data[1] > data[3]) {
                if ((data[0] - sam) < data[1]) {
                    if (data[2] * (data[0] - sam) > data[3]) {
                        qm++;
                        sam += data[1];
                    } else {
                        ++sa;
                        sam += 1;
                    }
                } else {
                    qm++;
                    sam += data[1];
                }
            } else {
                ++sa;
                sam += 1;
            }
        }

        return sa * data[2] + qm * data[3];
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        CheapTravel main = new CheapTravel();

        out.println(main.find(scanner.nextIntArray()));

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


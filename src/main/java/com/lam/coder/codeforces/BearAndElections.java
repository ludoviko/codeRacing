package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * @author L.Azuaje.
 *         <p/>
 *         Limak is a grizzly bear who desires power and adoration. He wants to win in upcoming elections and rule over the Bearland.
 *         <p/>
 *         There are n candidates, including Limak. We know how many citizens are going to vote for each candidate. Now i-th candidate would get ai votes. Limak is candidate number 1. To win in elections, he must get strictly more votes than any other candidate.
 *         <p/>
 *         Victory is more important than everything else so Limak decided to cheat. He will steal votes from his opponents by bribing some citizens. To bribe a citizen, Limak must give him or her one candy - citizens are bears and bears like candies. Limak doesn't have many candies and wonders - how many citizens does he have to bribe?
 *         <p/>
 *         Input
 *         The first line contains single integer n (2 ≤ n ≤ 100) - number of candidates.
 *         <p/>
 *         The second line contains n space-separated integers a1, a2, ..., an (1 ≤ ai ≤ 1000) - number of votes for each candidate. Limak is candidate number 1.
 *         <p/>
 *         Note that after bribing number of votes for some candidate might be zero or might be greater than 1000.
 *         <p/>
 *         Output
 *         Print the minimum number of citizens Limak must bribe to have strictly more votes than any other candidate.
 *         <p/>
 *         Sample test(s)
 *         input
 *         5
 *         5 1 11 2 8
 *         output
 *         4
 *         input
 *         4
 *         1 8 8 8
 *         output
 *         6
 *         input
 *         2
 *         7 6
 *         output
 *         0
 *         Note
 *         In the first sample Limak has 5 votes. One of the ways to achieve victory is to bribe 4 citizens who want to vote for the third candidate. Then numbers of votes would be 9, 1, 7, 2, 8 (Limak would have 9 votes). Alternatively, Limak could steal only 3 votes from the third candidate and 1 vote from the second candidate to get situation 9, 0, 8, 2, 8.
 *         <p/>
 *         In the second sample Limak will steal 2 votes from each candidate. Situation will be 7, 6, 6, 6.
 *         <p/>
 *         In the third sample Limak is a winner without bribing any citizen.
 */

public class BearAndElections {

    public int find(int[] data) {

        int[] others = new int[data.length - 1];
        System.arraycopy(data, 1, others, 0, data.length - 1);
        Arrays.sort(others);
        int max = others[others.length - 1];
        int candies = 0;

        while (data[0] <= others[others.length - 1]) {
            data[0]++;
            others[others.length - 1]--;
            candies++;
            Arrays.sort(others);
        }

        return candies;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        BearAndElections main = new BearAndElections();

        int n = scanner.nextInt();

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


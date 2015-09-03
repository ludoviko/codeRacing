package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p/>
 *         515A - Drazil and Date
 *         <p/>
 *         Someday, Drazil wanted to go on date with Varda. Drazil and Varda live on Cartesian plane. Drazil's home is located in point (0, 0) and Varda's home is located in point (a, b). In each step, he can move in a unit distance in horizontal or vertical direction. In other words, from position (x, y) he can go to positions (x + 1, y), (x - 1, y), (x, y + 1) or (x, y - 1).
 *         <p/>
 *         Unfortunately, Drazil doesn't have sense of direction. So he randomly chooses the direction he will go to in each step. He may accidentally return back to his house during his travel. Drazil may even not notice that he has arrived to (a, b) and continue travelling.
 *         <p/>
 *         Luckily, Drazil arrived to the position (a, b) successfully. Drazil said to Varda: "It took me exactly s steps to travel from my house to yours". But Varda is confused about his words, she is not sure that it is possible to get from (0, 0) to (a, b) in exactly s steps. Can you find out if it is possible for Varda?
 *         <p/>
 *         Input
 *         You are given three integers a, b, and s ( - 109 ≤ a, b ≤ 109, 1 ≤ s ≤ 2·109) in a single line.
 *         <p/>
 *         Output
 *         If you think Drazil made a mistake and it is impossible to take exactly s steps and get from his home to Varda's home, print "No" (without quotes).
 *         <p/>
 *         Otherwise, print "Yes".
 *         <p/>
 *         Sample test(s)
 *         input
 *         5 5 11
 *         output
 *         No
 *         input
 *         10 15 25
 *         output
 *         Yes
 *         input
 *         0 5 1
 *         output
 *         No
 *         input
 *         0 0 2
 *         output
 *         Yes
 *         Note
 *         In fourth sample case one possible route is: (0,0) , (0,1), (0,0).
 */

public class DrazilAndDate {

    public String find(int x, int y, int steps) {
        String s = "NO";
        int sum = Math.abs(x) + Math.abs(y);

        if (sum > steps) {
            s = "NO";
        } else if (sum == steps) {
            s = "YES";
        } else if (sum < steps) {
            if (sum % 2 == 0 && steps % 2 != 0) {
                s = "NO";
            } else if (sum % 2 != 0 && steps % 2 == 0) {
                s = "NO";
            } else if (sum % 2 == 0 && steps % 2 == 0) {
                s = "YES";
            } else if (sum % 2 != 0 && steps % 2 != 0) {
                s = "YES";
            }
        }

        return s;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        DrazilAndDate main = new DrazilAndDate();

        int[] n = scanner.nextIntArray();

        out.println(main.find(n[0], n[1], n[2]));

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


package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Auaje.
 *         <p/>
 *         Fox Ciel starts to learn programming. The first task is drawing a fox! However, that turns out to be too hard for a beginner, so she decides to draw a snake instead.
 *         <p/>
 *         A snake is a pattern on a n by m table. Denote c-th cell of r-th row as (r, c). The tail of the snake is located at (1, 1), then it's body extends to (1, m), then goes down 2 rows to (3, m), then goes left to (3, 1) and so on.
 *         <p/>
 *         Your task is to draw this snake for Fox Ciel: the empty cells should be represented as dot characters ('.') and the snake cells should be filled with number signs ('#').
 *         <p/>
 *         Consider sample tests in order to understand the snake pattern.
 *         <p/>
 *         Input
 *         The only line contains two integers: n and m (3 ≤ n, m ≤ 50).
 *         <p/>
 *         n is an odd number.
 *         <p/>
 *         Output
 *         Output n lines. Each line should contain a string consisting of m characters. Do not output spaces.
 *         <p/>
 *         Sample test(s)
 *         input
 *         3 3
 *         output
 *         ###
 *         ..#
 *         ###
 *         input
 *         3 4
 *         output
 *         ####
 *         ...#
 *         ####
 *         input
 *         5 3
 *         output
 *         ###
 *         ..#
 *         ###
 *         #..
 *         ###
 *         input
 *         9 9
 *         output
 *         #########
 *         ........#
 *         #########
 *         #........
 *         #########
 *         ........#
 *         #########
 *         #........
 *         #########
 */

public class FoxAndSnake {

    public void find(int n, int m) {
        String head = "";
        String right = "";
        String left = "";
        char c = '#';

        for (int i = 0; i < m; i++) {
            head += c;
        }

        for (int i = 0; i < m - 1; i++) {
            right += ".";
        }

        for (int i = 0; i < m - 1; i++) {
            left += ".";
        }

        right += c;
        left = c + left;

        boolean leftU = false;

        for (int i = 0; i < n - 1; ) {
            System.out.println(head);
            i++;
            if (leftU) {
                System.out.println(left);
            } else {
                System.out.println(right);
            }
            i++;
            leftU = !leftU;
        }

        System.out.println(head);
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        FoxAndSnake main = new FoxAndSnake();
        int[] data = scanner.nextIntArray();
        main.find(data[0], data[1]);

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


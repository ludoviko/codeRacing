package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje
 *         <p/>
 *         Two players play a simple game. Each player is provided with a box with balls. First player's box contains exactly n1 balls and second player's box contains exactly n2 balls. In one move first player can take from 1 to k1 balls from his box and throw them away. Similarly, the second player can take from 1 to k2 balls from his box in his move. Players alternate turns and the first player starts the game. The one who can't make a move loses. Your task is to determine who wins if both players play optimally.
 *         <p/>
 *         Input
 *         The first line contains four integers n1, n2, k1, k2. All numbers in the input are from 1 to 50.
 *         <p/>
 *         This problem doesn't have subproblems. You will get 3 points for the correct submission.
 *         <p/>
 *         Output
 *         Output "First" if the first player wins and "Second" otherwise.
 *         <p/>
 *         Sample test(s)
 *         input
 *         2 2 1 2
 *         output
 *         Second
 *         input
 *         2 1 1 1
 *         output
 *         First
 *         Note
 *         Consider the first sample test. Each player has a box with 2 balls. The first player draws a single ball from his box in one move and the second player can either take 1 or 2 balls from his box in one move. No matter how the first player acts, the second player can always win if he plays wisely.
 */

public class Game {

    public String find(int[] data) {
        while (true) {
            if (--data[0] == 0) {
                return "Second";
            }
            if (--data[1] == 0) {
                return "First";
            }
        }
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        Game main = new Game();

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


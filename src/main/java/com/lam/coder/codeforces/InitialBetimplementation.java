package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author There are five people playing a game called "Generosity". Each person gives some non-zero number of coins b as an initial bet. After all players make their bets of b coins, the following operation is repeated for several times: a coin is passed from one player to some other player.
 *         <p/>
 *         Your task is to write a program that can, given the number of coins each player has at the end of the game, determine the size b of the initial bet or find out that such outcome of the game cannot be obtained for any positive number of coins b in the initial bet.
 *         <p/>
 *         Input
 *         The input consists of a single line containing five integers c1, c2, c3, c4 and c5 — the number of coins that the first, second, third, fourth and fifth players respectively have at the end of the game (0 ≤ c1, c2, c3, c4, c5 ≤ 100).
 *         <p/>
 *         Output
 *         Print the only line containing a single positive integer b — the number of coins in the initial bet of each player. If there is no such value of b, then print the only value "-1" (quotes for clarity).
 *         <p/>
 *         Sample test(s)
 *         input
 *         2 5 4 0 4
 *         output
 *         3
 *         input
 *         4 5 9 2 1
 *         output
 *         -1
 *         Note
 *         In the first sample the following sequence of operations is possible:
 *         <p/>
 *         One coin is passed from the fourth player to the second player;
 *         One coin is passed from the fourth player to the fifth player;
 *         One coin is passed from the first player to the third player;
 *         One coin is passed from the fourth player to the second player.
 */

public class InitialBetimplementation {
    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        String string = scanner.next();
        String[] data = string.split(" ");

        int[] a = new int[data.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(data[i]);
        }

        int sum = 0;
        for (int i : a) {
            sum += i;
        }

        int k;
        if (sum == 0) {
            k = -1;
        } else {
            k = (sum % 5 == 0 ? sum / 5 : -1);
        }

        out.println(k);

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

    }
}


package com.lam.coder.kattis;

import java.io.*;

/**
 * @codeSolution  L.Azuaje.
 *
 *         <p/>
 *         Jack and Jill developed a special encryption method, so they can enjoy conversations without worrrying about eavesdroppers.
 *         Here is how: let LL be the length of the original message, and MM be the smallest square number greater than or equal to LL.
 *         Add (M−L)(M−L) asterisks to the message, giving a padded message with length MM. Use the padded message to fill a table of size K×KK×K,
 *         where K2=MK2=M. Fill the table in row-major order (top to bottom row, left to right column in each row).
 *         Rotate the table 9090 degrees clockwise. The encrypted message comes from reading the message in row-major order from the rotated table, omitting any asterisks.
 *         <p/>
 *         For example, given the original message ‘iloveyouJack’, the message length is L=12L=12.
 *         Thus the padded message is ‘iloveyouJack****’, with length M=16M=16. Below are the two tables before and after rotation.
 *         <p/>
 *         Then we read the secret message as ‘Jeiaylcookuv’.
 *         <p/>
 *         Input
 *         The first line of input is the number of original messages, 1≤N≤1001≤N≤100.
 *         The following NN lines each have a message to encrypt.
 *         Each message contains only characters a–z (lower and upper case), and has length 1≤L≤100001≤L≤10000.
 *         <p/>
 *         Output
 *         For each original message, output the secret message.
 *         <p/>
 *         Sample Input 1	Sample Output 1
 *         2
 *         iloveyoutooJill
 *         TheContestisOver
 *         iteiloylloooJuv
 *         OsoTvtnheiterseC
 */

public class SecretMessage {
    private String string;

    public SecretMessage(String string) {
        this.string = string;
    }

    public String find() {
        char[][] origin = toArray();
        int n = origin.length;

        char[][] destination = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                destination[j][n - 1 - i] = origin[i][j];
            }
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (destination[i][j] == '*') {
                    continue;
                }
                builder.append(destination[i][j]);
            }
        }

        return builder.toString();
    }

    private char[][] toArray() {
        int n = (int) Math.ceil(Math.sqrt(string.length()));
        string += stars(n * n - string.length());

        char[][] data = new char[n][n];

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = string.charAt(k++);
            }
        }

        return data;
    }

    private String stars(int n) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            builder.append("*");
        }

        return builder.toString();
    }

    public static void main(String[] args) throws IOException {
        SecretMessage main;
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int n = scanner.nextInt();

        for (int i = 0 ; i < n; i++) {
            String string = scanner.next();
            main = new SecretMessage(string);
            out.println(main.find());
        }

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
                str = this.reader.readLine();
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


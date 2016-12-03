package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author Code Forces.  Solution by: L.Azuaje.
 *         <p>
 *         Problem: 330A Cakeminator.
 *         <p>
 *         Used at Codeforces: #192 Div-2.
 */

public class Cakeminator {

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int[] data = scanner.nextIntArray();
        String[] matrix = new String[data[0]];
        int c = 0;

        char[][] matrixChars = new char[data[0]][data[1]];

        for (int i = 0; i < data[0]; i++) {
            matrix[i] = scanner.next();
            matrixChars[i] = matrix[i].toCharArray();
        }

        boolean anS = false;

        for (int i = 0; i < data[0]; i++) {
            for (int j = 0; j < data[1]; j++) {
                if (matrixChars[i][j] == 'S') {
                    anS = true;
                    break;
                } else {
                }
            }

            if (!anS) {
                for (int j = 0; j < data[1]; j++) {
                    matrixChars[i][j] = 'X';
                }
            }
            anS = false;
        }

        for (int j = 0; j < data[1]; j++) {
            for (int i = 0; i < data[0]; i++) {
                if (matrixChars[i][j] == 'S') {
                    anS = true;
                    break;
                } else {
                }
            }

            if (!anS) {
                for (int i = 0; i < data[0]; i++) {
                    matrixChars[i][j] = 'X';
                }
            }
            anS = false;
        }

        for (int i = 0; i < data[0]; i++) {
            for (int j = 0; j < data[1]; j++) {
                if (matrixChars[i][j] == 'X') {
                    c++;
                }
            }
        }

        out.println(c);

        scanner.close();
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


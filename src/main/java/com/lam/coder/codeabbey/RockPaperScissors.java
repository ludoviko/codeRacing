package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Locale;

/**
 * @author L.Azuaje.
 *         <p>
 *         Code Abbey: 49	 Rock Paper Scissors.          Implementation .
 *         <p>
 *         Rock beats Scissors (by blunting them)
 *         Scissors beat Paper (by cutting it)
 *         Paper beats Rock (by covering it)
 */

public class RockPaperScissors {
    public RockPaperScissors() {
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int n = scanner.nextInt();
        String string = null;
        String[] data = null;
        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < n; i++) {
            string = scanner.next();
            data = string.split(" ");
            for (int j = 0; j < data.length; j++) {
                if (data[j].equals("RS") || data[j].equals("SP") || data[j].equals("PR")) {
                    p1++;
                } else if (data[j].equals("SR") || data[j].equals("PS") || data[j].equals("RP")) {
                    p2++;
                }
            }
            if (p1 > p2) {
                out.format(Locale.US, "%d ", 1);
            } else {
                out.format(Locale.US, "%d ", 2);
            }
            p1 = 0;
            p2 = 0;
        }

        out.println();

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

        float[] nextFloatArray() {
            String[] data = nextStringArray();
            float[] a = new float[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Float.parseFloat(data[i]);
            }

            return a;
        }

        double[] nextDoubleArray() {
            String[] data = nextStringArray();
            double[] a = new double[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Double.parseDouble(data[i]);
            }

            return a;
        }
    }
}


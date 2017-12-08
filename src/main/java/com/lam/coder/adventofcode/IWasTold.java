package com.lam.coder.adventofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Problem Author:  Advent of Code (AdventOfCode.com).
 *
 * @author Solution by: L.Azuaje.
 *         <p>
 *         AdventOfCode: 2015-002:      I Was Told There Would Be No Math.
 */

public class IWasTold {
    public IWasTold() {
    }

    public static int find(int a, int b, int c) {
        return 2 * (a * b + b * c + a * c) + Math.min(a * b, Math.min(b * c, a * c));
    }


    public static int findRibbon(int a, int b, int c) {
        int total = 0;
        total = a * b * c;
        int max = Math.max(a, Math.max(b, c));
        total += 2 * (a + b + c - max);

        return total;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        String string;
        String[] data = null;
        int[] dim = new int[3];

        int sum = 0;
        int ribbon = 0;
        while (!(string = scanner.next()).equals("")) {
            data = string.split("x");

            for (int i = 0; i < data.length; i++) {
                dim[i] = Integer.parseInt(data[i]);
            }

//            sum += find(dim[0], dim[1], dim[2]);
            ribbon += findRibbon(dim[0], dim[1], dim[2]);
        }

        //       out.println(sum);
        out.println(ribbon);
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


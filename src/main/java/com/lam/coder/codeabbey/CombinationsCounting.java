package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigInteger;

/**
 * @author L.Azuaje.
 */

public class CombinationsCounting {
    public static BigInteger factorialBI(int n) {
        BigInteger[] table = new BigInteger[(int) (n + 1)];

        table[0] = BigInteger.ONE;
        if (n > 0) {
            table[1] = BigInteger.ONE;
        }

        for (int i = 2; i <= n; i++) {
            table[i] = new BigInteger(i + "").multiply(table[i - 1]);
        }

        return table[n];
    }

    public static BigInteger permutationsBI(int n, int m) {
        BigInteger big = new BigInteger("1");

        for (long i = n; i > n - m; i--) {
            big = big.multiply(new BigInteger(i + ""));
        }
        return big;
    }

    //	n! / (r!(n−r)!)
    public static BigInteger combinationsBI(int n, int m) {
        BigInteger permutation = permutationsBI(n, m);
        BigInteger factorial_m = factorialBI(m);

        return permutation.divide(factorial_m);
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int n = scanner.nextInt();
        int[] data;

        for (int i = 0; i < n; i++) {
            data = scanner.nextIntArray();
            out.format("%d ", combinationsBI(data[0], data[1]));
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


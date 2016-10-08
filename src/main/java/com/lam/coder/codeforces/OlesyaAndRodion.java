package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigInteger;

/**
 * @author : Solution by L.Azuaje.
 *         <p>
 *         <p>
 *         584A	     Olesya And Rodion.
 */

public class OlesyaAndRodion {
    public static BigInteger findBI(int len, int divisor) {
        BigInteger div = new BigInteger("" + divisor);
        BigInteger from = BigInteger.TEN.pow(len - 1);
        BigInteger upTo = BigInteger.TEN.pow(len - 1).multiply(BigInteger.TEN);
        BigInteger solution = new BigInteger("-1");

        while (from.compareTo(upTo) < 0) {
            if (from.mod(div).compareTo(BigInteger.ZERO) == 0) {
                solution = from;
                break;
            }
            from = from.add(BigInteger.ONE);

        }

        return solution;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int[] data = scanner.nextIntArray();

        out.println(OlesyaAndRodion.findBI(data[0], data[1]).toString());

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


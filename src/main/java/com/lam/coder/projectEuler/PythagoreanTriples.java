package com.lam.coder.projectEuler;

import com.lam.mathematics.PythagoreanTriplet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p>
 *         <p>
 *         Problem 9: Special Pythagorean triplet
 *         <p>
 *         A Pythagorean triplet is a set of three natural numbers, a < b < c,
 *         for which, a^2 + b^2 = c^2
 *         <p>
 *         For example, 32 + 42 = 9 + 16 = 25 = 52.
 *         <p>
 *         There exists exactly one Pythagorean triplet for which a + b + c =
 *         1000. Find the product abc.
 *         <p>
 *         a = 2mn
 *         b = m*m - n*n
 *         c = m*m + n*n
 *         <p>
 *         Answer = 31875000.
 *         <p>
 *         <p>
 *         a*a + b*b = c*c;
 *         a + b + c = n;
 *         <p>
 *         <p>
 *         Solution:
 *         <p>
 *         b = (n . n - 2an)/2(n-a);
 */

public class PythagoreanTriples {

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        PythagoreanTriplet main;

        // Number of test cases.
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            main = new PythagoreanTriplet(scanner.nextInt());
            main.find();
            if (main.getC() == -1) {
                out.format("%d ", main.getC());
            } else {
                out.format("%d ", main.getA() * main.getB() * main.getC());
            }
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


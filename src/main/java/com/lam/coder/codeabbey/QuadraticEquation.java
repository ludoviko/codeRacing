package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p>
 *         Find the solutions to the equations:
 *         <p>
 *         A * x^2 + B * x + C = 0
 */

public class QuadraticEquation {
    private final double A;
    private final double B;
    private final double C;

    public QuadraticEquation(double a, double b, double c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public double findDiscriminant() {
        return this.B * this.B - 4 * this.A * this.C;
    }

    public String findFirstRoot() {
        double discriminant = findDiscriminant();
        double solution;
        String sol;

        if (discriminant >= 0) {
            solution = -this.B + Math.sqrt(discriminant);
            solution /= 2 * this.A;
            sol = Integer.toString((int) solution);
        } else {
            solution = -this.B / (2 * this.A);
            sol = Integer.toString((int) solution) + "+" + Integer.toString((int) ((int) Math.sqrt(-discriminant) / (2 * this.A))) + "i";
        }

        return sol;
    }

    public String findSecondRoot() {
        double discriminant = findDiscriminant();
        double solution;
        String sol;

        if (discriminant >= 0) {
            solution = -this.B - Math.sqrt(discriminant);
            solution /= 2 * this.A;
            sol = Integer.toString((int) solution);
        } else {
            solution = -this.B / (2 * this.A);
            sol = Integer.toString((int) solution) + "-" + Integer.toString((int) ((int) Math.sqrt(-discriminant) / (2 * this.A))) + "i";
        }

        return sol;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        QuadraticEquation main;
        double[] data;

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            data = scanner.nextDoubleArray();
            main = new QuadraticEquation(data[0], data[1], data[2]);
            out.format("%s ", main.findFirstRoot());
            out.format("%s", main.findSecondRoot());
            if (i < n - 1) {
                out.format("%s", "; ");
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


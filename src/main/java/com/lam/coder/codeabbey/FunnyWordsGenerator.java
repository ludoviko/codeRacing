package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 */

public class FunnyWordsGenerator {
    public static final String CONSONANTS = "bcdfghjklmnprstvwxz";
    public static final String VOWELS = "aeiou";

    public FunnyWordsGenerator() {
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        LinearCongruentialGeneratorFW generatorFW = null;

        int[] data = scanner.nextIntArray();
        int[] lengths = scanner.nextIntArray();
        StringBuilder builder = null;
        int next = -1;

        generatorFW = new LinearCongruentialGeneratorFW(445, 700001, 2097152, data[1]);

        for (int i = 0; i < data[0]; i++) {
            builder = new StringBuilder();
            for (int j = 0; j < lengths[i]; j++) {
                next = generatorFW.findNext();
                if (j % 2 == 0) {
                    next = next % 19;
                    builder.append(CONSONANTS.charAt(next));
                } else {
                    next = next % 5;
                    builder.append(VOWELS.charAt(next));
                }
            }
            out.format("%s ", builder.toString());
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

class LinearCongruentialGeneratorFW {
    private final int A;
    private final int X0;
    private final int C;
    private final int M;
    private int next;

    public LinearCongruentialGeneratorFW(int a, int c, int m, int x0) {
        this.A = a;
        this.X0 = x0;
        this.next = x0;
        this.C = c;
        this.M = m;
    }

    public int findNext() {
        this.next = (this.A * next + this.C) % this.M;
        return next;
    }
}
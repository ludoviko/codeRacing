package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 */

public class LevenshteinDistance {
    private String word1;
    private String word2;
    private int[][] matrix;

    public LevenshteinDistance(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
        this.matrix = new int[word2.length() + 1][word1.length() + 1];
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        LevenshteinDistance main = null;

        int n = scanner.nextInt();
        String[] data = null;

        for (int i = 0; i < n; i++) {
            data = scanner.nextStringArray();
            main = new LevenshteinDistance(data[0], data[1]);
            out.format("%d ", main.maximumDistance());
        }

        out.println();

        scanner.reader.close();
        out.close();
    }

    public int maximumDistance() {
        int substitutionCost = 0;

        for (int column = 0; column < this.matrix[0].length; column++) {
            this.matrix[0][column] = column;
        }

        for (int row = 0; row < this.matrix.length; row++) {
            this.matrix[row][0] = row;
        }

        for (int row = 1; row < this.matrix.length; row++) {
            for (int column = 1; column < this.matrix[0].length; column++) {
                if (this.word1.charAt(column - 1) == this.word2.charAt(row - 1)) {
                    substitutionCost = 0;
                } else {
                    substitutionCost = 1;
                }

                this.matrix[row][column] = Math.min(this.matrix[row - 1][column] + 1,
                        Math.min(this.matrix[row][column - 1] + 1, this.matrix[row - 1][column - 1] + substitutionCost));
            }
        }

        return this.matrix[this.matrix.length - 1][this.matrix[0].length - 1];
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


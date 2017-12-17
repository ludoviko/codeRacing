package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author CodeAbbey.com
 *         <p>
 *         Solution by: LAzuaje.
 *         <p>
 *         Code Abbey: 75	 Yacht or Dice Poker          Simple mat.
 */

public class YachtOrDicePoker {
    int[] counter;

    public YachtOrDicePoker() {
        this.counter = new int[7];
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        YachtOrDicePoker main;

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            main = new YachtOrDicePoker();
            main.count(scanner.nextIntArray());
            out.format("%s ", main.description());
        }

        out.println();

        scanner.reader.close();
        out.close();
    }

    public void count(int[] data) {
        for (int i = 0; i < data.length; i++) {
            counter[data[i]]++;
        }
    }

    public int count(int n) {
        int c = 0;
        for (int i : this.counter) {
            if (i == n) {
                c++;
            }
        }
        return c;
    }

    public boolean isSmallStraight() {
        return counter[1] == 1 && counter[2] == 1 && counter[3] == 1 && counter[4] == 1 && counter[5] == 1;
    }

    public boolean isBigStraight() {
        return counter[6] == 1 && counter[2] == 1 && counter[3] == 1 && counter[4] == 1 && counter[5] == 1;
    }

    public String description() {
        if (count(2) == 2) {
            return "two-pairs";
        } else if (count(2) == 1 && count(3) == 1) {
            return "full-house";
        } else if (isBigStraight()) {
            return "big-straight";
        } else if (isSmallStraight()) {
            return "small-straight";
        } else if (count(4) == 1) {
            return "four";
        } else if (count(5) == 1) {
            return "yacht";
        } else if (count(2) == 1) {
            return "pair";
        } else {
            return "three";
        }
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


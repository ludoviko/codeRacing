package com.lam.coder.uva;

import java.io.*;

/**
 *
 * @author LAzuaje.
 *
 *
 *
 */

public class EmoogleBalance {
	public int find(int[] data ) {
        int sum = 0;
        for (int i : data  ) {
            if (i == 0) {
                sum--;
            } else {
                sum++;
            }
        }

        return sum;
     }

    public static void main (String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        EmoogleBalance main = new EmoogleBalance();

        int i = 1;
        while ( ! (scanner.next()).equals("0")) {
            // Read test data
            // Process line of input Here
            int r = main.find(scanner.nextIntArray());
            out.println("Case " +  i++ + ":" + " "+ r);
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
            String[] data  = nextStringArray();
            int[] a  = new int[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        Integer[] nextIntegerArray() {
            String[] data  = nextStringArray();
            Integer[] a  = new Integer[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        long[] nextLongArray() {
            String[] data  = nextStringArray();
            long[] a  = new long[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Long.parseLong(data[i]);
            }

            return a;
        }
    }
}
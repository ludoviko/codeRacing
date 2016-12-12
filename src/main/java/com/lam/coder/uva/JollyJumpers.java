package com.lam.coder.uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;


/**
 * @author UVA on Line. Solution by L.Azuaje.
 *
 * Vol/Cod/Name: 100 10038  Jolly Jumpers
 *
 */

public class JollyJumpers {
    public static boolean isJolly(Integer[] data) {
        boolean isJolly = true;
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 1; i < data.length; i++) {
            set.add(Math.abs( data[i] - data[i-1] ));
        }

        for (int i = 1; i < data.length; i++) {
            if (! set.contains(i)) {
                isJolly = false;
                break;
            }
        }

        return isJolly;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        String line;
        Integer[] data;
        Integer[] data2;

        while ( (line = scanner.next()) != null ) {
            data = scanner.toIntegerArray(line.trim().split(" "));
            data2 = new Integer[data.length -1];
            System.arraycopy(data, 1, data2, 0, data.length -1);

            if (isJolly(data2)) {
                out.println("Jolly");
            } else {
                out.println("Not jolly");
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
                str = this.reader.readLine();
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


        Integer[] toIntegerArray(String[] data) {
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


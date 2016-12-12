package com.lam.coder.uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author UVA on Line. Solution by L.Azuaje.
 *
 *  Vol/Cod/Name: 100 	 10050     Hartals.
 *
 */

public class Hartals {
    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int n = scanner.nextInt();
        int parties;
        int days;
        int factor;
        int times;
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            days = scanner.nextInt();
            parties = scanner.nextInt();
            for (int j = 0; j < parties; j++) {
                factor = scanner.nextInt();
                times = days / factor;
                for (int k = 1; k <= times; k++) {
                    // Exclude the  6th and 7th days.
                    if ( k * factor % 7 == 6 || k * factor % 7 == 0 ) {
                    } else {
                        set.add(k * factor);
                    }
                }
            }
            out.println(set.size());
            set.clear();
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


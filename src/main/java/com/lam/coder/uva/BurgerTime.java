package com.lam.coder.uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


/**
 * @author  Solution by L.Azuaje.
 *
 *
 *
 */

public class BurgerTime {
    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int n;
        String string;
        boolean isR = false;
        boolean isD = false;
        String expected = "";
        int countR = 0;
        int countD = 0;
        int minDistance = Integer.MAX_VALUE;

        while ((n = scanner.nextInt()) != 0) {
            string = scanner.next();
            if (string.contains("Z")) {
                out.println(0);
            } else {
                for (int i = 0; i < string.length(); i++) {
                    if (string.charAt(i) == 'R') {
                        isR = true;
                        countR = i;
                        if (expected.equals("R")) {
                            if (i - countD < minDistance) {
                                minDistance = i - countD;
                            }
                            isD = false;
                        }
                        expected = "D";
                    } else if (string.charAt(i) == 'D') {
                        isD = true;
                        countD = i;
                        if (expected.equals("D")) {
                            if (i - countR < minDistance) {
                                minDistance = i - countR;
                            }
                            isR = false;
                        }
                        expected = "R";
                    }
                }
                out.println(minDistance);
                isR = false;
                isD = false;
                expected = "";
                countR = 0;
                countD = 0;
                minDistance = Integer.MAX_VALUE;
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


package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author Code Forces.  Solution by: L.Azuaje.
 *         <p>
 *         Problem: 732A  Buy a Shovel.
 *         <p>
 *         Used at Codeforces: Round 377 Div-2.
 */

public class BuyAShovel {

    public static int find(int price, int bankNote) {
        int solution = 0;
        int partial = 10000000;
        int i = 1;

        int priceEnd = price % 10;

        if (priceEnd == 0) {
            solution = 1;
        } else {
            if ( 10 % priceEnd == 0 ) {
                partial = 10 / priceEnd;
            } else if (priceEnd % 2 == 0 ) {
                partial = 5;
            }

            if ( bankNote % priceEnd  == 0) {
                solution =  bankNote / priceEnd;
            } else {
                for (i = 1; i <= 10; i++) {
                    if ( (priceEnd) % 10 == bankNote ) {
                        break;
                    } else {
                        priceEnd += price % 10;
                    }
                }
                if (i == 11) {
                    solution = Math.min(10, partial);
                } else {
                    solution = i;
                }
            }
        }
        return solution;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int[] data = scanner.nextIntArray();

        out.println(find(data[0], data[1]));

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


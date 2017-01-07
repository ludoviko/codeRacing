package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author Code Forces.  Solution by: L.Azuaje.
 *         <p>
 *         Problem: 733B  Parade.
 *         <p>
 *         Used at Codeforces: #378 Div-2.
 */

public class Parade_733 {
    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        long lefts = 0;
        long rights = 0;
        long[] data;
        // Min differcence between left and right.
        long minLR = Integer.MAX_VALUE;
        int indexLR = -1;
        // Min differcence between right and left.
        long minRL = Integer.MAX_VALUE;
        int indexRL = -1;

        int n = scanner.nextInt();

        long[][] array = new long[n][2];

        for (int i = 0; i < n; i++) {
            data = scanner.nextLongArray();
            array[i] = data;
            lefts += data[0];
            rights += data[1];

            if (data[0] - data[1] < minLR) {
                minLR = data[0] - data[1];
                indexLR = i;
            }

            if (data[1] - data[0] < minRL) {
                minRL = data[1] - data[0];
                indexRL = i;
            }
        }

        long solution = Math.abs(lefts - rights);
        long partial;

        int column = -1;

        long leftsAux = lefts;
        long rightsAux = rights;

        leftsAux -= array[indexLR][0];
        leftsAux += array[indexLR][1];
        rightsAux -= array[indexLR][1];
        rightsAux += array[indexLR][0];

        lefts -= array[indexRL][0];
        lefts += array[indexRL][1];
        rights -= array[indexRL][1];
        rights += array[indexRL][0];

        if (Math.abs(leftsAux - rightsAux) > Math.abs(lefts - rights )) {
            column = indexLR;
        } else {
            column = indexRL;
        }
        partial = Math.max(Math.abs(leftsAux - rightsAux), Math.abs(lefts - rights));

        if (partial > solution) {
            out.println(column + 1);
        } else {
            out.println(0);
        }

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


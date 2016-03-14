package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1B: Spreadsheets.
 *
 * In the popular spreadsheets systems (for example, in Excel) the following numeration of columns is used. The first column has number A, the second — number B, etc. till column 26 that is marked by Z. Then there are two-letter numbers: column 27 has number AA, 28 — AB, column 52 is marked by AZ. After ZZ there follow three-letter numbers, etc.

 The rows are marked by integer numbers starting with 1. The cell name is the concatenation of the column and the row numbers. For example, BC23 is the name for the cell that is in column 55, row 23.

 Sometimes another numeration system is used: RXCY, where X and Y are integer numbers, showing the column and the row numbers respectfully. For instance, R23C55 is the cell from the previous example.

 Your task is to write a program that reads the given sequence of cell coordinates and produce each item written according to the rules of another numeration system.

 Input
 The first line of the input contains integer number n (1???n???105), the number of coordinates in the test. Then there follow n lines, each of them contains coordinates. All the coordinates are correct, there are no cells with the column and/or the row numbers larger than 106 .

 Output
 Write n lines, each line should contain a cell coordinates in the other numeration system.

 Examples
 input
 2
 R23C55
 BC23
 output
 BC23
 R23C55
 *
 */
public class Spreadsheets {
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String convertFromDecimalTo26(int decimal) {
        StringBuilder builder = new StringBuilder();
        int remainder;

        while (decimal > 26) {
            remainder = decimal % 26;
            if (remainder == 0) {
                remainder = 26;
                decimal--;
            }
            builder.append(ALPHABET.charAt(remainder - 1));
            decimal = decimal / 26;
        }

        remainder = decimal % 26;
        if (remainder == 0) {
            remainder = 26;
        }
        builder.append(ALPHABET.charAt(remainder - 1));

        return builder.reverse().toString();
    }

    public static int convertFrom26ToDecimal(String s26) {
        int p = s26.length() - 1;
        int i = 0;
        int value;
        int total = 0;

        while ( p  >=  0) {
            value  = s26.charAt(i++) - ('A' - 1);
            value = (int)Math.pow(26, p) * value;
            total += value;
            p--;
        }

        return total;
    }

    public static String procesData(String string) {
        String data = "";
        int f = -1;

        // Format: ColumnRow where Column in letters and Row in whole numberr.
        String CCRR = "[A-Z]+\\d+";

        if (string.matches(CCRR)) {
            // Convert from 26-base to decimal.
            for (int i = 0; i < string.length(); i++) {
                if ( Character.isDigit(string.charAt(i))  ) {
                    f = i;
                    break;
                }
            }
            data = "R" + string.substring(f) + "C" + convertFrom26ToDecimal(string.substring(0, f));
        } else {
            // Convert from decimal to 26-base.
            f = string.indexOf('C');
            int n = Integer.parseInt(string.substring(f + 1));
            data = convertFromDecimalTo26(n) +  string.substring(1, f) ;
        }

        return data;
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

    public static void main(String[] strings) throws IOException {
        MyScanner scanner = new MyScanner();

        int n  = scanner.nextInt();
        int i = 0;
        String data = "";
        while (i++ < n) {
                data = scanner.next();
                System.out.println(Spreadsheets.procesData(data));
        }
    }
}


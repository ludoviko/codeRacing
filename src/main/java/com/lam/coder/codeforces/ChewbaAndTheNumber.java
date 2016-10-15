package com.lam.coder.codeforces;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * @author Solution by: L.Azuaje.
 *         <p>
 *         Codeforces: 514A.  Round #291 (Div. 2). 	Chewbaсca and Number.
 */


public class ChewbaAndTheNumber {

    public static String find(String string) {
        char[] data = string.toCharArray();
        char nine = '9';
        String solution = "";

        if (string.matches("$9+^")) {
            for (int i = 0; i < data.length; i++) {
                if (nine - data[i] < data[i] - '0' && nine - data[i] != 0) {
                    solution += (nine - data[i]);
                } else {
                    solution += data[i];
                }
            }
        } else {
            for (int i = 0; i < data.length; i++) {
                if (nine - data[i] < data[i] - '0') {
                    solution += (nine - data[i]);
                } else {
                    solution += data[i];
                }
            }
        }

        if (solution.charAt(0) == '0') {
            solution = "9" + solution.substring(1);
        }
        return solution;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        ChewbaAndTheNumber main = new ChewbaAndTheNumber();

        String string = scanner.next();

        out.println(main.find(string));

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

    }
}


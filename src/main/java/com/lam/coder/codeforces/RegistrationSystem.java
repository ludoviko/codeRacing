package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Solution by: L.Azuaje.
 *         <p>
 *         Codeforces: 4C  Registration System.
 */

public class RegistrationSystem {
    private Map<String, Integer> dictionary;

    public RegistrationSystem() {
        this.dictionary = new HashMap<String, Integer>();
    }

    private void update(String string) {
        this.dictionary.put(string, this.dictionary.getOrDefault(string, 0) + 1);
    }

    public Map<String, Integer> getDictionary() {
        return this.dictionary;
    }

    public String updateAndCheck(String string) {
        String response = "";

        if ( ! this.getDictionary().containsKey(string)) {
            response = "OK";
            this.update(string);
        } else {
            response = string + this.getDictionary().get(string);
            this.update(string);
        }

        return response;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        RegistrationSystem main = new RegistrationSystem();

        int n = scanner.nextInt();

        String string;
        for (int i = 0; i < n; i++) {
            string = scanner.next();
            out.println(main.updateAndCheck(string));
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


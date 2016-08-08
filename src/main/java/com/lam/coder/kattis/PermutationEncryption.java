package com.lam.coder.kattis;

import java.io.*;

/**
 * 
 * @author Solution by: L.Azuaje.
 *
 *
 *
 */

// XXX Solution rejected by judge.
public class PermutationEncryption {
	public String find(int[] keys, String string) {
        if (string.length() % keys.length != 0) {
            string = string + addSpaces(keys.length - string.length() % keys.length);
        }

        return process(keys, string);
	}

    private String process(int[] keys, String string) {
        StringBuilder builder = new StringBuilder();
        int k = 0;

        for (int i = 0; i <string.length()/keys.length; i++) {
            for (int j = 0; j < keys.length; j++) {
                builder.append(string.charAt(keys[j] + i * keys.length - 1 ));
            }
        }

        return builder.toString();
    }

    private String addSpaces(int n) {
        StringBuilder spaces = new StringBuilder();

        for (int i = 0; i < n; i++) {
            spaces.append(" ");
        }

        return spaces.toString();
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        PermutationEncryption main = new PermutationEncryption();

        int[] data;
        int[] keys;
        String string;

        while (true) {
            data = scanner.nextIntArray();
            if (data[0] == 0) {
                break;
            }

            keys = new int[data.length -1];
            for (int i = 1; i < data.length ; i++) {
               keys[i-1] = data[i];
            }

            string = scanner.next();
            out.println(main.find(keys, string));
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


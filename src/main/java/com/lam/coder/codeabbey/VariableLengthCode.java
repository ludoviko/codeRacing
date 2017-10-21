package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author L.Azuaje.
 */

public class VariableLengthCode {
    public static final Map<Character, String> map = new HashMap<Character, String>();

    static {
        map.put(' ', "11");
        map.put('t', "1001");
        map.put('n', "10000");
        map.put('s', "0101");
        map.put('r', "01000");
        map.put('d', "00101");
        map.put('!', "001000");
        map.put('c', "000101");
        map.put('m', "000011");
        map.put('g', "0000100");
        map.put('b', "0000010");
        map.put('v', "00000001");
        map.put('k', "0000000001");
        map.put('q', "000000000001");
        map.put('e', "101");
        map.put('o', "10001");
        map.put('a', "011");
        map.put('i', "01001");
        map.put('h', "0011");
        map.put('l', "001001");
        map.put('u', "00011");
        map.put('f', "000100");
        map.put('p', "0000101");
        map.put('w', "0000011");
        map.put('y', "0000001");
        map.put('j', "000000001");
        map.put('x', "00000000001");
        map.put('z', "000000000000");
    }

    private String message;

    public VariableLengthCode(String message) {
        this.message = message;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        VariableLengthCode main = new VariableLengthCode(scanner.next());

        String solution = main.toHexadecimal();

        out.format("%s %n", solution);

        scanner.reader.close();
        out.close();
    }

    private String encode() {
        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < this.message.length(); i++) {
            encoded.append(map.get(this.message.charAt(i)));
        }

        if (encoded.length() % 8 != 0) {
            int remainder = encoded.length() % 8;
            for (int i = 0; i < 8 - remainder; i++) {
                encoded.append("0");
            }
        }

        return encoded.toString();
    }

    public String toHexadecimal() {
        StringBuilder hexadecimal = new StringBuilder();

        String encoded = this.encode();

        int n = encoded.length() / 4;

        String byteData = "";

        for (int i = 0; i < n; i++) {
            byteData = encoded.substring(i * 4, i * 4 + 4);
            hexadecimal.append(Integer.toHexString(Integer.parseInt(byteData, 2)));
            if (i % 2 == 1) {
                hexadecimal.append(' ');
            }
        }

        return hexadecimal.toString().toUpperCase();
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

        float[] nextFloatArray() {
            String[] data = nextStringArray();
            float[] a = new float[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Float.parseFloat(data[i]);
            }

            return a;
        }

        double[] nextDoubleArray() {
            String[] data = nextStringArray();
            double[] a = new double[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Double.parseDouble(data[i]);
            }

            return a;
        }
    }
}


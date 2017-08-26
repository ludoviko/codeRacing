package com.lam.coder.codeabbey;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 */

public class LuhnAlgorithm {

    public static boolean isRight(long code) {
        long sum = 0;
        long remainder;

        int i = 1;
        while (code > 0) {
            remainder = code % 10;
            code = code / 10;
            if (i++ % 2 == 0) {
                remainder = remainder * 2;
                sum += remainder > 9 ? remainder - 9 : remainder;
            } else {
                sum += remainder;
            }
        }

        return sum % 10 == 0;
    }

    public static boolean isRight(String code) {
        String reverse = new StringBuilder(code).reverse().toString();
        int sum = 0;

        for (int i = 0; i < reverse.length(); i++) {
            if ((i + 1) % 2 == 0) {
                sum += Character.getNumericValue(reverse.charAt(i)) * 2 < 10 ? Character.getNumericValue(reverse.charAt(i)) * 2 :
                        Character.getNumericValue(reverse.charAt(i)) * 2 - 9;
            } else {
                sum += Character.getNumericValue(reverse.charAt(i));
            }
        }

        return sum % 10 == 0;
    }

    public static String swap(int position1, int position2, String string) {
        char[] data = string.toCharArray();
        char c1 = data[position1];
        data[position1] = data[position2];
        data[position2] = c1;
        return new String(data);
    }

    public static String findInterrogationMark(String code) {
        String reverse = new StringBuilder(code).reverse().toString();
        char interrogationMark = '?';
        boolean isEven = false;
        int sum = 0;
        int aux;
        String x;

        for (int i = 0; i < reverse.length(); i++) {
            if (reverse.charAt(i) == interrogationMark) {
                if ((i + 1) % 2 == 0) {
                    isEven = true;
                }
            } else {
                if ((i + 1) % 2 == 0) {
                    sum += Character.getNumericValue(reverse.charAt(i)) * 2 < 10 ? Character.getNumericValue(reverse.charAt(i)) * 2 :
                            Character.getNumericValue(reverse.charAt(i)) * 2 - 9;
                } else {
                    sum += Character.getNumericValue(reverse.charAt(i));
                }
            }
        }

        boolean goOn = true;

        // Brute force.
        do {
            if (isEven) {
                for (int i = 0; i < 10; i++) {
                    if (i < 5) {
                        aux = sum + i * 2;
                        if (aux % 10 == 0) {
                            x = i + "";
                            code = code.replace(interrogationMark + "", x);
                            goOn = false;
                            break;
                        }
                    } else {
                        aux = sum + i * 2 - 9;
                        if (aux % 10 == 0) {
                            x = i + "";
                            code = code.replace(interrogationMark + "", x);
                            goOn = false;
                            break;
                        }
                    }
                }
            } else {
                for (int i = 0; i < 10; i++) {
                    aux = sum + i;
                    if (aux % 10 == 0) {
                        x = i + "";
                        code = code.replace(interrogationMark + "", x);
                        goOn = false;
                        break;
                    }
                }
            }
        } while (goOn);

        return code;
    }

    public static String findPermutation(String string) {
        String aux = string;
        int i = 0;
        while (!isRight(aux) && i < aux.length()) {
            aux = swap(i, i+1, string);
            i++;
        }
        return aux;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

         int n = scanner.nextInt();
         String string;

        for (int i = 0; i < n; i++) {
            string = scanner.next();
            if (string.contains("?")) {
                out.format("%s ", findInterrogationMark(string));
            } else {
                out.format("%s ", findPermutation(string));
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


package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;

/**
 * @author L.Azuaje.
 *         <p>
 *         Code Abbey: 42	 Blackjack Counting.
 */

public class BlackjackCounting {

    public BlackjackCounting() {
    }

    public static int sum(String string) {
        List<Character> numbers = new ArrayList<Character>();
        List<Character> letters = new ArrayList<Character>();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                letters.add(string.charAt(i));
            } else if (Character.isDigit(string.charAt(i))) {
                numbers.add(string.charAt(i));
            }
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += Character.getNumericValue(numbers.get(i));
        }

        Collections.sort(letters, new Comparator<Character>() {
            public int compare(Character o1, Character o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < letters.size(); i++) {
            switch (letters.get(i)) {
                case 'A':
                    if (sum + 11 <= 21) {
                        sum += 11;
                    } else {
                        sum += 1;
                    }
                    break;
                case 'T':
                    sum += 10;
                    break;
                case 'J':
                    sum += 10;
                    break;
                case 'Q':
                    sum += 10;
                    break;
                case 'K':
                    sum += 10;
                    break;
            }
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int n = scanner.nextInt();
        String string = null;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum(scanner.next());
            if (sum > 21) {
                out.format("%s ", "Bust");
            } else {
                out.format(Locale.US, "%d ", sum);
            }
        }

        out.println();

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


package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 */

public class ModuloAndTimeDifference {

    public static String find(int day1, int hour1, int minute1, int second1, int day2, int hour2, int minute2, int second2) {
        long time1 = findSeconds(day1, hour1, minute1, second1);
        long time2 = findSeconds(day2, hour2, minute2, second2);
        long difference = time2 - time1;

        long days = difference / (24 * 60 * 60);
        long temp = difference % (24 * 60 * 60);

        long hours = temp / (60 * 60);
        temp = temp % (60 * 60);

        long minutes = temp / 60;
        long seconds = temp % 60;

        return "(" + days + " " + hours + " " + minutes + " " + seconds + ")";
    }

    private static long findSeconds(int day1, int hour1, int minute1, int second1) {
        return second1 + minute1 * 60 + hour1 * 60 * 60 + day1 * 24 * 60 * 60;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int n = scanner.nextInt();
        String string;
        String[] data;

        for (int i = 0; i < n; i++) {
            string = scanner.next();
            data = string.split(" ");
            out.format("%s ",
                    find(
                            Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]),
                            Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]),
                            Integer.parseInt(data[6]), Integer.parseInt(data[7])
                    )
            );
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


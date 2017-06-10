package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author Code Forces.  Solution by: L.Azuaje.
 *         <p>
 *         Problem: 758B   Blown Garland.
 *         <p>
 *         Used at Codeforces: #392 Div-2 .
 */

public class BlownGarland {
    public static final char RED = 'R';
    public static final char BLUE = 'B';
    public static final char GREEN = 'G';
    public static final char YELLOW = 'Y';
    public static final char BROKEN = '!';

    public static int[] findPositions(String string) {
        int pos_red = -1;
        int pos_yellow = -1;
        int pos_blue = -1;
        int pos_green = -1;

        int[] rbyg = new int[4];

        int i = 0;
        while (pos_red == -1 || pos_blue == -1 || pos_yellow == -1 || pos_green == -1) {
            switch (string.charAt(i)) {
                case RED: {
                    pos_red = i;
                    break;
                }
                case BLUE: {
                    pos_blue = i;
                    break;
                }
                case GREEN: {
                    pos_green = i;
                    break;
                }
                case YELLOW: {
                    pos_yellow = i;
                    break;
                }
            }
            i++;
        }

        rbyg[0] = pos_red % 4;
        rbyg[1] = pos_blue % 4;
        rbyg[2] = pos_yellow % 4;
        rbyg[3] = pos_green % 4;

        return rbyg;
    }

    public static int[] countBrokenLights(String string, int[] rbyg) {
        int[] count_rbyg = new int[4];

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == BROKEN) {
                if (i % 4 == rbyg[0]) {
                    count_rbyg[0]++;
                } else if (i % 4 == rbyg[1]) {
                    count_rbyg[1]++;
                } else if (i % 4 == rbyg[2]) {
                    count_rbyg[2]++;
                } else if (i % 4 == rbyg[3]) {
                    count_rbyg[3]++;
                }
            }
        }

        return count_rbyg;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        String string = scanner.next();
        int[] pos_rbyg = findPositions(string);
        int[] count_rbyg = countBrokenLights(string, pos_rbyg);

        out.format("%d %d %d %d", count_rbyg[0], count_rbyg[1], count_rbyg[2], count_rbyg[3]);

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

        float nextFloat() {
            return Float.parseFloat(this.next());
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


package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p>
 *         Code Abbey: 46	 Tic-Tac-Toe.
 */

public class Tic_Tac_Toe {
    private char[] data;

    public Tic_Tac_Toe() {
        data = new char[9];
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        Tic_Tac_Toe main = null;

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            main = new Tic_Tac_Toe();
            int[] data = scanner.nextIntArray();

            boolean victory = false;
            int j = 0;
            for (j = 0; j < data.length; j++) {
                if (j % 2 == 0) {
                    main.setPosition(data[j], 'X');
                } else {
                    main.setPosition(data[j], '0');
                }
                if (j >= 4) {
                    victory = main.checkResult();
                }
                if (victory) {
                    break;
                }
            }

            if (victory) {
                out.format("%s ", j + 1);
            } else {
                out.format("%s ", 0);
            }
        }

        out.println();

        scanner.reader.close();
        out.close();
    }

    public void setPosition(int n, char value) {
        n--;
        this.data[n] = value;
    }

    public boolean checkResult() {
        if ((this.data[0] == 'X' || this.data[0] == '0') && this.data[0] == this.data[1] && this.data[1] == this.data[2]) {
            return true;
        } else if ((this.data[3] == 'X' || this.data[3] == '0') && this.data[3] == this.data[4] && this.data[4] == this.data[5]) {
            return true;
        } else if ((this.data[6] == 'X' || this.data[6] == '0') && this.data[6] == this.data[7] && this.data[7] == this.data[8]) {
            return true;
        } else if ((this.data[0] == 'X' || this.data[0] == '0') && this.data[0] == this.data[3] && this.data[3] == this.data[6]) {
            return true;
        } else if ((this.data[1] == 'X' || this.data[1] == '0') && this.data[1] == this.data[4] && this.data[4] == this.data[7]) {
            return true;
        } else if ((this.data[2] == 'X' || this.data[2] == '0') && this.data[2] == this.data[5] && this.data[5] == this.data[8]) {
            return true;
        } else if ((this.data[0] == 'X' || this.data[0] == '0') && this.data[0] == this.data[4] && this.data[4] == this.data[8]) {
            return true;
        } else if ((this.data[2] == 'X' || this.data[2] == '0') && this.data[2] == this.data[4] && this.data[4] == this.data[6]) {
            return true;
        } else {
            return false;
        }
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


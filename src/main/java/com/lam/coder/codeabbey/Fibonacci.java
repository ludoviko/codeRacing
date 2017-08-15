package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for calculation the fibonacci number up to a given number.
 * Intermediate -lower- values are saved in a list of Big Integers.
 * Iterative algorithm.
 */
public class Fibonacci {
    private List<BigInteger> data;

    /**
     * The non argument constructor.
     */
    public Fibonacci() {
        this.data = new ArrayList<BigInteger>();
    }

    /**
     * A method for finding the next fibonacci number.
     * It updates the list of fibonacci numbers.
     *
     * @return the last calculated fibonacci number.
     */
    public BigInteger nextFibonacci() {
        if (this.data.size() == 0) {
            // Base case: zero.
            this.data.add(new BigInteger("0"));
        } else if (this.data.size() == 1) {
            // Base case: one.
            this.data.add(new BigInteger("1"));
        } else {
            this.data.add( this.data.get(this.data.size()-1).add(this.data.get(this.data.size()-2)) );
        }
        return this.data.get(this.data.size()-1);
    };

    /**
     * A static utility class for finding the fibonacci number for any value.
     * @param index: the i argument for calculation the fibonacci number using a recursive call.
     * @return The calculated the fibonacci number.
     *
     */
    public static BigInteger getElement(int index) {
        return getElement(index, new BigInteger("0"), new BigInteger("1"));
    }

    private static BigInteger getElement(int index, BigInteger value1, BigInteger value2) {
        return (index == 0) ? value1 : (index > 1) ? getElement(index - 1, value2, value1.add(value2)) : value2;
    }

    /**
     * @return The list of BigIntegers of calculated values from o to n.
     */
    public List<BigInteger>  getData() {
        return this.data;
    }

    public static void main(String[] strings) throws IOException {
        BigInteger bi;
        int c = 0;

        Fibonacci f;

        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int n  = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            f = new Fibonacci();
            bi =  new BigInteger(scanner.next());
            while (bi.compareTo(f.nextFibonacci()) != 0) {
                c++;
            }
            out.format("%d ", c);
            c = 0;
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

        float[] nextFloatArray() {
            String[] data  = nextStringArray();
            float[] a  = new float[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Float.parseFloat(data[i]);
            }

            return a;
        }

        double[] nextDoubleArray() {
            String[] data  = nextStringArray();
            double[] a  = new double[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Double.parseDouble(data[i]);
            }

            return a;
        }
    }
}


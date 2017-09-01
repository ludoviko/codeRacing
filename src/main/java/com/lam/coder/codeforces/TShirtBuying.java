package com.lam.coder.codeforces;

import java.io.*;
import java.util.*;

/**
 * @author Code Forces.  Solution by: L.Azuaje.
 *         <p>
 *         Problem: 799B   #413 Div-1-2            T-shirt buying.
 */

public class TShirtBuying {
    public static void main(String[] args) throws IOException {
        FastInputReader scanner = new FastInputReader();
        PrintStream out = System.out;

        int n = scanner.nextInt();
        int[] prices = scanner.nextIntArray(n);
        int[] as = scanner.nextIntArray(n);
        int[] bs = scanner.nextIntArray(n);
        int m = scanner.nextInt();
        int[] selections = scanner.nextIntArray(m);

        List<T_Shirt> shirts_1 = new ArrayList<T_Shirt>(n);
        List<T_Shirt> shirts_2 = new ArrayList<T_Shirt>(n);
        List<T_Shirt> shirts_3 = new ArrayList<T_Shirt>(n);

        for (int i = 0; i < n; i++) {
            T_Shirt ts = new T_Shirt(prices[i], as[i], bs[i]);
            if (as[i] == 1) {
                shirts_1.add(ts);
            } else if (as[i] == 2) {
                shirts_2.add(ts);
            } else {
                shirts_3.add(ts);
            }
            if (bs[i] == as[i]) {
                // Already added element.
                continue;
            }
            if (bs[i] == 1) {
                shirts_1.add(ts);
            } else if (bs[i] == 2) {
                shirts_2.add(ts);
            } else {
                shirts_3.add(ts);
            }
        }

        Collections.sort(shirts_1);
        Collections.sort(shirts_2);
        Collections.sort(shirts_3);
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;

        System.out.println();
        T_Shirt a1 = null;

        for (int i = 0; i < m; i++) {
            if (selections[i] == 1) {
                if ( i1 <  shirts_1.size() ) {
                    a1 = shirts_1.get(i1++);
                    while (a1.isDeleted() && i1 < shirts_1.size()) {
                        a1 = shirts_1.get(i1++);
                    }
                    if ( i1 <=  shirts_1.size() && !a1.isDeleted() ) {
                        a1.setDeleted(true);
                        System.out.print(a1.price + " ");
                    } else {
                        System.out.print(-1 + " ");
                    }
                } else {
                    System.out.print(-1 + " ");
                }
            } else if (selections[i] == 2) {
                if ( i2 <  shirts_2.size() ) {
                    a1 = shirts_2.get(i2++);
                    while (a1.isDeleted() && i2 < shirts_2.size()) {
                        a1 = shirts_2.get(i2++);
                    }
                    if ( i2 <=  shirts_2.size() && !a1.isDeleted()  ) {
                        a1.setDeleted(true);
                        System.out.print(a1.price + " ");
                    } else {
                        System.out.print(-1 + " ");
                    }
                } else {
                    System.out.print(-1 + " ");
                }
            } else {
                if ( i3 <  shirts_3.size() ) {
                    a1 = shirts_3.get(i3++);
                    while (a1.isDeleted() && i3 < shirts_3.size()) {
                        a1 = shirts_3.get(i3++);
                    }
                    if ( i3 <=  shirts_3.size() && !a1.isDeleted() ) {
                        a1.setDeleted(true);
                        System.out.print(a1.price + " ");
                    } else {
                        System.out.print(-1 + " ");
                    }
                } else {
                    System.out.print(-1 + " ");
                }
            }
        }

        out.close();
    }

    static class T_Shirt implements Comparable<T_Shirt> {
        int price;
        int a;
        int b;
        boolean deleted;

        boolean isDeleted() {
            return deleted;
        }

        T_Shirt(int price, int a, int b) {
            this.price = price;
            this.a = a;
            this.b = b;
            this.deleted = false;
        }

        public void setDeleted(boolean deleted) {
            this.deleted = deleted;
        }

        @Override
        public String toString() {
            return "T_Shirt{" +
                    "price=" + price +
                    ", a=" + a +
                    ", b=" + b +
                    ", deleted= " + this.deleted +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            T_Shirt t_shirt = (T_Shirt) o;

            return (this.price == t_shirt.price);
        }

        @Override
        public int hashCode() {
            int result = price;
            result = 31 * result + a;
            return result;
        }

        public int compareTo(T_Shirt other) {
            if (this.price > other.price) {
                return 1;
            } else if (this.price < other.price) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    // -----------MyScanner class for faster input----------
    public static class FastInputReader {
        private byte[] buf = new byte[16384];
        private int curChar;
        private int numChars;

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = System.in.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public String nextString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        public long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }
    }

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


package com.lam.coder.adventofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * Problem Author:  Advent of Code (AdventOfCode.com).
 *
 * @author Solution by: L.Azuaje.
 *         <p>
 *         AdventOfCode.com: 2015-003      Perfectly Spherical Houses in a Vacuum.
 */

public class PerfectlySpheric {
    public static char UP = '^';
    public static char DOWN = 'v';
    public static char LEFT = '<';
    public static char RIGHT = '>';

    private String string;

    public PerfectlySpheric(String string) {
        this.string = string;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        String string = scanner.next();

        PerfectlySpheric main = new PerfectlySpheric(string);

        out.format(Locale.US, "%d %n", main.count());
        out.format(Locale.US, "%d %n", main.countWithRobot());

        out.println();

        scanner.reader.close();
        out.close();
    }

    public int count() {
        Set<Tuple> set = new HashSet<Tuple>();

        Tuple t = new Tuple(0, 0);
        set.add(t.clone());

        for (int i = 0; i < this.string.length(); i++) {
            if (this.string.charAt(i) == UP) {
                t.incY();
            } else if (this.string.charAt(i) == DOWN) {
                t.decY();
            } else if (this.string.charAt(i) == LEFT) {
                t.decX();
            } else if (this.string.charAt(i) == RIGHT) {
                t.incX();
            }

            set.add(t.clone());
        }

        return set.size();
    }

    public int countWithRobot() {
        Set<Tuple> set = new HashSet<Tuple>();

        Tuple t = new Tuple(0, 0);
        set.add(t.clone());

        Tuple robot = new Tuple(0, 0);
        set.add(robot.clone());

        for (int i = 0; i < this.string.length(); i++) {
            if (i % 2 == 0) {
                if (this.string.charAt(i) == UP) {
                    t.incY();
                } else if (this.string.charAt(i) == DOWN) {
                    t.decY();
                } else if (this.string.charAt(i) == LEFT) {
                    t.decX();
                } else if (this.string.charAt(i) == RIGHT) {
                    t.incX();
                }
                set.add(t.clone());
            } else {
                if (this.string.charAt(i) == UP) {
                    robot.incY();
                } else if (this.string.charAt(i) == DOWN) {
                    robot.decY();
                } else if (this.string.charAt(i) == LEFT) {
                    robot.decX();
                } else if (this.string.charAt(i) == RIGHT) {
                    robot.incX();
                }
                set.add(robot.clone());
            }
        }

        return set.size();
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

class Tuple {
    int x;
    int y;

    public Tuple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Tuple clone() {
        return new Tuple(this.x, this.y);
    }

    public void incX() {
        this.x++;
    }

    public void decX() {
        this.x--;
    }

    public void incY() {
        this.y++;
    }

    public void decY() {
        this.y--;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tuple)) return false;

        Tuple tuple = (Tuple) o;

        if (x != tuple.x) return false;
        return y == tuple.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}


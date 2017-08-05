package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Locale;

/**
 * Solution to the problem Hexagonal Grid.
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Point add(Point p) {
        Point point = new Point(this.x + p.x, this.y + p.y);
        return point;
    }

    public static double distance(Point p1, Point p2) {
        double dx = (double) (p2.x - p1.x);
        double dy = (double) (p2.y - p1.y);
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(Point p2) {
        double dx = (double) (p2.x - this.x);
        double dy = (double) (p2.y - this.y);
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance() {
        double dx =  this.x;
        double dy =  this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
            return false;
        if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    public static void main(String[] args) throws IOException {
        Point a = new Point(1, 0);
        Point b = new Point(0.5, Math.sqrt(3) * 0.5);
        Point c = new Point(-0.5, Math.sqrt(3) * 0.5);
        Point d = new Point(-1, 0);
        Point e = new Point(-0.5, -Math.sqrt(3) * 0.5);
        Point f = new Point(0.5, -Math.sqrt(3) * 0.5);
        Point p;

        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int n = scanner.nextInt();
        String data;

        for (int i = 0; i < n; i++) {
            p  = new Point(0,0);
            data = scanner.next();
            for (int j = 0; j < data.length(); j++) {
                switch (data.charAt(j) ) {
                    case 'A':
                        p = p.add(a);
                        break;
                    case 'B':
                        p = p.add(b);
                        break;
                    case 'C':
                        p = p.add(c);
                        break;
                    case 'D':
                        p = p.add(d);
                        break;
                    case 'E':
                        p = p.add(e);
                        break;
                    case 'F':
                        p = p.add(f);
                        break;
                }
            }
            out.format(Locale.US, "%8.8f ", p.distance());
        }

        scanner.close();
        out.close();
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



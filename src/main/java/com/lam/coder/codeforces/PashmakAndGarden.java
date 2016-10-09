package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author Solution by: L.Azuaje.
 *         <p>
 *         Codeforces:   459A	    Pashmak And Garden .
 */

public class PashmakAndGarden {
    Point point1;
    Point point2;
    Point point3;
    Point point4;

    public PashmakAndGarden() {
    }

    public PashmakAndGarden(int x, int y, int x2, int y2) {
        this.point1 = new Point(x, y);
        this.point2 = new Point(x2, y2);
    }

    public void setPoints(int x, int y, int x2, int y2) {
        this.point1 = new Point(x, y);
        this.point2 = new Point(x2, y2);
    }

    class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "X: " + x + ", Y: " + y;
        }

        public boolean isParalelToXAxis(Point p) {
            if (this.y == p.y) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isOnXAxis() {
            if (this.y == 0) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isParalelToYAxis(Point p) {
            if (this.x == p.x) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isOnYAxis() {
            if (this.x == 0) {
                return true;
            } else {
                return false;
            }
        }

        public int distanceX(Point other) {
            return Math.abs(this.x - other.x);
        }

        public int differenceX(Point other) {
            return other.x - this.x;
        }

        public int distanceY(Point other) {
            return Math.abs(this.y - other.y);
        }

        public int differenceY(Point other) {
            return other.y - this.y;
        }
    }

    public String findPoints() {
        if (point1.isParalelToXAxis(point2)) {
            point3 = new Point(point1.x, point1.differenceX(point2) + point1.y);
            point4 = new Point(point2.x, point3.y);
        }

        if (point1.isParalelToYAxis(point2)) {
            point3 = new Point(point1.differenceY(point2) + point1.x, point1.y);
            point4 = new Point(point3.x, point2.y);
        }

        if (!point1.isParalelToXAxis(point2) && !point1.isParalelToYAxis(point2)) {
            if (point1.distanceY(point2) == point1.distanceX(point2)) {
                point3 = new Point(point1.x, point2.y);
                point4 = new Point(point2.x, point1.y);
            }
        }

        if (point3 ==  null) {
           // System.out.println(-1);
            return "-1";
        } else {
            return point3.x + " " +  point3.y +  " " + point4.x +  " " + point4.y;
          //  System.out.format("%d %d %d %d %n", point3.x, point3.y, point4.x, point4.y );
        }
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int[] data = scanner.nextIntArray();
        PashmakAndGarden main = new PashmakAndGarden(data[0], data[1], data[2], data[3]);

        System.out.println(main.findPoints());

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
    }
}


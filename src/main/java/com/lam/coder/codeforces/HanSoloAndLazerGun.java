package com.lam.coder.codeforces;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HanSoloAndLazerGun {

    class Point {
        int	x, y;

        Point(int xo, int yo) {
            this.x = xo;
            this.y = yo;
        }

        void changeXY(Point c) {
            this.x -= c.getX();
            this.y -= c.getY();
        }

        void changeXY(int xo, int yo) {
            this.x -= xo;
            this.y -= yo;
        }

        void setXY(int xo, int yo) {
            this.x = xo;
            this.y = yo;
        }

        void changeX(int xo) {
            this.x -= xo;
        }

        void changeY(int yo) {
            this.y -= yo;
        }

        int getX() {
            return this.x;
        }

        double getP() {
            if (this.y != 0) {
                return new Double(this.x) / new Double(this.y);
            }

            return 0.0;
        }

        int getY() {
            return this.y;
        }

        @Override
        public String toString() {
            return this.x + ", " + this.y;
        }

    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        HanSoloAndLazerGun main = new HanSoloAndLazerGun();
        int shots = 0;

        String[] string = scanner.next().split(" ");
        int n = Integer.parseInt(string[0]);

        HanSoloAndLazerGun.Point center = main.new Point(
                Integer.parseInt(string[1]), Integer.parseInt(string[2]));

        List<HanSoloAndLazerGun.Point> list = new ArrayList<HanSoloAndLazerGun.Point>();
        List<HanSoloAndLazerGun.Point> list_2 = new ArrayList<HanSoloAndLazerGun.Point>();
        List<HanSoloAndLazerGun.Point> list_3 = new ArrayList<HanSoloAndLazerGun.Point>();

        Set<Double> set = new HashSet<Double>();

        // System.out.println(center);

        for (int i = 0; i < n; i++) {
            string = scanner.next().split(" ");
            list.add(main.new Point(Integer.parseInt(string[0]), Integer
                    .parseInt(string[1])));
        }

        HanSoloAndLazerGun.Point p;
        for (int i = 0; i < n; i++) {
            p = list.get(i);
            p.changeXY(center);
        }

        for (int i = 0; i < list.size(); i++) {
            p = list.get(i);
            if (p.getX() == 0) {
                shots = 1;
            } else {
                list_2.add(p);
            }
        }

        int add = 0;

        for (int i = 0; i < list_2.size(); i++) {
            p = list_2.get(i);
            if (p.getY() == 0) {
                add = 1;
            } else {
                list_3.add(p);
            }
        }
        shots += add;

        for (int i = 0; i < list_3.size(); i++) {
            p = list_3.get(i);
            if (p.getP() == 0.0) {
                continue;
            }
            set.add(p.getP());
        }

        shots += set.size();

        out.println(shots);

        scanner.reader.close();
        out.close();
    }

    // -----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader	reader;

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
                str = this.reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

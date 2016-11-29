package com.lam.coder.codejam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * *
 * Problem
 * <p>
 * A company is located in two very tall buildings. The company intranet connecting the buildings consists of many wires, each connecting a window on the first building to a window on the second building.
 * <p>
 * You are looking at those buildings from the side, so that one of the buildings is to the left and one is to the right. The windows on the left building are seen as points on its right wall, and the windows on the right building are seen as points on its left wall. Wires are straight segments connecting a window on the left building to a window on the right building.
 * <p>
 * <p>
 * <p>
 * You've noticed that no two wires share an endpoint (in other words, there's at most one wire going out of each window). However, from your viewpoint, some of the wires intersect midway. You've also noticed that exactly two wires meet at each intersection point.
 * <p>
 * On the above picture, the intersection points are the black circles, while the windows are the white circles.
 * <p>
 * How many intersection points do you see?
 * <p>
 * Input
 * <p>
 * The first line of the input gives the number of test cases, T. T test cases follow. Each case begins with a line containing an integer N, denoting the number of wires you see.
 * <p>
 * The next N lines each describe one wire with two integers Ai and Bi. These describe the windows that this wire connects: Ai is the height of the window on the left building, and Bi is the height of the window on the right building.
 * <p>
 * Output
 * <p>
 * For each test case, output one line containing "Case #x: y", where x is the case number (starting from 1) and y is the number of intersection points you see.
 * <p>
 * Limits
 * <p>
 * 1 ? T ? 15.
 * 1 ? Ai ? 104.
 * 1 ? Bi ? 104.
 * Within each test case, all Ai are different.
 * Within each test case, all Bi are different.
 * No three wires intersect at the same point.
 * <p>
 * Small dataset
 * <p>
 * 1 ? N ? 2.
 * <p>
 * Large dataset
 * <p>
 * 1 ? N ? 1000.
 * <p>
 * Sample
 * <p>
 * <p>
 * Input
 * <p>
 * 2
 * 3
 * 1 10
 * 5 5
 * 7 7
 * 2
 * 1 1
 * 2 2
 * Output
 * <p>
 * Case #1: 2
 * Case #2: 0
 */
public class RopeIntranet {
    void solve(Scanner in, PrintWriter out) {
        int m = in.nextInt();
        int n;
        int x, y;
        int c = 0;

        List<Interval> points = new ArrayList<Interval>();
        List<Interval> intervals = new ArrayList<Interval>();

        for (int i = 0; i < m; i++) {
            n = in.nextInt();
            for (int j = 0; j < n; j++) {
                Interval p = new Interval(in.nextInt(), in.nextInt());
                points.add(p);
                intervals.add(p);
            }

            for (Interval interval : intervals) {
                for (Interval p : points) {
                    if (p.low > interval.low && p.high < interval.high) {
                        c++;
                    }
                }
            }

            System.out.format("Case #%d: %d%n", i + 1, c);
            out.format("Case #%d: %d%n", i + 1, c);
            c = 0;
            points.clear();
            intervals.clear();
        }
    }

    void run() {
        String name = RopeIntranet.class.getName();
        String sizeS = "-small";
        String sizeX = "-large";
        String size = sizeX;
        String fileIn = name + size + ".in";
        String fileOut = name + size + ".out";
        Locale.setDefault(Locale.US);
        try {
                // Read from keyboard, write to screen.
                Scanner in = new Scanner(new FileReader(fileIn));
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
                        new File(fileOut))));
            solve(in, out);
            in.close();
            out.close();
        } catch (Exception exception) {
               throw new Error(exception);
        }
    }

    public static void main(String[] strings) {
        new RopeIntranet().run();
    }


    class Interval {
        int low;
        int high;

        Interval(int low, int high) {
            this.low = low;
            this.high = high;
        }
    }

}


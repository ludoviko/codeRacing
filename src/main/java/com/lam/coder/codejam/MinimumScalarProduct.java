package com.lam.coder.codejam;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


/**
 * Problem A. Minimum Scalar Product
 * <p>
 * This contest is open for practice. You can try every problem as many times as you like, though we won't keep track of which problems you solve. Read the Quick-Start Guide to get started.
 * Small input
 * 5 points
 * Solve A-small
 * Large input
 * 10 points
 * Solve A-large
 * Judge's response for last submission: Correct.
 * Problem
 * <p>
 * You are given two vectors v1=(x1,x2,...,xn) and v2=(y1,y2,...,yn). The scalar product of these vectors is a single number, calculated as x1y1+x2y2+...+xnyn.
 * <p>
 * Suppose you are allowed to permute the coordinates of each vector as you wish. Choose two permutations such that the scalar product of your two new vectors is the smallest possible, and output that minimum scalar product.
 * <p>
 * Input
 * <p>
 * The first line of the input file contains integer number T - the number of test cases. For each test case, the first line contains integer number n. The next two lines contain n integers each, giving the coordinates of v1 and v2 respectively.
 * Output
 * <p>
 * For each test case, output a line
 * <p>
 * Case #X: Y
 * where X is the test case number, starting from 1, and Y is the minimum scalar product of all permutations of the two given vectors.
 * Limits
 * <p>
 * Small dataset
 * <p>
 * T = 1000
 * 1 ? n ? 8
 * -1000 ? xi, yi ? 1000
 * <p>
 * Large dataset
 * <p>
 * T = 10
 * 100 ? n ? 800
 * -100000 ? xi, yi ? 100000
 * <p>
 * Sample
 * <p>
 * <p>
 * Input
 * <p>
 * 2
 * 3
 * 1 3 -5
 * -2 4 1
 * 5
 * 1 2 3 4 5
 * 1 0 1 0 1
 * <p>
 * Output
 * Case #1: -25
 * Case #2: 6
 */
public class MinimumScalarProduct {
    public static long find(int[] a, int[] b) {
        long p = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        int[] c = new int[b.length];

        for (int i = 0; i < b.length; i++) {
            p += ((long) a[b.length - 1 - i]) * b[i];
        }

        return p;
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int i = 0;
        int[] a;
        int[] b;
        while (i < n) {
            int len = in.nextInt();
            a = new int[len];
            b = new int[len];

            for (int j = 0; j < len; j++) {
                a[j] = in.nextInt();
            }
            for (int j = 0; j < len; j++) {
                b[j] = in.nextInt();
            }

            i++;
            System.out.format("Case #%d: %d%n", i, MinimumScalarProduct.find(a, b));
            out.format("Case #%d: %d%n", i, MinimumScalarProduct.find(a, b));
        }
    }

    void run() {
        String name = MinimumScalarProduct.class.getName();
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
        new MinimumScalarProduct().run();
    }

}

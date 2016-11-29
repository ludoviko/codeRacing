package com.lam.coder.codejam;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;


/**
 * Problem
 * <p>
 * You receive a credit C at a local store and would like to buy two items. You first walk through the store and create a
 * list L of all available items. From this list you would like to buy two items that add up to the entire value of
 * the credit. The solution you provide will consist of the two integers indicating the positions of the items in your
 * list (smaller number first).
 * <p>
 * Input
 * <p>
 * The first line of input gives the number of cases, N. N test cases follow. For each test case there will be:
 * <p>
 * One line containing the value C, the amount of credit you have at the store.
 * One line containing the value I, the number of items in the store.
 * One line containing a space separated list of I integers. Each integer P indicates the price of an item in the store.
 * Each test case will have exactly one solution.
 * Output
 * <p>
 * For each test case, output one line containing "Case #x: " followed by the indices of the two items whose price
 * adds up to the store credit. The lower index should be output first.
 * <p>
 * Limits
 * <p>
 * 5 ? C ? 1000
 * 1 ? P ? 1000
 * <p>
 * Small dataset
 * <p>
 * N = 10
 * 3 ? I ? 100
 * <p>
 * Large dataset
 * <p>
 * N = 50
 * 3 ? I ? 2000
 * <p>
 * Sample
 * <p>
 * <p>
 * Input
 * 3
 * 100
 * 3
 * 5 75 25
 * 200
 * 7
 * 150 24 79 50 88 345 3
 * 8
 * 8
 * 2 1 9 4 4 56 90 3
 * <p>
 * Output
 * Case #1: 2 3
 * Case #2: 1 4
 * Case #3: 4 5
 */


public class StoreCredit {
    public String find(int[] array, int total) {
        int ix = -1;
        int jx = -1;

        break_out:
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == total) {
                    ix = i;
                    jx = j;
                    break break_out;
                }
            }
        }

        return ++ix + " " + ++jx;
    }

    void solve(Scanner in, PrintWriter out) {
        int x = 0;
        int c = 0;
        int n = in.nextInt();
        int total = 0;
        int size = 0;
        int[] array;

        while (x < n * 3 && in.hasNext()) {
            total = in.nextInt();
            size = in.nextInt();
            array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
            }
            x += 3;

            out.println("Case " + "#" + ++c + ": " + find(array, total));
        }
    }

    void run() {
        String fileIn = "StoreCredit-small.in";
        String fileOut = "StoreCredit-small.out";
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
        new StoreCredit().run();
    }
}


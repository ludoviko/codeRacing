package com.lam.coder.acmp;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

/**
 * Source: https://acmp.ru/index.asp?main=task&id_task=685
 */
public class GoldenSand {
    public static long find(Integer[] values, Integer[] capacities) {
        sort(values);
        sort(capacities);

        int sum = 0;
        for (int i = 0; i < values.length ; i++) {
            sum += values[i] * capacities[i];
        }

        return  sum;
    }

    private static void sort(Integer[] data) {
        // Sort data in decreasing order.
        Arrays.sort(data, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
    }

    void solve(Scanner in, PrintWriter out) {
        int size = 3;

        Integer[] values = new Integer[size];
        for (int i = 0; i < values.length ; i++) {
            values[i] = in.nextInt();
        }

        Integer[] capacities = new Integer[size];
        for (int i = 0; i < capacities.length ; i++) {
            capacities[i] = in.nextInt();
        }

        out.format("%d%n", find(values, capacities));
    }

    void run() {
        Locale.setDefault(Locale.US);
        try {
                // Read from keyboard, write to screen.
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out);
            solve(in, out);
            in.close();
            out.close();
            } catch (Exception exception) {
               throw new Error(exception);
        }
    }

    public static void main(String[] strings) {
        new GoldenSand().run();
    }
}


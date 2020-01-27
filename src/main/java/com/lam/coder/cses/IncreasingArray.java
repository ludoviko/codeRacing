package com.lam.coder.cses;

import java.util.Scanner;

/**
 *
 * @author  cses.fi.
 *
 * Solution by: L.Azuaje.
 *
 * CSES Problem: problemset/task/1094    IncreasingArray   .
 *
 *
 */

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < data.length; i++) {
            data[i] = scanner.nextInt();
        }

        long s = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[i - 1]) {
                s += data[i - 1] - data[i];
                data[i] = data[i - 1];
            }
        }

        System.out.println(s);
        scanner.close();
    }
}

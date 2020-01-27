package com.lam.coder.cses;

import java.util.Scanner;

/**
 *
 * @author  cses.fi.
 *
 * Solution by: L.Azuaje.
 *
 * CSES Problem: problemset/task/1083/  Missing Number .
 *
 *
 */

public class MissingNumber {
    public static long find(Long[] data, long n) {
        long summa = n*(n+1)/2;
        long partialSumma = 0;

        for (long d: data) {
            partialSumma += d;
        }

        return summa - partialSumma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Long[] data = new Long[n-1];

        for (int i = 0; i < data.length; i++) {
            data[i] = scanner.nextLong();
        }

        System.out.println(find(data, n));
        scanner.close();
    }
}

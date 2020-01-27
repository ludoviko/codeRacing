package com.lam.coder.cses;

import java.util.Scanner;

/**
 * @author cses.fi.
 * <p>
 * Solution by: L.Azuaje.
 * <p>
 * CSES Problem: https://cses.fi/problemset/task/1068 Weird Algorithm.
 */

public class WeirdAlgorithm {
    public static String find(long n) {
        StringBuilder builder = new StringBuilder();

        while (n != 1) {
            builder.append(n);
            builder.append(' ');

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        return builder.append(n).toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(find(n));
        scanner.close();
    }
}

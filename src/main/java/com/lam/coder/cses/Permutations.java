package com.lam.coder.cses;

import java.util.Scanner;

/**
 *
 * @author  cses.fi.
 *
 * Solution by: L.Azuaje.
 *
 * CSES Problem: problemset/task/1070   Permutations  .
 *
 *
 */

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder builder = new StringBuilder();

        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        } else {
            int k = 2;
            for (long i = (long) Math.ceil(n/2.0); i <n; i++) {
                builder.append(k).append(" ");
                k += 2;
            }

            for (int i = 0; i < Math.ceil(n/2.0); i++) {
                builder.append(2 * i + 1).append(" ");
            }

            System.out.println(builder);
        }
        scanner.close();
    }
}

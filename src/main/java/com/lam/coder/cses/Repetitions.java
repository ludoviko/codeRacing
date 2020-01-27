package com.lam.coder.cses;

import java.util.Scanner;

/**
 *
 * @author  cses.fi.
 *
 * Solution by: L.Azuaje.
 *
 * CSES Problem: problemset/task/1069  Repetitions.
 *
 *
 */

public class Repetitions {
    public static long find(String string) {
        int max = 1;
        int m = 1;

        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i-1) == string.charAt(i)) {
                m++;
            } else {
                if (m > max) {
                    max = m;
                }
                m = 1;
            }
        }

        if (m > max) {
            max = m;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        System.out.println(find(string));

        scanner.close();
    }
}

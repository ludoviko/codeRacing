package com.lam.coder.topCoder;

import java.util.Arrays;

public class PalindromePrime {
    public int count(int left, int right) {
        boolean[] primesBool = find(right);

        int count = 0;

        for (int i = left; i <= right; i++) {
            if (isPalindrome(i) && primesBool[i]) {
                count++;
            }
        }
        return count;
    }

    private static long reverse(long n, int base) {
        long reversed = 0;
        while (n > 0) {
            reversed = base * reversed + n % base;
            n /= base;
        }
        return reversed;
    }

    public static boolean isPalindrome(long n) {
        return n == reverse(n, 10);
    }

    public static boolean[] find(int upTo) {
        boolean[] primesBool = new boolean[upTo + 1];
        Arrays.fill(primesBool, true);

        primesBool[0] = false;
        primesBool[1] = false;

        int root = (int) Math.sqrt(upTo);

        for (int i = 2; i <= root; i++) {
            for (int j = i * i; j <= upTo; j += i) {
                if (primesBool[j]) {
                    primesBool[j] = false;
                }
            }
        }

        return primesBool;
    }
}
package com.lam.coder.acmp;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

/**
 * Source: https://acmp.ru/index.asp?main=task&id_task=328
 *
 * Improvement: Use one formula and not cycles.
 */

public class DotsOnDominoesPieces {
    public static BigInteger findBI(int n) {
        BigInteger s = BigInteger.ZERO;
        for (int i = 1; i <= n ; i++) {
            s = s.add(sumBI(i, 2*i, 2*i - (i - 1)));
        }

        return  s;
    }

    private static long sum(int first, int last, int n) {
        return ((first + last) * n )/ 2;
    }

    private static BigInteger sumBI(int first, int last, int n) {
        return new BigInteger(first + "").add(new BigInteger(last + "")).multiply(new BigInteger(n+"")).divide(new BigInteger("2"))  ;
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        out.format("%d%n", findBI(n));
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
        new DotsOnDominoesPieces().run();
    }
}


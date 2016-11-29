package com.lam.coder.acmp;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Source: https://acmp.ru/index.asp?main=task&id_task=3
 */
public class FiveByFive25 {
    public static long find(int n) {
        int m = n / 10;

        long r = ((long)m) * (m + 1) * 100  + 25;
        return  r;
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        out.format("%d%n", find(n));
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
        new FiveByFive25().run();
    }
}


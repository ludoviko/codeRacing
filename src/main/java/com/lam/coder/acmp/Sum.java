package com.lam.coder.acmp;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 *
 * https://acmp.ru/index.asp?main=task&id_task=2
 */

public class Sum {
    public static long find(int n) {
        return  ( 1L + n ) * ( Math.abs(n - 1) + 1) / 2;
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
        new Sum().run();
    }
}


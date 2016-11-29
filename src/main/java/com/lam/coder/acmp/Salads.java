package com.lam.coder.acmp;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Source: https://acmp.ru/index.asp?main=task&id_task=513
 */
public class Salads {
    public static long find(int n) {
        long sum = 0;

        // This formula is the same as the sum of all combination except for i <> 1, i <=n.
        sum = (1 << n)  - (n + 1);

        return sum;
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
        new Salads().run();
    }
}


package com.lam.coder.acmp;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Source: https://acmp.ru/index.asp?main=task&id_task=554.
 */
public class Pizza {
    public static int find(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1){
            return 2;
        } else {
            return find(n -1) + n;
        }
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
        new Pizza().run();
    }
}

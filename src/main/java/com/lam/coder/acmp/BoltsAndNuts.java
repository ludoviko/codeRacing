package com.lam.coder.acmp;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Source: https://acmp.ru/index.asp?main=task&id_task=294
 */
public class BoltsAndNuts {
    public static long findLosses(double units, int value) {
        return (long) units * value;
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        double percertLoss = in.nextInt() / 100.0;
        int value = in.nextInt();

        int m = in.nextInt();
        double percertLossM = in.nextInt() / 100.0;
        int valueM = in.nextInt();

        double correction = Math.min(n - n * percertLoss, m - m * percertLossM);

        out.format("%d%n", findLosses(n * percertLoss + n - n * percertLoss - correction, value) +
                findLosses(m * percertLossM + m - m * percertLossM - correction, valueM));
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
        new BoltsAndNuts().run();
    }
}



package com.lam.coder.acmp;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Source: https://acmp.ru/index.asp?main=task&id_task=263
 */
public class Metro {
    public static long find(int stations, int from, int to) {
        int displamemnt = Math.min(Math.floorMod(from - to, stations), Math.floorMod(to - from, stations)) - 1;

        return  displamemnt;
    }

    void solve(Scanner in, PrintWriter out) {
        out.format("%d%n", find(in.nextInt(), in.nextInt(), in.nextInt()));
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
            //   throw new Error(exception);
        }
    }

    public static void main(String[] strings) {
        new Metro().run();
    }
}



package com.lam.coder.acmTimus;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class BookWorm {
    public static int find(int width, int cover, int start, int end) {
        int r = width * Math.abs( start + 1 - end ) + 2 * cover * Math.abs(start - end);
        return r;
    }

    void solve(Scanner in, PrintWriter out) {
             out.format("%d%n",  find(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()));
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
        new BookWorm().run();
    }
}


package com.lam.coder.acmp;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * ????? ?????.
 *
 * Source: https://acmp.ru/asp/do/index.asp?main=task&id_course=1&id_section=1&id_topic=27&id_problem=158
 */
public class DivideApples {

    public static void find(int pupils, int apples, PrintWriter out) {

        int q = apples / pupils;
        int remainder = apples % pupils;

        int offended = ( pupils - remainder ) % pupils;

        out.format("%d %d %d%n", q, remainder, offended);
    }

    void solve(Scanner in, PrintWriter out) {
        int pupils = in.nextInt();
        int apples = in.nextInt();

        find(pupils, apples, out);
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
        new DivideApples().run();
    }
}

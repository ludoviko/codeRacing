package com.lam.coder.acmp;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * ??????.
 *
 * Source: https://acmp.ru/index.asp?main=task&id_task=697
 *
 */
public class Repairs {
        public static int find(int len, int wide, int high) {
            int cap = 16;

            // For rounding up whole numbers add (denominator - 1) to the numerator.
            int r = (2 * (len * high + wide * high) + (cap - 1) )/cap;

            return r;
        }

        void solve(Scanner in, PrintWriter out) {
            int l = in.nextInt();
            int w = in.nextInt();
            int h = in.nextInt();

             out.format("%d%n", find(l, w, h));
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
            new Repairs().run();
        }
    }


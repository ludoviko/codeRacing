package com.lam.coder.acmp;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Source: https://acmp.ru/asp/do/index.asp?main=task&id_course=1&id_section=1&id_topic=27&id_problem=157
 *
 */

public class MKAD {
        public static long find(int velocity, int time) {
            int startAt = 1;
            int end = 109;

            int d = Math.floorMod( velocity * time, end ) + startAt;

            return  d;
        }

        void solve(Scanner in, PrintWriter out) {
            out.format("%d%n", find(in.nextInt(), in.nextInt()));
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
            new MKAD().run();
        }
    }

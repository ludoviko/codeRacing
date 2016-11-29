package com.lam.coder.acmp;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

/**
 * Source: https://acmp.ru/index.asp?main=task&id_task=528.
 */
public class Fortress {
    public static BigInteger find(long walls, long fortresses) {
        int rooms = 2;
        BigInteger s = sumBI(walls, walls * fortresses, fortresses);
        s = s.add(sumBI(-rooms - 1, -fortresses * rooms + 1, fortresses - 1));
        return s;
    }

    private static BigInteger sumBI(long first, long last, long n) {
        return new BigInteger(first + "").add(new BigInteger(last + "")).multiply(new BigInteger(n+"")).divide(new BigInteger("2"))  ;
    }

    private static long sum(int first, int last, int n) {
        return ((first + last) * n )/ 2;
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
            //   throw new Error(exception);
        }
    }

    public static void main(String[] strings) {
        new Fortress().run();
    }
}

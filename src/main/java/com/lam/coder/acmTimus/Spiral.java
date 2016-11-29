package com.lam.coder.acmTimus;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class Spiral {
    public static BigInteger find(int x, int y) {
        if (x <= y) {
            return  new BigInteger("2").multiply( new BigInteger((x -1) + "" ));
        } else {
            return  (new BigInteger("2").multiply( new BigInteger((y -1) + "" ))).add(BigInteger.ONE);
        }
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
        new Spiral().run();
    }
}


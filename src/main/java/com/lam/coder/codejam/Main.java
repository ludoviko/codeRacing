package com.lam.coder.codejam;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static int find() {
        return -1;
    }

     void solve(Scanner in, PrintWriter out) {
//         int a = in.nextInt();
//             out.format("Case #%d: %d%n", i, find(a, b));
//             System.out.format("Case #%d: %d%n", i + 1, find(a, b));
     }

    void run() {
        String name = Main.class.getName();
        String sizeS = "-small";
        String sizeX = "-large";
        String size = sizeX;
        String fileIn = name + size + ".in";
        String fileOut = name + size + ".out";
        Locale.setDefault(Locale.US);
        try {
                // Read from file, write to file.
                Scanner in = new Scanner(new FileReader(fileIn));
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
                        new File(fileOut))));
                // Read from keyboard, write to screen.
//                Scanner in = new Scanner(System.in);
//                PrintWriter out = new PrintWriter(System.out);
            solve(in, out);
            in.close();
            out.close();
        } catch (Exception exception) {
               throw new Error(exception);
        }
    }

    public static void main(String[] strings) {
        new Main().run();
    }
}

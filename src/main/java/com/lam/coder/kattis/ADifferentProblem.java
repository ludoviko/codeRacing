package com.lam.coder.kattis;

import java.io.*;
import java.util.Scanner;

/**
 * 
 * @author Usuario
 *
 *
 *
 */

public class ADifferentProblem {
	
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;

        ADifferentProblem main = new ADifferentProblem();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long a = sc.nextLong(), b = sc.nextLong();
            out.println(Math.abs(a-b));
        }
        sc.close();
        out.close();
    }


}


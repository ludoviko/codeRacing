package com.lam.coder.uva;

import java.io.*;
import java.util.*;


/**
 * @solutionAuthor: L.Azuaje.
 * <p>
 * <p>
 * The 3n + 1 problem
 * <p>
 * Background
 * <p>
 * Problems in Computer Science are often classified as belonging to a certain class of problems
 * (e.g., NP, Unsolvable, Recursive). In this problem you will be analyzing a property of an algorithm
 * whose classification is not known for all possible inputs.
 * <p>
 * The Problem
 * <p>
 * Consider the following algorithm:
 * <p>
 * <p>
 * 1. 		 input n
 * <p>
 * 2. 		 print n
 * <p>
 * <p>
 * 3. 		 if n = 1 then STOP
 * <p>
 * <p>
 * 4. 		 		 if n is odd then  tex2html_wrap_inline44
 * <p>
 * <p>
 * 5. 		 		 else  tex2html_wrap_inline46
 * <p>
 * <p>
 * 6. 		 GOTO 2
 * <p>
 * <p>
 * <p>
 * Given the input 22, the following sequence of numbers will be
 * printed 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
 * <p>
 * It is conjectured that the algorithm above will terminate (when a 1 is printed) for any integral input value.
 * Despite the simplicity of the algorithm, it is unknown whether this conjecture is true. It has been verified,
 * however, for all integers n such that 0 < n < 1,000,000 (and, in fact, for many more numbers than this.)
 * <p>
 * Given an input n, it is possible to determine the number of numbers printed (including the 1).
 * For a given n this is called the cycle-length of n. In the example above, the cycle length of 22 is 16.
 * <p>
 * For any two numbers i and j you are to determine the maximum cycle length over all numbers between i and j.
 * <p>
 * <p>
 * The Input
 * <p>
 * The input will consist of a series of pairs of integers i and j, one pair of integers per line.
 * All integers will be less than 1,000,000 and greater than 0.
 * <p>
 * You should process all pairs of integers and for each pair determine the maximum cycle
 * length over all integers between and including i and j.
 * <p>
 * You can assume that no operation overflows a 32-bit integer.
 * <p>
 * The Output
 * <p>
 * For each pair of input integers i and j you should output i, j, and the maximum cycle
 * length for integers between and including i and j. These three numbers should be separated by at
 * least one space with all three numbers on one line and with one line of output for each line of input.
 * The integers i and j must appear in the output in the same order in which they appeared in the
 * input and should be followed by the maximum cycle length (on the same line).
 * <p>
 * Sample Input
 * <p>
 * 1 10
 * 100 200
 * 201 210
 * 900 1000
 * Sample Output
 * <p>
 * 1 10 20
 * 100 200 125
 * 201 210 89
 * 900 1000 174
 */

public class The3nPlus1Problem {
    public The3nPlus1Problem() {
    }

    private int findCollatzSize(long n) {
        List<Long> list = new ArrayList<Long>();

        int size = 1;

        while (n != 1) {
            size++;

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }

        return size;
    }

    public int find(int a, int b) {
        int m = Math.min(a, b);
        int n = Math.max(a, b);

        List<Integer> list = new ArrayList<Integer>();

        for (int i = m; i <= n; i++) {
            list.add(findCollatzSize(i));
        }

        return max(list);
    }

    private int max(List<Integer> list) {
        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }

        return max;
    }

    private void solve(int a, int b, PrintWriter out) {
        out.format("%d %d %d%n", a, b, find(a, b));
    }

    public static void main(String[] args) throws IOException {
        The3nPlus1Problem problem = new The3nPlus1Problem();

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        while(in.hasNextInt()){
            problem.solve(in.nextInt(), in.nextInt(), out);
        }

        in.close();
    }

     static int[] toIntArray(String[] data) {
        int[] a = new int[data.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(data[i]);
        }

        return a;
    }
}


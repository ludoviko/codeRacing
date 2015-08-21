package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p/>
 *         Shapur was an extremely gifted student. He was great at everything including Combinatorics,
 *         Algebra, Number Theory, Geometry, Calculus, etc. He was not only smart but extraordinarily
 *         fast! He could manage to sum 1018 numbers in a single second.
 *         <p/>
 *         One day in 230 AD Shapur was trying to find out if any one can possibly do
 *         calculations faster than him. As a result he made a very great contest and asked every one to come and take part.
 *         <p/>
 *         In his contest he gave the contestants many different pairs of numbers.
 *         Each number is made from digits 0 or 1. The contestants should write a new
 *         number corresponding to the given pair of numbers. The rule is simple:
 *         The i-th digit of the answer is 1 if and only if the i-th digit of the two
 *         given numbers differ. In the other case the i-th digit of the answer is 0.
 *         <p/>
 *         Shapur made many numbers and first tried his own speed. He saw that he can perform
 *         these operations on numbers of length ∞ (length of a number is number of digits in it) in
 *         a glance! He always gives correct answers so he expects the contestants to
 *         give correct answers, too. He is a good fellow so he won't give anyone
 *         very big numbers and he always gives one person numbers of same length.
 *         <p/>
 *         Now you are going to take part in Shapur's contest. See if you are faster and more accurate.
 *         <p/>
 *         Input
 *         There are two lines in each input. Each of them contains a single number.
 *         It is guaranteed that the numbers are made from 0 and 1 only and that their length is same.
 *         The numbers may start with 0. The length of each number doesn't exceed 100.
 *         <p/>
 *         Output
 *         Write one line — the corresponding answer. Do not omit the leading 0s.
 *         <p/>
 *         Sample test(s)
 *         input
 *         1010100
 *         0100101
 *         output
 *         1110001
 *         input
 *         000
 *         111
 *         output
 *         111
 *         input
 *         1110
 *         1010
 *         output
 *         0100
 *         input
 *         01110
 *         01100
 *         output
 *         00010
 */

public class UltraFastMathematician {

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        UltraFastMathematician main = new UltraFastMathematician();

        out.println(main.find(scanner.next(), scanner.next()));

        scanner.reader.close();
        out.close();
    }

    public String find(String a, String b) {

        String data = "";
        int c = 0, d = 0, e = 0;

        for (int i = 0; i < a.length(); i++) {
            c = Integer.parseInt(a.charAt(i) + "");
            d = Integer.parseInt(b.charAt(i) + "");
            e = c ^ d;
            data += e;
        }

        return data;
    }

    // -----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader reader;

        public MyScanner() {
            this.reader = new BufferedReader(new InputStreamReader(System.in));
        }

        public void close() throws IOException {
            this.reader.close();
        }

        int nextInt() {
            return Integer.parseInt(this.next());
        }

        long nextLong() {
            return Long.parseLong(this.next());
        }

        double nextDouble() {
            return Double.parseDouble(this.next());
        }

        String next() {
            String str = "";
            try {
                str = this.reader.readLine().trim();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        String[] nextStringArray() {
            String[] str = null;
            try {
                str = this.reader.readLine().trim().split(" ");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}


package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Recently, Anton has found a set. The set consists of small English letters. Anton carefully wrote out all the letters from the set in one line, separated by a comma. He also added an opening curved bracket at the beginning of the line and a closing curved bracket at the end of the line.
 *         <p/>
 *         Unfortunately, from time to time Anton would forget writing some letter and write it again. He asks you to count the total number of distinct letters in his set.
 *         <p/>
 *         Input
 *         The first and the single line contains the set of letters. The length of the line doesn't exceed 1000. It is guaranteed that the line starts from an opening curved bracket and ends with a closing curved bracket. Between them, small English letters are listed, separated by a comma. Each comma is followed by a space.
 *         <p/>
 *         Output
 *         Print a single number — the number of distinct letters in Anton's set.
 *         <p/>
 *         Sample test(s)
 *         input
 *         {a, b, c}
 *         output
 *         3
 *         input
 *         {b, a, b, a}
 *         output
 *         2
 *         input
 *         {}
 *         output
 *         0
 */

public class AntonAndLetters {

    public int find(String string) {

        if (string.length() <= 2) {
            return 0;
        }

        String[] data = string.substring(1, string.length() - 1).split(", ");

        Set<String> set = new HashSet<String>();


        set.addAll(Arrays.asList(data));

        return set.size();
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        AntonAndLetters main = new AntonAndLetters();

        String string = scanner.next();

        out.println(main.find(string));

        scanner.reader.close();
        out.close();
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


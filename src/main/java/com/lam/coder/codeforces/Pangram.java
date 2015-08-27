package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * @author L.Azuaje.
 *         <p/>
 *         A word or a sentence in some language is called a pangram if all the characters of the alphabet of this language appear in it at least once. Pangrams are often used to demonstrate fonts in printing or test the output devices.
 *         <p/>
 *         You are given a string consisting of lowercase and uppercase Latin letters. Check whether this string is a pangram. We say that the string contains a letter of the Latin alphabet if this letter occurs in the string in uppercase or lowercase.
 *         <p/>
 *         Input
 *         The first line contains a single integer n (1 ≤ n ≤ 100) — the number of characters in the string.
 *         <p/>
 *         The second line contains the string. The string consists only of uppercase and lowercase Latin letters.
 *         <p/>
 *         Output
 *         Output "YES", if the string is a pangram and "NO" otherwise.
 *         <p/>
 *         Sample test(s)
 *         input
 *         12
 *         toosmallword
 *         output
 *         NO
 *         input
 *         35
 *         TheQuickBrownFoxJumpsOverTheLazyDog
 *         output
 *         YES
 */

public class Pangram {

    public String find(String string) {
        string = string.toLowerCase();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabet = letters.toCharArray();
        int[] frequency = new int[alphabet.length];

        String missings = "";

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                frequency[string.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == 0) {
                missings += (char) (i + 'a');
            }
        }

        if (missings.length() > 0) {
            return new String("NO");
        }

        return "YES";
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        Pangram main = new Pangram();

        int n = scanner.nextInt();
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

        int[] nextIntArray() {
            String[] data = nextStringArray();
            int[] a = new int[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        Integer[] nextIntegerArray() {
            String[] data = nextStringArray();
            Integer[] a = new Integer[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(data[i]);
            }

            return a;
        }

        long[] nextLongArray() {
            String[] data = nextStringArray();
            long[] a = new long[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Long.parseLong(data[i]);
            }

            return a;
        }
    }
}


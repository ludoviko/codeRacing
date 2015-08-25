package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p/>
 *         Our good friend Mole is trying to code a big message. He is typing on an unusual keyboard with characters arranged in following way:
 *         <p/>
 *         <p/>
 *         qwertyuiop
 *         asdfghjkl;
 *         zxcvbnm,./
 *         Unfortunately Mole is blind, so sometimes it is problem for him to put his hands accurately. He accidentally moved both his hands with one position to the left or to the right. That means that now he presses not a button he wants, but one neighboring button (left or right, as specified in input).
 *         <p/>
 *         We have a sequence of characters he has typed and we want to find the original message.
 *         <p/>
 *         Input
 *         First line of the input contains one letter describing direction of shifting ('L' or 'R' respectively for left or right).
 *         <p/>
 *         Second line contains a sequence of characters written by Mole. The size of this sequence will be no more than 100. Sequence contains only symbols that appear on Mole's keyboard. It doesn't contain spaces as there is no space on Mole's keyboard.
 *         <p/>
 *         It is guaranteed that even though Mole hands are moved, he is still pressing buttons on keyboard and not hitting outside it.
 *         <p/>
 *         Output
 *         Print a line that contains the original message.
 *         <p/>
 *         Sample test(s)
 *         input
 *         R
 *         s;;upimrrfod;pbr
 *         output
 *         allyouneedislove
 */

public class Keyboard {
    public String find(String LR, String string) {
        String key = "qwertyuiopasdfghjkl;zxcvbnm,./";
        char[] data = key.toCharArray();

        int shift = 0;
        if (LR.equals("L")) {
            shift = 1;
        } else {
            shift = -1;
        }

        StringBuilder builder = new StringBuilder();

        char k;
        int p = -1;
        for (int i = 0; i < string.length(); i++) {
            k = string.charAt(i);
            p = key.indexOf(k);
            builder.append(data[p + shift]);
        }

        return builder.toString();
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        Keyboard main = new Keyboard();

        out.println(main.find(scanner.next(), scanner.next()));

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


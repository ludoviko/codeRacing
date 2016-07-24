package com.lam.coder.uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


/**
 * @author UVA 11530 - SMS Typing

 *
 * Cell phones have become an essential part of modern life. In addition to
 *         making voice calls, cell phones can be used to send text messages, which
 *         are known as SMS for short. Unlike computer keyboards, most cell phones
 *         have limited number of keys. To accommodate all alphabets, letters are
 *         compacted into single key. Therefore, to type certain characters, a key
 *         must be repeatedly pressed until that character is shown on the display
 *         panel.
 *         In this problem we are interested in finding out the number of times keys on a cell phone must be
 *         pressed to type a particular message.
 *         In this problem we will assume that the key pad of our cell phone is arranged as follows.
 *         ---------------------
 *         | | abc | def |
 *         ---------------------
 *         | ghi | jkl | mno |
 *         ---------------------
 *         | pqrs | tuv | wxyz |
 *         ---------------------
 *         | | <SP>| |
 *         ---------------------
 *         In the above grid each cell represents one key. Here <SP> means a space. In order to type the letter
 *         ‘a’, we must press that key once, however to type ‘b’ the same key must be repeatedly pressed twice
 *         and for ‘c’ three times. In the same manner, one key press for ‘d’, two for ‘e’ and three for ‘f’. This is
 *         also applicable for the remaining keys and letters. Note that it takes a single press to type a space.
 *         Input
 *         The first line of input will be a positive integer T where T denotes the number of test cases. T lines
 *         will then follow each containing only spaces and lower case letters. Each line will contain at least 1 and
 *         at most 100 characters.
 *         Output
 *         For every case of input there will be one line of output. It will first contain the case number followed
 *         by the number of key presses required to type the message of that case. Look at the sample output for
 *         exact formatting.
 *         Sample Input
 *         2
 *         welcome to ulab
 *         good luck and have fun
 *         Sample Output
 *         Case #1: 29
 *         Case #2: 41
 */

public class SMSTyping {

    public static int  find(String string) {
        char[] data = string.toLowerCase().toCharArray();

        int n  = 0;
        for (char c: data) {
            switch (c) {
                case 'a':
                case 'd':
                case 'g':
                case 'j':
                case 'm':
                case 'p':
                case 't':
                case 'w':
                    n++;
                    break;
                case 'b':
                case 'e':
                case 'h':
                case 'k':
                case 'n':
                case 'q':
                case 'u':
                case 'x':
                    n +=2;
                    break;
                case 'c':
                case 'f':
                case 'i':
                case 'l':
                case 'o':
                case 'r':
                case 'v':
                case 'y':
                    n +=3;
                    break;
                case 's':
                case 'z':
                    n +=4;
                    break;
                case ' ':
                    n++;
                    break;
            }
        }
        return n;
    }


//	public find() {
//	}

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        SMSTyping main = new SMSTyping();

        int n = scanner.nextInt();
        String string;

        for (int i = 0; i < n; i++) {
            string = scanner.next();
            out.format("Case #%d: %d%n", i+1,  find(string));
        }

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
                str = this.reader.readLine();
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


package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p/>
 *         Scrooge McDuck keeps his most treasured savings in a home safe with a combination lock. Each time he wants to put there the treasures that he's earned fair and square, he has to open the lock.
 *         <p/>
 *         <p/>
 *         The combination lock is represented by n rotating disks with digits from 0 to 9 written on them. Scrooge McDuck has to turn some disks so that the combination of digits on the disks forms a secret combination. In one move, he can rotate one disk one digit forwards or backwards. In particular, in one move he can go from digit 0 to digit 9 and vice versa. What minimum number of actions does he need for that?
 *         <p/>
 *         Input
 *         The first line contains a single integer n (1 ≤ n ≤ 1000) — the number of disks on the combination lock.
 *         <p/>
 *         The second line contains a string of n digits — the original state of the disks.
 *         <p/>
 *         The third line contains a string of n digits — Scrooge McDuck's combination that opens the lock.
 *         <p/>
 *         Output
 *         Print a single integer — the minimum number of moves Scrooge McDuck needs to open the lock.
 *         <p/>
 *         Sample test(s)
 *         input
 *         5
 *         82195
 *         64723
 *         output
 *         13
 *         Note
 *         In the sample he needs 13 moves:
 *         <p/>
 *         1 disk:
 *         2 disk:
 *         3 disk:
 *         4 disk:
 *         5 disk:
 */

public class CombinationLock {

    public int find(String n1, String n2) {

        int sum = 0;
        for (int i = 0; i < n2.length(); i++) {
            if (Math.abs(Character.getNumericValue(n1.charAt(i)) - Character.getNumericValue(n2.charAt(i))) <= 5) {
                sum += Math.abs(Character.getNumericValue(n1.charAt(i)) - Character.getNumericValue(n2.charAt(i)));
            } else {
                sum += 10 - Math.abs(Character.getNumericValue(n1.charAt(i)) - Character.getNumericValue(n2.charAt
                        (i)));
            }
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        CombinationLock main = new CombinationLock();

        int n = scanner.nextInt();

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


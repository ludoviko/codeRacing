package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;

/**
 * @author L.Azuaje.
 *         <p/>
 *         Kirito is stuck on a level of the MMORPG he is playing now. To move on in the game, he's got to defeat all n dragons that live on this level. Kirito and the dragons have strength, which is represented by an integer. In the duel between two opponents the duel's outcome is determined by their strength. Initially, Kirito's strength equals s.
 *         <p/>
 *         If Kirito starts duelling with the i-th (1 ≤ i ≤ n) dragon and Kirito's strength is not greater than the dragon's strength xi, then Kirito loses the duel and dies. But if Kirito's strength is greater than the dragon's strength, then he defeats the dragon and gets a bonus strength increase by yi.
 *         <p/>
 *         Kirito can fight the dragons in any order. Determine whether he can move on to the next level of the game, that is, defeat all dragons without a single loss.
 *         <p/>
 *         Input
 *         The first line contains two space-separated integers s and n (1 ≤ s ≤ 104, 1 ≤ n ≤ 103). Then n lines follow: the i-th line contains space-separated integers xi and yi (1 ≤ xi ≤ 104, 0 ≤ yi ≤ 104) — the i-th dragon's strength and the bonus for defeating it.
 *         <p/>
 *         Output
 *         On a single line print "YES" (without the quotes), if Kirito can move on to the next level and print "NO" (without the quotes), if he can't.
 *         <p/>
 *         Sample test(s)
 *         input
 *         2 2
 *         1 99
 *         100 0
 *         output
 *         YES
 *         input
 *         10 1
 *         100 100
 *         output
 *         NO
 *         Note
 *         In the first sample Kirito's strength initially equals 2. As the first dragon's strength is less than 2, Kirito can fight it and defeat it. After that he gets the bonus and his strength increases to 2 + 99 = 101. Now he can defeat the second dragon and move on to the next level.
 *         <p/>
 *         In the second sample Kirito's strength is too small to defeat the only dragon and win.
 */

public class Dragons {
    public String find(int force, String[] fighters) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        Set<Integer> data = new TreeSet<Integer>();

        for (int i = 0; i < fighters.length; i++) {
            if (map.containsKey(new Integer(fighters[i].split(" ")[0]))) {
                int aux = new Integer(fighters[i].split(" ")[1]);
                aux += map.get(new Integer(fighters[i].split(" ")[0]));
                map.put(new Integer(fighters[i].split(" ")[0]), aux);
            } else {
                map.put(new Integer(fighters[i].split(" ")[0]), new Integer(fighters[i].split(" ")[1]));
                data.add(new Integer(fighters[i].split(" ")[0]));
            }
        }

        int power = force;
        for (Integer i : data) {
            if (power > i) {
                power += map.get(i);
            } else {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        Dragons main = new Dragons();

        int[] data = scanner.nextIntArray();
        String[] fighters = new String[data[1]];

        for (int i = 0; i < data[1]; i++) {
            fighters[i] = scanner.next();
        }

        out.println(main.find(data[0], fighters));

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

        Float[] nextFloatArray() {
            String[] data = nextStringArray();
            Float[] a = new Float[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Float.parseFloat(data[i]);
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


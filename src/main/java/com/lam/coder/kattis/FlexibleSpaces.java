package com.lam.coder.kattis;

import java.io.*;
import java.util.Arrays;

/**
 * Kattis: flexible
 * Golomb Industries is designing their new office building following modern principles that allow for flexible, reconfigurable meeting spaces. Their plans include a very wide rectangular room, with a series of optional parallel partitions.
 *         <p/>
 *         Figure 1: An example of a configurable space
 *         Figure 1 illustrates such a room having a width of 10 units and three optional partitions located 1 unit, 4 units, and 8 units away from the left wall of the room. The width of the room always measures the distance between the left and right walls, and partitions always run parallel to these walls. We do not concern ourselves with the depth of the room.
 *         <p/>
 *         For this example, if no partitions are used, a meeting can be held in the original space having width 10. If the company needs a space that is precisely 4 units wide, they can use the portion of the room between the left wall and a partition placed at location 4 (or they could use the portion between the partitions at locations 4 and 8). To provide a space having width 7 they can use the portion of the room between the partitions placed at locations 1 and 8 (omitting the partition at location 4).
 *         <p/>
 *         Given a particular room design, your job is to determine all feasible widths for a meeting.
 *         <p/>
 *         Input
 *         The first line of the input contains two integers: the overall width WW of the room, with 2?W?1002?W?100, and the number PP of intermediate partitions, such that 1?P<W1?P<W. Following that is a line with PP integers, each designating the location LL of an optional partition, such that 0<L<W0<L<W. Each partition is at a distinct location and the partitions’ locations will be listed in increasing order.
 *         <p/>
 *         Output
 *         Your program should output a list, from smallest to largest, of each distinct width that can be achieved for a meeting space.
 *         <p/>
 *         Sample Input 1	Sample Output 1
 *         10 3
 *         1 4 8
 *         1 2 3 4 6 7 8 9 10
 *         Sample Input 2	Sample Output 2
 *         6 2
 *         2 5
 *         1 2 3 4 5 6
 */

public class FlexibleSpaces {

    public int[] find(int[] data) {
        int[] solution = new int[data[data.length - 1] + 1];
        Arrays.fill(solution, 0);

        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                solution[data[j] - data[i]] = data[j] - data[i];
            }
        }

        return solution;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        FlexibleSpaces main = new FlexibleSpaces();

        int array[] = scanner.nextIntArray();

        int wide = array[0];
        int n = array[1];

        int[] data = new int[n + 2];
        data[0] = 0;
        data[n + 1] = wide;

        array = scanner.nextIntArray();

        for (int i = 0; i < n; i++) {
            data[i + 1] = array[i];
        }

        int[] solution = main.find(data);

        for (int s : solution) {
            if (s != 0) {
                out.format("%d ", s);
            }
        }

        scanner.reader.close();
        out.println();
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


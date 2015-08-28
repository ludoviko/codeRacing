package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p/>
 *         The police department of your city has just started its journey. Initially, they don’t have any manpower. So, they started hiring new recruits in groups.
 *         <p/>
 *         Meanwhile, crimes keeps occurring within the city. One member of the police force can investigate only one crime during his/her lifetime.
 *         <p/>
 *         If there is no police officer free (isn't busy with crime) during the occurrence of a crime, it will go untreated.
 *         <p/>
 *         Given the chronological order of crime occurrences and recruit hirings, find the number of crimes which will go untreated.
 *         <p/>
 *         Input
 *         The first line of input will contain an integer n (1 ≤ n ≤ 105), the number of events. The next line will contain n space-separated integers.
 *         <p/>
 *         If the integer is -1 then it means a crime has occurred. Otherwise, the integer will be positive, the number of officers recruited together at that time. No more than 10 officers will be recruited at a time.
 *         <p/>
 *         Output
 *         Print a single integer, the number of crimes which will go untreated.
 *         <p/>
 *         Sample test(s)
 *         input
 *         3
 *         -1 -1 1
 *         output
 *         2
 *         input
 *         8
 *         1 -1 1 -1 -1 1 1 1
 *         output
 *         1
 *         input
 *         11
 *         -1 -1 2 -1 -1 -1 -1 -1 -1 -1 -1
 *         output
 *         8
 *         Note
 *         Lets consider the second example:
 *         <p/>
 *         Firstly one person is hired.
 *         Then crime appears, the last hired person will investigate this crime.
 *         One more person is hired.
 *         One more crime appears, the last hired person will investigate this crime.
 *         Crime appears. There is no free policeman at the time, so this crime will go untreated.
 *         One more person is hired.
 *         One more person is hired.
 *         One more person is hired.
 *         The answer is one, as one crime (on step 5) will go untreated.
 */

public class PoliceRecruits {

    public int find(int[] data) {

        int sum = 0;
        int c = 0;

        for (int i : data) {
            if (sum <= 0 && i < 0) {
                c++;
            } else {
                sum += i;
            }
        }

        return c;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        PoliceRecruits main = new PoliceRecruits();

        int n = scanner.nextInt();

        out.println(main.find(scanner.nextIntArray()));

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


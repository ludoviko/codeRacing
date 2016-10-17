package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.*;

/**
 * @author Solution by: L.Azuaje.
 *         <p>
 *         Codeforces:  459B.
 *         Round #261 Div 2:   Pashmak And Flowers.
 */

public class PashmakAndFlowers {
    public static String find(Long[] data) {
        long dif = 0;
        Arrays.sort(data);

        dif = data[data.length - 1] - data[0];

        Map<Long, Long> map = histogram(data);

        Set<Long> keys = map.keySet();

        Iterator<Long> itera = keys.iterator();

        BigInteger countBI = BigInteger.ZERO;
        long k = 0;

        if (dif == 0) {
            if (itera.hasNext()) {
                // Combinations of 2 elements from n.
               // count = data.length * (data.length - 1)/2 ;
                countBI = new BigInteger(data.length + "").multiply(new BigInteger((data.length + -1) + ""));
                countBI = countBI.divide(new BigInteger("2"));
            }
        } else {
            while (itera.hasNext()) {
                k = itera.next();
                countBI = countBI.add(new BigInteger(map.get(k) + "").multiply(new BigInteger(map.getOrDefault(k + dif, 0L) + "")));
            }
        }

        return Long.toString(dif) + " " + countBI.toString();
    }

    private static Map<Long, Long> histogram(Long[] data) {
        Map<Long, Long> map = new HashMap<Long,Long>();

        for (int i = 0; i < data.length; i++) {
            map.put(data[i], map.getOrDefault(data[i], 0L) + 1);
        }

        return map;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        int n = scanner.nextInt();
        Long[] data = scanner.nextLongArray();

        out.println(find(data));

        scanner.close();
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

        Long[] nextLongArray() {
            String[] data = nextStringArray();
            Long[] a = new Long[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Long.parseLong(data[i]);
            }

            return a;
        }
    }
}


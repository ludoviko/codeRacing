package com.lam.coder.codeabbey;

import java.io.*;
import java.util.*;

/**
 * @author L.Azuaje.
 */

public class Anagrams {
    public static final String DirIn = "src/main/java/com/lam/coder/codeabbey/dataIn/";
    // String dirIn =                     "src/main/java/com/lam/coder/codeabbey/";

    public static final String DataIn = DirIn + "words.txt";

    Map<String, Integer> map;

    public Anagrams() {
        map = new HashMap<String, Integer>(1000);
    }

    private static String[] readData() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(DataIn));
        List<String> data = new LinkedList<String>();
        String line = null;
        while ((line = reader.readLine()) != null) {
            data.add(line);
        }

        String[] strings = data.toArray(new String[0]);
        reader.close();
        return strings;
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        Anagrams main = new Anagrams();

        main.fillMap(readData());

        Map<String, Integer> map = main.getMap();

        int n = scanner.nextInt();
        String string = null;
        char[] chars = null;

        for (int i = 0; i < n; i++) {
            string = scanner.next();
            chars = string.toCharArray();
            Arrays.sort(chars);
            string = new String(chars);
            out.format("%d ", map.get(string));
        }

        out.println();

        scanner.reader.close();
        out.close();
    }

    public Map<String, Integer> getMap() {
        return this.map;
    }

    public void fillMap(String[] data) {
        char[] chars = null;
        String string = null;

        for (int i = 0; i < data.length; i++) {
            chars = data[i].toCharArray();
            Arrays.sort(chars);
            string = new String(chars);
            map.put(string, map.getOrDefault(string, -1) + 1);
        }
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

        float[] nextFloatArray() {
            String[] data = nextStringArray();
            float[] a = new float[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Float.parseFloat(data[i]);
            }

            return a;
        }

        double[] nextDoubleArray() {
            String[] data = nextStringArray();
            double[] a = new double[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Double.parseDouble(data[i]);
            }

            return a;
        }
    }
}


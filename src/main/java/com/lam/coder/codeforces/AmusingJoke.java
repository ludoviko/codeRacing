package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * @author So, the New Year holidays are over. Santa Claus and his colleagues can take a rest and have guests at last. When two "New Year and Christmas Men" meet, thear assistants cut out of cardboard the letters from the guest's name and the host's name in honor of this event. Then the hung the letters above the main entrance. One night, when everyone went to bed, someone took all the letters of our characters' names. Then he may have shuffled the letters and put them in one pile in front of the door.
 *         <p/>
 *         The next morning it was impossible to find the culprit who had made the disorder. But everybody wondered whether it is possible to restore the names of the host and his guests from the letters lying at the door? That is, we need to verify that there are no extra letters, and that nobody will need to cut more letters.
 *         <p/>
 *         Help the "New Year and Christmas Men" and their friends to cope with this problem. You are given both inscriptions that hung over the front door the previous night, and a pile of letters that were found at the front door next morning.
 *         <p/>
 *         Input
 *         The input file consists of three lines: the first line contains the guest's name, the second line contains the name of the residence host and the third line contains letters in a pile that were found at the door in the morning. All lines are not empty and contain only uppercase Latin letters. The length of each line does not exceed 100.
 *         <p/>
 *         Output
 *         Print "YES" without the quotes, if the letters in the pile could be permuted to make the names of the "New Year and Christmas Men". Otherwise, print "NO" without the quotes.
 *         <p/>
 *         Sample test(s)
 *         input
 *         SANTACLAUS
 *         DEDMOROZ
 *         SANTAMOROZDEDCLAUS
 *         output
 *         YES
 *         input
 *         PAPAINOEL
 *         JOULUPUKKI
 *         JOULNAPAOILELUPUKKI
 *         output
 *         NO
 *         input
 *         BABBONATALE
 *         FATHERCHRISTMAS
 *         BABCHRISTMASBONATALLEFATHER
 *         output
 *         NO
 *         Note
 *         In the first sample the letters written in the last line can be used to write the names and there won't be any extra letters left.
 *         <p/>
 *         In the second sample letter "P" is missing from the pile and there's an extra letter "L".
 *         <p/>
 *         In the third sample there's an extra letter "L".
 */

public class AmusingJoke {

    public String find(String first, String second, String all) {

        char[] a = first.toCharArray();
        char[] b = second.toCharArray();

        char[] ab = (first + second).toCharArray();
        char[] c = all.toCharArray();

        Arrays.sort(ab);
        Arrays.sort(c);

        if (Arrays.equals(ab, c)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

        AmusingJoke main = new AmusingJoke();

        out.println(main.find(scanner.next(), scanner.next(), scanner.next()));

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


    }
}


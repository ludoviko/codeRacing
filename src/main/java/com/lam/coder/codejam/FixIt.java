package com.lam.coder.codejam;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixIt {
    public static int find(String[] existings, String[] wanteds) {
        Set<String> directories = new HashSet<String>();
        String regex = "/\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        String dir = "";
        int c = 0;
        directories.addAll(Arrays.asList(existings));

        for (String w : wanteds) {
            matcher = pattern.matcher(w);
            while ( matcher.find()) {
                dir += matcher.group(0);
                if ( directories.contains(dir)) {
                } else {
                    directories.add(dir);
                    c++;
                }

            }

            dir = "";
        }

        return c;
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int e = -1;
        int w = -1;
        int ret = -1;

        String[] existings;
        String[] wanteds;

        for (int i = 0; i < n; i++) {
            e = in.nextInt();
            w = in.nextInt();

            existings = new String[e];
            wanteds = new String[w];

            for (int j = 0; j < e; j++) {
                existings[j] = in.next();
            }

            for (int j = 0; j < w; j++) {
                wanteds[j] = in.next();
            }

            ret = find(existings, wanteds);
            out.format("Case #%d: %d%n", i + 1, ret);
            System.out.format("Case #%d: %d%n", i + 1, ret);

            existings = null;
            wanteds = null;
        }
    }

    void run() {
        String name = FixIt.class.getName();
        String sizeS = "-small";
        String sizeX = "-large";
        String size = sizeX;
        String fileIn = name + size + ".in";
        String fileOut = name + size + ".out";
        Locale.setDefault(Locale.US);
        try {
                // Read from keyboard, write to screen.
                Scanner in = new Scanner(new FileReader(fileIn));
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
                        new File(fileOut))));
                // Read from keyboard, write to screen.
//                Scanner in = new Scanner(System.in);
//                PrintWriter out = new PrintWriter(System.out);
            solve(in, out);
            in.close();
            out.close();
        } catch (Exception exception) {
               throw new Error(exception);
        }
    }

    public static void main(String[] strings) {
        new FixIt().run();
    }
}

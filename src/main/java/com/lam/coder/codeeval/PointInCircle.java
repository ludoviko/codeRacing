package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author L.Azuaje.
 *         <p/>
 *         CHALLENGE DESCRIPTION:
 *         <p/>
 *         Having coordinates of the center of a circle, it's radius and coordinates of a point you need to define whether this point is located inside of this circle.
 *         <p/>
 *         INPUT SAMPLE:
 *         <p/>
 *         Your program should accept as its first argument a path to a filename. Input example is the following
 *         <p/>
 *         Center: (2.12, -3.48); Radius: 17.22; Point: (16.21, -5)
 *         Center: (5.05, -11); Radius: 21.2; Point: (-31, -45)
 *         Center: (-9.86, 1.95); Radius: 47.28; Point: (6.03, -6.42)
 *         All numbers in input are between -100 and 100
 *         <p/>
 *         OUTPUT SAMPLE:
 *         <p/>
 *         Print results in the following way.
 *         <p/>
 *         true
 *         false
 *         true
 */

public class PointInCircle {
    // Center: (2.12, -3.48); Radius: 17.22; Point: (16.21, -5)
    public boolean find(String string) {

        string = string.replaceAll("Center:", "");
        string = string.replaceAll("Radius:", "");
        string = string.replaceAll("Point:", "");
        string = string.replaceAll("[(),;]", "");

        float[] data = nextFloatArray(string.trim());

        float x = data[0] + data[2];
        float y = data[1] + data[2];

        if (x >= data[3] && y >= data[4] && data[3] >= -x && data[4] >= -y) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        PrintStream out = System.out;

        PointInCircle main = new PointInCircle();
        String line;

        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            out.println(main.find(line));
        }

        buffer.close();
        out.close();
    }


    String[] nextStringArray(String string) {
        String[] str = null;
        str = string.trim().split("\\s+");

        return str;
    }

    int[] nextIntArray(String string) {
        String[] data = nextStringArray(string);
        int[] a = new int[data.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(data[i]);
        }

        return a;
    }

    float[] nextFloatArray(String string) {
        String[] data = nextStringArray(string);
        float[] a = new float[data.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = Float.parseFloat(data[i]);
        }

        return a;
    }


    Integer[] nextIntegerArray(String string) {
        String[] data = nextStringArray(string);
        Integer[] a = new Integer[data.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(data[i]);
        }

        return a;
    }


}


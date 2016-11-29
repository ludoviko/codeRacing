package com.lam.coder.acmTimus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Sum {
    public int find(int n) {
        if (n > 0) {
            return n * (n + 1) /2;
        } else {
            n = n * -1;
            return - n * (n + 1) /2 + 1;
        }
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        Sum sum  = new Sum();

        streamTokenizer.nextToken();
        int n = (int)streamTokenizer.nval;
        System.out.println(sum.find(n));
    }
}

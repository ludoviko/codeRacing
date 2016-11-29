package com.lam.coder.acmTimus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.LinkedList;
import java.util.List;

// No test.
public class ReverseRoot {
    public static void main(String[] args) throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        List<Long> list = new LinkedList<Long>();

        while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
            if(streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                list.add(0, (long) streamTokenizer.nval);
            }
        }

        for (Long d : list) {
            System.out.format("%.4f%n", Math.sqrt(d));
        }
    }
}
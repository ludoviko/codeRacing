package com.lam.coder.acmTimus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class DemocracyinDanger {

    public int findMinimunVoters(int[] data) {

        Arrays.sort(data);
        int counter = 0;
        int majority = 0;

        for (int d : data) {
            if (majority > data.length / 2) {
                break;
            } else {
                counter += d / 2 + 1;
                majority++;
            }
        }

        return counter;
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        DemocracyinDanger democracyinDanger = new DemocracyinDanger();

        streamTokenizer.nextToken();
        int size = (int)streamTokenizer.nval;
        int[] data = new int[size];

        int i = 0;
        while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
            if(streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                data[i++] =  (int)streamTokenizer.nval;
            }
        }

        System.out.println(democracyinDanger.findMinimunVoters(data));

    }

}

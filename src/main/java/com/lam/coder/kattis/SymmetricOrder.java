package com.lam.coder.kattis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SymmetricOrder {

    public List<String> process(List<String> list) {
        List<String> data = new ArrayList<String>();
        List<String> data_2 = new ArrayList<String>();


        for (int i = 0; i < list.size() ; i++) {
            if ( i % 2 == 0) {
                data.add(list.get(i));
            } else {
                data_2.add(0, list.get(i));
            }
        }

        data.addAll(data_2);

        return data;
    }

    public static void main(String[] args) throws IOException {
        SymmetricOrder sym = new SymmetricOrder();
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        List<String> list = new LinkedList<String>();
        List<String> syms;
        int len;

        int j = 1;

        while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
            if(streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                len = (int) streamTokenizer.nval;

                if (len == 0) {
                    break;
                }

                list.clear();
                for (int i = 0; i < len; i++) {
                    streamTokenizer.nextToken();
                    String item = streamTokenizer.sval;
                    list.add(item);
                }

                System.out.println("SET " + j++);

                syms = sym.process(list);
                for (String s : syms) {
                    System.out.println(s);
                }

            }
        }
    }
}

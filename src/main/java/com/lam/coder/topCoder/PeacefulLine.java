package com.lam.coder.topCoder;

/**
 * Created by Usuario on 03/10/2016.
 */
public class PeacefulLine {
    public static final String IMPOSSIBLE = "impossible";
    public static final String POSSIBLE = "possible";

    public String makeLine(int[] a) {
        int j = 0;
        int maxValue = 0;

        int[] counter = new int[26];

        for (int i = 0; i < a.length; i++) {
            counter[a[i]]++;
        }

        for (int i = 0; i < counter.length; i++) {
            if ( counter[i] > maxValue ) {
                maxValue = counter[i];
                j = i;
            }
        }

        if (  a.length >=   2 * counter[j] - 1)  {
            return POSSIBLE;
        } else {
            return IMPOSSIBLE;
        }
    }
}
package com.lam.coder.topCoder;

/**
 * Created by Usuario on 05/10/2016.
 */
public class BearCheats {
    public String eyesight(int a, int b) {
        String h = "happy";
        String g = "glasses";

        if (a == b) {
            return h;
        }

        if ( a < 10 & b < 10 ) {
            return h;
        }

        String as = a + "";
        String bs = b + "";

        int d = 0;

        for (int i = 0; i < as.length(); i++) {
            if ( as.charAt(i) == bs.charAt(i)) {
            } else {
                d++;
                if (d > 1) {
                    return g;
                }
            }
        }

        return h;
    }
}
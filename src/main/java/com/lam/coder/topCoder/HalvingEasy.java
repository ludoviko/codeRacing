package com.lam.coder.topCoder;

public class HalvingEasy {

    public int count(int[] array, int n) {
        int c = 0;

        for (int a : array) {
            if (a == n) {
                c++;
            } else if (a < n) {
            } else {
                while (a >= 1) {
                    a = a / 2;
                    if (a == n) {
                        c++;
                        break;
                    }
                }
            }
        }


        return c;
    }

}

package com.lam.coder.topCoder;

/**
 * Created by Usuario on 10/05/2017.
 */
public class RangeEncoding {
    public int minRanges(int[] array) {
        int c = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if ( array[i + 1] - array[i] > 1) {
                c++;
            }
        }
        return c;
    }
}

package com.lam.coder.topCoder;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author TopCoder.
 *
 * Solution by: L.Azuaje.
 *         <p>
 * Problem TopCoder: FanFailure SRM 195.
 */
public class FanFailure {

    public 	int[] getRange(int[] capacities, int minCooling) {

        Integer[] data = new Integer[capacities.length];

        for (int i = 0; i < capacities.length; i++) {
            data[i] = capacities[i];
        }

        Arrays.sort(data, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        });

        int i = 0;
        int s = 0;

        for (Integer c: data ) {
            s += c;
        }

        //  find max failure set
        int min = 0;
        i =  1;
        for (Integer c: data ) {
             min += c;
             if (min >= minCooling) {
                 break;
             }
             i++;
        }

        int MFS = data.length - i;

        //  find MFC
        i =  0;
        for (Integer c: data ) {
            s -= c;
            if (s < minCooling) {
                break;
            }
            i++;
        }

        int MFC = i;

        return new int[] {MFS, MFC};
    }
}

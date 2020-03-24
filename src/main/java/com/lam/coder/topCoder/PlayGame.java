package com.lam.coder.topCoder;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author TopCoder.
 *
 * Solution by: L.Azuaje.
 *         <p>
 *  Problem TopCoder:  SRM 217 PlayGame.
*/

public class PlayGame {
    public int saveCreatures(int[] teamA, int[] teamB ) {

        Integer[] arrayA = new Integer[teamA.length];
        Integer[] arrayB = new Integer[teamB.length];

        for (int i = 0; i < teamA.length; i++) {
            arrayA[i] = teamA[i];
        }

        for (int i = 0; i < teamB.length; i++) {
            arrayB[i] = teamB[i];
        }


        Arrays.sort(arrayA, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }

            @Override
            public boolean equals(Object obj) {
                return this == obj;
            }
        });

        Arrays.sort(arrayB, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }

            @Override
            public boolean equals(Object obj) {
                return this == obj;
            }
        });

        int suma = 0;
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = i; j < arrayB.length; j++) {
                if (arrayA[i] > arrayB[j]) {
                    suma += arrayA[i];
                    arrayB[j] = arrayA[i];
                    break;
                }
            }
        }

        return suma;
    }
}

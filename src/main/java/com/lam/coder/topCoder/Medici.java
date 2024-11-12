package com.lam.coder.topCoder;

/**
 * @author TopCoder.
 * <p>
 * Solution by: L.Azuaje.
 * <p>
 * Problem TopCoder: SRM 204 Medici.
 */


public class Medici {
    public int winner(int[] fame, int[] fortune, int[] secrets) {

        int[] scores = new int[fame.length];

        for (int i = 0; i < fame.length; i++) {
            scores[i] = findSmallest(fame[i], fortune[i], secrets[i]);
        }

        int index = findGreatestIndex(scores);
        int max = scores[index];

        int countMax = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == max) {
                countMax++;
            }
        }

        if (countMax > 1) {
            return -1;
        } else {
            return findGreatestIndex(scores);
        }

    }

    private int findSmallest(int... data) {
        int n = data[0];
        for (int d : data) {
            if (d < n) {
                n = d;
            }
        }
        return n;
    }

    private int findGreatestIndex(int[] data) {
        int index = 0;
        int n = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > n) {
                n = data[i];
                index = i;
            }
        }
        return index;
    }
}

package com.lam.coder.topCoder;

/**
 * Created by Usuario on 04/10/2016.
 */
public class TravellingSalesmanEasy {
    public int getMaxProfit(int M, int[] profit, int[] city, int[] visit) {
        int max = 0;
        int total = 0;
        int n = -1;

        for (int i = 0; i < visit.length; i++) {
            for (int j = 0; j < city.length; j++) {
                if (visit[i] == city[j]) {
                    if (profit[j] > max) {
                        max = profit[j];
                        n = j;
                    }
                }
            }
            if (n >= 0) {
                profit[n] = 0;
                total += max;
                max = 0;
                n = -1;
            }
        }
        return total;
    }
}

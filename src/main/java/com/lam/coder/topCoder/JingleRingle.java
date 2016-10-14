package com.lam.coder.topCoder;

import java.util.Arrays;

/**
 * Solution by: L.Azuaje.
 *
 * Topcoder: TCO10 Qual 2. JingleRingle.
 */
public class JingleRingle {
    public int profit(int[] buyOffers, int[] sellOffers, int tax) {
        int profit = 0;
        int profTemp   = 0;

        if (buyOffers.length == 0 || sellOffers.length == 0) {
            return profit;
        }

        Arrays.sort(buyOffers);
        Arrays.sort(sellOffers);

        for (int i = 0; i < sellOffers.length; i++) {
            if ( i <   buyOffers.length) {
                // Buy cheap from sellOffers, sell expensive at buying.
                // Buy-sell pairwise.
                profTemp = buyOffers[buyOffers.length -1 -i] - sellOffers[i] - tax * buyOffers[buyOffers.length -1 -i]/ 100;
                if (profTemp <= 0) {
                    break;
                }
                profit += profTemp > 0  ? profTemp : 0;
            }
        }
        return profit;
    }
}



package com.lam.coder.topCoder;

/**
 * Solution by L.Azuaje.
 *
 * SRM 479  TheAirTripDivTwo
 */

public class TheAirTripDivTwo {
    public 	int find(int[] flights, int fuel) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < flights.length; i++) {
            sum += flights[i];
            if (sum <= fuel) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}

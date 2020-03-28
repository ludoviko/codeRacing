package com.lam.coder.topCoder;

/**
 * @author TopCoder.
 *
 * Solution by: L.Azuaje.
 *
 * Problem TopCoder: FuelConsumption  SRM 217.
 */

public class FuelConsumption {
    public double maximalDistance(int[] velocities, int[] consumptions, int fuel) {

        double max = 0;
        int index = -1;

        for (int i = 0; i < velocities.length; i++) {
            double item = ((double) velocities[i]) / consumptions[i];
            if (item > max) {
                max = item;
                index = i;
            }
        }

        return ((double) velocities[index]) * fuel/ consumptions[index];
    }
}

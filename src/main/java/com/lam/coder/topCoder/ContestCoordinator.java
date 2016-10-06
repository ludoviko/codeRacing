package com.lam.coder.topCoder;

import java.util.*;

public class ContestCoordinator {
    public double bestAverage(int[] scores) {
        List<Integer> list = new ArrayList<Integer>();

        for (Integer i : scores) {
            list.add(i);
        }

        Collections.sort(list);

        int min;
        int max;
        // It might be not necessary to remove any element to get the maximum average.
        double  maxAverage = findAverage(list);
        double current;

        while (list.size() > 2) {
            min = list.get(0);
            max = list.get(list.size() - 1);

            list.remove(new Integer(min));
            list.remove(new Integer(max));

            current = findAverage(list);

            if (maxAverage <  current) {
                maxAverage = current;
            }
        }

        return maxAverage;
    }

    private static double findAverage(List<Integer> list) {
        double sum = 0.0;

        for (Integer i : list) {
            sum += i;
        }

        return sum / list.size();
    }
}

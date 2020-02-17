package com.lam.coder.topCoder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author TopCoder.
 *
 * Solution by: L.A.
 *         <p>
 *Problem:  TopCoder SRM 222 GroceryBagger.
 */
public class GroceryBagger {

    public int minimumBags(int strength, String[] items) {
        Map<String, Integer> map = new HashMap<>();

        for (String item: items ) {
            map.put(item, 1 + map.getOrDefault(item, 0));
        }

        int bags = 0;

        for ( String item: map.keySet() ) {
            bags += map.get(item)/strength;
            bags += map.get(item)%strength == 0 ? 0: 1;
        }

        return bags;
    }
}

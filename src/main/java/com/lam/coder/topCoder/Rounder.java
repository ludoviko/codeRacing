package com.lam.coder.topCoder;

/**
 * @author TopCoder.
 *
 * Solution by: L.Azuaje.
 *
 *Problem TopCoder: Rounder SRM 195.
 */

public class Rounder {
    public int round(int n, int base) {
        int result = (n/base) * base;

        int remainder = n % base;

        if (base % 2 == 0) {
         if (remainder >= base / 2 ) {
             result += base;
         }
        } else {
            if (remainder > base / 2 ) {
                result += base;
            }
        }

        return result;
    }
}

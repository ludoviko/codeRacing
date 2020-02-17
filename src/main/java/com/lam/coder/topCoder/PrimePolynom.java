package com.lam.coder.topCoder;


/**
 *
 * @author TopCoder
 *
 * Source:  TopCoder Single Round Match 259 Round 1 - Division II, Level Two: PrimePolynom
 *
 * Solution: L.A.
 *
 */

public class PrimePolynom {
    public int reveal(int a, int b, int c) {
        int x = 0;
        int y = 0;
        while (true) {
            y = a * x * x  + b *x + c;
            if (y > 0  && isPrime(y)) {
            } else {
                break;
            }
            x++;
        }
        return x;
    }

    public boolean isPrime(int n) {
        if (n ==1) return false;
        if (n == 2) return true;

        if (n%2==0) return false;

        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}

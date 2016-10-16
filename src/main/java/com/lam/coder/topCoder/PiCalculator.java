package com.lam.coder.topCoder;

import java.math.BigInteger;

/**
 *
 *
 *  Single Round Match 246 Round 1 - Division I, Level One.
 *
 */
public class PiCalculator {
    public static final String PI = "3.141592653589793238462643383279";
    public String decimal;
    public String whole;
    public String decimalSeparator;

    public PiCalculator() {
        decimal = PI.substring(2);
        whole = PI.substring(0, 1);
        decimalSeparator = ".";
    }

    public String calculate(int precision) {
        String solution;
        char c = decimal.charAt(precision);
        BigInteger decimalBI = new BigInteger(PI.substring(2, 2 + precision));

        if (Character.getNumericValue(c) >= 5) {
            decimalBI = decimalBI.add(BigInteger.ONE);
            solution = whole + decimalSeparator + decimalBI.toString();
        } else {
            solution = whole + decimalSeparator + decimal.substring(0, precision);
        }

        return solution;
    }
}

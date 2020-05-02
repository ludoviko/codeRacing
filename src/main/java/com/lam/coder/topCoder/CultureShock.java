package com.lam.coder.topCoder;

/**
 * @author TopCoder.
 *
 * Solution by: L.Azuaje.
 *
 * Problem TopCoder: CultureShock SRM 216.
 */


public class CultureShock {
    public String translate(String text) {
        String solution = "";
        String[] data = text.split(" ");

        for ( String s: data ) {
            if (s.equals("ZEE")) {
                solution += "ZED" + " ";
            } else {
                solution += s + " ";
            }
        }

        return solution.trim();
    }

    public static void main(String[] args) {
        CultureShock cultureShock = new CultureShock();
        System.out.println(cultureShock.translate("ZEE"));
        System.out.println(cultureShock.translate("ZEE ZEE ZED ZEDS ZEE ZEES"));
    }
}

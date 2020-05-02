package com.lam.coder.topCoder;

/**
 * @author TopCoder.
 * <p>
 * Solution by: L.Azuaje.
 * <p>
 * Problem TopCoder: RockStar.
 * <p>
 * This problem was used for:
 * Single Round Match 216 Round 1 - Division I, Level One
 * Single Round Match 216 Round 1 - Division II, Level Two
 */


public class RockStar {
    public int getNumSongs(int ff, int fs, int sf, int ss) {
        int total = 0;
        int trafic = -1;

        String last = "";

        while (trafic != total) {
            trafic = total;
            if (last.isEmpty()) {
                if (ff > 0) {
                    total += ff;
                    ff = 0;
                    last = "ff";
                } else if (fs > 0) {
                    total++;
                    fs--;
                    last = "fs";
                } else if (ss > 0) {
                    total += ss;
                    ss = 0;
                    last = "ss";
                } else if (sf > 0) {
                    total++;
                    sf--;
                    last = "sf";
                }

            } else if (last.endsWith("s")) {
                if (ss > 0) {
                    total += ss;
                    ss = 0;
                    last = "ss";
                } else if (sf > 0) {
                    total++;
                    sf--;
                    last = "sf";
                }
            } else if (last.endsWith("f")) {
                if (fs > 0) {
                    total += 1;
                    fs--;
                    last = "fs";
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        RockStar rockStar = new RockStar();
        System.out.println(rockStar.getNumSongs(100, 0, 0, 200));
        System.out.println(rockStar.getNumSongs(0, 0, 20, 200));
        System.out.println(rockStar.getNumSongs(1, 2, 1, 1));
        System.out.println(rockStar.getNumSongs(192, 279, 971, 249));
    }

}
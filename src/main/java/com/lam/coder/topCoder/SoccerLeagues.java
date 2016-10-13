package com.lam.coder.topCoder;

/**
 *  Solution by L.Azuaje.
 *
 * 	TopCoder: SRM 443 SoccerLeagues.
 */
public class SoccerLeagues {

    public 	int[] points(String[] matches) {
        char awayWin = 'L';
        char homeWin = 'W';
        char draw = 'D';

        int hw = 3;
        int d = 1;
        int aW = 3;

        int[] scores = new int[matches[0].length()];

        for (int i = 0; i < matches.length; i++) {
            for (int j = 0; j < matches[0].length(); j++) {
                if (matches[i].charAt(j) == homeWin) {
                    scores[i] += hw;
                } else if (matches[i].charAt(j) == draw) {
                    scores[i] += d;
                    scores[j] += d;
                } else if (matches[i].charAt(j) == awayWin) {
                    scores[j] += aW;
                }
            }
            
        }
        return scores;
    }
}

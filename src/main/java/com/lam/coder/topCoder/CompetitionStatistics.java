package com.lam.coder.topCoder;

/**
 * @author TopCoder.
 *
 * Solution by: L.Azuaje.
 *         <p>
 *Problem: CompetitionStatistics	SRM 259.
 */
public class CompetitionStatistics {

    public int consecutiveGrowth(int[] ratingChanges) {
        int maxSequence = 0;
        int times = 0;

        for (int rc: ratingChanges ) {
            if (rc > 0) {
                times++;
                if (times > maxSequence) {
                    maxSequence = times;
                }
            } else {
                times = 0;
            }
        }
        return maxSequence;
    }
}

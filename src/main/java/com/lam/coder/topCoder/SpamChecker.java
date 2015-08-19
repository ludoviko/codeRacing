package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement Wolf Sothe was troubled with e-mail spam every day,
 *         so he decided to make his own spam filter.
 * 
 *         Sothe's approach starts by looking at each line of the e-mail
 *         separately and classifying it either as good or bad. The more bad
 *         lines an e-mail contains, the more likely it is a spam.
 * 
 *         Sothe already implemented the above part, and you are given its
 *         output as a String judgeLog. The characters of judgeLog correspond to
 *         the lines of an e-mail, in order. The character 'o' represents a good
 *         line and the character 'x' represents a bad line. For example,
 *         judgeLog="oxooo" corresponds to an e-mail with 5 lines. The second
 *         line of this e-mail is bad and the other four lines are good.
 * 
 *         Sothe now came up with an algorithm to decide whether an e-mail is
 *         spam. Pseudocode of the algorithm is shown below.
 * 
 *         At the beginning, set the score of the e-mail to 0. For each line of
 *         the e-mail, in order: If the line is good, increase the score by G.
 *         If the line is bad, decrease the score by B. If the score is now
 *         negative (i.e., smaller than 0): Classify the e-mail as "SPAM" and
 *         terminate. If the score was never negative: Classify the e-mail as
 *         "NOT SPAM" and terminate.
 * 
 *         In the pseudocode, G and B are positive integers. You are given their
 *         values as ints good and bad.
 * 
 *         Return "SPAM" (quotes for clarity) if the e-mail described by
 *         judgeLog is a spam, and "NOT SPAM" otherwise.
 * 
 *         Definition
 * 
 *         Class: SpamChecker Method: spamCheck Parameters: String, int, int
 *         Returns: String Method signature: String spamCheck(String judgeLog,
 *         int good, int bad) (be sure your method is public)
 * 
 *         Constraints - judgeLog will contain between 1 and 50 characters,
 *         inclusive. - Each character in judgeLog will be 'o' or 'x'. - good
 *         will be between 1 and 1000, inclusive. - bad will be between 1 and
 *         1000, inclusive.
 * 
 *         Examples 0)
 * 
 *         "ooooxxxo"
 * 
 *         2
 * 
 *         3
 * 
 *         Returns: "SPAM"
 * 
 *         After the 7th line of this e-mail the score is 2+2+2+2-3-3-3 = -1.
 *         Hence, at that moment the e-mail gets classified as spam. 
 *         
 *         1)
 *         "ooooxxxo"
 * 
 *         3
 * 
 *         4
 * 
 *         Returns: "NOT SPAM"
 * 
 *         In this case, the score of the e-mail will never be negative, so it
 *         gets classified as not spam. Note that after 7 lines of this e-mail
 *         the score is 0, but that does not make it a spam. 
 *         
 *         2)
 *         "xooooooooooooooooooooooooooo"
 * 
 *         1000
 * 
 *         1
 * 
 *         Returns: "SPAM"
 * 
 *         3)
 *         "oxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
 * 
 *         1000
 * 
 *         1
 * 
 *         Returns: "NOT SPAM"
 * 
 *         4)
 *         "ooxoxoxooxoxxoxoxooxoxoxoxxoxx"
 * 
 *         15
 * 
 *         17
 * 
 *         Returns: "SPAM"
 * 
 *         5)
 *         "oooxoxoxoxoxoxooxooxoxooxo"
 * 
 *         16
 * 
 *         18
 * 
 *         Returns: "NOT SPAM"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: 2014 TCO Algorithm Round 1B - Division I,
 *         Level One
 */

public class SpamChecker {
	public static final String SPAM = "SPAM";
	public static final String NOT_SPAM = "NOT SPAM";

	public static final char GOOD = 'o';
	public static final char BAD = 'x';

	public String spamCheck(String log, int good, int bad) {
		int count = 0;
		String out = NOT_SPAM;

		for (int i = 0; i < log.length(); i++) {
			if (log.charAt(i) == GOOD) {
				count += good;
			} else {
				count -= bad;
			}
			if (count < 0) {
				out = SPAM;
				break;
			} else {
			}
		}

		return out;
	}
}

package com.lam.coder.topCoder;

/**
 * 
 * @author LAzuaje
 * 
 *         Problem Statement for InsertZ
 * 
 *         You are given two Strings: init and goal. Both init and goal contain
 *         lowercase letters only. Additionally, init does not contain the
 *         character 'z'.
 * 
 *         Your goal is to transform init into goal. The only operation you are
 *         allowed to do is to insert the character 'z' anywhere into init. You
 *         can repeat the operation as many times as you want, and each time you
 *         can choose any position where to insert the 'z'.
 * 
 *         For example, if init="fox", you can transform it to "fzox" in one
 *         operation. Alternately, you can transform "fox" into "zzzfoxzzz" in
 *         six operations. It is not possible to transform "fox" into any of the
 *         strings "fx", "foz", "fxo", "foxy".
 * 
 *         Return "Yes" (quotes for clarity) if it is possible to transform init
 *         into goal. Otherwise, return "No".
 * 
 * 
 *         Definition
 * 
 *         Class: InsertZ Method: canTransform Parameters: String, String
 *         Returns: String Method signature: String canTransform(String init,
 *         String goal) (be sure your method is public)
 * 
 * 
 *         Notes - Note that the return value is case sensitive.
 * 
 *         Constraints - init and goal will each contain between 1 and 50
 *         characters, inclusive. - Each character of init and goal will be a
 *         lowercase letter ('a'-'z'). - init will not contain the letter 'z'.
 * 
 *         Examples 0)
 * 
 *         "fox" "fozx" Returns: "Yes" By inserting 'z' to the position bettween
 *         'o' and 'x' in "fox", we obtain "fozx". 1)
 * 
 *         "fox" "zfzoxzz" Returns: "Yes" You may perform the operation multiple
 *         times. 2)
 * 
 *         "foon" "foon" Returns: "Yes" In this case init and goal are equal.
 *         You do not have to perform the operation. 3)
 * 
 *         "topcoder" "zopzoder" Returns: "No" 4)
 * 
 *         "aaaaaaaaaa" "a" Returns: "No" 5)
 * 
 *         "mvixrdnrpxowkasufnvxaq"
 *         "mvizzxzzzrdzznzrpxozzwzzkazzzszzuzzfnvxzzzazzq" Returns: "Yes" 6)
 * 
 *         "opdlfmvuicjsierjowdvnx" "zzopzdlfmvzuicjzzsizzeijzowvznxzz" Returns:
 *         "No" This problem statement is the exclusive and proprietary property
 *         of TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 587 Round 1 - Division
 *         II, Level One
 *
 */

public class InsertZ {

	public String canTransform(String init, String goal) {
		goal = goal.replaceAll("z", "");
		return (init.equals(goal) == true ? "Yes" : "No");
	}
}

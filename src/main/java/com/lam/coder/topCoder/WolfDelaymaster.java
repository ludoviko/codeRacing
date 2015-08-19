package com.lam.coder.topCoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Ludoviko Azuaje Problem Statement    
 * 
 *           Wolf Sothe is playing the game Delaymaster. In this game, he can
 *         create new words according to the following rules: For each positive
 *         integer n, the string which consists of n copies of 'w', then n
 *         copies of 'o', then n copies of 'l', and finally n copies of 'f' is a
 *         valid word.
 * 
 *         The concatenation of two valid words is a valid word. Only the words
 *         that can be obtained by rules 1 and 2 are valid. There are no other
 *         valid words. Thus, for example: By rule 1, "wolf", "wwoollff", and
 *         "wwwooolllfff" are valid words. Then, by rule 2, "wolfwwoollff" is a
 *         valid word.
 * 
 *         By applying rule 2 twice, "wolfwwoollffwolf" is a valid word.
 * 
 *         The string "wfol" is not a valid word (order matters). The string
 *         "wwolfolf" is not a valid word (we can only concatenate, not insert
 *         one word into another). The string "wwwoolllfff" is not a valid word
 *         (only two 'o's instead of three). You are given a String str. Return
 *         "VALID" if str is a valid word and "INVALID" otherwise. Note that the
 *         return value is case-sensitive: you must return the strings "VALID"
 *         and "INVALID" in all-uppercase. Definition     
 * 
 *         Class: WolfDelaymaster Method: check Parameters: String Returns:
 *         String Method signature: public String check(String str)
 * 
 *         Constraints - str will contain between 1 and 50 characters,
 *         inclusive. - Each character in str will be 'w', 'o', 'l' or 'f'.
 *         Examples 0)
 * 
 *              "wolf" Returns: "VALID" The first valid word from the examples
 *         in the problem statement. 1)
 * 
 *              "wwolfolf" Returns: "INVALID" The second invalid word from the
 *         examples in the problem statement. 2)
 * 
 *              "wolfwwoollffwwwooolllfffwwwwoooollllffff" Returns: "VALID"
 * 
 *         3)
 * 
 *              "flowolf" Returns: "INVALID"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
 * 
 * 
 */

public class WolfDelaymaster {

	public String check(String string) {

	String REGEX  = "(w+o+l+f+)+";	
		
	String[] wolves = string.split(REGEX);
	
	 for (String w : wolves ) {
		 System.out.println(w);
	 }
		
     Pattern pattern = Pattern.compile(REGEX);
     Matcher matcher = pattern.matcher(string);
     
     if (matcher != null ) {
       if (matcher.find()) {
         String regex_expression = matcher.group();
         System.out.println( regex_expression);
       };  
     };
		

		
		return "";
	}

	public static void main(String[] args) {
		WolfDelaymaster master = new WolfDelaymaster();

		master.check("wolf");
		master.check("wolfwolf");
		master.check("wolfwwoollff");
//		 *         valid words. Thus, for example: By rule 1, "wolf", "wwoollff", and
//		 *         "wwwooolllfff" are valid words. Then, by rule 2, "wolfwwoollff" is a
//		 *         valid word.

	}

}

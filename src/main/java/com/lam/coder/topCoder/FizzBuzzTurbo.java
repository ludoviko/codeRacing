package com.lam.coder.topCoder;

import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 * 
 *         Fizz Buzz is a simple game used to teach kids about divisibility. The
 *         goal of the game is to say positive integers in increasing order,
 *         with a twist: You don't say the numbers divisible by 3 and 5.
 *         Instead, whenever a number was divisible by 3 you say "fizz" and for
 *         a number divisible by 5 you say "buzz". (Thus, if a number was
 *         divisible by 15, you say "fizzbuzz".)
 * 
 *         Here is how the game starts: 1, 2, fizz, 4, buzz, fizz, 7, 8, fizz,
 *         buzz, 11, fizz, 13, 14, fizzbuzz, 16, 17, fizz, 19, buzz, fizz, 22,
 *         23, fizz, buzz, 26, fizz, 28, 29, fizzbuzz, 31, 32, fizz, 34, buzz,
 *         fizz, ...
 * 
 *         Fizz Buzz has also become a traditional programming interview
 *         question. However, in this problem we have a more tricky assignment
 *         for you.
 * 
 *         You are given longs A and B. Consider the part of the game that
 *         corresponds to integers from A to B, inclusive. During this part of
 *         the game, you will say "fizz" X times, "buzz" Y times, and "fizzbuzz"
 *         Z times. Return a long[] with three elements: {X,Y,Z}.
 * 
 *         Definition
 * 
 *         Class: FizzBuzzTurbo Method: counts Parameters: long, long Returns:
 *         long[] Method signature: long[] counts(long A, long B) (be sure your
 *         method is public)
 * 
 * 
 *         Notes - The return value can be quite large. Make sure to use the
 *         appropriate data type.
 * 
 *         Constraints - A will be between 1 and 10^18, inclusive. - B will be
 *         between A and 10^18, inclusive.
 * 
 *         Examples 0)
 * 
 * 
 *         1
 * 
 *         4
 * 
 *         Returns: {1, 0, 0 }
 * 
 *         This is the sequence "1, 2, fizz, 4". 1)
 * 
 * 
 *         2
 * 
 *         6
 * 
 *         Returns: {2, 1, 0 }
 * 
 *         This is the sequence "2, fizz, 4, buzz, fizz". 2)
 * 
 * 
 *         150
 * 
 *         165
 * 
 *         Returns: {4, 2, 2 }
 * 
 *         This sequence begins and ends with a "fizzbuzz". There are some
 *         "fizz"es and some "buzz"es inbetween. 3)
 * 
 * 
 *         474747
 * 
 *         747474
 * 
 *         Returns: {72728, 36363, 18182 }
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: 2014 TCO Algorithm Round 1C - Division I,
 *         Level Two
 */

public class FizzBuzzTurbo {

	// XXX Non optimal. Understand better approach
	public long[] counts(long from, long to) {
		long fs = 0;
		long bs = 0;
		long fbs = 0;

		for (long i = from; i <= to; i++) {
			if (i % 15 == 0) {
				fbs++;
			} else if (i % 3 == 0) {
				fs++;
			} else if (i % 5 == 0) {
				bs++;
			}
		}

		return new long[] { fs, bs, fbs };
	}
	
//	public long[] counts1(long A, long B) 	  {
//	    long ret3 = B/15 - (A-1)/15;
//	    long ret = (B/3) - (A-1)/3 - ret3;
//	    long ret2 = (B/5) - (A-1)/5 - ret3;
//	    return new long[] {ret, ret2, ret3};
//	  }
}

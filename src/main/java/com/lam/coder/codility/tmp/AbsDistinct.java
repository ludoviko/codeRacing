package com.lam.coder.codility.tmp;

import com.lam.mathematics.array.ArrayUtil;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         A non-empty zero-indexed array A consisting of N numbers is given.
 *         The array is sorted in non-decreasing order. The absolute distinct
 *         count of this array is the number of distinct absolute values among
 *         the elements of the array.
 * 
 *         For example, consider array A such that:
 * 
 *         A[0] = -5 A[1] = -3 A[2] = -1 A[3] = 0 A[4] = 3 A[5] = 6
 * 
 *         The absolute distinct count of this array is 5, because there are 5
 *         distinct absolute values among the elements of this array, namely 0,
 *         1, 3, 5 and 6.
 * 
 *         Write a function:
 * 
 *         class Solution { public int solution(int[] A); }
 * 
 *         that, given a non-empty zero-indexed array A consisting of N numbers,
 *         returns absolute distinct count of array A.
 * 
 *         For example, given array A such that:
 * 
 *         A[0] = -5 A[1] = -3 A[2] = -1 A[3] = 0 A[4] = 3 A[5] = 6
 * 
 *         the function should return 5, as explained above.
 * 
 *         Assume that:
 * 
 *         N is an integer within the range [1..100,000]; each element of array
 *         A is an integer within the range [−2,147,483,648..2,147,483,647];
 *         array A is sorted in non-decreasing order.
 * 
 *         Complexity:
 * 
 *         expected worst-case time complexity is O(N); expected worst-case
 *         space complexity is O(N), beyond input storage (not counting the
 *         storage required for input arguments).
 * 
 *         Elements of input arrays can be modified. Copyright 2009–2013 by
 *         Codility Limited. All Rights Reserved. Unauthorized copying,
 *         publication or disclosure prohibited. + add your test case(s)
 *         
 *         Score: 100 %.
 * 
 */

public class AbsDistinct {

	 public int solution(int... array) {

		 int[] prefixMinimumInteger = ArrayUtil.findPrefixSum(Integer.MIN_VALUE, array);;
		 int resultMinimumInteger = prefixMinimumInteger[prefixMinimumInteger.length -1];

		 int[] prefixMaxInteger = ArrayUtil.findPrefixSum(Integer.MAX_VALUE, array);;
		 int resultMaxInteger = prefixMaxInteger[prefixMaxInteger.length -1];
 
		 int[] histogram = ArrayUtil.findAbsDistinctCountValuesExceptExtremes(array);
		 int[] prefix =    ArrayUtil.findPrefixSum(histogram);
		 
		 int result = prefix[prefix.length -1] + resultMinimumInteger + resultMaxInteger; 
		 return result;
	 }
	 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbsDistinct distinct = new AbsDistinct();
	    int result  = distinct.solution(-5,-3,-1,0,3,6);
        System.out.println(result + " / 5");

	    result  = distinct.solution(8);
        System.out.println(result + " / 1");

	    result  = distinct.solution(1,1);
        System.out.println(result + " / 1");
 
	    result  = distinct.solution(1,8,1);
        System.out.println(result + " / 2");

	    result  = distinct.solution(-2147483648);
        System.out.println(result + " / 1");

	    result  = distinct.solution(2147483647);
        System.out.println(result + " / 1");
	}

}

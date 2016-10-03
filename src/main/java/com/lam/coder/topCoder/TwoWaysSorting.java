package com.lam.coder.topCoder;

/**
 * Problem Statement
 * <p>
 * Sasha has a String[] stringList. No two elements of stringList have the same length.
 * <p>
 * <p>
 * <p>
 * So far, Sasha has learned two ways of sorting strings:
 * <p>
 * He can sort strings lexicographically. For example, "car" < "carriage" < "cats" < "doggies". (See Notes for a definition of the lexicographic order.)
 * He can also sort strings according to their lengths in ascending order. For example, "car" < "cats" < "doggies" < "carriage".
 * Sasha now wonders whether stringList is sorted in either of these two ways. Return "lexicographically" (quotes for clarity) if stringList is sorted lexicographically but not according to the string lengths. Return "lengths" if stringList is sorted according to the string lengths but not lexicographically. Return "both" if it is sorted in both ways. Otherwise, return "none".
 * <p>
 * <p>
 * Definition
 * <p>
 * Class:	TwoWaysSorting
 * Method:	sortingMethod
 * Parameters:	String[]
 * Returns:	String
 * Method signature:	String sortingMethod(String[] stringList)
 * (be sure your method is public)
 * <p>
 * <p>
 * Notes
 * -	String A is lexicographically smaller than string B if A contains a character with a smaller ASCII value in the first position where they differ. In case one of the strings ends before they have a different character, the shorter one is considered smaller.
 * <p>
 * Constraints
 * -	stringList will contain between 1 and 50 elements, inclusive.
 * -	Each element of stringList will contain between 1 and 50 characters, inclusive.
 * -	Each character of each element of stringList will be a lowercase English letter ('a'-'z').
 * -	Every two elements of stringList will have different lengths.
 * <p>
 * Examples
 * 0)
 * <p>
 * {"a", "aa", "bbb"}
 * Returns: "both"
 * These strings are sorted both lexicographically and according to their lengths.
 * 1)
 * <p>
 * {"c", "bb", "aaa"}
 * Returns: "lengths"
 * The lengths of these strings are in ascending order. However, they are not sorted lexicographically as, for instance, "aaa" is lexicographically smaller than "c".
 * 2)
 * <p>
 * {"etdfgfh", "aio"}
 * Returns: "none"
 * Here the first string is longer than the second one, so they are not sorted according to length. (Note that we require the lengths to be in ascending order.) Similarly, they are not sorted lexicographically: "aio" should come before "etdfgfh".
 * 3)
 * <p>
 * {"aaa", "z"}
 * Returns: "lexicographically"
 * The input strings are sorted lexicographically only.
 * 4)
 * <p>
 * {"z"}
 * Returns: "both"
 * 5)
 * <p>
 * {"abcdef", "bcdef", "cdef", "def", "ef", "f", "topcoder"}
 * Returns: "lexicographically"
 * This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * <p>
 * <p>
 * <p>
 * <p>
 * This problem was used for:
 * Single Round Match 621 Round 1 - Division II, Level One
 * Problem Statement
 * <p>
 * Sasha has a String[] stringList. No two elements of stringList have the same length.
 * <p>
 * <p>
 * <p>
 * So far, Sasha has learned two ways of sorting strings:
 * <p>
 * He can sort strings lexicographically. For example, "car" < "carriage" < "cats" < "doggies". (See Notes for a definition of the lexicographic order.)
 * He can also sort strings according to their lengths in ascending order. For example, "car" < "cats" < "doggies" < "carriage".
 * Sasha now wonders whether stringList is sorted in either of these two ways. Return "lexicographically" (quotes for clarity) if stringList is sorted lexicographically but not according to the string lengths. Return "lengths" if stringList is sorted according to the string lengths but not lexicographically. Return "both" if it is sorted in both ways. Otherwise, return "none".
 * <p>
 * <p>
 * Definition
 * <p>
 * Class:	TwoWaysSorting
 * Method:	sortingMethod
 * Parameters:	String[]
 * Returns:	String
 * Method signature:	String sortingMethod(String[] stringList)
 * (be sure your method is public)
 * <p>
 * <p>
 * Notes
 * -	String A is lexicographically smaller than string B if A contains a character with a smaller ASCII value in the first position where they differ. In case one of the strings ends before they have a different character, the shorter one is considered smaller.
 * <p>
 * Constraints
 * -	stringList will contain between 1 and 50 elements, inclusive.
 * -	Each element of stringList will contain between 1 and 50 characters, inclusive.
 * -	Each character of each element of stringList will be a lowercase English letter ('a'-'z').
 * -	Every two elements of stringList will have different lengths.
 * <p>
 * Examples
 * 0)
 * <p>
 * {"a", "aa", "bbb"}
 * Returns: "both"
 * These strings are sorted both lexicographically and according to their lengths.
 * 1)
 * <p>
 * {"c", "bb", "aaa"}
 * Returns: "lengths"
 * The lengths of these strings are in ascending order. However, they are not sorted lexicographically as, for instance, "aaa" is lexicographically smaller than "c".
 * 2)
 * <p>
 * {"etdfgfh", "aio"}
 * Returns: "none"
 * Here the first string is longer than the second one, so they are not sorted according to length. (Note that we require the lengths to be in ascending order.) Similarly, they are not sorted lexicographically: "aio" should come before "etdfgfh".
 * 3)
 * <p>
 * {"aaa", "z"}
 * Returns: "lexicographically"
 * The input strings are sorted lexicographically only.
 * 4)
 * <p>
 * {"z"}
 * Returns: "both"
 * 5)
 * <p>
 * {"abcdef", "bcdef", "cdef", "def", "ef", "f", "topcoder"}
 * Returns: "lexicographically"
 * This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * <p>
 * <p>
 * <p>
 * <p>
 * This problem was used for:
 * Single Round Match 621 Round 1 - Division II, Level One
 */
public class TwoWaysSorting {
    public static final String LEXI = "lexicographically";
    public static final String BOTH = "both";
    public static final String LEN = "lengths";
    public static final String NONE = "none";

    public String sortingMethod(String[] strings) {
        boolean lexi = isSortedLexi(strings);
        boolean len = isSortedByLen(strings);

        if (lexi && len) {
            return BOTH;
        } else if (lexi) {
            return LEXI;
        } else if (len) {
            return LEN;
        } else {
            return NONE;
        }

    }

    private boolean isSortedByLen(String[] strings) {
        if (strings.length == 1) {
            return true;
        }

        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i].length() <= strings[i + 1].length()) {
            } else {
                return false;
            }
        }

        return true;
    }

    private boolean isSortedLexi(String[] strings) {
        if (strings.length == 1) {
            return true;
        }

        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i].compareTo(strings[i + 1]) <= 0) {
            } else {
                return false;
            }
        }

        return true;
    }
}

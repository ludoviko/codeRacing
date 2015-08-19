package com.lam.coder.topCoder;

import java.util.Arrays;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Simple driving directions usually consist of a list of instructions
 *         to turn in a particular direction on specific roads. Having used such
 *         directions to drive from home to your friend's house, you want to
 *         reverse them so you can get back home. Write a class
 *         DrivingDirections with a method reverse that takes a String[]
 *         directions and returns a String[] with the reversed directions.
 * 
 *         directions will have at least one element. The first will begin with
 *         "Start on " (quotes are for clarity). Each element after the first
 *         will begin with either "Turn LEFT on " or "Turn RIGHT on ". Note the
 *         single trailing space on each of these prefixes. Assume the remaining
 *         characters of each element are properly formatted street names
 *         composed of alphanumeric, hyphen, and space characters; do not modify
 *         them when reversing the directions. The returned String[] should be
 *         formatted the same way, with the directions reversed. For example, if
 *         the directions are:
 * 
 *         Start on Pirate Street Turn LEFT on Viking Avenue Turn RIGHT on Ninja
 *         Court
 * 
 *         The reversed directions would be:
 * 
 *         Start on Ninja Court Turn LEFT on Viking Avenue Turn RIGHT on Pirate
 *         Street
 * 
 * 
 *         Definition
 * 
 *         Class: DrivingDirections Method: reverse Parameters: String[]
 *         Returns: String[] Method signature: String[] reverse(String[]
 *         directions) (be sure your method is public)
 * 
 * 
 *         Constraints - directions will contain between 1 and 50 elements,
 *         inclusive. - The first element of directions will begin with
 *         "Start on " (quotes are for clarity) and contain between 10 and 50
 *         characters, inclusive. - All other elements of directions will begin
 *         with either "Turn LEFT on " or "Turn RIGHT on ", contain at least one
 *         character following the prefix, and contain at most 50 characters. -
 *         Each character will be an uppercase English character ('A' to 'Z'), a
 *         lowercase English character ('a' to 'z'), a digit ('0' to '9'), a
 *         hyphen, or a space.
 * 
 *         Examples 0)
 * 
 * 
 *         {"Start on Pirate Street", "Turn LEFT on Viking Avenue",
 *         "Turn RIGHT on Ninja Court"}
 * 
 *         Returns: { "Start on Ninja Court", "Turn LEFT on Viking Avenue",
 *         "Turn RIGHT on Pirate Street" }
 * 
 *         This is the example from the problem statement. 1)
 * 
 * 
 *         {"Start on planet Earth"}
 * 
 *         Returns: { "Start on planet Earth" }
 * 
 *         Since there is only one instruction, the reversed directions are
 *         identical to the original. 2)
 * 
 * 
 *         {"Start on Hebron Ave", "Turn RIGHT on CT-2", "Turn LEFT on I-84",
 *         "Turn LEFT on I-81", "Turn RIGHT on I-80", "Turn LEFT on I-680",
 *         "Turn RIGHT on Mission Blvd", "Turn LEFT on I-880",
 *         "Turn RIGHT on Montague Expressway",
 *         "Turn RIGHT on Mission College Blvd"}
 * 
 *         Returns: { "Start on Mission College Blvd",
 *         "Turn LEFT on Montague Expressway", "Turn LEFT on I-880",
 *         "Turn RIGHT on Mission Blvd", "Turn LEFT on I-680",
 *         "Turn RIGHT on I-80", "Turn LEFT on I-81", "Turn RIGHT on I-84",
 *         "Turn RIGHT on CT-2", "Turn LEFT on Hebron Ave" }
 * 
 *         3)
 * 
 * 
 *         {"Start on  ", "Turn LEFT on  0123456789 - ",
 *         "Turn RIGHT on  0123456789 - ",
 *         "Turn LEFT on                                      ",
 *         "Turn RIGHT on                                     ",
 *         "Turn LEFT on -a0b1c2d3e4f5g6h7i8j9k ",
 *         "Turn RIGHT on -A0B1C2D3E4F5G6H7I8J9K ", "Turn LEFT on -",
 *         "Turn RIGHT on -"}
 * 
 *         Returns: { "Start on -", "Turn LEFT on -",
 *         "Turn RIGHT on -A0B1C2D3E4F5G6H7I8J9K ",
 *         "Turn LEFT on -a0b1c2d3e4f5g6h7i8j9k ",
 *         "Turn RIGHT on                                     ",
 *         "Turn LEFT on                                      ",
 *         "Turn RIGHT on  0123456789 - ", "Turn LEFT on  0123456789 - ",
 *         "Turn RIGHT on  " }
 * 
 *         The characters after the prefix should not be modified when reversing
 *         the directions. 4)
 * 
 * 
 *         {"Start on Duke University Rd", "Turn RIGHT on Swift Ave",
 *         "Turn LEFT on NC-147", "Turn LEFT on I-85", "Turn RIGHT on I-40",
 *         "Turn RIGHT on US-52", "Turn LEFT on I-74", "Turn RIGHT on I-77",
 *         "Turn LEFT on I-64",
 *         "Turn RIGHT on Martin Luther King Memorial Bridge",
 *         "Turn RIGHT on N 3rd St", "Turn LEFT on Cole St",
 *         "Turn LEFT on N Broadway", "Turn RIGHT on Convention Plz"}
 * 
 *         Returns: { "Start on Convention Plz", "Turn LEFT on N Broadway",
 *         "Turn RIGHT on Cole St", "Turn RIGHT on N 3rd St",
 *         "Turn LEFT on Martin Luther King Memorial Bridge",
 *         "Turn LEFT on I-64", "Turn RIGHT on I-77", "Turn LEFT on I-74",
 *         "Turn RIGHT on US-52", "Turn LEFT on I-40", "Turn LEFT on I-85",
 *         "Turn RIGHT on NC-147", "Turn RIGHT on Swift Ave",
 *         "Turn LEFT on Duke University Rd" }
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 210 Round 1 - Division
 *         II, Level Two
 */

public class DrivingDirections {
	private static final String LEFT = "Turn LEFT ";
	private static final String RIGHT = "Turn RIGHT ";
	private static final String ON = "on";
	private static final String START_ON = "Start on";

	public String[] reverse(String[] directions) {
		String[] clone = Arrays.copyOf(directions, directions.length);
		String[] wordsTail;
		String[] wordsTailNext;

		if (directions.length <= 1) {
			return directions;
		}

		wordsTail = clone[directions.length - 1].split(ON, 2);
		directions[0] = START_ON + wordsTail[1];

		for (int i = 1; i < directions.length; i++) {
			wordsTail = clone[directions.length - i].split(ON, 2);
			wordsTailNext = clone[directions.length - i - 1].split(ON, 2);

			directions[i] = wordsTail[0].equals(RIGHT) ? LEFT : RIGHT;
			directions[i] += ON + wordsTailNext[1];
		}

		return directions;
	}
}

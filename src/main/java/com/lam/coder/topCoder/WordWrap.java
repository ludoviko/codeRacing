package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement for WordWrap
 * 
 * 
 *         Problem Statement
 * 
 *         Some text editors, such as vi, model the user's document as a
 *         sequence of lines containing a variable number of characters. Because
 *         the human eye prefers to read lines of equal length, such editors
 *         typically supply a function that will adjust the lines to make them
 *         fit within a column of fixed width. This process is called
 *         justification. (Other editors, such as OpenOffice.org, will justify
 *         lines on the fly.)
 * 
 *         Your job is to write a justifier for a simplified piece of text. You
 *         are given a String[], lines, each element of which is a single line
 *         consisting of tokens separated by single spaces. For the present
 *         purposes, a token is a sequence of lowercase alphabetical characters.
 *         You are to return a String[] containing the same tokens in the same
 *         order and still separated by single spaces, distributed in such a way
 *         that no line exceeds the desired column width, which is specified by
 *         the int columnWidth. Within these constraints, you should put as many
 *         tokens as possible in the first line, then as many as possible in the
 *         second, and so on.
 * 
 *         Note that tokens must not be split between consecutive lines, and
 *         that the number of lines in the result may differ from that in the
 *         input. The resulting lines must contain tokens separated by single
 *         spaces, without extraneous spaces at the beginning or end of a line,
 *         akin to the input. No input token will be longer than the column
 *         width.
 * 
 * 
 *         Definition
 * 
 *         Class: WordWrap Method: justify Parameters: String[], int Returns:
 *         String[] Method signature: String[] justify(String[] lines, int
 *         columnWidth) (be sure your method is public)
 * 
 * 
 *         Constraints - lines contains between 1 and 50 elements, inclusive -
 *         each element of lines is between 1 and 50 characters long, inclusive
 *         - in each element of lines, only the space character (' ') and the
 *         lowercase alphabetical characters ('a' through 'z') are allowed - in
 *         each element of lines, neither the first nor last character may be a
 *         space - in each element of lines, there may not be two or more
 *         consecutive spaces - columnWidth is between 1 and 50, inclusive - in
 *         each element of lines, no sequence of alphabetic characters is more
 *         than columnWidth characters long
 * 
 *         Examples 0)
 * 
 *         {"now is the time for all good men",
 *         "to come to the aid of their country"} 20 Returns: {
 *         "now is the time for", "all good men to come", "to the aid of their",
 *         "country" } Token order is preserved in the result, but no line
 *         exceeds 20 characters in length. 1)
 * 
 *         {"now", "is the time for", "all", "good", "men", "to",
 *         "come to the aid", "of", "their", "country"} 20 Returns: {
 *         "now is the time for", "all good men to come", "to the aid of their",
 *         "country" } Each line is made as long as possible without exceeding
 *         the column width. 2)
 * 
 *         {"four score and seven years ago", "our fathers brought forth",
 *         "upon this continent", "a new nation", "conceived in liberty",
 *         "and dedicated to the proposition", "that all men are created",
 *         "equal"} 50 Returns: {
 *         "four score and seven years ago our fathers brought",
 *         "forth upon this continent a new nation conceived",
 *         "in liberty and dedicated to the proposition that",
 *         "all men are created equal" } 3)
 * 
 *         {"th e ow l an d th e pu ss yc at", "we nt to se a",
 *         "on a be au ti fu l pe a gr ee n bo at"} 4 Returns: { "th e", "ow l",
 *         "an d", "th e", "pu", "ss", "yc", "at", "we", "nt", "to", "se a",
 *         "on a", "be", "au", "ti", "fu l", "pe a", "gr", "ee n", "bo", "at" }
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 * 
 *         This problem was used for: Single Round Match 186 Round 1 - Division
 *         I, Level One Single Round Match 186 Round 1 - Division II, Level Two
 */

public class WordWrap {
	public String[] justify(String[] lines, int columnWidth) {
		List<String> output = new ArrayList<String>();
		String[] words = null;

		StringBuilder line = new StringBuilder();
		String data = "";

		for (String string : lines) {
			data += string + " ";
		}

		data = data.trim();
		if (data.contains(" ")) {
			words = data.split(" ");
		} else {
			words = new String[] { data };
		}

		int i = 0;
		while (i < words.length) {
			while (i < words.length
					&& (line.length() + words[i].length() <= columnWidth)) {
				line.append(words[i++]).append(" ");
			}

			output.add(line.toString().trim());
			line = new StringBuilder();
		}

		return output.toArray(new String[] {});
	}
}

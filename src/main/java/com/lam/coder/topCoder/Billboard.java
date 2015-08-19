package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 * 
 *         An electronic billboard is supposed to display large letters by using
 *         several lightbulbs per letter. Given a message, and how each enlarged
 *         letter looks as a 5x5 arrangement of lightbulbs, return the enlarged
 *         message.
 * 
 *         The enlarged representation of the letters will be in a String[] with
 *         each element formatted as follows (quotes added for clarity):
 * 
 *         "<letter>:*****-*****-*****-*****-*****"
 * 
 *         Where <letter> is a single uppercase letter [A-Z], and each * is
 *         either the character '#' (representing a lit lightbulb) or a period
 *         ('.') (representing an unlit lightbulb). Each group of 5 (delimited
 *         by a dash, '-') represents a row in the 5x5 representation of the
 *         letter. So, "T:#####-..#..-..#..-..#..-..#.." means that the 5x5
 *         representation of 'T' is:
 * 
 *         "#####" "..#.." "..#.." "..#.." "..#.."
 * 
 *         Return the enlarged message as a 5-element String[], with each
 *         element representing one row of lightbulbs (where element 0 is the
 *         top row). Leave 1 (one) column of periods ('.') between each adjacent
 *         pair of letters in the enlarged message.
 * 
 *         Definition
 * 
 *         Class: Billboard Method: enlarge Parameters: String, String[]
 *         Returns: String[] Method signature: String[] enlarge(String message,
 *         String[] letters) (be sure your method is public)
 * 
 * 
 *         Constraints - message will contain between 1 and 10 characters,
 *         inclusive. - each character of message will be an uppercase letter
 *         [A-Z]. - letters will contain between 1 and 10 elements, inclusive. -
 *         each element of letters will be exactly 31 characters in length. -
 *         each element of letters will be formatted as (quotes added for
 *         clarity): "<letter>:*****-*****-*****-*****-*****", where <letter> is
 *         a single uppercase letter [A-Z] (inclusive) representing the letter
 *         being enlarged, and each * is either the character '#' or a period. -
 *         every letter appearing in message will have an enlarged
 *         representation in letters. - each letter represented in letters will
 *         be unique.
 * 
 *         Examples 0)
 *         "TOPCODER"
 * 
 *         {"T:#####-..#..-..#..-..#..-..#.." ,"O:#####-#...#-#...#-#...#-#####"
 *         ,"P:####.-#...#-####.-#....-#...." ,"C:.####-#....-#....-#....-.####"
 *         ,"D:####.-#...#-#...#-#...#-####." ,"E:#####-#....-####.-#....-#####"
 *         ,"R:####.-#...#-####.-#.#..-#..##"}
 * 
 *         Returns: 
 *       { "#####.#####.####...####.#####.####..#####.####.",
 *         "..#...#...#.#...#.#.....#...#.#...#.#.....#...#",
 *         "..#...#...#.####..#.....#...#.#...#.####..####.",
 *         "..#...#...#.#.....#.....#...#.#...#.#.....#.#..",
 *         "..#...#####.#......####.#####.####..#####.#..##" }
 * 
 *         1)
 * 
 * 
 *         "DOK"
 * 
 *         {"D:####.-#...#-#...#-#...#-####." ,"O:#####-#...#-#...#-#...#-#####"
 *         ,"K:#...#-#..#.-###..-#..#.-#...#"}
 * 
 *         Returns: { "####..#####.#...#", "#...#.#...#.#..#.",
 *         "#...#.#...#.###..", "#...#.#...#.#..#.", "####..#####.#...#" }
 * 
 *         2)
 * 
 * 
 *         "RANDOMNESS"
 * 
 *         {"S:##.##-#####-#.#.#-#.#.#-####." ,"N:#####-#####-#####-#####-#####"
 *         ,"R:#####-#####-##.##-#####-#####" ,"A:.....-.....-.....-.....-....."
 *         ,"D:#.#.#-.#.#.-#.#.#-.#.#.-#.#.#" ,"O:#####-#...#-#.#.#-#...#-#####"
 *         ,"E:#....-.#...-..#..-...#.-....#" ,"M:#....-.....-.....-.....-....."
 *         ,"X:#...#-.#.#.-..#..-.#.#.-#...#"}
 * 
 *         Returns: {
 *         "#####.......#####.#.#.#.#####.#.....#####.#.....##.##.##.##",
 *         "#####.......#####..#.#..#...#.......#####..#....#####.#####",
 *         "##.##.......#####.#.#.#.#.#.#.......#####...#...#.#.#.#.#.#",
 *         "#####.......#####..#.#..#...#.......#####....#..#.#.#.#.#.#",
 *         "#####.......#####.#.#.#.#####.......#####.....#.####..####." }
 * 
 *         Note that the letter X is defined but never used.
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for: 2002 TopCoder Inv. Round 3 - Division I,
 *         Level One
 * 
 * 
 */

public class Billboard {
	public String[] enlarge(String message, String[] letters) {
		String[] words = null;
		String letter = null;
		
		String out = ""; 
		String[] outs = new String[letters[0].split("-").length]; 
		
		for (int i = 0; i < letters[0].split("-").length; i++) {
			for (int j = 0; j < message.length(); j++) {
				letter = findLetter(message.charAt(j), letters);
				words = letter.split("-");
				if (i == 0) {
					out += words[i].substring(2);  
				} else {
					out += words[i]; 
				}
				if (j == message.length() -1) {
				} else {
					out += ".";
				}
			}
			outs[i] = out;
			out = "";
		}
		return outs;
	}
	
	private String findLetter(char aChar, String[] letters) {
		for (int i = 0; i < letters.length; i++) {
			if (letters[i].charAt(0) == aChar) {
				return letters[i]; 	
			}
		}
		return "";
	}
}

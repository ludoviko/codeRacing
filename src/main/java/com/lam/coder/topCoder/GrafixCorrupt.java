package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 * 
 *         In the grafix file format, a bitmap is encoded as a sequence of
 *         lowercase alphabetic words. All of these words are drawn from a
 *         dictionary that has been built specially for the bitmap by a
 *         compression algorithm. Each word in the dictionary has the same
 *         length.
 * 
 *         It can occur that words in a grafix file are corrupted by poor
 *         transmission or storage media. In such cases, grafix attempts to
 *         reconstruct the original file by matching each corrupted word to a
 *         dictionary word that contains one or more of the same characters at
 *         the same positions.
 * 
 *         You are given a String[], dictionary, containing every word in a
 *         grafix file's dictionary, and a String, candidate, which is a
 *         possibly corrupted word in that file. If there is no dictionary word
 *         that has at least one character in the same position as candidate,
 *         then return the int value -1. Otherwise, return the zero-based index
 *         of the dictionary word that has the greatest number of characters at
 *         the same positions as candidate. In the event of a tie, favor the
 *         lowest index.
 * 
 *         Definition
 * 
 *         Class: grafixCorrupt Method: selectWord Parameters: String[], String
 *         Returns: int Method signature: int selectWord(String[] dictionary,
 *         String candidate) (be sure your method is public)
 * 
 * 
 *         Constraints - dictionary contains between 1 and 50 elements,
 *         inclusive - candidate is between 1 and 20 characters long, inclusive
 *         - each element of dictionary has the same length as candidate - only
 *         the characters 'a' to 'z' are permitted in candidate and dictionary
 * 
 *         Examples 0)
 * 
 * 
 *         {"cat", "cab", "lab"}
 * 
 *         "dab"
 * 
 *         Returns: 1
 * 
 *         The word "dab" has two letters in the same position as both "cab" and
 *         "lab", but "cab" comes first. 1)
 * 
 * 
 *         {"cat", "cab", "lab"}
 * 
 *         "lag"
 * 
 *         Returns: 2
 * 
 *         Here, "lab" is the best fit. 2)
 * 
 * 
 *         {"cat", "cab", "lab"}
 * 
 *         "bic"
 * 
 *         Returns: -1
 * 
 *         The word "bic" contains a 'c' and a 'b', but neither character is at
 *         the same position in any dictionary word. 3)
 * 
 * 
 *         {"zkv", "izs", "fed", "waa", "ttx", "bgt", "quy", "dtq", "dgo",
 *         "yrs", "cid", "nln", "pvz", "txt", "zun", "erd", "jen", "klh", "kxy",
 *         "emf", "mqt", "lza", "dzb", "ndx", "vfr", "jhs", "dkm", "elb"}
 * 
 *         "cwd"
 * 
 *         Returns: 10
 * 
 *         4)
 * 
 * 
 *         {"zhadjsg", "vzptftx", "fbaslxs", "ejejncm", "xpxkeae", "ixrrtzw",
 *         "ovctbzx", "sfzekhh", "lxzixjk", "jixdpik", "bkianck", "laclyin",
 *         "uqmdkfx", "dimswqo", "fojhetr", "grntrce", "obdtqwx", "bhojwcy",
 *         "zuuuvst", "mvqtoly", "aftmupx", "govuidx", "qklpret", "yptccki",
 *         "uxdnslh", "wudrusz", "uwxbvou", "ouytqun", "pjdexqe", "xraaqdw",
 *         "lxmoncl", "sjnjfgb", "qrlqgvc", "fgvoadm", "yohsrxw", "udpvrsr",
 *         "mklucgt"}
 * 
 *         "vklikgf"
 * 
 *         Returns: 36
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 211 Round 1 - Division
 *         I, Level One Single Round Match 211 Round 1 - Division II, Level Two
 * 
 */

public class GrafixCorrupt {
	public int selectWord(String[] dictionary, String candidate) {
		String word;
		int max = 0;
		int count = 0;
		int index = -1;

		for (int i = 0; i < dictionary.length; i++) {
			for (int j = 0; j < dictionary[0].length(); j++) {
				if (dictionary[i].charAt(j) == candidate.charAt(j)) {
					count++;
				}
			}

			if (count > max) {
				word = dictionary[i];
				max = count;
				index = i;
			} else {
			}
			count = 0;
		}

		return index;
	}
}

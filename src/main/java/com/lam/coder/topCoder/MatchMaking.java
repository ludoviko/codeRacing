package com.lam.coder.topCoder;

import java.util.Arrays;

/**
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement for MatchMaking Problem Statement
 * 
 *         You are developing the matchmaking component of an online dating
 *         site. Prospective members must fill out a questionnaire consisting of
 *         binary questions such as Do you prefer to vacation (a) in the
 *         mountains or (b) at the seaside? and Would you rather travel (a) by
 *         plane or (b) by train?
 * 
 *         You are to match up men with women by maximizing the number of
 *         answers each couple has in common. A man and a woman have an answer
 *         in common whenever they give the same answer to the same question.
 *         Conflicts can easily arise due to numerical ties, but you will be
 *         able to resolve all such conflicts using the following procedure.
 *         Note that there will be equal numbers of men and women, with names
 *         being unique in each sex.
 * 
 *         Take the woman whose name comes earliest in lexicographic order, and
 *         consider the men with whom she has the greatest number of answers in
 *         common. Among these men, pick the one whose name comes earliest in
 *         lexicographic order. You have found the woman's best match. Remove
 *         this couple from the dating pool, and repeat the matching procedure
 *         until there are no more singles left.
 * 
 *         You are given a String[], namesWomen, containing the names of single
 *         women, and another String[], answersWomen, containing their answers.
 *         The kth element of answersWomen lists the answers of the woman whose
 *         name is the kth element of namesWomen. If there are n questions in
 *         the questionnaire, then every element of answersWomen consists of n
 *         characters, each of which is either 'a' or 'b'. The answers are
 *         always given in the fixed questionnaire order. You are similarly
 *         given the String[]s namesMen and answersMen for the single men.
 *         Lastly, you are given a String, queryWoman, containing the name of a
 *         woman. Return the name of the man to whom she is matched after you
 *         have formed all couples according to the above rules.
 * 
 *         Definition
 * 
 *         Class: MatchMaking Method: makeMatch Parameters: String[], String[],
 *         String[], String[], String Returns: String
 * 
 *         Method signature: String makeMatch(String[] namesWomen, String[]
 *         answersWomen, String[] namesMen, String[] answersMen, String
 *         queryWoman)
 * 
 *         Notes - Lexicographic order is like dictionary order, with the
 *         difference that case matters. All uppercase letters take precedence
 *         over all lowercase letters. Thus, "boolean" comes before "boot";
 *         "boo" comes before "boolean"; "Boot" comes before "boo"; "Zoo" comes
 *         before "boo".
 * 
 *         Constraints - namesWomen contains between 1 and 50 elements,
 *         inclusive - if namesWomen consists of n elements, then answersWomen,
 *         namesMen, and answersMen consist of n elements each - each element of
 *         namesWomen and each element of namesMen is between 1 and 50
 *         characters long, inclusive - the only characters that may appear in
 *         namesMen and namesWomen are 'a' to 'z' and 'A' to 'Z' - no two
 *         elements of namesWomen are alike - no two elements of namesMen are
 *         alike - the first element of answersWomen is between 1 and 50
 *         characters long, inclusive - if the first element of answersWomen
 *         consists of m characters, then each element of answersWomen and of
 *         answersMen is m characters long - the only characters that may appear
 *         in answersWomen and answersMen are 'a' and 'b' - queryWoman is one of
 *         the Strings in namesWomen
 * 
 *         Examples 0) 
 *         {"Constance", "Bertha", "Alice"}
 * 
 *         {"aaba", "baab", "aaaa"}
 * 
 *         {"Chip", "Biff", "Abe"}
 * 
 *         {"bbaa", "baaa", "aaab"}
 * 
 *         "Bertha"
 * 
 *         Returns: "Biff"
 * 
 *         Alice has two answers in common with Chip and three answers in common
 *         with both Abe and Biff; Abe gets lexicographic preference. Bertha
 *         also has two answers in common with Chip and three answers in common
 *         with both Abe and Biff. Since Abe has already been matched to Alice,
 *         Bertha lands Biff.
 * 
 *         1) {"Constance", "Bertha", "Alice"}
 * 
 *         {"aaba", "baab", "aaaa"}
 * 
 *         {"Chip", "Biff", "Abe"}
 * 
 *         {"bbaa", "baaa", "aaab"}
 * 
 *         "Constance"
 * 
 *         Returns: "Chip"
 * 
 *         We are dealing with the same names and answers as before. Constance
 *         is the last to go. Although she has two answers in common with Abe
 *         and Biff, they are both taken. She ends up with Chip, with whom she
 *         has only one answer in common.
 * 
 *         2) {"Constance", "Alice", "Bertha", "Delilah", "Emily"}
 * 
 *         {"baabaa", "ababab", "aaabbb", "bababa", "baabba"}
 * 
 *         {"Ed", "Duff", "Chip", "Abe", "Biff"}
 * 
 *         {"aabaab", "babbab", "bbbaaa", "abbbba", "abaaba"}
 * 
 *         "Constance"
 * 
 *         Returns: "Duff"
 * 
 *         3) {"Constance", "Alice", "Bertha", "Delilah", "Emily"}
 * 
 *         {"baabaa", "ababab", "aaabbb", "bababa", "baabba"}
 * 
 *         {"Ed", "Duff", "Chip", "Abe", "Biff"}
 * 
 *         {"aabaab", "babbab", "bbbaaa", "abbbba", "abaaba"}
 * 
 *         "Delilah"
 * 
 *         Returns: "Chip"
 * 
 *         4)  {"Constance", "Alice", "Bertha", "Delilah", "Emily"}
 * 
 *         {"baabaa", "ababab", "aaabbb", "bababa", "baabba"}
 * 
 *         {"Ed", "Duff", "Chip", "Abe", "Biff"}
 * 
 *         {"aabaab", "babbab", "bbbaaa", "abbbba", "abaaba"}
 * 
 *         "Emily"
 * 
 *         Returns: "Ed"
 * 
 *         5)  {"anne", "Zoe"}
 * 
 *         {"a", "a"}
 * 
 *         {"bob", "chuck"}
 * 
 *         {"a", "a"}
 * 
 *         "Zoe"
 * 
 *         Returns: "bob"
 * 
 *         6)  {"F", "M", "S", "h", "q", "g", "r", "N", "U", "x", "H", "P", "o",
 *         "E", "R", "z", "L", "m", "e", "u", "K", "A", "w", "Q", "O", "v", "j",
 *         "a", "t", "p", "C", "G", "k", "c", "V", "B", "D", "s", "n", "i", "f",
 *         "T", "I", "l", "d", "J", "y", "b"}
 * 
 *         {"abaabbbb", "bbaabbbb", "aaabaaab", "aabbaaaa", "baabbaab",
 *         "aaababba", "bbabbbbb", "bbbabbba", "aaabbbba", "aabbbaaa",
 *         "abbabaaa", "babbabbb", "aaaaabba", "aaaabbaa", "abbbabaa",
 *         "babababa", "abbaaaaa", "bbababba", "baaaaaba", "baaaaabb",
 *         "bbbbabba", "ababbaaa", "abbbabab", "baabbbaa", "bbbaabbb",
 *         "aababbab", "ababbabb", "abbaabba", "baabbabb", "aaabaaab",
 *         "aabbbaba", "aabaaabb", "abababba", "aabbaaaa", "aabbabaa",
 *         "bababaaa", "aabaaaab", "bbbbaabb", "baaababb", "abaabbab",
 *         "aabbbaaa", "baabbaba", "bbabbbaa", "aabbbbaa", "abbbaaab",
 *         "abababbb", "ababaaba", "bababaaa"}
 * 
 *         {"f", "C", "v", "g", "Q", "z", "n", "c", "B", "o", "M", "F", "u",
 *         "x", "I", "T", "K", "L", "E", "U", "w", "A", "d", "t", "e", "R", "D",
 *         "s", "p", "q", "m", "r", "H", "j", "J", "V", "l", "a", "k", "h", "G",
 *         "y", "i", "P", "O", "N", "b", "S"}
 * 
 *         {"bbbaabab", "bbabaabb", "ababbbbb", "bbbababb", "baababaa",
 *         "bbaaabab", "abbabbaa", "bbbabbbb", "aabbabab", "abbababa",
 *         "aababbbb", "bababaab", "aaababbb", "baabbaba", "abaaaaab",
 *         "bbaababa", "babaabab", "abbabbba", "ababbbab", "baabbbab",
 *         "babbaaab", "abbbbaba", "bbabbbba", "baaabaab", "ababbabb",
 *         "abbbaabb", "bbbbaabb", "bbbaaabb", "baabbaba", "bbabaaab",
 *         "aabbbaab", "abbbbabb", "bbaaaaba", "bbbababa", "abbaabba",
 *         "bababbbb", "aabaaabb", "babbabab", "baaaabaa", "ababbaba",
 *         "aaabaabb", "bbaaabaa", "baaaaabb", "bbaabaab", "bbababab",
 *         "aabaaaab", "aaaaabab", "aabbaaba"}
 * 
 *         "U"
 * 
 *         Returns: "x"
 * 
 *         7)  {"q", "M", "w", "y", "p", "N", "s", "r", "a", "H", "o", "n", "F",
 *         "m", "l", "b", "D", "j", "C", "u", "f", "I", "g", "L", "i", "x", "A",
 *         "G", "O", "k", "h", "d", "c", "E", "B", "v", "J", "z", "K", "e", "t"}
 * 
 *         {"aabbaaabb", "baabababb", "bbaababba", "bbbaaaaaa", "abaaaabaa",
 *         "bababbbab", "abbaabbaa", "aabababbb", "bababaaaa", "abbababaa",
 *         "aabbbbbba", "bbabbabab", "babaabbba", "babbabbbb", "baaabbbbb",
 *         "baaabaaaa", "aaabbaaab", "abbaabbbb", "abbabbbab", "bbaaaabba",
 *         "babbaaabb", "aabbabbab", "baaababba", "ababaabab", "bbbaabbab",
 *         "aaaabbabb", "babaaaaaa", "abbbbaaab", "aabaaabba", "bbbaaaaba",
 *         "bbbbbbaab", "aabbaaabb", "aabaabbab", "aababaaba", "bbabbbbab",
 *         "abbabaaab", "babaaabbb", "bababbaaa", "aabbaabaa", "baaabbabb",
 *         "bbbbbbbbb"}
 * 
 *         {"m", "k", "n", "q", "L", "E", "M", "l", "w", "x", "g", "e", "i",
 *         "z", "F", "r", "a", "h", "f", "D", "J", "K", "j", "v", "A", "t", "N",
 *         "y", "s", "c", "o", "p", "d", "b", "B", "G", "O", "I", "u", "C", "H"}
 * 
 *         {"bbaaabbba", "bbaaaaaab", "abaaababb", "baaaabbbb", "abbbababa",
 *         "baaaaaaaa", "aabbbbbab", "aaaaabbba", "baabababb", "babaaabab",
 *         "baaababaa", "bbbbaabba", "bbaabbabb", "bbaaababb", "abbabbaba",
 *         "aababaaab", "abbbbbbaa", "aabbaabaa", "bbbaabbba", "abbabbaba",
 *         "aaabbbaaa", "bbaabaaaa", "aabababbb", "abbbbabab", "baaabbbba",
 *         "bababbbba", "aababbaab", "bbaabbaab", "bbbaaabbb", "babbbbabb",
 *         "ababababb", "babaaabab", "bbaaaaaba", "aaaaabaaa", "abbaaabbb",
 *         "bbbbababb", "baabababb", "bbaabaaaa", "aaababbbb", "abbbbbbba",
 *         "bbaabbaaa"}
 * 
 *         "o"
 * 
 *         Returns: "C"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: 
 *         Single Round Match 203 Round 1 - Division I, Level One 
 *         Single Round Match 203 Round 1 - Division II, Level Two
 * 
 *         Score (Practice Room): 598.65 points / 600 
 */

public class MatchMaking {
	public String makeMatch(String[] namesWomen, String[] answersWomen,
			String[] namesMen, String[] answersMen, String queryWoman) {

		int index;
		String man = null;
		String match = null;

		String[] answersW = new String[answersWomen.length];
		String[] answersM = new String[answersMen.length];
		String[] women = new String[namesWomen.length];
		String[] men = new String[namesMen.length];

		System.arraycopy(namesWomen, 0, women, 0, namesWomen.length);
		System.arraycopy(namesMen, 0, men, 0, namesMen.length);

		Arrays.sort(namesWomen);
		Arrays.sort(namesMen);

		answersW = copyAnswers(namesWomen, women, answersWomen, answersW);
		answersM = copyAnswers(namesMen, men, answersMen, answersM);

		for (int i = 0; i < namesWomen.length; i++) {
			man = this.checkMen(namesWomen[i], answersW[i], namesMen,
					answersM);

			if (queryWoman.equals(namesWomen[i])) {
				match = man;
			}

			index = findIndex(namesMen, man);
			if (index > -1) {
				namesMen[index] = "";
				answersM[index] = "";
				namesWomen[i] = "";
			}
		}
		return match;
	}

	private String[] copyAnswers(String[] names, String[] namesDestine,
			String[] answers, String[] answersDestine) {

		int k = 0;
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < namesDestine.length; j++) {
				if (names[i].equals(namesDestine[j])) {
					answersDestine[k++] = answers[j];
					break;
				}
			}
		}
		return answersDestine;
	}

	private int findIndex(String[] names, String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}

	private String checkMen(String woman, String herAnswers, String[] namesMen,
			String[] answersMen) {

		String maxMen = null;
		int max = 0;
		int counter = 0;

		for (int man = 0; man < namesMen.length; man++) {
			for (int k = 0; k < herAnswers.length(); k++) {
				if (answersMen[man].length() > 0) {
					if (herAnswers.charAt(k) == answersMen[man].charAt(k)) {
						counter++;
					}
				}
			}
			if (counter > max) {
				// This comparison (counter > max) respects lexicographic order.
				max = counter;
				maxMen = namesMen[man];
			}
			counter = 0;
		}
		
		// If there is no match retunrs the first available man. 
		int j = 0;
		if ( maxMen == null ) {
			maxMen = "";
			while (  maxMen.equals("")   ) {
				maxMen = namesMen[j++];
			}
		}
		
		return maxMen;
	}
}

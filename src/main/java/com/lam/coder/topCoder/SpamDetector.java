package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 * 
 *         You are writing part of a spam detection system. Your job is to
 *         analyze the subject lines of e-mail messages and return a count of
 *         known spam signalling keywords in the subject lines. Your task is
 *         made more difficult by the spammers who try to hide the keywords in
 *         several ways. Here we will consider just one obfuscation technique:
 *         duplicating characters. Duplicating characters means taking an
 *         existing character in a word and inserting more copies of that
 *         character into the same place in the word. This process can then be
 *         repeated on a different character in the word. The spam signalling
 *         keyword "credit" might be modified to "creddiT", "CredittT" or
 *         "ccrreeeddiitt", etc., but not "credict".
 * 
 *         For the purposes of this problem we will consider subject lines which
 *         contain only letters and spaces. The "words" in the subject line are
 *         delimited by spaces. A word in the subject line is considered a
 *         "match" if the entire word is the same as at least one entire
 *         keyword, after possibly removing some duplicated characters from the
 *         subject word. A keyword that matches only part of a subject word or a
 *         subject word that matches only part of a keyword does not count. Note
 *         that if a keyword contains a double letter, the subject word must
 *         also contain (at least) a double letter in the same position to match
 *         ("double letter" means two consecutive letters in the word that are
 *         the same). For this application, all matches (and the use of the term
 *         "same") are case insensitive.
 * 
 *         Given a subject line and a list of keywords, return the count of
 *         words in the subject line which "match" words in the keyword list. If
 *         multiple words in the subject line match the same keyword, they are
 *         each counted, but a word in the subject line that matches multiple
 *         keywords is only counted once.
 * 
 *         Definition
 * 
 *         Class: SpamDetector Method: countKeywords Parameters: String,
 *         String[] Returns: int Method signature: int countKeywords(String
 *         subjectLine, String[] keywords) (be sure your method is public)
 * 
 * 
 *         Constraints - subjectLine will contain between 0 and 50 characters,
 *         inclusive. - subjectLine will include only letter ('a' to 'z' and 'A'
 *         to 'Z') and space (' ') characters. - keywords will have between 0
 *         and 50 elements, inclusive. - each element of keywords will contain
 *         between 1 and 50 characters, inclusive. - each element of keywords
 *         will consist of only letters ('a' to 'z' and 'A' to 'Z'). - The same
 *         letter (ignoring case) never appears more than twice consecutively in
 *         any element of keywords. (ie. "aabbAAbb" is ok, but "aaAbb" is not
 *         allowed.)
 * 
 *         Examples 0)
 * 
 * 
 *         "LoooW INTEREST RATES available dont BE slow"
 * 
 *         {"interest","rates","loan","available","LOW"}
 * 
 *         Returns: 4
 * 
 *         "INTEREST" , "RATES" , "available", and "LoooW" match. Note that
 *         "slow" does not match, even though it contains the substring "low"
 *         which is a keyword. 1)
 * 
 * 
 *         "Dear Richard Get Rich Quick            no risk"
 * 
 *         {"rich","risk","Quicken","wealth","SAVE"}
 * 
 *         Returns: 2
 * 
 *         Don't match "Richard" 2)
 * 
 * 
 *         "in debbtt againn and aAgain and AGAaiIN"
 * 
 *         {"AGAIN","again","Again","again"}
 * 
 *         Returns: 3
 * 
 *         3)
 * 
 * 
 *         "PlAyy ThEE Lottto     get Loottoo feever"
 * 
 *         {"play","lotto","lottery","looser"}
 * 
 *         Returns: 3
 * 
 *         4)
 * 
 * 
 *         "                                   "
 * 
 *         {"empty","space","does","not","match"}
 * 
 *         Returns: 0
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for:
 * 
 *         Single Round Match 205 Round 1 - Division I, Level One
 *         Single Round Match 205 Round 1 - Division II, Level Two
 * 
 */

public class SpamDetector {
	public int countKeywords(String subjectLine, String[] keywords) {
		String[] words = subjectLine.toLowerCase().split(" ");
		int count = 0;

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < keywords.length; j++) {
				if (wordMatch(keywords[j].toLowerCase(), words[i])) {
					count++;
					break;
				} else {

				}
			}
		}

		return count;
	}

	public static boolean wordMatch(String word, String match) {
		int w = 0;

		word = word == null ? "" : word;
		match = match == null ? "" : match;

		if (match.length() < word.length()) {
			return false;
		} else if (word.isEmpty() && !match.isEmpty()) {
			return false;
		} else if (word.isEmpty() && match.isEmpty()) {
			return true;
		}

		int m = 0;
		while (m < match.length() && w < word.length()) {
			if (match.charAt(m) == word.charAt(w)) {
				w++;
				m++;
			} else if (m > 0 && match.charAt(m) == match.charAt(m - 1)) {
				m++;
			} else {
				return false;
			}
		}
		// Are there any chars left in match and the end of word has been
		// reached ?
		if (m < match.length() && w == word.length()) {
			w--;
			while (m < match.length() && m < match.length()) {
				if (match.charAt(m) == word.charAt(w)) {
					m++;
				} else {
					return false;
				}
			}
		} else if (w < word.length()) {
			// The match string is over and still there are characters in word
			// unmatched.
			return false;
		}
		return true;
	}
}

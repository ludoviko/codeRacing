package com.lam.coder.topCoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         You are implementing the portion of an online dating site where
 *         members display their profiles. Most of the profile content is
 *         automatically generated from member data. Part of a profile, however,
 *         is furnished directly by the member as free-form text. Weblinks
 *         frequently crop up in this text, despite a site policy that forbids
 *         advertisement and linking of any kind. Your job is to seek and
 *         destroy all weblinks in a given piece of text.
 * 
 *         For the purposes of this problem, a weblink is a string consisting of
 *         three parts. From left to right, these are the prefix, domain, and
 *         suffix.
 * 
 *         The prefix consists of one of the three following strings.
 * 
 *         http:// http://www. www.
 * 
 *         The domain is a sequence of one or more characters, each of which is
 *         a letter (a character from 'a' to 'z' or from 'A' to 'Z'), a numeral
 *         ('0' to '9'), or a period (the character '.').
 * 
 *         The suffix is one of the five following strings.
 * 
 * 
 *         .com .org .edu .info .tv
 * 
 *         There must be no space character within the weblink. The weblink may
 *         have any kind of character to the left and right of it. It may also
 *         occur at the beginning of the text, at the end of the text, or it may
 *         itself be the entire text.
 * 
 *         Furthermore, a weblink extends as far as possible to the left and
 *         right. The passage below, for example, contains a single weblink
 *         stretching between the fragments "espi" and "aladocious".
 * 
 * 
 *         espihttp://www.tv.org.superwww.cali.comaladocious
 * 
 *         Each weblink in the text must be replaced with a string consisting of
 *         the word "OMIT" followed by a number. The first weblink is to be
 *         replaced with "OMIT1", the second with "OMIT2", and so forth. All
 *         portions of text that do not consist of a weblink must remain intact.
 * 
 *         You are given a String consisting of letters, numerals ('0' to '9')
 *         and the characters ' ' (space), ',' (comma), '.' (period), ':'
 *         (colon), and '/' (slash). Return a String containing the text after
 *         it has been cleaned in the manner described above.
 * 
 *         Definition
 * 
 *         Class: UnLinker Method: clean Parameters: String Returns: String
 *         Method signature: String clean(String text) (be sure your method is
 *         public)
 * 
 * 
 *         Constraints - text is between 1 and 50 characters long, inclusive -
 *         each character in text is a letter ('a' to 'z' or 'A' to 'Z'), a
 *         numeral ('0' to '9'), or one of the following: ' ' (space); ','
 *         (comma); '.' (period); ':' (colon); '/' (slash).
 * 
 *         Examples 0)
 * 
 * 
 *         "espihttp://www.tv.org.superwww.cali.comaladocious"
 * 
 *         Returns: "espiOMIT1aladocious"
 * 
 *         Remember, a weblink stretches as far as possible to the left and
 *         right. 1)
 * 
 * 
 *         "check www.foo.com 4 www.foo.com www.scoopz.com"
 * 
 *         Returns: "check OMIT1 4 OMIT2 OMIT3"
 * 
 *         Each occurrence of "www.foo.com" gets a different number. 2)
 * 
 * 
 *         "check www.foo.com 4 www.foo.comwww.scoopz.com"
 * 
 *         Returns: "check OMIT1 4 OMIT2"
 * 
 *         What a difference a space makes! 3)
 * 
 * 
 *         "check www.foo.com 4 www.foo.comhttp://scoopz.com"
 * 
 *         Returns: "check OMIT1 4 OMIT2OMIT3"
 * 
 *         The last two weblinks are separate again. 4)
 * 
 * 
 *         "http://411.com goodz 4 www.733t.com, 2http://..com"
 * 
 *         Returns: "OMIT1 goodz 4 OMIT2, 2OMIT3"
 * 
 *         5)
 * 
 * 
 *         "http.//say.org,www.jeeves.x.info,www.comhttp://.tv"
 * 
 *         Returns: "http.//say.org,OMIT1,www.comhttp://.tv"
 * 
 *         6)
 * 
 * 
 *         "http://www.www.com/www"
 * 
 *         Returns: "OMIT1/www"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for:
 * 
 *         Single Round Match 203 Round 1 - Division II, Level Three
 * 
 */

public class UnLinker {
	private static final String REGEX = "((http://)|(http://www\\.)|(www\\.))[a-zA-Z.0-9]+"
			+ "((\\.com)|(\\.org)|(\\.edu)|(\\.info)|(\\.tv))";

	private static final String OMIT = "OMIT";

	public String clean(String text) {
		Pattern pattern = Pattern.compile(REGEX);

		StringBuffer out = new StringBuffer();
		
        Matcher matcher = pattern.matcher(text);
        
        int i = 1;
        while (matcher.find()) {
        	matcher.appendReplacement(out, OMIT + i++);
        }

        matcher.appendTail(out);

		return out.toString();
	}
}

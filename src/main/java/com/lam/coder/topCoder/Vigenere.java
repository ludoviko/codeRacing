package com.lam.coder.topCoder;

import java.util.regex.Pattern;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 * 
 *         This problem is taken from the Collegiate Challenge Finals.
 * 
 *         Class Name: Vigenere Method Name: coder Parameters: String,String,int
 *         Returns: String
 * 
 *         The Vigenere Cipher is a simple but strong encryption algorithm.
 *         Unlike many simple encryption algorithms, the Vigenere Cipher is
 *         immune to frequency analysis because it alters the normal frequency
 *         by using more than one alphabet to encrypt the message. Instead of
 *         there being a one-to-one relationship between each letter and its
 *         substitute, there is a one-to-many relationship between each letter
 *         and its substitute.
 * 
 *         The Vigenere Cipher is based on the following table (which has a
 *         simple pattern so you don't actually have to store the table).
 * 
 *         A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 * 
 *         A A B C D E F G H I J K L M N O P Q R S T U V W X Y Z B B C D E F G H
 *         I J K L M N O P Q R S T U V W X Y Z A C C D E F G H I J K L M N O P Q
 *         R S T U V W X Y Z A B D D E F G H I J K L M N O P Q R S T U V W X Y Z
 *         A B C . . . . . . . . . . . . . . .
 * 
 *         When encoding a message with the Vigenere Cipher, a code word is
 *         written repeatedly over the message. Each letter in the message is
 *         replaced with the letter at the intersection of the row given by the
 *         corresponding code word letter and the column given by the message
 *         letter.
 * 
 *         Implement a class Vigenere that contains a method coder. The method
 *         encodes and decodes Strings of capital letters (A-Z) using the
 *         Vigenere Cipher. coder takes two Strings and an int as a parameter.
 *         The first String is the message. The second String is the code word.
 *         The int specifies whether the message should be encoded or decoded:
 *         int=1: encode message int=2: decode message The method returns a
 *         String that is the resulting (encoded or decoded) message.
 * 
 *         If the message or code word is not valid (They do not contain only
 *         capital letters in the range A to Z, or the code word is of length 0)
 *         the method returns "ERROR".
 *         
 *         If the int is not 1 or 2, the method
 *         returns "ERROR" 
 *         
 *         If both the message and code word are of length 0, or
 *         if just the message has length 0 (and the code word is valid), the
 *         method should return an empty string.
 * 
 *         The method signature is: public String coder(String message,String
 *         codeWord,int action);
 * 
 *         message and codeWord are Strings with length less than 1000.
 * 
 *         Examples: If the message is "TOPCODERISGREAT" and the codeWord is
 *         "CODE" and the action is encode (1), write the code word over the
 *         message and look up letters in the table: Code Word: CODECODECODECOD
 * 
 *         Message: TOPCODERISGREAT Encoded: VCSGQRHVKGJVGOW because the letter
 *         in row C column T is V, the letter in row O column O is C, etc....
 * 
 *         If the message is "HRWCQYRORWSCGKUO" and the codeWord is "OK" and the
 *         action is decode (2), the decoded message is "THISCODEDMESSAGE". If
 *         the message is "HowAreYou" and the codeWord is "GO" and the action is
 *         encode (1), the method returns "ERROR" because the message isn't all
 *         capital letters.
 * 
 * 
 *         Definition
 * 
 *         Class: Vigenere Method: coder Parameters: String, String, int
 *         Returns: String Method signature: String coder(String param0, String
 *         param1, int param2) (be sure your method is public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Collegiate Challenge Finals - Division I,
 *         Level One
 */

public class Vigenere {

	public static final int ENCODE = 1;
	public static final int DECODE = 2;
	private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private String REGEX = "^[A-Z]+$";
	public static String ERROR = "ERROR";
	

	private boolean matches(String message) {
		return  Pattern.matches(REGEX, message);
	}
	
	public String coder(String message, String codeWord, int action) {

		if (message.length() == 0 || message == null) {
			return "";
		}
		
		boolean goOn = this.matches(message);
		if (goOn) {
		} else {
			return ERROR;
		}
		
		goOn = this.matches(codeWord);
		if (goOn) {
		} else {
			return ERROR;
		}
		
		if (action == ENCODE) {
			return encode(message, codeWord);
		} else if (action == DECODE) {
			return decode(message, codeWord);
		} else {
			return ERROR;
		}
	}

	private String encode(String message, String codeWord) {
		String codeWordLong = codeWord;
		String codification = "";

		int mLen = message.length();
		int cLen = codeWordLong.length();

		while (cLen < mLen) {
			codeWordLong += codeWord;
			cLen = codeWordLong.length();
		}

		for (int i = 0; i < message.length(); i++) {
			codification += Vigenere.encode(message.charAt(i),
					Vigenere.getIndexOfChar(CHARS, codeWordLong.charAt(i)));
		}

		return codification;
	}

	private String decode(String message, String codeWord) {
		String codeWordLong = codeWord;
		String decodification = "";

		int mLen = message.length();
		int cLen = codeWordLong.length();

		while (cLen < mLen) {
			codeWordLong += codeWord;
			cLen = codeWordLong.length();
		}

		for (int i = 0; i < message.length(); i++) {
			decodification += Vigenere.decode(message.charAt(i),
					Vigenere.getIndexOfChar(CHARS, codeWordLong.charAt(i)));
		}

		return decodification;
	}

	private static int getIndexOfChar(String chars, char aChar) {
		int i = 0;
		while (true) {
			if (chars.charAt(i) == aChar) {
				return i;
			}
			i++;
		}
	}
	
	private static char encode(char aChar, int shift) {
		char code;

		String charsShifted = CHARS.substring(shift)
				+ CHARS.substring(0, shift);

		char a = 'A';
		int aInt = (int) a;

		int letterInt;
		int position;

		letterInt = (int) aChar;
		position = letterInt - aInt;
		code = charsShifted.charAt(position);

		return code;
	}

	private static char decode(char aChar, int shift) {
		char code;

		String charsShifted;

		charsShifted = CHARS.substring(shift)
				+ CHARS.substring(0, shift);
		
		int position = Vigenere.getIndexOfChar(charsShifted, aChar); 

		code = CHARS.charAt(position);

		return code;
	}
}

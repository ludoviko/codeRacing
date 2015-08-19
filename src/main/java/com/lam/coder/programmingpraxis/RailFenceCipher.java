package com.lam.coder.programmingpraxis;

import java.util.Arrays;

/**
 * 
 * @author LAzuaje
 *
 *         Rail-Fence Cipher March 31, 2009 The rail-fence cipher is a
 *         transposition cipher that rearranges the characters of a clear-text
 *         to form the cipher-text. The clear-text is arranged in up-and-down
 *         waves like the tops of the pickets on a rail fence; the cipher key is
 *         the height of the fence. For instance, the encipherment of
 *         “PROGRAMMING PRAXIS” with a key of 4 is shown below, using an
 *         underscore to make the space character visible:
 * 
 *         P R O G R A M M I N G _ P R A X I S P M P = P M P R A M _ R S = R A M
 *         _ R S O R I G A I = O R I G A I G N X = G N X
 * 
 *         The cipher-text is read at the right of the pickets: “PMPRAM
 *         RSORIGAIGNX”.
 * 
 *         Your task is to write functions that encipher and decipher texts
 *         using the rail-fence method. When you are finished, you are welcome
 *         to read or run a suggested solution, or to post your solution or
 *         discuss the exercise in the comments below.
 */

public class RailFenceCipher {

	public String encode(String message, int n, int offset) {
		if (n < 2) {
			throw new IllegalArgumentException(
					"The number of rails must be greater than 1.");
		}

		int up;
		int j = offset % (n + 1);

		String[] strings = new String[n];

		Arrays.fill(strings, "");

		if (j == n) {
			up = 0;
			j--;
			j--;
		} else {
			up = 1;
		}

		for (int i = 0; i < message.length(); i++) {
			if (up == 1) {
				strings[j++] += message.charAt(i);
			} else {
				strings[j--] += message.charAt(i);
			}

			if (j == n) {
				up = 0;
				j--;
				j--;
			} else if (j == -1) {
				j++;
				j++;
				up = 1;
			}
		}

		StringBuilder builder = new StringBuilder();

		for (String string : strings) {
			builder.append(string);
		}

		return builder.toString();
	}

	// XXX: Too complex...
	public String decode(String string, int n, int offset) {
		return null;
	}
}

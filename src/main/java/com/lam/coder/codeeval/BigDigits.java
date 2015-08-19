package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 *
 *         Codeeval.com
 *
 *         BIG DIGITS 
 *         
 *         CHALLENGE DESCRIPTION:
 * 
 *         In this challenge you're presented with a situation in which you need
 *         to output big symbols on devices which only support ASCII characters
 *         and single, fixed-width fonts. To do this you're going to use
 *         pseudo-graphics to ‘draw’ these big symbols.
 * 
 *         Here is an example of the font with digits from 0 to 9:
 * 
 *         12345123451234512345123451234512345123451234512345
 *          **    *  ***  ***   *   ****  **  ****  **   **  
 *         *  *  **     *    * *  * *    *       * *  * *  * 
 *         *  *   *   **   **  **** ***  ***    *   **   *** 
 *         *  *   *  *       *    *    * *  *  *   *  *    * 
 *          **   *** **** ***     * ***   **   *    **   **  
 *         --------------------------------------------------
 *         12345123451234512345123451234512345123451234512345
 *          
 *         Each pixel is
 *         marked either with asterisk ‘*’ or with minus ‘-’. Size of a digit is
 *         5×6 pixels.
 * 
 *         Your task is to write a program, which outputs the numbers given to
 *         you with the font as in the example. 
 *         
 *         Input can contain some other symbols, which should be ignored 
 *         (i.e. points, hyphens, spaces); only numbers must be printed out.
 *
 */

public class BigDigits {

	private String[]	zero;
	private String[]	one;
	private String[]	two;
	private String[]	three;
	private String[]	four;
	private String[]	five;
	private String[]	six;
	private String[]	seven;
	private String[]	eight;
	private String[]	nine;

	public BigDigits() {
		this.zero = new String[6];
		this.zero[0] = " **  ";
		this.zero[1] = "*  * ";
		this.zero[2] = "*  * ";
		this.zero[3] = "*  * ";
		this.zero[4] = " **  ";
		this.zero[5] = "     ";

		this.one = new String[6];
		this.one[0] = "  *  ";
		this.one[1] = " **  ";
		this.one[2] = "  *  ";
		this.one[3] = "  *  ";
		this.one[4] = " *** ";
		this.one[5] = "     ";

		this.two = new String[6];
		this.two[0] = "***  ";
		this.two[1] = "   * ";
		this.two[2] = " **  ";
		this.two[3] = "*    ";
		this.two[4] = "**** ";
		this.two[5] = "     ";

		this.three = new String[6];
		this.three[0] = "***  ";
		this.three[1] = "   * ";
		this.three[2] = " **  ";
		this.three[3] = "   * ";
		this.three[4] = "***  ";
		this.three[5] = "     ";

		this.four = new String[6];
		this.four[0] = " *   ";
		this.four[1] = "*  * ";
		this.four[2] = "**** ";
		this.four[3] = "   * ";
		this.four[4] = "   * ";
		this.four[5] = "     ";

		this.five = new String[6];
		this.five[0] = "**** ";
		this.five[1] = "*    ";
		this.five[2] = "***  ";
		this.five[3] = "   * ";
		this.five[4] = "***  ";
		this.five[5] = "     ";

		this.six = new String[6];
		this.six[0] = " **  ";
		this.six[1] = "*    ";
		this.six[2] = "***  ";
		this.six[3] = "*  * ";
		this.six[4] = " **  ";
		this.six[5] = "     ";

		this.seven = new String[6];
		this.seven[0] = "**** ";
		this.seven[1] = "   * ";
		this.seven[2] = "  *  ";
		this.seven[3] = " *   ";
		this.seven[4] = " *   ";
		this.seven[5] = "     ";

		this.eight = new String[6];
		this.eight[0] = " **  ";
		this.eight[1] = "*  * ";
		this.eight[2] = " **  ";
		this.eight[3] = "*  * ";
		this.eight[4] = " **  ";
		this.eight[5] = "     ";

		this.nine = new String[6];
		this.nine[0] = " **  ";
		this.nine[1] = "*  * ";
		this.nine[2] = " *** ";
		this.nine[3] = "   * ";
		this.nine[4] = " **  ";
		this.nine[5] = "     ";
	}

	public void print(String string) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < string.length(); j++) {
				if (Character.isDigit(string.charAt(j))) {
					switch (string.charAt(j)) {
						case '0':
							System.out.print(this.zero[i]);
							break;
						case '1':
							System.out.print(this.one[i]);
							break;
						case '2':
							System.out.print(this.two[i]);
							break;
						case '3':
							System.out.print(this.three[i]);
							break;
						case '4':
							System.out.print(this.four[i]);
							break;
						case '5':
							System.out.print(this.five[i]);
							break;
						case '6':
							System.out.print(this.six[i]);
							break;
						case '7':
							System.out.print(this.seven[i]);
							break;
						case '8':
							System.out.print(this.eight[i]);
							break;
						case '9':
							System.out.print(this.nine[i]);
							break;
						default:
							break;
					}
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		PrintStream out = System.out;

		BigDigits main = new BigDigits();
		String line;

		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			// Process line of input Here
			main.print(line);
		}

		buffer.close();
		out.close();
	}
}

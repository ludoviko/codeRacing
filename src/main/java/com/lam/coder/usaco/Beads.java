package com.lam.coder.usaco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 * 
 *         Broken Necklace
 * 
 *         You have a necklace of N red, white, or blue beads (3<=N<=350) some
 *         of which are red, others blue, and others white, arranged at random.
 *         Here are two examples for n=29:
 * 
 *         1 2 1 2 r b b r b r r b r b b b r r b r r r w r b r w w b b r r b b b
 *         b b b r b r r b r b r r r b r r r r r r b r b r r r w Figure A Figure
 *         B r red bead b blue bead w white bead
 * 
 *         The beads considered first and second in the text that follows have
 *         been marked in the picture.
 * 
 *         The configuration in Figure A may be represented as a string of b's
 *         and r's, where b represents a blue bead and r represents a red one,
 *         as follows: brbrrrbbbrrrrrbrrbbrbbbbrrrrb .
 * 
 *         Suppose you are to break the necklace at some point, lay it out
 *         straight, and then collect beads of the same color from one end until
 *         you reach a bead of a different color, and do the same for the other
 *         end (which might not be of the same color as the beads collected
 *         before this).
 * 
 *         Determine the point where the necklace should be broken so that the
 *         most number of beads can be collected. Example
 * 
 *         For example, for the necklace in Figure A, 8 beads can be collected,
 *         with the breaking point either between bead 9 and bead 10 or else
 *         between bead 24 and bead 25.
 * 
 *         In some necklaces, white beads had been included as shown in Figure B
 *         above. When collecting beads, a white bead that is encountered may be
 *         treated as either red or blue and then painted with the desired
 *         color. The string that represents this configuration will include the
 *         three symbols r, b and w.
 * 
 *         Write a program to determine the largest number of beads that can be
 *         collected from a supplied necklace. PROGRAM NAME: beads INPUT FORMAT
 *         Line 1: N, the number of beads Line 2: a string of N characters, each
 *         of which is r, b, or w SAMPLE INPUT (file beads.in)
 * 
 *         29 wwwbbrwrbrbrrbrbrwrwwrbwrwrrb
 * 
 *         OUTPUT FORMAT A single line containing the maximum of number of beads
 *         that can be collected from the supplied necklace. SAMPLE OUTPUT (file
 *         beads.out)
 * 
 *         11
 * 
 *         OUTPUT EXPLANATION Consider two copies of the beads (kind of like
 *         being able to runaround the ends). The string of 11 is marked.
 * 
 *         original 'split' v
 *         wwwbbrwrbrbrrbrbrwrwwrbwrwrrb|wwwbbrwrbrbrrbrbrwrwwrbwrwrrb |*****
 *         rrrrrb|bbbbb <-- assignments 5 x r 6 x b <-- 11 total
 */

/*
 * ID: ludovik1 LANG: JAVA TASK: Beads
 */

public class Beads {

	public static final String DirIn = "./source/com/coder/usaco/dataIn/";
	public static final String DirOut = "./source/com/coder/usaco/dataOut/";

	public static final String DataIn = DirIn + Beads.class.getSimpleName()
			+ ".in";
	public static final String DataOut = DirOut + Beads.class.getSimpleName()
			+ ".out";

	public int findMaxLength(String string) {
		int d1 = 0, d2 = 0;
		int dd = 0;
		int max = 0;
		String sub;

		int i = 0;
		boolean isRead = true;
		boolean isBlue = true;
		boolean isWhite = true;
		while (i < string.length()) {
			if (string.charAt(i++) == 'r') {
			} else {
				isRead = false;
				break;
			}
		}
		if (isRead) {
			return string.length();
		}

		i = 0;
		while (i < string.length()) {
			if (string.charAt(i++) == 'b') {
			} else {
				isBlue = false;
				break;
			}
		}
		if (isBlue) {
			return string.length();
		}

		i = 0;
		while (i < string.length()) {
			if (string.charAt(i++) == 'w') {
			} else {
				isWhite = false;
				break;
			}
		}
		if (isWhite) {
			return string.length();
		}

		while (dd <= string.length()) {
			string = string.substring(d1, string.length())
					+ string.substring(0, d1);

			d1 = this.count(string);

			StringBuilder sb = new StringBuilder(string.substring(d1));
			sub = sb.reverse().toString();
			
			d2 = this.count(sub);
			dd += d1;

			if (d1 + d2 > max) {
				max = d1 + d2;
			}
		}
		return max;
	}

	private int count(String string) {
		int n = 0;
		int i = 0;

		while (i < string.length() && (string.charAt(i) == 'w')) {
			n++;
			i++;
		}

		if (string.charAt(i) == 'r') {
			while (i < string.length()
					&& (string.charAt(i) == 'r' || string.charAt(i) == 'w')) {
				n++;
				i++;
			}
		} else if (string.charAt(i) == 'b') {
			while (i < string.length()
					&& (string.charAt(i) == 'b' || string.charAt(i) == 'w')) {
				n++;
				i++;
			}
		} else {
		}

		return n;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader(DataIn));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				DataOut)));

		int n = Integer.parseInt(read.readLine());
		String string = read.readLine();

		int result = new Beads().findMaxLength(string);
		out.println(result);

		read.close();
		out.close();
		System.exit(0);
	}
}

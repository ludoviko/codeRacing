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
 *         Transformations
 * 
 *         A square pattern of size N x N (1 <= N <= 10) black and white square
 *         tiles is transformed into another square pattern. Write a program
 *         that will recognize the minimum transformation that has been applied
 *         to the original pattern given the following list of possible
 *         transformations:
 * 
 *         #1: 90 Degree Rotation: The pattern was rotated clockwise 90 degrees.
 *         #2: 180 Degree Rotation: The pattern was rotated clockwise 180
 *         degrees. #3: 270 Degree Rotation: The pattern was rotated clockwise
 *         270 degrees. #4: Reflection: The pattern was reflected horizontally
 *         (turned into a mirror image of itself by reflecting around a vertical
 *         line in the middle of the image). #5: Combination: The pattern was
 *         reflected horizontally and then subjected to one of the rotations
 *         (#1-#3). #6: No Change: The original pattern was not changed. #7:
 *         Invalid Transformation: The new pattern was not obtained by any of
 *         the above methods.
 * 
 *         In the case that more than one transform could have been used, choose
 *         the one with the minimum number above. PROGRAM NAME: transform INPUT
 *         FORMAT Line 1: A single integer, N Line 2..N+1: N lines of N
 *         characters (each either `@' or `-'); this is the square before
 *         transformation Line N+2..2*N+1: N lines of N characters (each either
 *         `@' or `-'); this is the square after transformation SAMPLE INPUT
 *         (file transform.in)
 * 
 *         3
 * @-@ ---
 * @@-
 * @-@
 * @-- --@
 * 
 *     OUTPUT FORMAT A single line containing the the number from 1 through 7
 *     (described above) that categorizes the transformation required to change
 *     from the `before' representation to the `after' representation. SAMPLE
 *     OUTPUT (file transform.out)
 * 
 *     1
 * 
 */

/*
 * ID: ludovik1 LANG: JAVA TASK: Transformation
 */

public class Transformation {
	public static final String DirIn = "./source/com/coder/usaco/dataIn/";
	public static final String DirOut = "./source/com/coder/usaco/dataOut/";

	public static final String DataIn = DirIn
			+ Transformation.class.getSimpleName() + ".in";
	public static final String DataOut = DirOut
			+ Transformation.class.getSimpleName() + ".out";

	public static final int NINETY_ROTATION = 1;
	public static final int ONE_HUNDRED_AND_EIGHTY_ROTATION = 2;
	public static final int TWO_HUNDRED_AND_SEVENTY_ROTATION = 3;
	public static final int REFLECTION = 4;
	public static final int COMBINATION = 5;
	public static final int NO_CHANGE = 6;
	public static final int UNKNOWN = 7;

	public Transformation() {
	}

	private char[][] ninetyDegreeRotation(char[][] arrayIn) {
		char[][] arrayInT = new char[arrayIn.length][arrayIn.length];

		for (int i = 0; i < arrayIn.length; i++) {
			for (int j = 0; j < arrayIn.length; j++) {
				arrayInT[i][j] = arrayIn[arrayIn.length - 1 - j][i];
			}
		}
		return arrayInT;
	}

	private char[][] reflection(char[][] arrayIn) {
		char[][] arrayInT = new char[arrayIn.length][arrayIn.length];
		for (int i = 0; i < arrayIn.length; i++) {
			for (int j = 0; j < arrayIn.length; j++) {
				arrayInT[i][j] = arrayIn[i][arrayIn.length - 1 - j];
			}
		}
		return arrayInT;
	}

	private boolean arrayOfCharsCharsEquals(char[][] array, char[][] array2) {
		boolean areEquals = true;

		end: for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] != array2[i][j]) {
					areEquals = false;
					break end;
				}
			}
		}
		return areEquals;
	}

	public int findNumberOf(char[][] arrayIn, char[][] arrayOut) {
		char[][] arrayInT;

		int result = UNKNOWN;

		int n = checkAngleRotation(arrayIn, arrayOut);
		if (n <= 3) {
			return n;
		}

		arrayInT = this.reflection(arrayIn);
		if (arrayOfCharsCharsEquals(arrayInT, arrayOut)) {
			return REFLECTION;
		}

		arrayInT = this.reflection(arrayIn);
		n = checkAngleRotation(arrayInT, arrayOut);
		if (n <= 3) {
			return COMBINATION;
		}

		if (arrayOfCharsCharsEquals(arrayIn, arrayOut)) {
			return NO_CHANGE;
		}

		return result;
	}

	private int checkAngleRotation(char[][] arrayIn, char[][] arrayOut) {
		int result = UNKNOWN;

		char[][] arrayInT = this.ninetyDegreeRotation(arrayIn);
		if (arrayOfCharsCharsEquals(arrayInT, arrayOut)) {
			return NINETY_ROTATION;
		}

		arrayInT = this.ninetyDegreeRotation(arrayInT);
		if (arrayOfCharsCharsEquals(arrayInT, arrayOut)) {
			return ONE_HUNDRED_AND_EIGHTY_ROTATION;
		}

		arrayInT = this.ninetyDegreeRotation(arrayInT);
		if (arrayOfCharsCharsEquals(arrayInT, arrayOut)) {
			return TWO_HUNDRED_AND_SEVENTY_ROTATION;
		}

		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		char[][] arrayIn;
		char[][] arrayOut;

		BufferedReader read = new BufferedReader(new FileReader(DataIn));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				DataOut)));

		int lines = Integer.parseInt(read.readLine());

		int linesIO = lines;

		arrayIn = new char[lines][lines];
		arrayOut = new char[lines][lines];

		String line;

		while (linesIO > 0) {
			line = read.readLine();
			arrayIn[arrayIn.length - linesIO--] = line.toCharArray();
		}

		linesIO = lines;
		while (linesIO > 0) {
			line = read.readLine();
			arrayOut[arrayIn.length - linesIO--] = line.toCharArray();
		}

		int index = new Transformation().findNumberOf(arrayIn, arrayOut);
		out.println(index);

		read.close();
		out.close();
		System.exit(0);
	}

}

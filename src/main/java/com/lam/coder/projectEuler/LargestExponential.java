package com.lam.coder.projectEuler;

import java.util.ArrayList;
import java.util.List;

import com.lam.utilIo.ReadData;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 99
 * 
 *         Largest exponential
 * 
 *         Comparing two numbers written in index form like 211 and 37 is not
 *         difficult, as any calculator would confirm that 211 = 2048 < 37 =
 *         2187.
 * 
 *         However, confirming that 632382^518061 > 519432^525806 would be much
 *         more difficult, as both numbers contain over three million digits.
 * 
 *         Using base_exp.txt (right click and 'Save Link/Target As...'), a 22K
 *         text file containing one thousand lines with a base/exponent pair on
 *         each line, determine which line number has the greatest numerical
 *         value.
 * 
 *         NOTE: The first two lines in the file represent the numbers in the
 *         example given above.
 * 
 *         Answer: 709.
 * 
 */

public class LargestExponential {
	private final String PathToFile = "./src/main/java/com/lam/coder/projectEuler/dataIn/base_exp.txt";
	private List<String> powers;

	public LargestExponential() {
		this.powers = new ArrayList<String>();
		this.loadData(this.powers, this.PathToFile);
	}

	private void loadData(List<String> list, String pathToFile) {
		ReadData data = new ReadData(list, pathToFile);
		data.loadData();
	}

	public int find() {
		String[] strings;
		double calculus;
		double max = 0;
		int j = 0;

		for (int i = 0; i < this.powers.size(); i++) {
			strings = this.powers.get(i).split(",");
			calculus = (Integer.parseInt(strings[1]) * Math.log10(Integer
					.parseInt(strings[0])));
			if (calculus > max) {
				// System.out.println(strings[0] + "/" + strings[1] + "/" +
				// calculus );
				max = calculus;
				j = i;
			}
		}

		// System.out.println(max);
		return j + 1;
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LargestExponential largest = new LargestExponential();
		System.out.println("Answer: " + largest.find());
	}
}

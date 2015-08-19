package com.lam.coder.usaco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Mixing Milk
 * 
 *         Since milk packaging is such a low margin business, it is important
 *         to keep the price of the raw product (milk) as low as possible. Help
 *         Merry Milk Makers get the milk they need in the cheapest possible
 *         manner.
 * 
 *         The Merry Milk Makers company has several farmers from which they may
 *         buy milk, and each one has a (potentially) different price at which
 *         they sell to the milk packing plant. Moreover, as a cow can only
 *         produce so much milk a day, the farmers only have so much milk to
 *         sell per day. Each day, Merry Milk Makers can purchase an integral
 *         amount of milk from each farmer, less than or equal to the farmer's
 *         limit.
 * 
 *         Given the Merry Milk Makers' daily requirement of milk, along with
 *         the cost per gallon and amount of available milk for each farmer,
 *         calculate the minimum amount of money that it takes to fulfill the
 *         Merry Milk Makers' requirements.
 * 
 *         Note: The total milk produced per day by the farmers will be
 *         sufficient to meet the demands of the Merry Milk Makers. PROGRAM
 *         NAME: milk INPUT FORMAT Line 1: Two integers, N and M. The first
 *         value, N, (0 <= N <= 2,000,000) is the amount of milk that Merry Milk
 *         Makers wants per day. The second, M, (0 <= M <= 5,000) is the number
 *         of farmers that they may buy from. Lines 2 through M+1: The next M
 *         lines each contain two integers, Pi and Ai. Pi (0 <= Pi <= 1,000) is
 *         price in cents that farmer i charges. Ai (0 <= Ai <= 2,000,000) is
 *         the amount of milk that farmer i can sell to Merry Milk Makers per
 *         day.
 * 
 *         SAMPLE INPUT (file milk.in)
 * 
 *         100 5 5 20 9 40 3 10 8 80 6 30
 * 
 *         OUTPUT FORMAT
 * 
 *         A single line with a single integer that is the minimum price that
 *         Merry Milk Makers can get their milk at for one day. SAMPLE OUTPUT
 *         (file milk.out)
 * 
 *         630
 */

/*
 * ID: ludovik1 LANG: JAVA TASK: MixingMilk
 */

public class MixingMilk {
	public static final String DirIn = "./source/com/coder/usaco/dataIn/";
	public static final String DirOut = "./source/com/coder/usaco/dataOut/";

	public static final String DataIn = DirIn
			+ MixingMilk.class.getSimpleName() + ".in";
	public static final String DataOut = DirOut
			+ MixingMilk.class.getSimpleName() + ".out";

	public static int find(int expected, String[] producers) {
		TreeMap<Integer, Integer> production = getMap(producers);
		int spending = 0;

		while (expected > 0) {
			Map.Entry<Integer, Integer> entry = production.pollFirstEntry();
			if (entry.getValue() <= expected) {
				expected -= entry.getValue();
				spending += entry.getKey() * entry.getValue();
			} else {
				production.put(entry.getKey(), entry.getValue() - expected);
				spending += entry.getKey() * expected;
				expected = 0;
			}
		}
		return spending;
	}

	private static TreeMap<Integer, Integer> getMap(String[] producers) {
		String line;
		int value;
		int k;
		int v;
		int i = producers.length;
		TreeMap<Integer, Integer> production = new TreeMap<Integer, Integer>();

		while (i > 0) {
			line = producers[producers.length - i];
			k = Integer.parseInt(line.split(" ")[0]);
			v = Integer.parseInt(line.split(" ")[1]);
			if (production.containsKey(k)) {
				value = production.remove(k);
				production.put(k, value + v);
			} else {
				production.put(k, v);
			}
			i--;
		}
		return production;
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(DataIn));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				DataOut)));
		String line = reader.readLine();

		int expected = Integer.parseInt(line.split(" ")[0]);
		int lines = Integer.parseInt(line.split(" ")[1]);
		String[] productors = new String[lines];

		while (lines > 0) {
			line = reader.readLine();
			productors[productors.length - lines] = line;
			lines--;
		}

		out.println(MixingMilk.find(expected, productors));

		reader.close();
		out.close();
		System.exit(0);
	}
}

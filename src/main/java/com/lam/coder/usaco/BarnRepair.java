package com.lam.coder.usaco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Barn Repair
 * 
 *         It was a dark and stormy night that ripped the roof and gates off the
 *         stalls that hold Farmer John's cows. Happily, many of the cows were
 *         on vacation, so the barn was not completely full.
 * 
 *         The cows spend the night in stalls that are arranged adjacent to each
 *         other in a long line. Some stalls have cows in them; some do not. All
 *         stalls are the same width.
 * 
 *         Farmer John must quickly erect new boards in front of the stalls,
 *         since the doors were lost. His new lumber supplier will supply him
 *         boards of any length he wishes, but the supplier can only deliver a
 *         small number of total boards. Farmer John wishes to minimize the
 *         total length of the boards he must purchase.
 * 
 *         Given M (1 <= M <= 50), the maximum number of boards that can be
 *         purchased; S (1 <= S <= 200), the total number of stalls; C (1 <= C
 *         <= S) the number of cows in the stalls, and the C occupied stall
 *         numbers (1 <= stall_number <= S), calculate the minimum number of
 *         stalls that must be blocked in order to block all the stalls that
 *         have cows in them.
 * 
 *         Print your answer as the total number of stalls blocked. PROGRAM
 *         NAME: barn1 INPUT FORMAT Line 1: M, S, and C (space separated) Lines
 *         2-C+1: Each line contains one integer, the number of an occupied
 *         stall. SAMPLE INPUT (file barn1.in)
 * 
 *         4 50 18 3 4 6 8 14 15 16 17 21 25 26 27 30 31 40 41 42 43
 * 
 *         OUTPUT FORMAT A single line with one integer that represents the
 *         total number of stalls blocked. SAMPLE OUTPUT (file barn1.out)
 * 
 *         25
 * 
 *         [One minimum arrangement is one board covering stalls 3-8, one
 *         covering 14-21, one covering 25-31, and one covering 40-43
 */

/*
 * ID: ludovik1 LANG: JAVA TASK: BarnRepair
 */

public class BarnRepair {
	public static final String DirIn = "./source/com/coder/usaco/dataIn/";
	public static final String DirOut = "./source/com/coder/usaco/dataOut/";

	public static final String DataIn = DirIn
			+ BarnRepair.class.getSimpleName() + ".in";
	public static final String DataOut = DirOut
			+ BarnRepair.class.getSimpleName() + ".out";

	public static final int EMPTY = 0;
	public static final int OCCUPIED = 1;
	public static final int UNBLOCKED = 2;
	public static final int USELESS = 4;

	public int findMinimumStallsBlocked(int boards, int numberOfStalls,
			int[] occupiedStallNumbers) {

		String interval;
		int count = 1;

		int[] stalls = new int[numberOfStalls];
		Arrays.fill(stalls, EMPTY);

		for (int i = 0; i < occupiedStallNumbers.length; i++) {
			stalls[occupiedStallNumbers[i] - 1] = OCCUPIED;
		}

		int i = 0;
		while (stalls[i] == EMPTY) {
			stalls[i++] = USELESS;
		}

		i = numberOfStalls - 1;
		while (stalls[i] == EMPTY) {
			stalls[i--] = USELESS;
		}

		while (count < boards) {
			interval = findMaxEmptyStalls(stalls);
			for (i = Integer.parseInt(interval.split("/")[0]); i < Integer
					.parseInt(interval.split("/")[0])
					+ Integer.parseInt(interval.split("/")[1]);) {
				stalls[i++] = UNBLOCKED;
			}
			count++;
		}
		return findTotalBlockedStalls(stalls);
	}

	private String findMaxEmptyStalls(int[] stalls) {
		int max = 0;
		int value = 0;
		int i = 0;
		int z = 0;

		while (i < stalls.length) {
			while (i < stalls.length && stalls[i] == EMPTY) {
				value++;
				i++;
			}
			if (value > max) {
				max = value;
				z = i - value;
			}
			value = 0;
			i++;
		}
		return z + "/" + max;
	}

	private int findTotalBlockedStalls(int[] stalls) {
		int total = 0;
		int i = 0;

		while (i < stalls.length) {
			if (stalls[i] == EMPTY || stalls[i] == OCCUPIED) {
				total++;
			}
			i++;
		}
		return total;
	}

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(DataIn));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				DataOut)));
		String line = reader.readLine();

		int boards = Integer.parseInt(line.split(" ")[0]);
		int numberOfStalls = Integer.parseInt(line.split(" ")[1]);
		int numberOfOccupiedStalls = Integer.parseInt(line.split(" ")[2]);
		int[] occupiedStallNumbers = new int[numberOfOccupiedStalls];

		while (numberOfOccupiedStalls > 0) {
			occupiedStallNumbers[occupiedStallNumbers.length
					- numberOfOccupiedStalls--] = Integer.parseInt(reader
					.readLine());
		}

		out.println(new BarnRepair().findMinimumStallsBlocked(boards,
				numberOfStalls, occupiedStallNumbers));

		out.close();
		reader.close();
		System.exit(0);
	}
}

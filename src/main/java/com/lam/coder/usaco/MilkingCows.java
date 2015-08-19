package com.lam.coder.usaco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ludoviko Azuaje
 * 
 *         Three farmers rise at 5 am each morning and head for the barn to milk
 *         three cows. The first farmer begins milking his cow at time 300
 *         (measured in seconds after 5 am) and ends at time 1000. The second
 *         farmer begins at time 700 and ends at time 1200. The third farmer
 *         begins at time 1500 and ends at time 2100. The longest continuous
 *         time during which at least one farmer was milking a cow was 900
 *         seconds (from 300 to 1200). The longest time no milking was done,
 *         between the beginning and the ending of all milking, was 300 seconds
 *         (1500 minus 1200).
 * 
 *         Your job is to write a program that will examine a list of beginning
 *         and ending times for N (1 <= N <= 5000) farmers milking N cows and
 *         compute (in seconds):
 * 
 *         The longest time interval at least one cow was milked. The longest
 *         time interval (after milking starts) during which no cows were being
 *         milked.
 * 
 *         PROGRAM NAME: milk2 INPUT FORMAT Line 1: The single integer Lines
 *         2..N+1: Two non-negative integers less than 1000000, the starting and
 *         ending time in seconds after 0500 SAMPLE INPUT (file milk2.in)
 * 
 *         3 300 1000 700 1200 1500 2100
 * 
 *         OUTPUT FORMAT A single line with two integers that represent the
 *         longest continuous time of milking and the longest idle time. 
 *         
 *         SAMPLE
 *         OUTPUT (file milk2.out)
 * 
 *         900 300
 */

/*
 * ID: ludovik1 LANG: JAVA TASK: MilkingCows
 */
public class MilkingCows {
	public static final String DirIn = "./source/com/coder/usaco/dataIn/";
	public static final String DirOut = "./source/com/coder/usaco/dataOut/";

	public static final String DataIn = DirIn
			+ MilkingCows.class.getSimpleName() + ".in";
	public static final String DataOut = DirOut
			+ MilkingCows.class.getSimpleName() + ".out";

	public class Time implements Comparable<Time> {
		private int start;
		private int end;

		public Time(int start, int end) {
			this.start = start;
			this.end = end;
		}

		public int getStart() {
			return this.start;
		}

		public int getEnd() {
			return this.end;
		}

		public Time add(Time time) {
			if (this.end >= time.start && this.end <= time.end
					&& this.start < time.start) {
				return new Time(this.start, time.end);
			} else if (time.end >= this.start && time.end <= this.end
					&& time.start < this.start) {
				return new Time(time.start, this.end);
			} else if (this.end >= time.end && this.start <= time.start) {
				return new Time(this.start, this.end);
			} else if (time.end >= this.end && time.start <= this.start) {
				return new Time(time.start, time.end);
			} else {
				return null;
			}
		}

		@Override
		public String toString() {
			return "Time [start=" + this.start + ", end=" + this.end + "]";
		}

		public int compareTo(Time other) {
			if (this.start < other.start) {
				return -1;
			} else if (this.start > other.start) {
				return 1;
			} else if (this.end < other.end) {
				return -1;
			} else if (this.end > other.end) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	public String findTimes(String[] array) {
		int start, start2, end, end2;
		int i = 0;

		int timeIdle = 0;
		int timeContinuesMilking = 0;
		int maxIdle = 0;
		int maxContinuesMilking = 0;

		List<Time> times = this.getTimesAsList(array);

		start = times.get(i).getStart();
		end = times.get(i).getEnd();
		timeContinuesMilking = end - start;
		maxContinuesMilking = timeContinuesMilking;

		i++;
		while (i < times.size()) {
			start2 = times.get(i).getStart();
			end2 = times.get(i).getEnd();

			timeContinuesMilking = end2 - start2;
			if (timeContinuesMilking > maxContinuesMilking) {
				maxContinuesMilking = timeContinuesMilking;
			}

			timeIdle = start2 - end;
			if (timeIdle > maxIdle) {
				maxIdle = timeIdle;
			}

			end = end2;
			start = start2;
			i++;
		}
		return "" + maxContinuesMilking + " " + maxIdle;
	}

	private List<Time> getTimesAsList(String[] array) {
		List<Time> times = new ArrayList<Time>();

		int start, end;

		for (int i = 0; i < array.length; i++) {
			start = Integer.parseInt(array[i].split(" ")[0]);
			end = Integer.parseInt(array[i].split(" ")[1]);
			Time time = new Time(start, end);
			times.add(time);
		}

		Collections.sort(times);

		for (int i = 0; i < times.size() - 1;) {
			Time time1 = times.get(i);
			Time time2 = times.get(i + 1);
			Time time3 = time1.add(time2);
			if (time3 == null) {
				i++;
			} else {
				times.remove(i);
				times.remove(i);
				times.add(i, time3);
			}
		}
		return times;
	}

	/**
	 * @param args
	 */
	public static void main(String[] string) throws IOException {
		String[] array;
		BufferedReader reader = new BufferedReader(new FileReader(DataIn));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				DataOut)));

		int lines = Integer.parseInt(reader.readLine());

		array = new String[lines];
		String line;

		while (lines > 0) {
			line = reader.readLine();
			array[array.length - lines--] = line;
		}

		String calculation = new MilkingCows().findTimes(array);
		out.println(calculation);

		reader.close();
		out.close();
		System.exit(0);
	}

}

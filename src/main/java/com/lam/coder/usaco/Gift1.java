package com.lam.coder.usaco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 ID: ludovik1
 LANG: JAVA
 TASK: Gift1
 */

public class Gift1 {
	public static final String DirIn = "./source/com/coder/usaco/dataIn/";
	public static final String DirOut = "./source/com/coder/usaco/dataOut/";

	public static final String DataIn = DirIn + Gift1.class.getSimpleName()
			+ ".in";
	public static final String DataOut = DirOut + Gift1.class.getSimpleName()
			+ ".out";

	public int[] moneyTotal(String[] friends, String[] rulesByFriends) {

		int[] moneySource = new int[friends.length];
		int[] money = new int[friends.length];
		int[] moneyDif = new int[friends.length];

		for (int i = 0; i < rulesByFriends.length; i++) {
			money[i] = Integer.parseInt(rulesByFriends[i].split(" ")[0]);
			moneySource[i] = Integer.parseInt(rulesByFriends[i].split(" ")[0]);
		}

		String friend;
		int moneyF;
		int kk = 0;
		int n;
		for (int i = 0; i < rulesByFriends.length; i++) {
			if (rulesByFriends[i].split(" ")[0] != "0") {
				for (int j = 1; j < rulesByFriends[i].split(" +").length; j++) {
					n = rulesByFriends[i].split(" ").length - 1;
					friend = rulesByFriends[i].split(" ")[j];
					moneyF = moneySource[i] / n;
					// find friend index;
					for (int k = 0; k < friends.length; k++) {
						if (friends[k].equals(friend)) {
							kk = k;
							break;
						}
					}
					money[kk] += moneyF;
					money[i] -= moneyF;
				}
			} else {
			}
		}

		for (int i = 0; i < money.length; i++) {
			moneyDif[i] = money[i] - moneySource[i];
		}

		return moneyDif;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader(DataIn));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				DataOut)));

		int n = Integer.parseInt(read.readLine());

		String[] friends = new String[n];
		String[] rulesByFriends = new String[n];

		int f = 0;
		int count = n;
		while (count-- > 0) {
			friends[f++] = read.readLine();
		}

		int ff = 0;
		String friend;
		String friendsTo = "";
		String[] data;
		int m;

		while ((friend = read.readLine()) != null) {
			for (int k = 0; k < friends.length; k++) {
				if (friends[k].equals(friend)) {
					ff = k;
					break;
				}
			}
			data = read.readLine().split(" ");
			friendsTo += data[0] + " ";
			m = Integer.parseInt(data[1]);
			while (m-- > 0) {
				friendsTo += read.readLine() + " ";
			}
			rulesByFriends[ff] = friendsTo;
			friendsTo = "";
		}

		int money[] = new Gift1().moneyTotal(friends, rulesByFriends);

		for (int i = 0; i < money.length; i++) {
			out.println(friends[i] + " " + money[i]);
		}

		read.close();
		out.close();

		System.exit(0);
	}
}

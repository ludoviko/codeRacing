package com.lam.coder.topCoder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DoorsGame {
	private static final char TROPHY = 't';
	private static final char PLAYER_1 = 'x';
	private static final char PLAYER_2 = 'y';
	private static final char SPACE = ' ';

	public int determineOutcome(String doors, int trophy) {
		char[] passage = new char[2 * doors.length() + 1];
		Set<Character> colorsChosen = new HashSet<Character>(); 

		int p1 = 1;
		int p2 = passage.length - 2;

		Arrays.fill(passage, SPACE);
		passage[0] = PLAYER_1;
		passage[passage.length - 1] = PLAYER_2;

		for (int i = 0; i < doors.length(); i++) {
			passage[2 * i + 1] = doors.charAt(i);
		}

		passage[2 * trophy] = TROPHY;
		// Player 1

		char move;

		boolean w1 = false;
		boolean w2 = false;

		while (true) {
			// move player 1
			move = passage[p1];
			
			for (int i = 0; i <passage.length; i++) {
				if (passage[i] == move && passage[i] != SPACE) {
					colorsChosen.add(passage[i]);
					passage[i] = SPACE;
				}
			}
					
			while (passage[p1] == SPACE) {
				if (passage[p1+1] == TROPHY) {
					w1 = true;
				}
				p1++;
			}

			while (passage[p2] == SPACE) {
				if (passage[p2-1] == TROPHY) {
					w2 = true;
				}
				p2--;
			}

			if (w1 || w2) {
				break;
			}

			// move player 2
			move = passage[p2];
			for (int i = 0; i <passage.length; i++) {
				if (passage[i] == move && passage[i] != SPACE) {
					colorsChosen.add(passage[i]);
					passage[i] = SPACE;
				}
			}

			while (passage[p1] == SPACE) {
				if (passage[p1+1] == TROPHY) {
					w1 = true;
				}
				p1++;
			}

			while (passage[p2] == SPACE) {
				if (passage[p2-1] == TROPHY) {
					w2 = true;
				}
				p2--;
			}

			if (w1 || w2) {
				break;
			}
		}

		if (w1 && w2) {
			return 0;
		} else if (w1) {
			return colorsChosen.size();
		} else {
			return - colorsChosen.size();
		}

	}

}

package com.lam.coder.codility.tmp;

/**
 * 
 * @author Ludoviko Azuaje
 *
 * https://codility.com/c/run/demoFF96C5-CV9
 * 
 *  Score: 70/100. 
 *  
 *  Correct functionality, problems with scalability. 
 *
 */

import com.lam.annotation.Note;

@Note(note = "Tested", tested=true)
public class BallSwitch {

	private int rightWayout;
	
	public int[][] findTraverse(int[][] a) {
		int rows = a.length;
		int columns = a[0].length;
		
		int row = 0;
		int column = 0;

		boolean exit = false;
		boolean rowMove = false;
		boolean columnMove = false;
		
		while ( ! exit ) {
			if ( a[row][column] > 0 ) {
				a[row][column++] = -1;
				columnMove = true;
				rowMove = false;
			} else if ( a[row][column] < 0 ) {
				a[row++][column] = 1;
				rowMove = true;
				columnMove = false;
			} else {
				if (columnMove) {
					column++;
				}  
				if (rowMove) {
					row++;
				}
			};
			
			if ( row == rows  ||  column == columns ) {
				exit = true;
			};
		}

		if (column == columns - 1  && row == rows && rowMove) {
			this.rightWayout = 1;
		} else {
			this.rightWayout = 0;
		}
		
		return a;
	};
	
	public int solution(int[][]a, int ballsInserted) {
		int count = 0;
		
		for (int i = 0; i < ballsInserted; i++) {
			a = this.findTraverse(a);
			count += this.rightWayout;
		}
		return count;
	}
}

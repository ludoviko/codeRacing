package com.lam.coder.topCoder;

import java.util.Arrays;

public class ChessboardPattern {
	public static final char X = 'X';
	public static final char DOT = '.';

	public String[] makeChessboard(int rows, int columns) {
		StringBuilder[] data = new StringBuilder[rows];
		String[] strings = new String[rows];

		Arrays.fill(strings, "");

		for (int r = 0; r < rows; r++) {
			data[rows - r - 1] = new StringBuilder();
			for (int c = 0; c < columns; c++) {
				if ( (c + r)  % 2 == 0  ) {
					data[rows - r - 1].append(DOT);
				} else {
					data[rows - r - 1].append(X);
				}
			}
		}

		for (int i = 0; i < data.length; i++) {
			strings[i] = data[i].toString();
		}

		return strings;
	}
}

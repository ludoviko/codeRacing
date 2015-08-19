package com.lam.coder.topCoder;

import java.util.Arrays;

public class WordFinder {
	private static final String NOT_FOUND = "Not Found";

	// Walk-through example:
	// Suppose that puzzle contained the following elements:
	// HGFRUITEZYXL
	// CRWPWQNVUTEO
	// AAAILUIDOMYP
	// EPKERUAFOBCF
	// PELPPAMNGJLK
	//
	// Further, suppose the words to find are the following words:
	// [FRUIT, APPLE, GRAPE, PEACH, MANGO, PEAR, PLUM, KIWI, PRUNE, LEMON]
	//
	// FRUIT is located (horizontally) in the 1st row, beginning at the 3rd
	// column,
	// so its location is 1,3.
	// APPLE is located (horizontally backwards) in the last (5th) row,
	// beginning
	// at the 6th column, so its location is 5,6.
	// GRAPE is located (vertically) in the 1st row, beginning at the 2nd
	// column,
	// so its location is 1,2.
	// PEACH is located (vertically backwards) in the last (5th) row, beginning
	// at
	// the 1st column, so its location is 5,1.
	// MANGO is not located in the puzzle, so its location is "Not Found".
	// PEAR is located (diagonally) in the last (5th) row, beginning at the 5th
	// column, so its location is 5,5.
	// PLUM is located (diagonally) in the 2nd row, beginning at the 4th column,
	// so
	// its location is 2,4.
	// KIWI is located (diagonally) in the 4th row, beginning at the 3rd column,
	// so
	// its location is 4,3.
	// PRUNE is located (diagonally) in the 5th row, beginning at the 4th
	// column,
	// so its location is 5,4.
	// LEMON is located (diagonally) in the 1st row, beginning at the last
	// (12th)
	// column, so its location is 1,12.
	//
	// The String[] returned would be:
	// [1,3, 5,6, 1,2, 5,1, Not Found, 5,5, 2,4, 4,3, 5,4, 1,12]

	public String[] findWords(String[] puzzle, String[] words) {
		int column; 
		String[] data = new String[words.length];
		String[] trasverse = new String[puzzle[0].length()];
		String[] pointer = puzzle;
		
		Arrays.fill(data, NOT_FOUND);

		// Find horizontally
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < puzzle.length; j++) {
				column = findWordHorizontally(puzzle[j], words[i]);  	
				if (column != -1 ) {
					data[i] = (j + 1) + "," + ++column;
					break;
				}
				column = findWordHorizontallyBackwards(puzzle[j], words[i]);  	
				if (column != -1 ) {
					data[i] = (j + 1) + "," + ++column;
					break;
				}
			}
		}

		String vWord = "";	
		for (int j = 0; j < puzzle[0].length(); j++) {
			for (int i = 0; i < puzzle.length; i++) {
			      vWord += puzzle[i].charAt(j);	
			}
			trasverse[j] = vWord;
			vWord = "";
		}
		
		// Find vertically
		puzzle = trasverse;
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < puzzle.length; j++) {
				column = findWordHorizontally(puzzle[j], words[i]);  	
				if (column != -1 ) {
					data[i] =  ++column  + "," +  (j + 1);
					break;
				}
				column = findWordHorizontallyBackwards(puzzle[j], words[i]);  	
				if (column != -1 ) {
					data[i] =  ++column  + "," +  (j + 1);
					break;
				}
			}
		}
		
		puzzle = pointer;
	
		// Find diagonally
		String p;
		
		p = "";
		int a = 0; int b = 0;

		for (int w = 0; w < words.length; w++) {
			out:	for (int i = 0; i < puzzle.length; i++) {
				for (int j = 0; j < puzzle[0].length(); j++) {
					a = i;
					b = j;
					while (a  < puzzle.length  && b  < puzzle[0].length()  ) {
						p += puzzle[a].charAt(b);
						System.out.print(puzzle[a].charAt(b));
						a++;
						b++;
					}
					System.out.println();
					int index = p.indexOf(words[w]);
					p = "";
					if (index > -1) {
					  System.out.println(words[w]  + "/" + index + "/" + (i + index) + "/" +  (j  + index )+ "/");
					  data[i] =  (i + index + 1)  + "," +  (j + 1);
					  break out;
					}
				}
			}
		}


		puzzle = trasverse;
		p = "";
		a = 0; 
		b = 0;
   
		for (int w = 0; w < words.length; w++) {
			out:	for (int i = 0; i < puzzle.length; i++) {
				for (int j = 0; j < puzzle[0].length(); j++) {
					a = i;
					b = j;
					while (a  < puzzle.length  && b  < puzzle[0].length()  ) {
						p += puzzle[a].charAt(b);
						System.out.print(puzzle[a].charAt(b));
						a++;
						b++;
					}
					System.out.println();
					int index = p.indexOf(words[w]);
					p = "";
					if (index > -1) {
					  System.out.println(words[w]  + "/" + index + "/" + (i + index) + "/" +  (j  + index )+ "/");
					  data[i] =  (i + index + 1)  + "," +  (j + 1);
					  break out;
					}
				}
			}
		}

		
		return null;
	}

	private int findWordHorizontally(String line, String word) {
		return search(line, word); 
	}

	private int findWordHorizontallyBackwards(String line, String word) {
		StringBuilder back = new StringBuilder(word);
		int column = search(line, back.reverse().toString());
		
		if (column > -1) {
			column += word.length() - 1;
		}
		
		return column; 
	}

	private int search(String line, String pattern) {
		return line.indexOf(pattern);
	}
	
	
	public static void main(String[] args) {
	
		String[] puzzle = new String[] { "CASA", "AROS","SADA","ORAS"};
		
		int a = 0; int b = 0;
		String word = "RD";
		String p = "";
		
out:	for (int i = 0; i < puzzle.length; i++) {
			for (int j = 0; j < puzzle[0].length(); j++) {
				a = i;
				b = j;
				while (a  < puzzle.length  && b  < puzzle[0].length()  ) {
					p += puzzle[a].charAt(b);
					System.out.print(puzzle[a].charAt(b));
					a++;
					b++;
				}
				System.out.println();
				int index = p.indexOf(word);
				p = "";
				if (index > -1) {
				  System.out.println(word  + "/" + index + "/" + (i + index) + "/" +  (j  + index )+ "/");
				  break out;
				}
			}
		}
		
		
	}

}

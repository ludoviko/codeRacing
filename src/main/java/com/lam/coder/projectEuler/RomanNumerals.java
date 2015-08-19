package com.lam.coder.projectEuler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.lam.utilString.RomanNumber;

/**
 * 
 * @author Usuario
 * 
 *         Problem 89: Roman numerals
 * 
 *         The rules for writing Roman numerals allow for many ways of writing
 *         each number (see About Roman Numerals...). However, there is always a
 *         "best" way of writing a particular number.
 * 
 *         For example, the following represent all of the legitimate ways of
 *         writing the number sixteen:
 * 
 *         IIIIIIIIIIIIIIII VIIIIIIIIIII VVIIIIII XIIIIII VVVI XVI
 * 
 *         The last example being considered the most efficient, as it uses the
 *         least number of numerals.
 * 
 *         The 11K text file, roman.txt (right click and 'Save Link/Target
 *         As...'), contains one thousand numbers written in valid, but not
 *         necessarily minimal, Roman numerals; that is, they are arranged in
 *         descending units and obey the subtractive pair rule (see About Roman
 *         Numerals... for the definitive rules for this problem).
 * 
 *         Find the number of characters saved by writing each of these in their
 *         minimal form.
 * 
 *         Note: You can assume that all the Roman numerals in the file contain
 *         no more than four consecutive identical units.
 *         
 *         Answer: 743.
 */

// For the first 30, I get a savings of 14 characters.
public class RomanNumerals {
	private static final String DataIn = "src/main/java/com/lam/coder/projectEuler/dataIn/roman.txt";
	public static int find() throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader(DataIn));

		int decimal = 0;
		String line = "";
		String roman;
        int count = 0;
        int i = 0;
        
		while ((line = reader.readLine()) != null) {
			decimal = Integer.parseInt(RomanNumber.getDecimal(line));
			roman = RomanNumber.getRoman(decimal);
			count += line.trim().length() - roman.length();
			i++;
		}
		
		reader.close();
		return count;
	}

	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println(RomanNumerals.find());
	}
}

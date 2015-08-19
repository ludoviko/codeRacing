package com.lam.coder.usaco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Name That Number
 * 
 *         Among the large Wisconsin cattle ranchers, it is customary to brand
 *         cows with serial numbers to please the Accounting Department. The cow
 *         hands don't appreciate the advantage of this filing system, though,
 *         and wish to call the members of their herd by a pleasing name rather
 *         than saying, "C'mon, #4734, get along."
 * 
 *         Help the poor cowhands out by writing a program that will translate
 *         the brand serial number of a cow into possible names uniquely
 *         associated with that serial number. Since the cow hands all have
 *         cellular saddle phones these days, use the standard Touch-Tone(R)
 *         telephone keypad mapping to get from numbers to letters (except for
 *         "Q" and "Z"):
 * 
 *         2: A,B,C 5: J,K,L 8: T,U,V 3: D,E,F 6: M,N,O 9: W,X,Y 4: G,H,I 7:
 *         P,R,S
 * 
 *         Acceptable names for cattle are provided to you in a file named
 *         "dict.txt", which contains a list of fewer than 5,000 acceptable
 *         cattle names (all letters capitalized). Take a cow's brand number and
 *         report which of all the possible words to which that number maps are
 *         in the given dictionary which is supplied as dict.txt in the grading
 *         environment (and is sorted into ascending order).
 * 
 *         For instance, the brand number 4734 produces all the following names:
 * 
 *         GPDG GPDH GPDI GPEG GPEH GPEI GPFG GPFH GPFI GRDG GRDH GRDI GREG GREH
 *         GREI GRFG GRFH GRFI GSDG GSDH GSDI GSEG GSEH GSEI GSFG GSFH GSFI HPDG
 *         HPDH HPDI HPEG HPEH HPEI HPFG HPFH HPFI HRDG HRDH HRDI HREG HREH HREI
 *         HRFG HRFH HRFI HSDG HSDH HSDI HSEG HSEH HSEI HSFG HSFH HSFI IPDG IPDH
 *         IPDI IPEG IPEH IPEI IPFG IPFH IPFI IRDG IRDH IRDI IREG IREH IREI IRFG
 *         IRFH IRFI ISDG ISDH ISDI ISEG ISEH ISEI ISFG ISFH ISFI
 * 
 *         As it happens, the only one of these 81 names that is in the list of
 *         valid names is "GREG".
 * 
 *         Write a program that is given the brand number of a cow and prints
 *         all the valid names that can be generated from that brand number or
 *         ``NONE'' if there are no valid names. Serial numbers can be as many
 *         as a dozen digits long. PROGRAM NAME: namenum INPUT FORMAT A single
 *         line with a number from 1 through 12 digits in length. SAMPLE INPUT
 *         (file namenum.in)
 * 
 *         4734
 * 
 *         OUTPUT FORMAT A list of valid names that can be generated from the
 *         input, one per line, in ascending alphabetical order. SAMPLE OUTPUT
 *         (file namenum.out)
 * 
 *         GREG
 */

/*
 * ID: ludovik1 LANG: JAVA TASK: NameThatNumber
 */

public class NameThatNumber {
	public static final String NONE = "NONE";

	public static final String DirIn =  ".src/main/java/com/lam/coder/usaco/dataIn/";
	public static final String DirOut = ".src/main/java/com/lam/coder/usaco/dataOut/";

	public static final String NamesFile = DirIn + "namenumdict.txt";
	public static final String DataIn = DirIn
			+ NameThatNumber.class.getSimpleName() + ".in";
	public static final String DataOut = DirOut
			+ NameThatNumber.class.getSimpleName() + ".out";

	private String dirIn;
	private String dirOut;

	private Map<Character, Integer> numberMap;
	private List<String> names;
	private List<String> matches;

	public NameThatNumber() {
		new NameThatNumber(DataIn, DirOut);
	}

	public NameThatNumber(String dirIn, String dirOut) {
		this.dirIn = dirIn;
		this.dirOut = dirOut;
		numberMap = new HashMap<Character, Integer>();
		// Skip Q and Z letters.
		numberMap.put('A', 2);
		numberMap.put('B', 2);
		numberMap.put('C', 2);
		numberMap.put('D', 3);
		numberMap.put('E', 3);
		numberMap.put('F', 3);
		numberMap.put('G', 4);
		numberMap.put('H', 4);
		numberMap.put('I', 4);
		numberMap.put('J', 5);
		numberMap.put('K', 5);
		numberMap.put('L', 5);
		numberMap.put('M', 6);
		numberMap.put('N', 6);
		numberMap.put('O', 6);
		numberMap.put('P', 7);
		numberMap.put('R', 7);
		numberMap.put('S', 7);
		numberMap.put('T', 8);
		numberMap.put('U', 8);
		numberMap.put('V', 8);
		numberMap.put('W', 9);
		numberMap.put('X', 9);
		numberMap.put('Y', 9);
		names = new ArrayList<String>();
		matches = new ArrayList<String>();
		loadNames();
	}


	public void findMatches(String number) {
		matches.clear();
		for (int i = 0; i < names.size(); i++) {
			if (this.translate(names.get(i)).equals(new BigInteger(number))) {
				matches.add(names.get(i));
			}
		}

		if (matches.isEmpty()) {
			matches.add(NONE);
		}
	}

	private BigInteger translate(String word) {
		String translation = "";

		for (int i = 0; i < word.length(); i++) {
			// Skip Q and Z letters.
			if (word.charAt(i) != 'Q' && word.charAt(i) != 'Z') {
				translation += numberMap.get(word.charAt(i));
			}
		}
		return new BigInteger(translation);
	}

	private void loadNames() {
		File file = new File(NamesFile);
		String line = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));

			while ((line = reader.readLine()) != null) {
				names.add(line);
			}

			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<String> getMatches() {
		return matches;
	}

	public static void main(String[] args) throws IOException {
		NameThatNumber nameIt = new NameThatNumber();

		BufferedReader read = new BufferedReader(new FileReader(DataIn));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				DataOut)));

		String number = read.readLine();

		nameIt.findMatches(number);

		for (int i = 0; i < nameIt.getMatches().size(); i++) {
			out.println(nameIt.getMatches().get(i));
		}

		read.close();
		out.close();

		System.exit(0);
	}
}

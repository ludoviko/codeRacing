package com.lam.coder.projectEuler;

import com.lam.utilIo.ReadData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author LAzuaje
 * 
 *         Problem 79: Passcode derivation
 * 
 *         A common security method used for online banking is to ask the user
 *         for three random characters from a passcode. For example, if the
 *         passcode was 531278, they may ask for the 2nd, 3rd, and 5th
 *         characters; the expected reply would be: 317.
 * 
 *         The text file, keylog.txt, contains fifty successful login attempts.
 * 
 *         Given that the three characters are always asked for in order,
 *         analyse the file so as to determine the shortest possible secret
 *         passcode of unknown length.
 * 
 *         Answer: 73162890.
 */

public class PasscodeDerivation {
	public final String PathToFile = "src/main/java/com/lam/coder/projectEuler/dataIn/keylog.txt";
	public List<String> codes;

	public PasscodeDerivation() {
		this.codes = new ArrayList<String>();
		this.loadData(this.codes, this.PathToFile);
	}

	private void loadData(List<String> list, String pathToFile) {
		ReadData data = new ReadData(list, pathToFile);
		data.loadData();
	}

	public String find() {
		String password = "";
		String code;

		List<String> codesCopy = new ArrayList<String>(this.codes);
		List<String> codesD = new ArrayList<String>();

		Set<Integer> set0 = new TreeSet<Integer>();
		Set<Integer> set1 = new TreeSet<Integer>();

		while (true) {
			for (int i = 0; i < codesCopy.size(); i++) {
				code = codesCopy.get(i);
				set0.add(Integer.parseInt(code.charAt(0) + ""));
				set1.add(Integer.parseInt(code.charAt(1) + ""));
			}

			password += this.search(set0, set1);
			if (set1.size() == 1) {
				password += set1.iterator().next();
				break;
			}

			for (int i = 0; i < this.codes.size(); i++) {
				code = this.codes.get(i);
				if (code.startsWith(password.substring(password.length() - 1))) {
					codesD.add(code.substring(1));
				}
			}

			codesCopy = new ArrayList<String>(codesD);
			codesD.clear();
			set0.clear();
			set1.clear();
		}
		return password;
	}

	private String search(Set<Integer> set0, Set<Integer> set1) {
		String digit = "";
		Set<Integer> set00 = new TreeSet<Integer>(set0);

		Iterator<Integer> itera = set00.iterator();

		Integer i = null;
		while (itera.hasNext()) {
			i = itera.next();
			if (!set1.contains(i)) {
				break;
			}
		}

		digit += i;
		return digit;
	}

	public static void main(String[] args) {
		PasscodeDerivation derivation = new PasscodeDerivation();
		System.out.println(derivation.find());
	}
}

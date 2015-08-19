package com.lam.coder.topCoder;

public class BloggoHyphenate {
	public String[] correct(String[] dictionary, String[] candidates) {
		String[] output = new String[candidates.length];

		int i = 0;
		for (int d = i; d < dictionary.length; d++) {
			for (int c = 0; c < candidates.length; c++) {
				if (dictionary[d].replaceAll(" ", "").equals(
						candidates[c].replaceAll("-", ""))) {
					if ( matches(dictionary[d], candidates[c]) ) {
						output[c] = "correct";
					} else {
						output[c] = findPosition(dictionary[d], candidates[c]);
					}
				} else {
				}
			}
			i++;
		}
		return output;
	}

	private static boolean matches(String pattern, String word) {
		int w = word.indexOf('-');
		int p = 0;

		for (int i = 0; i < pattern.length(); i++) {
			if (pattern.charAt(i) != ' ') {
				p++;
			} else {
				if ( w == p ) {
					return true;
				}
			}
		}
		return false;
	}
	
	private static String findPosition(String pattern, String word) {
		int w = word.indexOf('-');
		int p = 0;
		int dif = word.length();
		int index = -1;

		for (int i = 0; i < pattern.length(); i++) {
			if (pattern.charAt(i) != ' ') {
				p++;
			} else {
				if (Math.abs(p - w) < dif) {
					dif = Math.abs(p - w);
					index = p;
				}
			}
		}

		word = word.replace("-", "");
		if (index > -1) {
			word = word.substring(0, index) + '-' + word.substring(index);
		}
		
		return word;
	}
}

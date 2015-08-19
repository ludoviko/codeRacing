package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.List;

public class Spamatronic {
	public static final int THRESHOLD = 75;

	public int[] filter(String[] knownSpam, String[] mail) {
		List<String> words = new ArrayList<String>();
		List<Integer> indexes = new ArrayList<Integer>();
		
		StringBuilder word = new StringBuilder();

		for (int i = 0; i < knownSpam.length; i++) {
			for (int j = 0; j < knownSpam[i].length(); j++) {
				if (knownSpam[i].toLowerCase().charAt(j) >= 'a'
						&& knownSpam[i].toLowerCase().charAt(j) <= 'z') {
					word.append(knownSpam[i].toLowerCase().charAt(j));
				} else {
					if (word.length() > 0) {
						words.add(word.toString());
						word.delete(0, word.length());
					}
				}
			}
		}

		int count = 0;
		int wc = 0;
		
		for (int i = 0; i < mail.length; i++) {
			for (int j = 0; j < mail[i].length(); j++) {
				if (mail[i].toLowerCase().charAt(j) >= 'a'
						&& mail[i].toLowerCase().charAt(j) <= 'z') {
					word.append(mail[i].toLowerCase().charAt(j));
				} else {
					if (word.length() > 0) {
						wc++;
                        if (words.contains(word.toString())) {
                        	count++;
                        }
						word.delete(0, word.length());
					}
				}
			}
			if ( 100.0 * count / wc < THRESHOLD ) {
				indexes.add(i);
			}
			count = 0;
			wc = 0;
		}

		int[] data = new int[indexes.size()];
		for (int i = 0; i < indexes.size(); i++) {
			data[i] = indexes.get(i);
		}
		
		return data;
	}

}

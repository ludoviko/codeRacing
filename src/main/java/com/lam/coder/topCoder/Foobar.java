package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.List;

public class Foobar {

	private List<String> words;

	public Foobar() {
		words = new ArrayList<String>();
		words.add("heck");
		words.add("gosh");
		words.add("dang");
		words.add("shucks");
		words.add("fooey");
		words.add("snafu");
		words.add("fubar");
	}
	
	
	public 	String censor(String plain, String code, String text) {
		String stars = "*";
		
		for (int i = 0; i < code.length(); i++) {
			text = text.replace(code.charAt(i), plain.charAt(i));
		}
		
		
		
		for (int i = 0; i < words.size(); i++) {
			
			stars = "*";
			for (int j = 1; j < words.get(i).length(); j++) {
				stars += "*";
			}
			
			text = text.replace(words.get(i), stars );
		}
		
		
		return text;
	}

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

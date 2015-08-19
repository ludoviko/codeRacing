package com.lam.coder.topCoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeRed {
	private static final String REGEX = "red";	
	
	public int count(String string) {
			Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(string);
	        
	        int i = 0;
	        while (matcher.find()) {
	        	i++;
	        }

		return i;
	}
}

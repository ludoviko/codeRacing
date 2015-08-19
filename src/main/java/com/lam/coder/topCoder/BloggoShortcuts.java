package com.lam.coder.topCoder;

public class BloggoShortcuts {
	public static final char ASTERISK = '*';
	public static final char UNDERSCORE  = '_';
	public static final String B_OPEN  = "<b>"; 
	public static final String B_CLOSE  = "</b>";
	public static final String I_OPEN  = "<i>"; 
	public static final String I_CLOSE  = "</i>";
	
	public 	String expand(String text) {
		int stars = 0;
		int underscores = 0;
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ASTERISK) {
				stars++;
				if ( stars % 2  == 1) {
					builder.append(B_OPEN);
				} else {
					builder.append(B_CLOSE);
				}
			} else if (text.charAt(i) == UNDERSCORE ) {
				underscores++;	
				if ( underscores % 2  == 1) {
					builder.append(I_OPEN);
				} else {
					builder.append(I_CLOSE);
				}
			} else {
				builder.append(text.charAt(i));
			}
			
		}
		
		return builder.toString();
	}
}

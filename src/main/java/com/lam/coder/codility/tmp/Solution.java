package com.lam.coder.codility.tmp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Score: 

public class Solution {

	public int solution(String string) {
		String sub;
		int count = 0;
		int max = 0;
		int aux = 0;
		
		for (int i = 0; i < string.length(); i++) {
			count = 0;
			sub = string.substring(0, i + 1);

			if (i < 1) {
				Pattern p = Pattern.compile(sub);
				Matcher m = p.matcher(string);

				while (m.find()) {
					count++;
				}
			} else if ( string.charAt(i -1) !=  string.charAt(i)) {
				
				
				while (string.substring(aux).contains(sub)) {
					count++;
					aux += 2; 
				}
				aux = 0;
			} else {
				while (string.substring(aux).contains(sub)) {
					count++;
					aux += 1; 
				}
				aux = 0;
			}
			count *= sub.length();
			if (count > max) {
				max = count;
			}

		}

		return max;

	}


}

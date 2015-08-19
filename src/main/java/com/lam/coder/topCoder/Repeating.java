package com.lam.coder.topCoder;

public class Repeating {

	/*
	 * Examples:
(1) decimal="0.2500000000": return "0.25(0)"
(2) decimal="0.8333333333": return "0.8(3)"
(3) decimal="0.0323232323": return "0.0(32)" (Because the 10th digit is "3" and
the repeating part starts with "3")
(4) decimal="0.0714285714": return "0.0(714285)"
(5) decimal="0.1176470588": return "0.11764705(8)" ("8" is repeated through the
9th and 10th digit)
(6) decimal="0.1588235290": return "0.1588235290" (There is no possible
repetition, according to the rules above)
	 */
	public String findRepeating(String string) {
		// "0.8333333333"
		// "0.3333333333"
	    int index = 0; 
	    int jndex = 0; 
		boolean repeated = false;
		
		for (int i = 1; i < string.length(); i++) {
			for (int j = 2; j < string.length(); j++) {
				if (string.substring(j, j + i).equals(
						string.substring(j + i, i + j + 1))) {
					if (! repeated) {
						jndex = j;
						index = i; 
					}
					repeated = true;

				} else {
					repeated = false;
					
				}

			}
		}

		return string.substring(0, jndex) + "(" +  string.substring(jndex, index) + ")";
	}
}

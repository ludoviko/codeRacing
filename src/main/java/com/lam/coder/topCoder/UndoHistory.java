package com.lam.coder.topCoder;

public class UndoHistory {

//	The total number of button presses was 8 (typing "tomorrow") + 1 (Enter) + 2 (mouse) + 6 (typing "pcoder") + 1 (Enter) = 18
	
	private static final int CLICKS = 2;
	private static final int ENTER = 1;
	
	public int minPresses(String[] lines) {
		
		int total = lines[0].length() + ENTER;
		String sub;
		
		
		for (int i = 1; i < lines.length; i++) {
			boolean isSub = false;
			for (int j = (Math.min(lines[i].length(), lines[i-1].length())); j > 1; j--) {
				sub = lines[i -1].substring(0, j );
				
				if (lines[i].contains(sub)) {
					total += CLICKS + ENTER + lines[i].length() - sub.length();
					isSub = true;
					break;
				}
			}
			if (! isSub) {
				total += ENTER + lines[i].length();
			}
			
		}
		
		return total;
	}

}

package com.lam.coder.topCoder;

public class MessageMess {

	public static final String AMBIGUOUS = "AMBIGUOUS!";
	public static final String IMPOSSIBLE = "IMPOSSIBLE!";

	public String restore(String[] dictionary, String message) {
		char space = ' ';
		// assertEquals("HI YOU SAY HI", message.restore(new String[] {"HI",
		// "YOU", "SAY"}, "HIYOUSAYHI"));

		// Create a class MessageMess that contains a method restore that takes
		// a String[] dictionary of possible words and a String message as
		// inputs. It returns the message with single spaces inserted to divide
		// the message into words from the dictionary. If there is more than one
		// way to insert spaces, it returns "AMBIGUOUS!" If there is no way to
		// insert spaces, it returns "IMPOSSIBLE!" The return should never have
		// any leading or trailing spaces.

		StringBuilder output = new StringBuilder();
		int LEN = message.length();
		int index;
		
		if (countAmbigous(dictionary, message)) {
			return AMBIGUOUS;
		} else {
			while (message.length() > 0) {
				for (int i = 0; i < dictionary.length; i++) {
					if (message.contains(dictionary[i])) {
						output.append(dictionary[i]);
						output.append(space);
						index = message.indexOf(dictionary[i]);
						message = message.substring(index
								+ dictionary[i].length());
					}
				}
			}
			
		}

		return output.toString().trim();
	}

	private boolean countAmbigous(String[] dictionary, String message) {
		int count = 0;

		for (int i = 0; i < dictionary.length; i++) {
			if (message.contains(dictionary[i])) {
				count++;
			} else {
			}
		}

		if (count > 1) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

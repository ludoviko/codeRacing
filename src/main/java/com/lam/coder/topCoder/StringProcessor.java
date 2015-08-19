package com.lam.coder.topCoder;

public class StringProcessor {
	// Movement commands (movement keys in IV editor)
	public static final char ZERO = '0';
	public static final char LAST = '$';
	public static final char L = 'l';
	public static final char H = 'h';
	// Processing commands (command keys in IV editor)
	public static final char DELETE = 'x';
	public static final char INSERT = 'i';
	public static final char SWAP = 's';
	public static final char UNDO = 'u';

	public String processString(String data, String commands) {
		char command, command_0;
		int position = 0;
		int position_0;
		boolean action = true;

		for (int i = 0; i < commands.length(); i++) {
			command = commands.charAt(i);
			switch (command) {
			case ZERO:
				position = 0;
				action = true;
				break;
			case LAST:
				position = data.length();
				action = true;
				break;
			case L:
				action = false;
				if (position < data.length()) {
					position++;
					action = true;
				}
				break;
			case H:
				action = false;
				if (position > 0) {
					position--;
					action = true;
				}
				break;
			case DELETE:
				action = false;
				if (position == data.length()) {
				} else {
					data = data.substring(0, position)
							+ data.substring(position + 1);
					action = true;
				}
				break;
			case INSERT:
				if (position == data.length()) {
					data = data + commands.charAt(++i);
				} else {
					data = data.substring(0, position) + commands.charAt(++i)
							+ data.substring(position + 1);
				}
				action = true;
				break;
			case SWAP:
				action = false;
				if (position >= data.length() - 1) {
				} else {
					char current = data.charAt(position);
					char right = data.charAt(position + 1);

					data = data.substring(0, position) + right + current
							+ data.substring(position + 2);
					action = true;
				}
				break;
			case UNDO:
               // XXX to complex.
				// undo the most recent processed command that is not undo, if
				// there is such a
				// command. Undo restores the String and pointer location to the
				// state before the
				// last non-undo command was processed. Remember: Sometimes a
				// command is given,
				// but not processed (because, for example, the end of the
				// String has been
				// reached). 'x', 's', 'l', 'h' may be given but not processed.
				// '0', '$', 'ic'
				// are always processed when given.
				break;

			default:
				break;
			}
			command_0 = command;
			position_0 = position; 
		}

		return data;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

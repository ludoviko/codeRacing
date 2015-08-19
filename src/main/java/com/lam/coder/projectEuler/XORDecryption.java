package com.lam.coder.projectEuler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Ludoviko Azuaje
 * 
 *         Problem 59: XOR decryption
 * 
 *         Each character on a computer is assigned a unique code and the
 *         preferred standard is ASCII (American Standard Code for Information
 *         Interchange). For example, uppercase A = 65, asterisk (*) = 42, and
 *         lowercase k = 107.
 * 
 *         A modern encryption method is to take a text file, convert the bytes
 *         to ASCII, then XOR each byte with a given value, taken from a secret
 *         key. The advantage with the XOR function is that using the same
 *         encryption key on the cipher text, restores the plain text; for
 *         example, 65 XOR 42 = 107, then 107 XOR 42 = 65.
 * 
 *         For unbreakable encryption, the key is the same length as the plain
 *         text message, and the key is made up of random bytes. The user would
 *         keep the encrypted message and the encryption key in different
 *         locations, and without both "halves", it is impossible to decrypt the
 *         message.
 * 
 *         Unfortunately, this method is impractical for most users, so the
 *         modified method is to use a password as a key. If the password is
 *         shorter than the message, which is likely, the key is repeated
 *         cyclically throughout the message. The balance for this method is
 *         using a sufficiently long password key for security, but short enough
 *         to be memorable.
 * 
 *         Your task has been made easy, as the encryption key consists of three
 *         lower case characters. Using cipher1.txt (right click and 'Save
 *         Link/Target As...'), a file containing the encrypted ASCII codes, and
 *         the knowledge that the plain text must contain common English words,
 *         decrypt the message and find the sum of the ASCII values in the
 *         original text.
 * 
 *         Answer: 107359, three letter key: god.
 */

public class XORDecryption {
	public static final String DirIn = ".src/main/java/com/lam/coder/projectEuler/dataIn/";
	public static final String DataIn = DirIn + "cipher1.txt";
	public static final String DirOut = ".src/main/java/com/lam/coder/projectEuler/dataOut/";
	public static final String DataOut = DirOut
			+ XORDecryption.class.getSimpleName() + ".out";

	private static String[] readData() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(DataIn));
		String line = reader.readLine();
		String[] data = line.split(",");
		reader.close();
		return data;
	}

	public static int find() throws IOException {
		int i, j, k, d, r, count;
		String key;
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				DataOut)));

		String[] data = readData();
		StringBuilder line = new StringBuilder();

		int remainder = data.length % 3;

		exit: for (i = 'a'; i <= 'z'; i++) {
			for (j = 'a'; j <= 'z'; j++) {
				for (k = 'a'; k <= 'z'; k++) {
					for (d = 0; d < data.length - 2; d = d + 3) {
						line.append(new Character((char) ((char) Integer
								.parseInt(data[d]) ^ i)));
						line.append(new Character((char) ((char) Integer
								.parseInt(data[d + 1]) ^ j)));
						line.append(new Character((char) ((char) Integer
								.parseInt(data[d + 2]) ^ k)));
					}
					r = 0;
					while (r < remainder) {
						if (r == 0) {
							line.append(new Character((char) ((char) Integer
									.parseInt(data[d + r]) ^ i)));
						} else {
							line.append(new Character((char) ((char) Integer
									.parseInt(data[d + r]) ^ j)));
						}
						r++;
					}
					if (line.toString().contains("Gospel") && true) {
						key = (char) i + "" + (char) j + "" + (char) k;
						// System.out.println(line);
						out.println(line);
						break exit;
					} else {
					}
					line.delete(0, line.length());
				}
			}
		}
		out.close();

		count = findSumChars(line.toString());
		return count;
	}

	private static int findSumChars(String string) {
		int count = 0;

		for (int i = 0; i < string.length(); i++) {
			count += string.charAt(i);
		}
		return count;
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
//		int count = find();
//		System.out.println("Count: " + count);
		System.out.println(65 ^ 42);
//		65 XOR 42 = 107
	}
}

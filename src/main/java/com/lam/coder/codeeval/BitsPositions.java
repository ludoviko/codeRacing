package com.lam.coder.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author L.Azuaje
 *
 *         Given a number n and two integers p1,p2 determine if the bits in
 *         position p1 and p2 are the same or not. Positions p1 and p2 are 1
 *         based.
 * 
 *         INPUT SAMPLE:
 * 
 *         The first argument will be a path to a filename containing a comma
 *         separated list of 3 integers, one list per line. E.g.
 * 
 *         86,2,3 
 *         125,1,2 
 *         
 *         OUTPUT SAMPLE:
 * 
 *         Print to stdout, 'true'(lowercase) if the bits are the same, else
 *         'false'(lowercase). E.g.
 * 
 *         true 
 *         false
 * 
 *          
 */

public class BitsPositions {
	public boolean find(int n, int p1, int p2) {

		// Position zero-based.
		p1--;
		p2--;

		int j = this.findBit(n, p1) ^ this.findBit(n, p2);
		j = j == 0 ? 1 : 0;
		return j == 1 ? true : false;
	}

	public byte findBit(int n, int position) {
		// Position zero-based.
		byte i = (byte) ((n >> position) & 1);
		return i;
	}

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] data;

		BitsPositions main = new BitsPositions();

		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			// Process line of input Here
			data = line.split(",");
			System.out.println(main.find(Integer.parseInt(data[0]),
					Integer.parseInt(data[1]), Integer.parseInt(data[2])));
		}

		buffer.close();

	}
}

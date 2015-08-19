package com.lam.coder.topCoder;

public class WindowManager {
	private static char CORNER = '+';
	private static char TOP = '-';
	private static char BORDER = '|';

	public String[] screen(int height, int width, String[] windows) {
		String[] window;
		String[] destination = fillWindowWithSpaces(width, height);
		int w = 0;
		int h = 0;
		int x = 0;
		int y = 0;
		String[] values;
		char filler;

		for (int i = 0; i < windows.length; i++) {
			values = windows[i].split(" ");
			
			y = Integer.parseInt(values[0]);
			x = Integer.parseInt(values[1]);
			h = Integer.parseInt(values[2]);
			w = Integer.parseInt(values[3]);
			filler = values[4].charAt(0);
			
			if ( x < -1 && y < -1 && h + y > height + 2 &&  w + x > width + 2) {
				x = -1;
				y = -1;
				h = height + 2;
				w = width + 2;
			//	System.out.println("Reduction");
			} 
			
			window = new String[h];
			window = this.fillWindow(w, filler, window);
			this.copyArray(x, y, width, height, window, destination);
		}

		return destination;
	}

	private void copyArray(int x, int y, int width, int height,
			String[] source, String[] destination) {
		int yOffset;
		int xOffset;
		int xOffsetMemory;
		int d = x < 0 ? 0 : x;
		int s = y < 0 ? -y : 0;
		yOffset = s;
		xOffset = d;
		xOffsetMemory = xOffset;
		char[] chars;

		if ( y > height && x > width ) {
			  destination = new String[] { " " };  	
		} else if ( source.length + y < 0 && source[0].length() + x < 0 ) {
			  destination = new String[] { " " };  	
		} else {
		
		for (int i = 0; i < (destination.length - xOffsetMemory)
				&& i < source.length; i++) {
			chars = destination[xOffset].toCharArray();

			for (int j = 0; j < destination[0].length()
					&& j < source[0].length() && d < chars.length; j++) {
				chars[d++] = source[s].charAt(j + yOffset);
			}
			d = x < 0 ? 0 : x;
			s++;
			destination[xOffset++] = new String(chars);
		}
		}
	}

	private String[] fillWindow(int width, char filler, String[] window) {
		window[0] = this.findTop(width);
		window[window.length - 1] = this.findTop(width);

		window = this.findLines(width, filler, window);

		return window;
	}

	private String[] fillWindowWithSpaces(int width, int height) {
		String[] window = new String[height];

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < width; i++) {
			builder.append(" ");
		}

		for (int i = 0; i < window.length; i++) {
			window[i] = builder.toString();
		}

		return window;
	}

	private String[] findLines(int width, char filler, String[] window) {
		StringBuilder builder = new StringBuilder();

		builder.append(BORDER);
		
		for (int i = 2; i < width; i++) {
			builder.append(filler);
		}

		builder.append(BORDER);

		for (int i = 1; i < window.length - 1; i++) {
			window[i] = builder.toString();
		}

		return window;
	}

	private String findTop(int width) {
		StringBuilder builder = new StringBuilder();
		
		builder.append(CORNER);
		
		for (int i = 2; i < width; i++) {
			builder.append(TOP);
		}

		builder.append(CORNER);

		return builder.toString();
	}
}

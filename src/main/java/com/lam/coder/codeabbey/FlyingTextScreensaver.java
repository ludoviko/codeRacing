package com.lam.coder.codeabbey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 *
 *
 *
 */

public class FlyingTextScreensaver {
    private int width;
    private int height;
    private int textLen;
    private int x;
    private int y;
    private int velocityX;
    private int velocityY;

    public FlyingTextScreensaver(int width, int height, int textLen) {
        this.width = width;
        this.height = height;
        this.textLen = textLen;
        this.x = 0;
        this.y = 0;
        this.velocityX = 1;
        this.velocityY = 1;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int nextX() {
        this.x += this.velocityX;

        if ( this.x == this.width - this.textLen  ) {
            this.velocityX = -1;
        }  else if (this.x == 0) {
            this.velocityX = 1;
        }

        return this.x;
    }

    public int nextY() {
        this.y += this.velocityY;

        if ( this.y == this.height - 1 ) {
            this.velocityY = -1;
        } else if ( this.y == 0  ){
            this.velocityY = 1;
        }

        return this.y;
    }

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

        int[] data = scanner.nextIntArray();

		FlyingTextScreensaver main = new FlyingTextScreensaver(data[0], data[1], data[2]);

		int upTo = 101;
        for (int i = 0; i < upTo; i++) {
            out.format("%d %d ", main.getX(), main.getY());
            main.nextX();
            main.nextY();
        }

		scanner.reader.close();
		out.close();
	}

	// -----------MyScanner class for faster input----------
	public static class MyScanner {
		BufferedReader reader;

		public MyScanner() {
			this.reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public void close() throws IOException {
			this.reader.close();
		}

		int nextInt() {
			return Integer.parseInt(this.next());
		}

		long nextLong() {
			return Long.parseLong(this.next());
		}

		double nextDouble() {
			return Double.parseDouble(this.next());
		}

		String next() {
			String str = "";
			try {
				str = this.reader.readLine().trim();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		String[] nextStringArray() {
			String[] str = null;
			try {
				str = this.reader.readLine().trim().split(" ");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int[] nextIntArray() {
			String[] data  = nextStringArray();
			int[] a  = new int[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(data[i]);
			}

			return a;
		}

		Integer[] nextIntegerArray() {
			String[] data  = nextStringArray();
			Integer[] a  = new Integer[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(data[i]);
			}

			return a;
		}

		long[] nextLongArray() {
			String[] data  = nextStringArray();
			long[] a  = new long[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Long.parseLong(data[i]);
			}

			return a;
		}

          float[] nextFloatArray() {
            String[] data  = nextStringArray();
            float[] a  = new float[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Float.parseFloat(data[i]);
            }

            return a;
        }

        double[] nextDoubleArray() {
            String[] data  = nextStringArray();
            double[] a  = new double[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Double.parseDouble(data[i]);
            }

            return a;
        }
    }
}


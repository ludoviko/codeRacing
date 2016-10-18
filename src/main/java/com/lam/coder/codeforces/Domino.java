package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: Domino.
 *
 * Codeforces: 353A  #205 Div-2.
 *
 */

public class Domino {
    List<Tuple> tuples;

    public Domino() {
        tuples = new ArrayList<Tuple>();
    }

    public void add(Tuple tuple) {
        tuples.add(tuple);
    }

    public void add(int x, int y) {
        Tuple tuple = new Tuple(x, y);
        tuples.add(tuple);
    }

    public boolean isEven() {
        int xs = 0;
        int ys = 0;

        for (Tuple tuple : tuples) {
            xs += tuple.getX();
            ys += tuple.getY();
        }

        return (xs % 2 == 0) && (ys % 2 == 0);
    }

   public int numberSwaps() {
       int n = 0;

       if (this.isEven()) {
       } else {
           for (int i = 0; i < this.tuples.size() ; i++) {
               this.tuples.get(i).swap();
               if (isEven()) {
                   n++;
                   break;
               } else {
               }
           }
           if (! isEven()) {
               n = -1;
           }
       }

       return n;
   }

    class Tuple {
        private int x,  y;
        public Tuple(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setTuple(int x, int y) {
            this.x = x;
            this.y = x;
        }

        public void swap() {
            int z = x;
            x = y;
            y = z;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public String toString() {
            return "X: " + x + ", Y: " + y;
        }
    }

	
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		Domino main = new Domino();
		int n = scanner.nextInt();

        int[] data;

        for (int i = 0; i < n; i++) {
            data = scanner.nextIntArray();
            main.add(data[0], data[1]);
        }

		out.println(main.numberSwaps());

		scanner.close();
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
	}
}


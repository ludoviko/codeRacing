package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;

/**
 * 
 * @author Solution by L.Azuaje.
 *
 * 490A	Team Olympiad
 *
 */

public class TeamOlympiad {
	
	public static void find(Integer[] data) {
        Map<Integer, Integer> map =TeamOlympiad.getFrequency(data);

        Collection<Integer> list =  map.values();
        int min = findSmallest(list);
        System.out.println(min);

        int one = 0;
        int two = 0;
        int three = 0;

        for (int i = 0; i < min; i++) {
            one = findInteger(data, 1);
            two = findInteger(data, 2);
            three = findInteger(data, 3);

            System.out.format("%d %d %d %n", one, two, three);
        }
    }

    private static Integer findInteger(Integer[] data, Integer element ) {
        int index = -1;

        for (int i = 0; i < data.length ; i++) {
            if (data[i].equals(element)) {
                index = i + 1;
                data[i] = 0;
                break;
            }
        }

        return index;
    }

    private static Integer findSmallest(Collection<Integer> list ) {
        int min = Integer.MAX_VALUE;

        for (Integer i : list ) {
            if (i <= min) {
                min = i;
            }
        }

        return min;
    }

    private static Map<Integer, Integer> getFrequency(Integer[] data) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);

        for (Integer i : data) {
            map.put(i, map.get(i) + 1);
        }

        return map;
    }

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		TeamOlympiad main = new TeamOlympiad();
		
		int n = scanner.nextInt();
        Integer[] data = scanner.nextIntegerArray();

        TeamOlympiad.find(data);

		out.println();

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


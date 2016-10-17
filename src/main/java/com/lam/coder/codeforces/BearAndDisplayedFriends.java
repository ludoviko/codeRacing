package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author 
 *
 *
 *
 */

public class BearAndDisplayedFriends {
	
	public String[]  find(int max, int[] members, String[] queries) {

        List<String> res = new ArrayList<String>();
        List<Integer> onLine = new ArrayList<Integer>();

        for (int i = 0; i < queries.length; i++) {
            int m = members[Integer.parseInt( queries[i].split(" ")[1]) - 1 ];
            if (queries[i].startsWith("1")) {
                if (onLine.isEmpty()) {
                    onLine.add( m );
                } else {
                    if (onLine.size() < max) {
                        int j = -1;
                        for ( j = 0; j < onLine.size() ; j++) {
                            if ( m  >= onLine.get(j)  ) {
                            } else {
                                break;
                            }
                        }
                        onLine.add(j, m);
                    } else {
                        if (onLine.get( 0 ) < m) {
                            onLine.remove(0);
                            int j = -1;
                            for ( j = 0; j < onLine.size() ; j++) {
                                if ( m  >= onLine.get(j)  ) {
                                } else {
                                    break;
                                }
                            }
                            onLine.add(j, m);
                        }
                    }
                }

            } else {
                if (onLine.contains(m)) {
                    res.add("YES");
                } else {
                    res.add("NO");
                }
            }
        }

        return res.toArray(new String[0]);
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		BearAndDisplayedFriends main = new BearAndDisplayedFriends();

        /**
         *
         4 2 8
         300 950 500 200
         1 3
         2 4
         2 3
         1 1
         1 2
         2 1
         2 2
         2 3 4 2 8
         300 950 500 200
         1 3
         2 4
         2 3
         1 1
         1 2
         2 1
         2 2
         2 3
         */

		int data[] = scanner.nextIntArray();
        int members[] = scanner.nextIntArray();
        String[] queries  = new  String[ data[2] ];

        for (int i = 0; i < data[2]; i++) {
            queries[i] = scanner.next();
        }

        String[] strings  = main.find(data[1], members, queries);

        for (String string : strings ) {
            out.println(string);
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
	}
}


/**
 * 
 */
package com.lam.coder.codeabbey;

import com.lam.mathematics.Primes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;


/**
 * @author lazuaje
 *
 */

public class PrimesGenerator {
    private int upTo;
    private long[] array;

    public PrimesGenerator() {
    }

    public long[] getArray() {
        return array;  
    } 

    public void find (int upTo) {
    	this.upTo= upTo;

    	boolean[] primesBool = new boolean[this.upTo + 1];
    	Arrays.fill(primesBool, true);
    	
    	primesBool[0] = false;
    	primesBool[1] = false;
    	
    	int root = (int)Math.sqrt(this.upTo);
    	
    	for (int i = 2; i <=root; i++) {
    		if (primesBool[i]) {
    			for (int j = i*i; j <=this.upTo; j+=i) {
    				primesBool[j] = false;
    			}
    		}
    	};
 
    	int len = 0;
    	for ( int i = 1; i < primesBool.length; i++) {
    		if ( primesBool[i] ) {
    			len++;
    		};
    	};
 
    	array = new long[len];
    	int k = 0;
    	for ( int i = 1; i < primesBool.length; i++) {
    		if ( primesBool[i] ) {
    			array[k++] = i;		
    		};
    	};
    };

    public static void main( String[] args ) throws IOException {
        MyScanner scanner = new MyScanner();
        PrintStream out = System.out;

    	Primes calculate = new Primes();
    	calculate.find(2750159);
    	long[] array = calculate.getArray();

        int n = scanner.nextInt();
        int[] data = scanner.nextIntArray();

        for (int i = 0; i < n; i++) {
            out.format("%d ", array[data[i] - 1]);
        }

        scanner.reader.close();
        out.close();
   }

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

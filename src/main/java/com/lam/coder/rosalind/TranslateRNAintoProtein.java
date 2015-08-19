package com.lam.coder.rosalind;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class TranslateRNAintoProtein {
	
	public Map<String, String> codonsMap;
	
	public TranslateRNAintoProtein() {
		this.codonsMap = new HashMap<String, String>();
		
		this.codonsMap.put("UUU", "F");
		this.codonsMap.put("UUC", "F");
		
		this.codonsMap.put("CUU", "L");
		this.codonsMap.put("CUC", "L");
		this.codonsMap.put("UUA", "L");
		this.codonsMap.put("UUG", "L");
		this.codonsMap.put("CUG", "L");
		this.codonsMap.put("CUA", "L");

		this.codonsMap.put("AUU", "I");
		this.codonsMap.put("AUC", "I");
		this.codonsMap.put("AUA", "I");
		
		this.codonsMap.put("GUU", "V");
		this.codonsMap.put("GUC", "V");
		this.codonsMap.put("GUA", "V");
		this.codonsMap.put("GUG", "V");
		
		this.codonsMap.put("AUG", "M");
		
		this.codonsMap.put("UCU", "S");
		this.codonsMap.put("UCC", "S");
		this.codonsMap.put("UCA", "S");
		this.codonsMap.put("UCG", "S");
		this.codonsMap.put("AGC", "S");
		
		this.codonsMap.put("CCU", "P");
		this.codonsMap.put("CCC", "P");
		this.codonsMap.put("CCG", "P");
		this.codonsMap.put("CCA", "P");

		this.codonsMap.put("ACU", "T");
		this.codonsMap.put("ACC", "T");
		this.codonsMap.put("ACA", "T");
		this.codonsMap.put("ACG", "T");
		
		this.codonsMap.put("GCU", "A");
		this.codonsMap.put("GCC", "A");
		this.codonsMap.put("GCA", "A");
		this.codonsMap.put("GCG", "A");

		this.codonsMap.put("UAU", "Y");
		this.codonsMap.put("UAC", "Y");
		
		this.codonsMap.put("CAU", "H");
		this.codonsMap.put("CAC", "H");

		this.codonsMap.put("AAU", "N");
		this.codonsMap.put("AAC", "N");
		
		this.codonsMap.put("GAU", "D");
		this.codonsMap.put("GAC", "D");

		this.codonsMap.put("CAA", "Q");
		
		this.codonsMap.put("AAA", "K");
		this.codonsMap.put("AAG", "K");
		
		this.codonsMap.put("GAA", "E");
		this.codonsMap.put("GAG", "E");
		
		this.codonsMap.put("CAG", "Q");
		
		this.codonsMap.put("UGU", "C");
		this.codonsMap.put("UGC", "C");

		this.codonsMap.put("CGU", "R");
		this.codonsMap.put("CGC", "R");
		this.codonsMap.put("CGA", "R");
		this.codonsMap.put("AGA", "R");
		this.codonsMap.put("CGG", "R");
		this.codonsMap.put("AGG", "R");
		
		this.codonsMap.put("AGU", "S");
		this.codonsMap.put("UGG", "W");
		
		this.codonsMap.put("GGU", "G");
		this.codonsMap.put("GGC", "G");
		this.codonsMap.put("GGA", "G");
		this.codonsMap.put("GGG", "G");
		
		this.codonsMap.put("UAA", "Stop");
		this.codonsMap.put("UAG", "Stop");
		this.codonsMap.put("UGA", "Stop");
	}
	
	public String find(String string) {
		int len = string.length() / 3;
		
		String key = "";
		String value = "";
		
		StringBuilder data= new StringBuilder();
		
		for (int i = 0; i < len; i++) {
		   key = string.substring(i * 3, i * 3 + 3);
		   value = this.codonsMap.get(key);
		   
		   if (value.equals("Stop")) {
			   break;
		   }
		   
		   data.append(value); 
		}
		
		return data.toString();
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		TranslateRNAintoProtein main = new TranslateRNAintoProtein();
		
		String string = scanner.next();

		out.println(main.find(string));

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

	}
}


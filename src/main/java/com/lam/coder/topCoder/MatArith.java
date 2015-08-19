package com.lam.coder.topCoder;


public class MatArith {

	String[] calculate(String[] a, String[] b, String[] c, String operation) {
		
		int rows = this.checkRows(a);
		int columns = this.checkColumns(a);
		System.out.println("Rows, columns: " + rows + "  " + columns);

		

		return new String[] {"", ""} ;
	};
	
	private int checkRows(String[] a) {
		if (a == null) { 
			return -1;
		} else {
         return a.length;			
		}
	};

	private int checkColumns(String[] a) {
		String[] inner;
		int inner_len = -1;
		if (a == null) { 
			return -1;
		} else {
			int columns = a[0].split("\\s").length;
			for ( String string: a )  {
			    inner = string.split("\\s");
			    inner_len = inner.length;
			    if ( inner_len != columns ) {
			    	return -1;
			    }; 
				for (int i = 0; i < inner.length; i++)
					if (inner[i].matches("^-?\\d{1,2}$")) {
						System.out.println("Right format: " + inner[i]);
					} else {
						System.out.println("Wrong format: " + inner[i]);	
                       return -1;						
					}
			};
	     return inner_len;			
		}
	};
	
	private String[] multiply(String[] a, String[] b) {
		
		int rows = this.checkRows(a);
		int columns = this.checkColumns(b);
		
		
		
		
		
		return new String[] {"", ""} ;
		
	}; 
	
	public static void main(String[] strings) {
		
		MatArith mat = new MatArith();

		// String[] a =  {"1 2 3","2 3 4"};
		String[] a =  {"1 -2 3","2 3 4"};
		String[] b = {"1 2","3 4","5 6"};

		String[] c = {"1"};

		String operation = "A*B";
		
		mat.calculate(a, b, c, operation);
	};
	
}

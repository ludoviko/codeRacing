package com.lam.coder.codility.tmp;


/***
 * 
 * @author Ludoviko Azuaje
 * 
 *         Given an array A of N integers, we draw N discs in a 2D plane such
 *         that the I-th disc is centered on (0,I) and has a radius of A[I]. We
 *         say that the J-th disc and K-th disc intersect if J ≠ K and J-th and
 *         K-th discs have at least one common point.
 * 
 *         Write a function:
 * 
 *         int solution(int A[], int N);
 * 
 *         that, given an array A describing N discs as explained above, returns
 *         the number of pairs of intersecting discs. For example, given N=6
 *         and:
 * 
 *         A[0] = 1 A[1] = 5 A[2] = 2 A[3] = 1 A[4] = 4 A[5] = 0
 * 
 *         intersecting discs appear in eleven pairs of elements:
 * 
 *         0 and 1, 0 and 2, 0 and 4, 1 and 2, 1 and 3, 1 and 4, 1 and 5, 2 and
 *         3, 2 and 4, 3 and 4, 4 and 5.
 * 
 *         so the function should return 11.
 * 
 *         The function should return −1 if the number of intersecting pairs
 *         exceeds 10,000,000.
 * 
 *         Assume that:
 * 
 *         N is an integer within the range [0..100,000]; each element of array
 *         A is an integer within the range [0..2147483647].
 * 
 *         Complexity:
 * 
 *         expected worst-case time complexity is O(N*log(N)); expected
 *         worst-case space complexity is O(N), beyond input storage (not
 *         counting the storage required for input arguments).
 * 
 *         Elements of input arrays can be modified. Copyright 2009–2013 by
 *         Codility Limited. All Rights Reserved. Unauthorized copying,
 *         publication or disclosure prohibited. + add your test case(s)
 *         
 *         Score: 65 %.
 *         It does not scale well. 
 */

public class IntersectingDiscs {
//	public int[] array;
	
	public IntersectingDiscs() {
	//	this.array = array;
	}
	
	public class Point implements Comparable<Point>{
		int center;
		int radius;
		int lowerBound;
		int upperBound;
		
		public Point(int center,  int radius) {
			this.center = center;
			this.radius = radius;
			this.lowerBound = center - radius;
			this.upperBound = center + radius;
		};
		
	    int getLowerBound() {
	    	return this.lowerBound;
	    }	
	    int getUpperBound() {
	    	return this.upperBound;
	    }	
	
	    boolean isIntersection(Point point) {
            if (this.compareTo( point ) >= 0) {
            	if ( this.checkPointInside(point.lowerBound, this) )  {
            		return true;
            	} else if ( this.checkPointInside(point.upperBound, this) ) {
            		return true;
            	};
            } else {
            	if ( this.checkPointInside( this.lowerBound, point) )  {
            		return true;
            	} else if ( this.checkPointInside(this.upperBound, point) ) {
            		return true;
            	};
            };	    	
	    	return false;
	    }

		private boolean checkPointInside(int bound, Point point ) {
			return bound >= point.lowerBound  && bound <= point.upperBound;
		};

		public int compareTo(Point o) {
			return this.radius - o.radius;
		}

		@Override
		public String toString() {
			return "Point [center=" + this.center + ", radius=" + this.radius
					+ ", lowerBound=" + this.lowerBound + ", upperBound="
					+ this.upperBound + "]";
		}
	}
	
	public int solution( int[] A ) {
		int sum = 0;
		Point a;
		Point b;
        for (int i = 0; i < A.length; i++  ) {
        	a = new Point(i, A[i]);
            for (int j = i+1; j < A.length ; j++  ) {
            	b = new Point(j, A[j]);
                if (a.isIntersection(b)) {
                	sum++;
                };	
            }
        }		   
        return sum;
	};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int[] array = {1,5,2,1,4,0};
		 IntersectingDiscs discs = new IntersectingDiscs();
		 System.out.println(discs.solution(array));
	}

}

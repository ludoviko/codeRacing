package com.lam.coder.codility.tmp;

import junit.framework.TestCase;

import com.lam.coder.codility.tmp.IntersectingDiscs;

public class IntersectingDiscsTest extends TestCase {

	public void testArrayWith11Intersections() {
		 int[] array = {1,5,2,1,4,0};
		 IntersectingDiscs discs = new IntersectingDiscs();
		 IntersectingDiscsTest.assertEquals(11, discs.solution(array));
	}; 
	
}

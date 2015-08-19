package com.lam.coder.codility.tmp;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.lam.coder.codility.tmp.PrefixSet;

public class PrefixSetTest extends TestCase {

	PrefixSet prefix;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		prefix = new PrefixSet();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		prefix = null;
	}

	public void testOneSizeArray() {
		int[] a = {1};
		Assert.assertEquals("Error ", 0, prefix.ps(a));
	};
	
	public void testArrayAllElementsTheSame() {
		int[] a = {1,1,1,1,1,1,1};
		Assert.assertEquals("Error ", 0, prefix.ps(a));
	};
	
	public void testArray() {
		int[] a = {1,2,1};
		Assert.assertEquals("Error ", 1, prefix.ps(a));
	};

	public void testArray2() {
		int[] a = {2,2,1,0,1};
		Assert.assertEquals("Error ", 3, prefix.ps(a));
	};

	public void testArray3() {
		int[] a = {1,2,3,1,2};
		prefix.ps(a);
		Assert.assertEquals("Error ", 2, prefix.ps(a));
	};

	public void testArray4() {
		int[] a = {1,2,3,1,2,5,6,7,8,1,8,7};
		prefix.ps(a);
		Assert.assertEquals("Error ", 8, prefix.ps(a));
	};
	
	
}

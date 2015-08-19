package com.lam.coder.topCoder;

import java.util.ArrayList;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.MergeSort;

public class MergeSortStringTest extends TestCase {

	MergeSort<String> mergeSort;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		mergeSort = new MergeSort<String>();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		mergeSort = null;
	}

	@Test
	public void testMerge() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("a");
		expected.add("one");
		expected.add("two");
		expected.add("z");

		ArrayList<String> data = new ArrayList<String>();
		data.add("two");
		data.add("a");
		data.add("z");
		data.add("one");

		ArrayList<String> data2 = new ArrayList<String>();
		data2.add("two");
		
		Assert.assertEquals(expected, mergeSort.sort(data));
	}
}

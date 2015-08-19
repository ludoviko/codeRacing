package com.lam.coder.sortStd;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.sortStd.comparator.NaturalComparator;

public class MergerSortListSorterTest extends TestCase {

	MergerSortListSorter<String> mergeSort;

	@Override
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		this.mergeSort = new MergerSortListSorter<String>( NaturalComparator.INSTANCE );
	}

	@Override
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		this.mergeSort = null;
	}

	@Test
	public void testMerge() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("a");
		expected.add("one");
		expected.add("two");
		expected.add("z");

		ArrayList<String> data = new ArrayList<String>();
		data.add("one");
		data.add("a");
		data.add("z");
		data.add("two");

		ArrayList<String> _unsorted = new ArrayList<String>();
		ArrayList<String> _sorted = new ArrayList<String>();
		
		_unsorted.add("very");
		_unsorted.add("test");
		_unsorted.add("driven");
		_unsorted.add("development");
		_unsorted.add("is");
		_unsorted.add("nice");


		_sorted.add("development");
		_sorted.add("driven");
		_sorted.add("is");
		_sorted.add("nice");
		_sorted.add("test");
		_sorted.add("very");

		
		Assert.assertEquals(expected, this.mergeSort.sort(data));
	}
}

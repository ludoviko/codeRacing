package com.lam.coder.sortStd;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.sortStd.comparator.NaturalComparator;

public abstract class AbstractListSorterTest extends TestCase {
	private List<String> _unsorted;
	private List<String> _sorted;
	
	protected abstract ListSorter<String> createListSorter(Comparator<String> comparator);
	
	@Override
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		
		this._unsorted = new ArrayList<String>();
		this._sorted = new ArrayList<String>();
		
		this._unsorted.add("very");
		this._unsorted.add("test");
		this._unsorted.add("driven");
		this._unsorted.add("development");
		this._unsorted.add("is");
		this._unsorted.add("nice");

		this._sorted.add("development");
		this._sorted.add("driven");
		this._sorted.add("is");
		this._sorted.add("nice");
		this._sorted.add("test");
		this._sorted.add("very");
	}

	@Override
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		this._unsorted = null;
		this._sorted = null;
	}

	@Test
	public void test() {
		ListSorter<String> sorter = this.createListSorter( (Comparator<String>) NaturalComparator.INSTANCE);
	    assertEquals(this._sorted, sorter.sort(this._unsorted));		
	}

}

package com.lam.coder.sortStd.comparator;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {

	private final Comparator<T> _comparator;
	
    public ReverseComparator(NaturalComparator<T> comparator) {
    	this._comparator = comparator;
    }

	public int compare(T left, T right) throws ClassCastException {
		return this._comparator.compare(right, left);
	}

}

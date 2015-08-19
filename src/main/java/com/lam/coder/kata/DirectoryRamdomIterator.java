package com.lam.coder.kata;

import java.io.File;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem from: http://www.zsoltfabok.com/
 * 
 *         Implement an application which follows the iterator design pattern.
 *         This particular application receives a directory as argument, and at
 *         each consecutive call, it returns a file name from the directory that
 *         hasn’t been returned before, in a random order.
 * 
 *         When the application reaches the end of the content of the directory,
 *         it shall start over, again returning the directory contents in a
 *         random order.
 * 
 *         If the directory is empty, then every call shall return an empty
 *         string. If the argument is not a directory but a file, then its name
 *         shall be returned on each consecutive call.
 * 
 */

public class DirectoryRamdomIterator implements Iterator<String> {
	private File file;
	private String[] files;
	private int index;

	public DirectoryRamdomIterator(File file) {
		this.file = file;
		if (this.file.isFile()) {
			this.files = new String[] {this.file.getName()};
		} else {
			// It is a directory
			if (file.list().length == 0 ) {
				this.files = new String[] {""};
			} else {
				this.files = file.list();
			}
		}
		this.shuffle();
		this.index = 0;
	}

	public void shuffle() {
		int random;
		for (int i = 0; i < this.files.length; i++) {
			random = DirectoryRamdomIterator.findRandomIndex(this.files.length);
			this.swap(i, random);
		}
	}

	private static int findRandomIndex(int size) {
		return (int) (Math.random() * size);
	}

	private void swap(int one, int two) {
		String x;
		x = this.files[one];
		this.files[one] = this.files[two];
		this.files[two] = x;
	}

	public boolean hasNext() {
		return this.index != this.files.length;
	}

	public String next() {
		if (this.hasNext()) {
			return this.files[this.index++];
		} else if (this.files.length == 0) {
			return "";
		} else {
			throw new NoSuchElementException("Iteration has no more elements.");
		}
	}

	public void remove() {
		throw new UnsupportedOperationException(
				"DirectoryRamdomIterator class does not support remove operations.");
	}
}

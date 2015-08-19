package com.lam.coder.kata;

import java.io.File;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.kata.DirectoryRamdomIterator;

public class DirectoryRamdomIteratorTest {
	DirectoryRamdomIterator dir;
	DirectoryRamdomIterator file;
	DirectoryRamdomIterator dirEmpty;

	@Before
	public void setUp() throws Exception {
		file = new DirectoryRamdomIterator(new FakeFile("fakeFile.txt"));
		dirEmpty = new DirectoryRamdomIterator(new FakeFile(new File[] {}));
		dir = new DirectoryRamdomIterator(new FakeFile(new File[] {
				new FakeFile("fakeFileOne.txt"), new FakeFile("fakeFileTwo.txt"),
				new FakeFile("fakeFileThree.txt"), new FakeFile("fakeFileFour.txt") }));
	}

	@After
	public void tearDown() throws Exception {
		dir = null;
		file = null;
		dirEmpty = null;
	}

	@Test
	public void testHasNextDir() {
		String data;
		while (dir.hasNext()) {
			data = dir.next();
			System.out.println(data);
			Assert.assertNotNull(data);
		}
	}

	@Test
	public void testHasNextForAFile() {
		String data;
		while (file.hasNext()) {
			data = file.next();
			System.out.println("File: " + data);
			Assert.assertNotNull(data);
		}
	}

	@Test
	public void testHasNextForAnEmptyDir() {
		String data;
		if (dirEmpty.hasNext()) {
			while (dirEmpty.hasNext()) {
				data = dirEmpty.next();
				System.out
						.println("Empty dir expects an element with a 0 length string: "
								+ data);
				Assert.assertTrue(data.equals(""));
				Assert.assertNotNull(data);
			}
		} else {
			Assert.fail("The empty dir failed to have an element.");
		}
	}

	@Test
	public void testNext() {
		String data;
		while (dir.hasNext()) {
			data = dir.next();
			System.out.println(data);
			Assert.assertNotNull(data);
		}
		try {
			dir.next();
		} catch (NoSuchElementException e) {
		}
	}

	@Test
	public void testRemove() {
		try {
			dir.remove();
			Assert.fail("Failed to throw UnsupportedOperationException");
		} catch (UnsupportedOperationException e) {
		}
	}
}

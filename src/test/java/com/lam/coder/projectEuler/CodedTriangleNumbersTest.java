package com.lam.coder.projectEuler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.projectEuler.CodedTriangleNumbers;

import org.junit.Assert;

public class CodedTriangleNumbersTest {
	CodedTriangleNumbers numbers;
	
	@Before
	public void setUp() throws Exception {
		numbers = new CodedTriangleNumbers();
	}

	@After
	public void tearDown() throws Exception {
		numbers = null;
	}

	@Test
	public void testFindQuantityTriangleWords() {
		numbers.setWords();
		Assert.assertEquals(162, numbers.findQuantityTriangleWords());
	}

}

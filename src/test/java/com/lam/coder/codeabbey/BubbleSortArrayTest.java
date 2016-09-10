package com.lam.coder.codeabbey;

import com.lam.coder.codeabbey.BubbleSortArray;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortArrayTest {
	BubbleSortArray bubbleSortArray;
	
	@Before
	public void setUp() throws Exception {
		bubbleSortArray = new BubbleSortArray();
	}

	@After
	public void tearDown() throws Exception {
		bubbleSortArray  = null;
	}

	@Test
	public void test() {
        bubbleSortArray.setArray(new int[]{3, 1, 4, 1, 5, 9, 2, 6});
        bubbleSortArray.sort();
        Assert.assertThat("Should be the same.", bubbleSortArray.getPasses(), CoreMatchers.is(5));
        Assert.assertThat("Should be the same.", bubbleSortArray.getSwaps(), CoreMatchers.is(8));

        bubbleSortArray.setArray(new int[]{2, 16, 13, 14, 5, 1, 12, 9, 3, 6, 11, 10, 4, 7, 15, 17, 8});
        bubbleSortArray.sort();
        Assert.assertThat("Should be the same.", bubbleSortArray.getPasses(), CoreMatchers.is(10));
        Assert.assertThat("Should be the same.", bubbleSortArray.getSwaps(), CoreMatchers.is(63));
    }
}

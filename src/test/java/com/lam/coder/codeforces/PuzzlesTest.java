package com.lam.coder.codeforces;

import org.junit.*;

import com.lam.coder.codeforces.Puzzles;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PuzzlesTest {
    Puzzles puzzles;

    @Before
    public void setUp() throws Exception {
        puzzles = new Puzzles();
    }

    @After
    public void tearDown() throws Exception {
        puzzles  = null;
    }

    @Test
    public void test() {
        puzzles.setArray(new int[] {10, 12, 10, 7, 5, 22});
        puzzles.setN(4);
        Assert.assertThat("Should be the same.", puzzles.find(), CoreMatchers.is(5));

        puzzles.setArray(new int[] {10, 12, 10, 7});
        puzzles.setN(4);
        Assert.assertThat("Should be the same.", puzzles.find(), CoreMatchers.is(5));

        puzzles.setArray(new int[] {782, 633, 152, 416, 432, 825, 115, 97, 386, 357,
                836, 310, 530, 413, 354, 373, 847, 882, 913, 682, 729, 582, 671, 674, 94});
        puzzles.setN(2);
        Assert.assertThat("Should be the same.", puzzles.find(), CoreMatchers.is(3));
    }
}

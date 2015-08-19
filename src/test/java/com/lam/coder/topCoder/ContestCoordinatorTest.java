package com.lam.coder.topCoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.ContestCoordinator;
@Ignore
public class ContestCoordinatorTest {

    protected ContestCoordinator solution;

    @Before
    public void setUp() {
        this.solution = new ContestCoordinator();
    }

    public static void assertEquals(double expected, double actual) {
        if (Double.isNaN(expected)) {
            Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
            return;
        }
        double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
        Assert.assertEquals(expected, actual, delta);
    }

	
    
//    @Test(timeout = 2000)
    @Test()
    public void testCase7() {
        int[] scores = new int[] {1, 4, 1, 1, 2, 10, 6, 4, 8, 6, 6, 3, 3, 9, 2, 2, 5, 3, 4, 9, 9, 10, 9, 4, 7, 7, 4, 10, 10, 9, 9, 6, 4, 5, 3, 10, 8, 9, 9, 9, 4, 5, 1};

        double expected = 6.0;
        double actual = this.solution.bestAverage(scores);

        assertEquals(expected, actual);
    }

    
    @Test()
    public void testCase8() {
        int[] scores = new int[] {9, 5, 1, 7, 7, 7, 1, 5, 3, 10, 1, 5, 5, 3, 8, 10, 5, 7, 1, 6, 5, 9, 7, 7, 8, 10, 6, 9, 9, 1, 4, 5, 10, 6, 4, 2, 8, 5, 8, 7, 10, 4, 3, 2, 3, 10, 3, 9, 4, 3};

        double expected = 5.8125;
        double actual = this.solution.bestAverage(scores);

        assertEquals(expected, actual);
    }

    
    
	@Test(timeout = 2000)
    public void testCase0() {
        int[] scores = new int[]{1};

        double expected = 1.0;
        double actual = this.solution.bestAverage(scores);

        assertEquals(expected, actual);
    }

    @Test()
//    @Test(timeout = 2000)
    public void testCase5() {
        int[] scores = new int[] {5, 3, 3, 10, 10, 4, 3, 10, 10, 3, 9, 5, 7, 10} ;

        double expected = 6.666666666666667;
        double actual = this.solution.bestAverage(scores);

        assertEquals(expected, actual);
    }

		
    
    @Test()
    public void testCase6() {
        int[] scores = new int[] {6, 5, 10, 2, 9, 1, 8, 9};

        double expected = 7.0;
        double actual = this.solution.bestAverage(scores);

        assertEquals(expected, actual);
    }

	@Test(timeout = 2000)
    public void testCase1() {
        int[] scores = new int[]{1, 2, 3, 4};

        double expected = 2.5;
        double actual = this.solution.bestAverage(scores);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] scores = new int[]{1, 1, 999, 999, 1000, 1000};

        double expected = 999.0;
        double actual = this.solution.bestAverage(scores);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] scores = new int[]{1, 13, 8, 6, 7, 9};

        double expected = 7.5;
        double actual = this.solution.bestAverage(scores);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        int[] scores = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        double expected = 1.0;
        double actual = this.solution.bestAverage(scores);

        assertEquals(expected, actual);
    }

}

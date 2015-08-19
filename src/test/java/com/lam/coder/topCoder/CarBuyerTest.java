package com.lam.coder.topCoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.CarBuyer;

public class CarBuyerTest {
    protected CarBuyer solution;

    @Before
    public void setUp() {
        this.solution = new CarBuyer();
    }

    public static void assertEquals(double expected, double actual) {
        if (Double.isNaN(expected)) {
            Assert.assertTrue("expected: <NaN> but was: <" + actual + ">", Double.isNaN(actual));
            return;
        }
        double delta = Math.max(1e-9, 1e-9 * Math.abs(expected));
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] cars = new String[]{"10000 50 50", "12000 500 10", "15000 100 65", "20000 20 80", "25000 10 90"};
        int fuelPrice = 2;
        int annualDistance = 5000;
        int years = 2;

        double expected = 10500.0;
        double actual = this.solution.lowestCost(cars, fuelPrice, annualDistance, years);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] cars = new String[]{"10000 50 50", "12000 500 10", "15000 100 65", "20000 20 80", "25000 10 90"};
        int fuelPrice = 8;
        int annualDistance = 25000;
        int years = 10;

        double expected = 45200.0;
        double actual = this.solution.lowestCost(cars, fuelPrice, annualDistance, years);

        assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] cars = new String[]{"8426 774 19", "29709 325 31", "30783 853 68", "20796 781 3", "27726 4 81", "20788 369 69", "17554 359 34", "12039 502 24", "6264 230 69", "14151 420 65", "25115 528 70", "22234 719 55", "2050 926 40", "18618 714 29", "173 358 57"};
        int fuelPrice = 33;
        int annualDistance = 8673;
        int years = 64;

        double expected = 254122.44444444444;
        double actual = this.solution.lowestCost(cars, fuelPrice, annualDistance, years);

        assertEquals(expected, actual);
    }

}

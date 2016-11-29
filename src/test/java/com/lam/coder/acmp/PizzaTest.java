package com.lam.coder.acmp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)

public class PizzaTest {
    private Integer input;
    private Integer expected;

    public PizzaTest(Integer input, Integer expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = " {index}: acmp.Pizza( {0} ) = {1} ")
    public static Collection<Integer[]> data() {
        return Arrays.asList(new Integer[][]{
                {0, 1},
                {1, 2},
                {2, 4},
                {3, 7},
                {4, 11},
        });
    }

    @Test(timeout = 3000)
    public void testConversion() {
        assertThat(Pizza.find(input), is(expected));

    }
}



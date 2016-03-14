package com.lam.coder.codeforces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)

public class SpreadsheetsTest {
    private String input;
    private String expected;

    public SpreadsheetsTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

        @Parameterized.Parameters(name = " {index}: Spreadsheets( {0} ) = {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"R1C17", "Q1"},
                {"R1C18", "R1"},
                {"R1C19", "S1"},
                {"R1C20", "T1"},
                {"R1C21", "U1"},
                {"R1C22", "V1"},
                {"R1C23", "W1"},
                {"R1C24", "X1"},
                {"R1C25", "Y1"},
                {"R1C26", "Z1"},
                {"R1C27", "AA1"},
                {"R1C28", "AB1"},
                {"R1C29", "AC1"},
                {"R1C204152", "KOYZ1"},
                {"RX251", "R251C492"},
                {"R23C55", "BC23"}
        });
    }

    @Test(timeout = 3000)
    public void testConversion() {
        assertThat(Spreadsheets.procesData(input), is(expected));

    }
}



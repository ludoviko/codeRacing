package com.lam.coder.topCoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.HuffmanDecoding;

public class HuffmanDecodingTest {
    protected HuffmanDecoding solution;

    @Before
    public void setUp() {
        this.solution = new HuffmanDecoding();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String archive = "101101";
        String[] dictionary = new String[]{"00", "10", "01", "11"};

        String expected = "BDC";
        String actual = this.solution.decode(archive, dictionary);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String archive = "10111010";
        String[] dictionary = new String[]{"0", "111", "10"};

        String expected = "CBAC";
        String actual = this.solution.decode(archive, dictionary);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String archive = "0001001100100111001";
        String[] dictionary = new String[]{"1", "0"};

        String expected = "BBBABBAABBABBAAABBA";
        String actual = this.solution.decode(archive, dictionary);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String archive = "111011011000100110";
        String[] dictionary = new String[]{"010", "00", "0110", "0111", "11", "100", "101"};

        String expected = "EGGFAC";
        String actual = this.solution.decode(archive, dictionary);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String archive = "001101100101100110111101011001011001010";
        String[] dictionary = new String[]{"110", "011", "10", "0011", "00011", "111", "00010", "0010", "010", "0000"};

        String expected = "DBHABBACAIAIC";
        String actual = this.solution.decode(archive, dictionary);

        Assert.assertEquals(expected, actual);
    }

}

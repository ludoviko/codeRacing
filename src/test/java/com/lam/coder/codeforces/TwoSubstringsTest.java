package com.lam.coder.codeforces;


import com.lam.coder.codeforces.TwoSubstrings;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSubstringsTest {
    TwoSubstrings twoSubstrings;

    @Before
    public void setUp() throws Exception {
        twoSubstrings = new TwoSubstrings();
    }

    @After
    public void tearDown() throws Exception {
        twoSubstrings  = null;
    }

    @Test
    public void test() {
        Assert.assertThat("Should be the same.", TwoSubstrings.find("ABA"), CoreMatchers.is("NO"));
        Assert.assertThat("Should be the same.", TwoSubstrings.find("BACFAB"), CoreMatchers.is("YES"));
        Assert.assertThat("Should be the same.", TwoSubstrings.find("AXBYBXA"), CoreMatchers.is("NO"));
        Assert.assertThat("Should be the same.", TwoSubstrings.find("ABABAB"), CoreMatchers.is("YES"));
        Assert.assertThat("Should be the same.", TwoSubstrings.find("BBBBBBBBBB"), CoreMatchers.is("NO"));
        Assert.assertThat("Should be the same.", TwoSubstrings.find("ABBA"), CoreMatchers.is("YES"));
        Assert.assertThat("Should be the same.", TwoSubstrings.find("ABAXXXAB"), CoreMatchers.is("YES"));
        Assert.assertThat("Should be the same.", TwoSubstrings.find("TESTABAXXABTEST"), CoreMatchers.is("YES"));
        Assert.assertThat("Should be the same.", TwoSubstrings.find("ABAB"), CoreMatchers.is("NO"));
//        Assert.assertThat("Should be the same.", TwoSubstrings.find(""), CoreMatchers.is(""));
    }
}

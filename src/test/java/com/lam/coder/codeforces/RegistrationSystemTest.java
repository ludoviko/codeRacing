package com.lam.coder.codeforces;

import org.junit.*;

import com.lam.coder.codeforces.RegistrationSystem;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegistrationSystemTest {
    RegistrationSystem registrationSystem;

    @Before
    public void setUp() throws Exception {
        registrationSystem = new RegistrationSystem();
    }

    @After
    public void tearDown() throws Exception {
        registrationSystem  = null;
    }

    @Test
    public void test() {
        Assert.assertThat("Should be the same.", registrationSystem.updateAndCheck("first"), CoreMatchers.is("OK"));
        Assert.assertThat("Should be the same.", registrationSystem.updateAndCheck("first"), CoreMatchers.is("first1"));
        Assert.assertThat("Should be the same.", registrationSystem.updateAndCheck("second"), CoreMatchers.is("OK"));
        Assert.assertThat("Should be the same.", registrationSystem.updateAndCheck("second"), CoreMatchers.is("second1"));
        Assert.assertThat("Should be the same.", registrationSystem.updateAndCheck("third"), CoreMatchers.is("OK"));
        Assert.assertThat("Should be the same.", registrationSystem.updateAndCheck("third"), CoreMatchers.is("third1"));
//        Assert.assertThat("Should be the same.", registrationSystem.updateAndCheck(""), CoreMatchers.is(""));
    }

    @Test
    public void test2() {
        Assert.assertThat("Should be the same.", registrationSystem.updateAndCheck("b"), CoreMatchers.is("OK"));
        Assert.assertThat("Should be the same.", registrationSystem.updateAndCheck("b"), CoreMatchers.is("b1"));
        Assert.assertThat("Should be the same.", registrationSystem.updateAndCheck("b"), CoreMatchers.is("b2"));
    }
}

package com.lam.coder.codejam;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class T9SpellingTest {

    @Test
    public void testTranslation() {
        assertThat(T9Spelling.translate("hi"), is("44 444"));
        assertThat(T9Spelling.translate("yes"), is("999337777"));
        assertThat(T9Spelling.translate("foo  bar"), is("333666 6660 022 2777"));
        assertThat(T9Spelling.translate("hello world"), is("4433555 555666096667775553"));
    }
}


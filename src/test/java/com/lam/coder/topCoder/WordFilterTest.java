package com.lam.coder.topCoder;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Test;

import com.lam.coder.topCoder.WordFilter;

public class WordFilterTest extends TestCase {
	WordFilter filter;
	
	@Override
	protected void setUp() throws Exception {
		filter = new WordFilter();
		super.setUp();
	}
	
	@Override
	protected void tearDown() throws Exception {
		filter = null;
		super.tearDown();
	};
	
    @Test
    public void testSimpleSearch() {
        String string = "abcd";
        Assert.assertEquals("Error ", "", filter.strip(string, string));
    }

    @Test
    public void testSearch() {
        String string = "StRinG";
        Assert.assertEquals("Error ", "cccc ssssssssss", filter.strip(string, "ccccstring ssssssssss"));
        Assert.assertEquals("Error ", "ccccsssssssssss", filter.strip(string, "ccccstrinstringgsssssssssss"));
        Assert.assertEquals("Error ", "cccc ssssssssss", filter.strip(string, "ccccstring stringssssssssss"));
        Assert.assertEquals("Error ", " a b c d", filter.strip(string, "String A String B String C String d"));
    }

    @Test
    public void testSearchSystemTest() {
    	Assert.assertEquals("remainder", filter.strip("java", "remajjavajavaavjavaainder"));
    	Assert.assertEquals("remaining", filter.strip("JaVa", "remajJaVajAvAavJaVaaining"));
    	Assert.assertEquals("ssssessss", filter.strip("ee", "sssseeeeeeessss"));
    	Assert.assertEquals(" ...", filter.strip("testing", " testing..."));
        Assert.assertEquals("emacs rules!", filter.strip("Ultraedit", "emacs ultraedit rules!"));
    }
}

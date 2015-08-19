package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Foobar;

public class FoobarTest {
    Foobar bar;
    
	@Before
	public void setUp() throws Exception {
		bar = new Foobar();
	}

	@After
	public void tearDown() throws Exception {
		bar = null;
	}

	@Test
	public void testCensor() {
		Assert.assertEquals("I say ***** on this **** problem and the **** set!", bar.censor("ogg", "08B", "I say f00ey on this dan8 problem and the danB set!"));
//		Assert.assertEquals("Dung? What the ding do you mean, ****?", bar.censor("au", "ui", "Dung? What the ding do you mean, dung?"));
//		Assert.assertEquals(, bar.censor(, , ));
//		Assert.assertEquals(, bar.censor(, , ));
//		Assert.assertEquals(, bar.censor(, , ));
		/*
		 * 0)	
    	



1)	
    	
"eafk"
"88$$"
"What the h 8 c $ is this s  n  8  $  u?"
Returns: "What the ******* is this *************?"
Different characters may be substituted in the same way.

3)	
    	
"YYYggggabcdefghijklmnopqrstuvwxyz"
"XXXggggABCDEFGHIJKLMNOPQRSTUVWXYZ"
"DANGitALLtoHECK"
Returns: "****itALLto****"
Duplicate character substitutions and redundant substitutions may be specified.
4)	
    	
"ddhhooggss<y}T?h:1+Wd~\\\'\""
"D*HNO0G&S5Rfubar%f3k<:..."
"Dangoshucks, I say, * a n & 0 5 H u c k 5."
Returns: "***********, I say, *********************."

		 */
	}

}

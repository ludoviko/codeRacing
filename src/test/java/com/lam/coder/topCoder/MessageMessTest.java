package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.topCoder.MessageMess;

import junit.framework.Assert;
import junit.framework.TestCase;
@Ignore
public class MessageMessTest extends TestCase {

	MessageMess message;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		message = new MessageMess();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		message = null;
	}

	@Test
	public void testRestore() {
		Assert.assertEquals("AMBIGUOUS!", message.restore(new String[] {"ABC", "BCD", "CD", "ABCB"}, "ABCBCD"));
		Assert.assertEquals("HI YOU SAY HI", message.restore(new String[] {"HI", "YOU", "SAY"}, "HIYOUSAYHI"));
//		Assert.assertEquals(, message.restore(new String[] , ));
//		Assert.assertEquals(, message.restore(new String[] , ));
//		Assert.assertEquals(, message.restore(new String[] , ));

		/**
		 * A word from dictionary may appear multiple times in the message. 1)
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Returns: 
		 * 
		 * "ABC BCD" and "ABCB CD" are both possible interpretations of message.
		 * 2)
		 * 
		 * 
		 * {"IMPOSS", "SIBLE", "S"}
		 * 
		 * "IMPOSSIBLE"
		 * 
		 * Returns: "IMPOSSIBLE!"
		 * 
		 * There is no way to concatenate words from this dictionary to form
		 * "IMPOSSIBLE" 3)
		 * 
		 * 
		 * {"IMPOSS", "SIBLE", "S", "IMPOSSIBLE"}
		 * 
		 * "IMPOSSIBLE"
		 * 
		 * Returns: "IMPOSSIBLE"
		 * 
		 * This message can be decoded without ambiguity. This requires the
		 * insertion of no spaces since the entire message appears as a word in
		 * the dictionary.
		 */
	}

}

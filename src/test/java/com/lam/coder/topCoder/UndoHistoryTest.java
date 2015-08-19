package com.lam.coder.topCoder;

import org.junit.*;

import com.lam.coder.topCoder.UndoHistory;
@Ignore
public class UndoHistoryTest {
	UndoHistory undo;

	@Before
	public void setUp() throws Exception {
		undo = new UndoHistory();
	}

	@After
	public void tearDown() throws Exception {
		undo = null;
	}

	@Test
	public void testMinPresses() {
		Assert.assertEquals(10,
				undo.minPresses(new String[] { "a", "ab", "abac", "abacus" }));
		Assert.assertEquals(18,
				undo.minPresses(new String[] { "tomorrow", "topcoder" }));
		Assert.assertEquals(6, undo.minPresses(new String[] { "a", "b" }));
		// Assert.assertEquals(0, undo.minPresses(new String[] ));
		// Assert.assertEquals(0, undo.minPresses(new String[] ));
		// Assert.assertEquals(0, undo.minPresses(new String[] ));
	}

}

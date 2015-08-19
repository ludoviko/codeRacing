package com.lam.coder.topCoder;

import java.util.Arrays;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 * 
 *         Note: This problem statement includes images that may not appear if
 *         you are using a plugin. For best results, use the Arena editor.
 * 
 *         In the vector-drawing mode of the grafix software package, the user
 *         plots geometric objects of three kinds: arcs, circles, and polygons.
 *         These objects are grouped into collections known as globs. A newly
 *         made object automatically belongs to a glob of which it is the sole
 *         member. The user can later choose to merge two globs into one, or to
 *         split one glob so that each of its objects is delegated to a glob on
 *         its own. Each glob bears a unique identification number or ID, which
 *         is crucial to updating the document. Your job is to take a sequence
 *         of drawing instructions expressed in the grafix internal language,
 *         and execute them according to the rules laid out below.
 * 
 *         An instruction is a string that takes one the following forms.
 * 
 *         make OBJ delete ID merge ID ID split ID
 * 
 *         In these forms, "OBJ" is a placeholder for one of the following
 *         values.
 * 
 *         arc circle polygon
 * 
 *         Furthermore, "ID" is a placeholder for the string representation of
 *         an existing glob ID, which must be a non-negative integer. The string
 *         representation will not be padded with zeros, and no instruction will
 *         be padded with extraneous spaces on either side or between its
 *         tokens.
 * 
 *         Before you execute the first instruction, the document is empty, so
 *         no glob IDs are in use. When a "make" instruction is executed, you
 *         must form a new glob whose ID is the lowest non-negative integer that
 *         isn't currently in use as a glob ID. The sole member of the new glob
 *         will be an object of the type named by the "make" instruction.
 * 
 *         To execute a "delete" instruction, you take the glob whose ID is
 *         specified by the instruction, discard all the objects it contains,
 *         and liberate its ID for future use.
 * 
 *         The "merge" instruction specifies two different IDs. The first one
 *         identifies the target glob, to which you must add the members of the
 *         second glob, called the source glob. Immediately thereafter, the
 *         source glob is to be destroyed and its ID liberated. Note that globs
 *         do not contain other globs, but only objects. Thus, the consequence
 *         of a merge operation is that the target glob contains more objects
 *         than before, namely its prior contents as well as the objects drawn
 *         from the source glob.
 * 
 *         The "split" instruction liberates the ID of the specified glob and
 *         then reassigns each of its member objects to an individual glob
 *         bearing the lowest available ID, in the following order. First the
 *         arcs are reassigned, then the circles, and finally the polygons. The
 *         specified glob is finally discarded. Its ID, if it was not reused by
 *         one of its member objects, remains available.
 * 
 *         You are given a sequence of drawing instructions in the String[]
 *         commands. After executing all instructions in order, you are to
 *         determine the contents of the glob whose ID is specified by the int
 *         sel. If there is no such glob, return an empty int[]. Otherwise,
 *         return an int[] with three values declaring, in order, the number of
 *         arcs, circles, and polygons in that glob.
 * 
 *         Definition
 * 
 *         Class: grafixGlobs Method: execute Parameters: String[], int Returns:
 *         int[] Method signature: int[] execute(String[] commands, int sel) (be
 *         sure your method is public)
 * 
 * 
 *         Constraints - commands contains between 1 and 50 elements, inclusive
 *         - each element of commands adheres to the format described above -
 *         commands is a feasible sequence, so each ID refers to an existing
 *         glob when it is used - sel is between 0 and 999, inclusive
 * 
 *         Examples 0)
 * 
 * 
 *         {"make polygon", "make circle", "make polygon", "merge 0 1",
 *         "merge 2 0", "split 2"}
 * 
 *         0
 * 
 *         Returns: { 0, 1, 0 }
 * 
 *         1)
 * 
 * 
 *         {"make circle", "make circle", "make arc", "merge 2 1", "delete 0",
 *         "split 2", "delete 0", "make polygon"}
 * 
 *         0
 * 
 *         Returns: { 0, 0, 1 }
 * 
 *         2)
 * 
 * 
 *         {"make circle", "make circle", "make arc", "merge 2 1", "delete 0",
 *         "split 2", "delete 0", "make polygon"}
 * 
 *         2
 * 
 *         Returns: { }
 * 
 *         There is no glob with ID 2. 3)
 * 
 * 
 *         {"make arc"}
 * 
 *         999
 * 
 *         Returns: { }
 * 
 *         4)
 * 
 * 
 *         {"make polygon", "make polygon", "make arc", "make circle",
 *         "make circle", "delete 3", "make polygon", "make arc", "make arc",
 *         "merge 1 3", "merge 1 4", "merge 2 1", "make arc", "make arc",
 *         "make circle", "make circle", "merge 6 5", "split 6", "merge 2 1"}
 * 
 *         2
 * 
 *         Returns: { 2, 1, 2 }
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 211 Round 1 - Division
 *         II, Level Three
 * 
 */

public class GrafixGlobs {
	private static final String MAKE = "make";
	private static final String DELETE = "delete";
	private static final String MERGE = "merge";
	private static final String SPLIT = "split";

	private static final String ARC = "arc";
	private static final String CIRCLE = "circle";
	private static final String POLYGON = "polygon";

	private String[] doc;

	public GrafixGlobs() {
		doc = new String[1000];
	}

	public int[] execute(String[] commands, int sel) {
		Arrays.fill(doc, null);

		for (String command : commands) {
			execute(command);
		}

		if (this.doc[sel] == null) {
			return new int[] {};
		} else {
			return countForms(sel);
		}
	}

	private int[] countForms(int source) {
		int a = 0;
		int c = 0;
		int p = 0;

		if (!doc[source].contains(",")) {
			// one element source
			if (doc[source].equals(ARC)) {
				a++;
			} else if (doc[source].equals(CIRCLE)) {
				c++;
			} else if (doc[source].equals(POLYGON)) {
				p++;
			}
		} else {
			String[] forms = doc[source].split(",");
			for (String form : forms) {
				if (form.equals(ARC)) {
					a++;
				} else if (form.equals(CIRCLE)) {
					c++;
				} else if (form.equals(POLYGON)) {
					p++;
				}
			}
		}

		return new int[] { a, c, p };
	}

	private void execute(String command) {
		int index;
		int target;
		int source = -1;
		String data;

		String action = command.split(" ")[0];
		if (action.equals(MAKE)) {
			index = getAvailableSpot();
			doc[index] = command.split(" ")[1];
		} else if (action.equals(MERGE)) {
			target = Integer.parseInt(command.split(" ")[1]);
			source = Integer.parseInt(command.split(" ")[2]);

			if (doc[target] == null) {
				doc[target] = doc[source];
			} else {
				doc[target] += "," + doc[source];
				doc[source] = null;
			}
		} else if (action.equals(DELETE)) {
			target = Integer.parseInt(command.split(" ")[1]);
			doc[target] = null;
		} else if (action.equals(SPLIT)) {
			source = Integer.parseInt(command.split(" ")[1]);
			data = doc[source];
			doc[source] = null;
			if (!data.contains(",")) {
				// one element source
				index = getAvailableSpot();
				doc[index] = data;
			} else {
				String[] forms = data.split(",");
				for (String form : forms) {
					index = getAvailableSpot();
					if (form.equals(ARC)) {
						doc[index] = form;
					}
				}
				for (String form : forms) {
					index = getAvailableSpot();
					if (form.equals(CIRCLE)) {
						doc[index] = form;
					}
				}
				for (String form : forms) {
					index = getAvailableSpot();
					if (form.equals(POLYGON)) {
						doc[index] = form;
					}
				}
			}
		}
	}

	private int getAvailableSpot() {
		for (int i = 0; i < doc.length; i++) {
			if (doc[i] == null) {
				return i;
			}
		}
		return -1;
	}
}

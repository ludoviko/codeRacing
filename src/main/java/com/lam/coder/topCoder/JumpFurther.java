package com.lam.coder.topCoder;

/**
 * 
 * @author LAzuaje
 * 
 *         Problem Statement for JumpFurther
 * 
 *         Little Fox Jiro is standing at the bottom of a long flight of stairs.
 *         The bottom of the stairs has number 0, the bottommost step has number
 *         1, the next step has number 2, and so on. The staircase is so long
 *         that Jiro is guaranteed not to reach its top.
 * 
 *         Jiro will now perform N consecutive actions. The actions are numbered
 *         1 through N, in order. When performing action X, Jiro chooses between
 *         two options: either he does nothing, or he jumps exactly X steps up
 *         the stairs. In other words, if Jiro starts performing action X
 *         standing on step Y, he will end it either on step Y, or on step Y+X.
 * 
 *         For example, if N=3, Jiro will make three consecutive choices:
 *         whether or not to jump 1 step upwards, 2 steps upwards, and then 3
 *         steps upwards.
 * 
 *         One of the steps is broken. The number of this step is badStep. Jiro
 *         cannot jump onto this step.
 * 
 *         You are given the ints N and badStep. Compute and return the number
 *         of the topmost step that can be reached by Jiro.
 * 
 * 
 *         Definition
 * 
 *         Class: JumpFurther Method: furthest Parameters: int, int Returns: int
 *         Method signature: int furthest(int N, int badStep) (be sure your
 *         method is public)
 * 
 * 
 *         Constraints - N will be between 1 and 2,000, inclusive. - badStep
 *         will be between 1 and 4,000,000, inclusive.
 * 
 *         Examples 0)
 * 
 *         2 2 Returns: 3 The optimal strategy is to jump upwards twice: from
 *         step 0 to step 1, and then from step 1 to step 3. This trajectory
 *         avoids the broken step. 1)
 * 
 *         2 1 Returns: 2 In this case step 1 is broken, so Jiro cannot jump
 *         upwards as his first action. The optimal strategy is to first stay on
 *         step 0, and then to jump from step 0 to step 2. 2)
 * 
 *         3 3 Returns: 5 3)
 * 
 *         1313 5858 Returns: 862641 4)
 * 
 *         1 757065 Returns: 1 
 *         
 *         This problem statement is the exclusive and
 *         proprietary property of TopCoder, Inc. Any unauthorized use or
 *         reproduction of this information without the prior written consent of
 *         TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All
 *         rights reserved.
 * 
 *         This problem was used for: Single Round Match 587 Round 1 - Division
 *         I, Level One Single Round Match 587 Round 1 - Division II, Level Two
 * 
 */

public class JumpFurther {

	public int furthest(int n, int badStep) {
		int sum = 0;

		sum = (n * (n + 1)) / 2;
		sum += this.isBadStep(badStep, sum) == true ? -1 : 0;
		return sum;
	}

	private boolean isBadStep(int badStep, int sum) {

		if (badStep > sum) {
			return false;
		}

		double d = (-1 + Math.sqrt(1 + 8 * badStep)) / 2;
		return d == (int) d;
	}
}

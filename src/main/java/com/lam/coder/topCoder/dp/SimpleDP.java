package com.lam.coder.topCoder.dp;

import java.util.Arrays;

public class SimpleDP {

	private int[] memo;

	public SimpleDP(int n) {
		memo = new int[n + 1];
		Arrays.fill(memo, -1);
	}

	public void reset(int n) {
		memo = new int[n + 1];
		Arrays.fill(memo, -1);
	}

	public int getMinSteps(int n) {
		if (n == 1) {
			return 0;
		}
		if (memo[n] != -1) {
			return memo[n];
		}
		int r = 1 + getMinSteps(n - 1);
		if (n % 2 == 0) {
			r = Math.min(r, 1 + getMinSteps(n / 2));
		}
		if (n % 3 == 0) {
			r = Math.min(r, 1 + getMinSteps(n / 3));
		}

		memo[n] = r;
		return r;
	}

	public int getMinStepsBottomUp(int n) {
		memo[1] = 0;

		for (int i = 2; i <= n; i++) {
			memo[i] = 1 + memo[i - 1];
			if (i % 2 == 0) {
				memo[i] = Math.min(memo[i], 1 + getMinStepsBottomUp(n / 2));
			}
			if (i % 3 == 0) {
				memo[i] = Math.min(memo[i], 1 + getMinStepsBottomUp(n / 3));
			}
		}
		return memo[n];
	}
}

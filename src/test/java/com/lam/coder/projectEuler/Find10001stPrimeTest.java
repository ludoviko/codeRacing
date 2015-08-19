package com.lam.coder.projectEuler;

import org.junit.Test;

import com.lam.coder.projectEuler.Find10001stPrime;

import junit.framework.TestCase;

public class Find10001stPrimeTest extends TestCase {

	@Test
	public void testTrue() {
		Find10001stPrimeTest.assertEquals(104743, Find10001stPrime.go());
	}
	
}

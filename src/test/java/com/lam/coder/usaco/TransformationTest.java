package com.lam.coder.usaco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.usaco.Transformation;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TransformationTest extends TestCase {
	Transformation transformation;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		transformation = new Transformation();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testFindNumber() {
		char[][] arrayIn =  new char[][] { { '@', '-', '@' },
				{ '-', '-', '-' }, { '@', '@', '-' }, };
		
		Assert.assertEquals(
				1,
				transformation.findNumberOf(arrayIn, new char[][] {
						{ '@', '-', '@' }, { '@', '-', '-' },
						{ '-', '-', '@', }, }));


		char[][] arrayIn2 =  new char[][] { { '1', '2', '3' },
				{ '4', '5', '6' }, { '7', '8', '9' }, };
		
		Assert.assertEquals(
				2,
				transformation.findNumberOf(arrayIn2, new char[][] {
						{ '9', '8', '7' }, { '6', '5', '4' },
						{ '3', '2', '1', }, }));

		Assert.assertEquals(
				3,
				transformation.findNumberOf(arrayIn2, new char[][] {
						{ '3', '6', '9' }, { '2', '5', '8' },
						{ '1', '4', '7', }, }));

		Assert.assertEquals(
				4,
				transformation.findNumberOf(arrayIn2, new char[][] {
						{ '3', '2', '1' }, { '6', '5', '4' },
						{ '9', '8', '7', }, }));

		Assert.assertEquals(
				6,
				transformation.findNumberOf(arrayIn2, arrayIn2));

		Assert.assertEquals(
				5,
				transformation.findNumberOf(arrayIn2, new char[][] {
						{ '9', '6', '3' }, { '8', '5', '2' },
						{ '7', '4', '1', }, }));

		Assert.assertEquals(
				7,
				transformation.findNumberOf(arrayIn2, new char[][] {
						{ '6', '9', '3' }, { '8', '2', '5' },
						{ '1', '4', '7', }, }));
	}
}

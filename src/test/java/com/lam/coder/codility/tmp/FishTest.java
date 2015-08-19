package com.lam.coder.codility.tmp;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class FishTest  {

	Fish fish;
	
	@Before
	public void setUp() throws Exception {
		this.fish = new Fish();
	}

	@After
	public void tearDown() throws Exception {
		this.fish = null;
	}

	@Test
	public void testSolution() {
		Assert.assertEquals(2, this.fish.solution(new int [] {4, 3, 2, 1, 5 }, 
				new int[] {0, 1, 0, 0, 0}));

		Assert.assertEquals(2, this.fish.solution(new int [] {4, 3, 2, 1, 5 }, 
				new int[] {0, 1, 0, 1, 0}));
		
	}

}

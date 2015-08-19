package com.lam.coder.codility.tmp;


import java.util.Arrays;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codility.tmp.BallSwitch;

public class BallSwitchTest extends TestCase {

	private BallSwitch ballSwitch;
	
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		ballSwitch = new BallSwitch();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		ballSwitch = null;
	}

	@Test
	public void testSolution() {
		int[][] in = { {-1, 0, -1},  {1, 0, 0}  };  
		int[][] out = ballSwitch.findTraverse(in);
		int[][] expected = { {1, 0, -1},  {-1, 0, 0}  };
		
		for (int i = 0; i < in.length; i++ ) {
			boolean result = Arrays.equals( out[i], expected[i]);
			Assert.assertTrue( result );
		}
		
	}

	@Test
	public void testSolution_2() {
		int[][] in = { {1, 0, -1},  {-1, 0, 0}  };  
		int[][] out = ballSwitch.findTraverse(in);
		int[][] expected = { {-1, 0, +1},  {-1, 0, 0}  };  
		
		for (int i = 0; i < in.length; i++ ) {
			boolean result = Arrays.equals( out[i], expected[i]);
			Assert.assertTrue( result );
		};
		
	}


	@Test
	public void testSolution_3() {
		int[][] in = { {-1, 0, +1},  {-1, 0, 0}  };  
		int[][] out = ballSwitch.findTraverse(in);
		int[][] expected = { {+1, 0, +1},  {+1, 0, 0}  };  
		
		for (int i = 0; i < in.length; i++ ) {
			boolean result = Arrays.equals( out[i], expected[i]);
			Assert.assertTrue( result );
		}
	}

	@Test
	public void testSolution_4() {
		int[][] in = { {+1, 0, +1},  {+1, 0, 0}  };  
		int[][] out = ballSwitch.findTraverse(in);
		int[][] expected = { {-1, 0, -1},  {+1, 0, 0}  };  
		
		for (int i = 0; i < in.length; i++ ) {
			boolean result = Arrays.equals( out[i], expected[i]);
			Assert.assertTrue( result );
		}
	}

	@Test
	public void testSolution_5() {
		int[][] in = { {-1, 0, -1},  {1, 0, 0}  };  
		
		Assert.assertTrue( ballSwitch.solution(in, 4) == 1 );
	}

	
}

package com.lam.coder.codeforces;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.lam.coder.codeforces.TheaterSquare;
import com.lam.coder.codeforces.WatchingAMovie;

public class WatchingAMovieTest {
	WatchingAMovie watch;
	
	@Before
	public void setUp() throws Exception {
		watch = new WatchingAMovie();
	}

	@After
	public void tearDown() throws Exception {
		watch = null;
	}

	@Test
	public void testFind() {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
        list.add(5); 
        list.add(6); 
        list.add(10); 
        list.add(12); 
		
		Assert.assertEquals(6, watch.find(3, list));
	}

	@Test
	public void testFind_2() {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
        list.add(1); 
        list.add(100000); 
		
		Assert.assertEquals(100000, watch.find(1, list));
	}
}

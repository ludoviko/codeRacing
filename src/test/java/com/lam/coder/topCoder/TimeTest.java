package com.lam.coder.topCoder;


import junit.framework.TestCase;

import org.junit.Test;

import com.lam.coder.topCoder.Time;

public class TimeTest extends TestCase {
	
	Time time; 
	
	@Override
	protected void setUp() throws Exception {
		time = new Time();
		super.setUp();
	}
	
	@Override
	protected void tearDown() throws Exception {
		time = null;
		super.tearDown();
	}

    @Test
    public void testLowBound() {
    	try {
			time.whatTime(-1);
			TimeTest.fail("Wrong, expected  IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			System.out.println("OK, Expected " + e.getMessage() );
		};
    };
    
    @Test
    public void testUpperBound() {
    	try {
			time.whatTime(86400);
			TimeTest.fail("Wrong, expected  IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			System.out.println("OK, Expected " + e.getMessage() );
		};
    };
    
    @Test
    public void testConversion() { 
    	TimeTest.assertEquals("0:0:0", time.whatTime(0));
    	TimeTest.assertEquals("0:0:1", time.whatTime(1));
    	TimeTest.assertEquals("0:0:2", time.whatTime(2));
    	TimeTest.assertEquals("0:0:6", time.whatTime(6));
    	TimeTest.assertEquals("0:0:36", time.whatTime(36));
    	TimeTest.assertEquals("0:1:0", time.whatTime(60));
    	TimeTest.assertEquals("0:1:1", time.whatTime(61));
    	TimeTest.assertEquals("0:9:3", time.whatTime(543));
    	TimeTest.assertEquals("1:49:7", time.whatTime(6547));
    	TimeTest.assertEquals("1:1:0", time.whatTime(3660));
    	TimeTest.assertEquals("1:0:0", time.whatTime(3600));
    	TimeTest.assertEquals("1:1:1", time.whatTime(3661));
    	TimeTest.assertEquals("1:30:36", time.whatTime(5436));
    	TimeTest.assertEquals("23:59:59", time.whatTime(86399));
    	TimeTest.assertEquals("3:25:45", time.whatTime(12345));
    	TimeTest.assertEquals( "0:5:45", time.whatTime(345));
    	TimeTest.assertEquals("6:28:54", time.whatTime(23334));
    	TimeTest.assertEquals("12:0:0", time.whatTime(43200));
    	TimeTest.assertEquals("10:0:0", time.whatTime(36000));
    	TimeTest.assertEquals("12:41:18", time.whatTime(45678));
    	TimeTest.assertEquals("0:16:27", time.whatTime(987));
    	TimeTest.assertEquals("2:46:39", time.whatTime(9999));
    	TimeTest.assertEquals("1:30:36", time.whatTime(5436));
    	TimeTest.assertEquals("23:59:58", time.whatTime(86398));
    	TimeTest.assertEquals("23:59:59", time.whatTime(86399));
//    	TimeTest.assertEquals(, time.whatTime());
    }
}

/**
 * 
 */
package com.lam.coder.topCoder;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.WeekDay;

/**
 * @author lazuajemolle
 *
 */
public class WeekDayTest extends TestCase {
    WeekDay weekDay;

    @Before
    public void setUp() throws Exception {
         super.setUp();	 
         weekDay = new WeekDay();
    }

    @After
    public void tearDown() throws Exception {
    	super.tearDown();
        weekDay = null;
    }

    @Test
    public void testCheckWeekDay() {
        TestCase.assertEquals( "Monday", weekDay.getDay(4, 26, 1999) );
    }

    @Test
    public void testCheckWeekDaySystemTest() {
        TestCase.assertEquals("Tuesday", weekDay.getDay(11, 18, 1997));
        TestCase.assertEquals("Thursday", weekDay.getDay(6, 6, 1991));
        TestCase.assertEquals("Monday", weekDay.getDay(1, 1, 1990) );
        TestCase.assertEquals("Saturday", weekDay.getDay(2, 29, 1992));
        TestCase.assertEquals("Friday", weekDay.getDay(12, 31, 1999));
    }
}

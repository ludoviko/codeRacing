package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Chivalry;

public class ChivalryTest {
	Chivalry chivalry;
	
	@Before
	public void setUp() throws Exception {
		chivalry = new Chivalry();
	}

	@After
	public void tearDown() throws Exception {
		chivalry = null;
	}

	@Test
	public void testGetOrder() {
		Assert.assertEquals("WM", chivalry.getOrder("M", "W"));
		Assert.assertEquals("MMMW", chivalry.getOrder("MM", "MW"));
		Assert.assertEquals("WMMMM", chivalry.getOrder("MMMM", "W"));
        Assert.assertEquals("WWWM", chivalry.getOrder("M", "WWW"));
//		Assert.assertEquals(, chivalry.getOrder(, ));
	}

	@Test
	public void getOrderSystemTest() {
		Assert.assertEquals("WM", chivalry.getOrder("M", "W"));
		Assert.assertEquals("MMMW", chivalry.getOrder("MM", "MW"));
		Assert.assertEquals("WMMMM", chivalry.getOrder("MMMM", "W"));
		Assert.assertEquals("WWWM", chivalry.getOrder("M", "WWW"));
		Assert.assertEquals("WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", chivalry.getOrder("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW", "WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM"));
		Assert.assertEquals("MMMMMWWWWMWWWW", chivalry.getOrder("MMMMMWWWW", "MWWWW"));
		Assert.assertEquals("MWWWWMMMMMWWWW", chivalry.getOrder("MWWWW", "MMMMMWWWW"));
		Assert.assertEquals("WWMWMW", chivalry.getOrder("WMW", "WMW"));
		Assert.assertEquals("WWWWWWWW", chivalry.getOrder("WWWW", "WWWW"));
		Assert.assertEquals("WMMMM", chivalry.getOrder("MMMM", "W"));
		Assert.assertEquals("WMMMM", chivalry.getOrder("W", "MMMM"));
		Assert.assertEquals("WWWWWWWWWWMMMMMMMMMMWWWWWWWWWWMMMMMMMMMMWWWWWWWWWWMMMMMMMMMMMMMMMMMMMMWWWWWWWWWWMMMMMMMMMMWWWWWWWWWW", chivalry.getOrder("MMMMMMMMMMWWWWWWWWWWMMMMMMMMMMWWWWWWWWWWMMMMMMMMMM", "WWWWWWWWWWMMMMMMMMMMWWWWWWWWWWMMMMMMMMMMWWWWWWWWWW"));
		Assert.assertEquals("WMWWMMMMMMMWW", chivalry.getOrder("MWW", "WMMMMMMMWW"));
		Assert.assertEquals("MWWWMMMMWWMMMMWWWMWMW", chivalry.getOrder("MWWWMMMMWWM", "MMMWWWMWMW"));
		Assert.assertEquals("WMWMWMWMMMMMMMMMMMMMM", chivalry.getOrder("WMWMWMWM", "MMMMMMMMMMMMM"));
		Assert.assertEquals("WWWWMMMWWWWWWWWWMWWWWWWWWWWMMMWMWMWMWMMMMMWWMWWMWMW", chivalry.getOrder("WWWMMMWWWWWWWWWMWWWWWWWWWW", "WMMMWMWMWMWMMMMMWWMWWMWMW"));
		Assert.assertEquals("WWMMMMM", chivalry.getOrder("WWMM", "MMM"));
		Assert.assertEquals("WMWWWWMMMM", chivalry.getOrder("MWWWW", "WMMMM"));
		Assert.assertEquals("WWWWWWWWW", chivalry.getOrder("WWWWW", "WWWW"));
		Assert.assertEquals("WM", chivalry.getOrder("M", "W"));
		Assert.assertEquals("MWM", chivalry.getOrder("MW", "M"));
		Assert.assertEquals("WWWWMMMMWMMWMMMMMMMMMWWWWWW", chivalry.getOrder("MMMMWMMWMMMMMM", "WWWWMMMWWWWWW"));
		Assert.assertEquals("WWWWWMMM", chivalry.getOrder("WWWWW", "MMM"));
		Assert.assertEquals("WWMMMM", chivalry.getOrder("WMM", "WMM"));
		Assert.assertEquals("WWWWMM", chivalry.getOrder("WMM", "WWW"));
		Assert.assertEquals("WWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWM", chivalry.getOrder("WMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWM", "WMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWM"));
		Assert.assertEquals("MMWWMMMM", chivalry.getOrder("MMWW", "MMMM"));
	}

}

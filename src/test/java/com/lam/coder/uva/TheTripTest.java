package com.lam.coder.uva;

import org.junit.*;

import com.lam.coder.uva.TheTrip;
@Ignore
public class TheTripTest {
	float delta = 0.01f;
	TheTrip theTrip;
	
	@Before
	public void setUp() throws Exception {
		this.theTrip = new TheTrip();
	}

	@After
	public void tearDown() throws Exception {
		this.theTrip  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals(0.01, this.theTrip.find(new double[] {0.01,0.03, 0.03, 0.03, 0.03, 0.03, 0.03, 0.03, 0.03, 0.03, 0.03, 0.03, 0.03, 0.03, 0.03 }), this.delta);
//		Assert.assertEquals(2407.09, this.theTrip.find(new double[] {123.12, 6.13, 9.44, 89.08, 278.78, 223.78, 78.45, 912.89, 554.76, 547.57, 1781.89, 907.07 }), this.delta);
//		Assert.assertEquals(3991.11, this.theTrip.find(new double[] { 5000.00d, 11.11d,11.11d, 11.11d, 11.11d }), this.delta);
		Assert.assertEquals(10, this.theTrip.find(new double[] { 10.00d, 20.00d, 30.00d}), this.delta );
		Assert.assertEquals(11.99, this.theTrip.find(new double[] { 15.00d, 15.01d, 3.00d, 3.01d}), this.delta);
		Assert.assertEquals(1.33, this.theTrip.find(new double[] {1, 3, 3 }), this.delta);
		Assert.assertEquals(0.01, this.theTrip.find(new double[] { 0.01d, 0.03d, 0.03d }), this.delta);
		Assert.assertEquals(2.25, this.theTrip.find(new double[] {25.00d, 25.00d, 25.00d, 28.00d }), this.delta);
		Assert.assertEquals(4.73, this.theTrip.find(new double[] {10.01d, 15.25d, 18.96d }), this.delta);
		Assert.assertEquals(0.02, this.theTrip.find(new double[] {25.03d, 25.00d, 25.00d, 25.00d }), this.delta);
		Assert.assertEquals(1.1, this.theTrip.find(new double[] {6.17, 5.00, 4.03 }), this.delta);
		Assert.assertEquals(5, this.theTrip.find(new double[] {4.99, 15.00 }), this.delta);
		Assert.assertEquals(0, this.theTrip.find(new double[] {10 }), this.delta);
	//	Assert.assertEquals(0.01, this.theTrip.find(new double[] {0.01,0.01,0.01,0.01,0.01,0.01,0.01,0.01,0.01,0.01,0.01,0.01,0.01,0.01,0.03 }), this.delta);
//		Assert.assertEquals(, this.theTrip.find(new double[] { }), this.delta);
//		Assert.assertEquals(, this.theTrip.find(new double[] { }), this.delta);
//		Assert.assertEquals(, this.theTrip.find(new double[] { }), this.delta);
	}
}

package com.lam.coder.topCoder;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.BinaryCode;

import junit.framework.TestCase;

public class BinaryCodeTest extends TestCase {
	BinaryCode code;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		code = new BinaryCode();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		code = null;
	}

	@Test
	public void testDecodeSystemTest() {
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("1333") );
		Assert.assertArrayEquals("Error", new String[] {"00", "NONE"}, code.decode("00") );
		Assert.assertArrayEquals("Error", new String[] {"0", "NONE"} ,code.decode("0") );
		Assert.assertArrayEquals("Error", new String[] {"000", "NONE"} ,code.decode("000") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "1"}, code.decode("1") );
		Assert.assertArrayEquals("Error", new String[] { "011100011",  "NONE" },code.decode("123210122") );
		Assert.assertArrayEquals("Error", new String[] { "01", "10" }, code.decode("11") );
		Assert.assertArrayEquals("Error", new String[] { "NONE", "11001" }, code.decode("22111") );
		Assert.assertArrayEquals("Error", new String[] { "NONE", "NONE" }, code.decode("123210120") );
		Assert.assertArrayEquals("Error", new String[] { "NONE", "NONE" }, code.decode("3") );
		Assert.assertArrayEquals("Error", new String[] { "01101001101101001101001001001101001",
				 "10110010110110010110010010010110010" },code.decode("12221112222221112221111111112221111") );
		Assert.assertArrayEquals("Error", new String[] {"011100011", "NONE"}, code.decode("123210122"));
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("3") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("2") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "11"}, code.decode("22") );
	    Assert.assertArrayEquals("Error", new String[] {"001", "NONE"}, code.decode("011") );
		Assert.assertArrayEquals("Error", new String[] {"010", "NONE"}, code.decode("111") );
		Assert.assertArrayEquals("Error", new String[] {"011", "NONE"}, code.decode("122") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "101"}, code.decode("121") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "111"}, code.decode("232") );
		Assert.assertArrayEquals("Error", new String[] {"01001", "10010"}, code.decode("11111") );
		Assert.assertArrayEquals("Error", new String[] {"01101", "10110"}, code.decode("12221") );
		Assert.assertArrayEquals("Error", new String[] {"01101001101001101101101101001101101001001101001101", "10110010110010110110110110010110110010010110010110"}, code.decode("12221112221112222222222221112222221111112221112221") );
		Assert.assertArrayEquals("Error", new String[] {"01001101101101001101101001001101001001101001101001", "10010110110110010110110010010110010010110010110010"}, code.decode("11112222222221112222221111112221111112221112221111") );
		Assert.assertArrayEquals("Error", new String[] {"01101001001001001101101001101001001001001001101101", "10110010010010010110110010110010010010010010110110"}, code.decode("12221111111111112222221112221111111111111112222221") );
		Assert.assertArrayEquals("Error", new String[] {"01101001101101101101101101001101001001101101001001", "10110010110110110110110110010110010010110110010010"}, code.decode("12221112222222222222222221112221111112222221111111") );
		Assert.assertArrayEquals("Error", new String[] {"01001001101101101101001101001001101001001101001001", "10010010110110110110010110010010110010010110010010"}, code.decode("11111112222222222221112221111112221111112221111111") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "1100101000011011111111010000000011110100111011"}, code.decode("2211121100122223333332211000000123322111232222") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "1110110111110000110011100000111000000100111110000"}, code.decode("2322222233321001221123210001232100001111233321000") );
		Assert.assertArrayEquals("Error", new String[] {"01010010000000111111011011011011010110011", "NONE"}, code.decode("11211111000001233332222222222222212221122") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "11101110010101111101001110011000001000011"}, code.decode("23222321112122333221112321122100011100122") );
		Assert.assertArrayEquals("Error", new String[] {"00000111110010110110000111011110000100110100", "NONE"}, code.decode("00001233321112222221001232223321001111222110") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("3322220301103123301212012200321013203020302120323") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("111323012211013231000233331110223030100330") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("30120230303312331303233023113010030303331011023") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("2211121100122223333332211000000123322111232221") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("2322222233321001221123210001232100001111233321001") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("11211111000001233332222222222222212221121") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("23222321112122333221112321122100011100121") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("00001233321112222221001232223321001111222111") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("123210120") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("12311221") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("001") );
		Assert.assertArrayEquals("Error", new String[] {"0110100110110", "NONE"}, code.decode("1222111222221") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("2222") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("132131021") );
		Assert.assertArrayEquals("Error", new String[] {"01101001101101001101001001001101001", "10110010110110010110010010010110010"}, code.decode("12221112222221112221111111112221111") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("10") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("12") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("2322") );
		Assert.assertArrayEquals("Error", new String[] {"011100011", "NONE"}, code.decode("123210122") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("123210120") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("12311221") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("001") );
		Assert.assertArrayEquals("Error", new String[] {"0110100110110", "NONE"}, code.decode("1222111222221") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("2222") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("132131021") );
		Assert.assertArrayEquals("Error", new String[] {"01101001101101001101001001001101001", "10110010110110010110010010010110010"}, code.decode("12221112222221112221111111112221111") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("10") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("12") );
		Assert.assertArrayEquals("Error", new String[] {"NONE", "NONE"}, code.decode("2322") );
		Assert.assertArrayEquals("Error", new String[] {"011100011", "NONE"}, code.decode("123210122") );
	}
}

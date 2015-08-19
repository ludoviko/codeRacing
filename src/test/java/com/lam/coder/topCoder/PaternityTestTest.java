package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.PaternityTest;

public class PaternityTestTest {
	PaternityTest pater;

	@Before
	public void setUp() throws Exception {
		pater = new PaternityTest();
	}

	@After
	public void tearDown() throws Exception {
		pater = null;
	}

	@Test
	public void testPossibleFathers() {
		Assert.assertArrayEquals(
				new int[] { 0 },
				pater.possibleFathers("ABCD", "AXCY", new String[] { "SBTD",
						"QRCD" }));

		Assert.assertArrayEquals(
				new int[] { 1, 2 },
				pater.possibleFathers("ABCD", "ABCX", new String[] { "ABCY",
						"ASTD", "QBCD" }));

		Assert.assertArrayEquals(
				new int[] { 0, 1 },
				pater.possibleFathers("ABABAB", "ABABAB", new String[] {
						"ABABAB", "ABABCC", "ABCCDD", "CCDDEE" }));

		Assert.assertArrayEquals(
				new int[] { 0, 1 },
				pater.possibleFathers("ABABAB", "ABABAB", new String[] {
						"ABABAB", "ABABCC", }));

		Assert.assertArrayEquals(
				new int[] {},
				pater.possibleFathers("ABABAB", "ABABAB", new String[] {
						"ABCCDD", "CCDDEE" }));

		Assert.assertArrayEquals(
				new int[] {},
				pater.possibleFathers("YZGLSYQT", "YUQRWYQT", new String[] {
						"YZQLDPWT", "BZELSWQM", "OZGPSFKT", "GZTKFYQT",
						"WQJLSMQT" }));

		Assert.assertArrayEquals(new int[] { 1, 3 }, pater.possibleFathers(
				"WXETPYCHUWSQEMKKYNVP", "AXQTUQVAUOSQEEKCYNVP", new String[] {
						"WNELPYCHXWXPCMNKDDXD", "WFEEPYCHFWDNPMKKALIW",
						"WSEFPYCHEWEFGMPKIQCK", "WAEXPYCHAWEQXMSKYARN",
						"WKEXPYCHYWLLFMGKKFBB" }));

	}
	
	@Test
	public void testPossibleFathersSystemTest() {
		Assert.assertArrayEquals(new int[] {0} ,pater.possibleFathers("ABCD", "AXCY", new String[] {"SBTD", "QRCD"}));
		Assert.assertArrayEquals(new int[] {1, 2} ,pater.possibleFathers("ABCD", "ABCX", new String[] {"ABCY", "ASTD", "QBCD"}));
		Assert.assertArrayEquals(new int[] {0, 1} ,pater.possibleFathers("ABABAB", "ABABAB", new String[] {"ABABAB", "ABABCC", "ABCCDD", "CCDDEE"}));
		Assert.assertArrayEquals(new int[] {0} ,pater.possibleFathers("ABCDEFGH", "ABCDEFGH", new String[] {"ABCDEFGH"}));
		Assert.assertArrayEquals(new int[] {} ,pater.possibleFathers("ABCDEF", "ABCDEF", new String[] {"FEDCBA"}));
		Assert.assertArrayEquals(new int[] {0} ,pater.possibleFathers("ABCDEF", "XBCXXF", new String[] {"ABCDEF"}));
		Assert.assertArrayEquals(new int[] {} ,pater.possibleFathers("YZGLSYQT", "YUQRWYQT", new String[] {"YZQLDPWT", "BZELSWQM", "OZGPSFKT", "GZTKFYQT", "WQJLSMQT"}));
		Assert.assertArrayEquals(new int[] {} ,pater.possibleFathers("EHAPPOYCLXQH", "HXRPPJYGLXQW", new String[] {"QMAPPKFHLDQH", "ERVPROACLYQD", "ORAIPUYPLXQY", "UHAPELYJBXQU", "JGAPABYCZXQH"}));
		Assert.assertArrayEquals(new int[] {} ,pater.possibleFathers("XCIHGTUYLYAXZHRDPUKJ", "XWIEPKUWLYCFZDMGPUKJ", new String[] {"XFIEGTUYSJAXAHLIIAKJ", "QNIHMTAYKYAIZHRTPUIJ", "XCIYGUMYLYJXZYVTBUJE", "XIIHGHIYVYADZHUTPJTO", "WCIHGTVBBYKASXXDPUKJ"}));
		Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4} ,pater.possibleFathers("YDHXMKFWTYWSPGTVDBYG", "ODHXJTFWTHWDPGLSZBEX", new String[] {"YMHXMKFHTYOSRGTVDBYG", "YDHSMKQDTYWSOGTVDBYG", "YPHAMKDWOYWSPGTVDUYG", "YDHMMKMWTYJSPXTVDJYG", "YDVXMKZUOYCSPMTVDBYG"}));
		Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4} ,pater.possibleFathers("BBBBBBBBBBAAAAAAAAAA", "BBBBBBBBBBBBBBBBBBBB", new String[] {"AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA"}));
		Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4} ,pater.possibleFathers("ABCDEFGHIJKLMNOPQRST", "ABCDEFGHIJKLMNOPQRSX", new String[] {"ABCDEFGHIJKLMNOPQRST", "ABCDEFGHIJKLMNOPQRST", "ABCDEFGHIJKLMNOPQRST", "ABCDEFGHIJKLMNOPQRST", "ABCDEFGHIJKLMNOPQRST"}));
		Assert.assertArrayEquals(new int[] {1, 3} ,pater.possibleFathers("WXETPYCHUWSQEMKKYNVP", "AXQTUQVAUOSQEEKCYNVP", new String[] {"WNELPYCHXWXPCMNKDDXD", "WFEEPYCHFWDNPMKKALIW", "WSEFPYCHEWEFGMPKIQCK", "WAEXPYCHAWEQXMSKYARN", "WKEXPYCHYWLLFMGKKFBB"}));
		Assert.assertArrayEquals(new int[] {2, 3, 4} ,pater.possibleFathers("PREDNTRKUKRLFLENKX", "NRFXNTRUJSUFWLENKX", new String[] {"PTJDZBCKUKRLFHAXLM", "QIEDYMSKUKRLFPRHGG", "PYEDQZVKUKRLFZVCVB", "POEDTUKKUKRLFOKJTR", "PAEDRYLKUKRLFLHHKV"}));
		Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4} ,pater.possibleFathers("IVKEWOVNQKCCREDO", "IXKLWOVNTGCQRRWW", new String[] {"BVGEPMMNQKVCBEDO", "MVWEGRIEQKBCXEDO", "VVKEZJYHQKBCEEDO", "RVJEBGIXQKPCPEDO", "OVZEWKPGQKNCBEDO"}));
		Assert.assertArrayEquals(new int[] {} ,pater.possibleFathers("AAAAAA", "AAAAAB", new String[] {"AAAAAB", "AAAAAC"}));
		Assert.assertArrayEquals(new int[] {} ,pater.possibleFathers("ABCD", "ABXY", new String[] {"CDAB"}));
		Assert.assertArrayEquals(new int[] {} ,pater.possibleFathers("QNBEYZBRQQ", "QBBKFZFHQQ", new String[] {"QNMWYZHRVQ", "HDBCUZBRAQ", "NVBEOZBRFV", "OPMHYZBRYQ"}));
		Assert.assertArrayEquals(new int[] {2} ,pater.possibleFathers("XOKXPZKAAW", "TOKXPTSASG", new String[] {"XMKVBCUAAW", "XFKCIMKOAW", "XFFKEZKJAW", "XMKIIZKAIX"}));
		Assert.assertArrayEquals(new int[] {1, 3} ,pater.possibleFathers("EASSMBHEBGQBGP", "CPFSPBHTBGQUOP", new String[] {"JLSSMBHTDRQUGM", "EASSMSUELWWBGQ", "CAGSMBXEBAAKAP", "EASGMYMEAKHBGI"}));
		Assert.assertArrayEquals(new int[] {0, 3} ,pater.possibleFathers("FJGGTQWUTURYXBXK", "BJHGTRWUCSRPJBXE", new String[] {"FXGQOQZGTUJYXXNK", "FQLGQOWUXJRRXEXK", "FJGGFLWJTARUXVEG", "FGGVXQPZTUBYXKYK"}));
		Assert.assertArrayEquals(new int[] {1, 2} ,pater.possibleFathers("XY", "YY", new String[] {"YY", "XX", "XQ", "QY", "YX"}));
		Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4} ,pater.possibleFathers("ABCDEFGHIJKLMNOPQRST", "ABCDEFGHIJKLMNOPQRST", new String[] {"ABCDEFGHIJKLMNOPQRST", "ABCDEFGHIJKLMNOPQRSU", "ABCDEFGHIJKLMNOPQRSX", "ABCDEFGHIJKLMNOPQRSZ", "ABCDEFGHIJKLMNOPQRST"}));
		Assert.assertArrayEquals(new int[] {} ,pater.possibleFathers("ABABAB", "ABABAB", new String[] {"ABCCDD", "CCDDEE"}));
		Assert.assertArrayEquals(new int[] {1, 3} ,pater.possibleFathers("WXETPYCHUWSQEMKKYNVP", "AXQTUQVAUOSQEEKCYNVP", new String[] {"WNELPYCHXWXPCMNKDDXD", "WFEEPYCHFWDNPMKKALIW", "WSEFPYCHEWEFGMPKIQCK", "WAEXPYCHAWEQXMSKYARN", "WKEXPYCHYWLLFMGKKFBB"}));
		Assert.assertArrayEquals(new int[] {0, 1} ,pater.possibleFathers("ABABAB", "ABABAB", new String[] {"ABABAB", "ABABCC", "ABCCDD", "CCDDEE"}));
		Assert.assertArrayEquals(new int[] {} ,pater.possibleFathers("ABCD", "ABEF", new String[] {"CDEF"}));
		Assert.assertArrayEquals(new int[] {} ,pater.possibleFathers("ABCDEF", "ABCDEF", new String[] {"AXXXXX", "XBXXXX"}));
		Assert.assertArrayEquals(new int[] {} ,pater.possibleFathers("ABABAB", "ADADAD", new String[] {"ACACAC"}));
	}
}

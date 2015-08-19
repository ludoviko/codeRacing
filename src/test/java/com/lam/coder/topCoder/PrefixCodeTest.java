package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.PrefixCode;

public class PrefixCodeTest  {
	PrefixCode prefix;

	@Before
	public void setUp() throws Exception {
		prefix = new PrefixCode();
	}

	@After
	public void tearDown() throws Exception {
		prefix = null;
	}

	@Test
	public void testIsOne() {
		Assert.assertEquals("Yes", prefix.isOne(new String[] {"trivial"} ));
		Assert.assertEquals("No, 2", prefix.isOne(new String[] {"10001", "011", "100", "001", "10"}));
		Assert.assertEquals("No, 0", prefix.isOne(new String[] {"no", "nosy", "neighbors", "needed"}));
		Assert.assertEquals("Yes", prefix.isOne(new String[] {"1010", "11", "100", "0", "1011"}));
		Assert.assertEquals("Yes", prefix.isOne(new String[] {"No", "not"}));
	}
	
	@Test
	public void testIsOneSystemTest() { 
		Assert.assertEquals("No, 3"  ,prefix.isOne(new String[] {"6G9Lnpzw", "kA", "SyW9fFaF", "k", "SyW9fFa", "6G", "6", "SyW9f"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"trivial"}));
		Assert.assertEquals("No, 2"  ,prefix.isOne(new String[] {"10001", "011", "100", "001", "10"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"no", "nosy", "neighbors", "needed"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"1010", "11", "100", "0", "1011"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"When", "shall", "we", "three", "meet", "again"}));
		Assert.assertEquals("No, 4"  ,prefix.isOne(new String[] {"So", "foul", "and", "fair", "a", "day", "I", "have", "not", "seen"}));
		Assert.assertEquals("No, 5"  ,prefix.isOne(new String[] {"Is", "this", "a", "dagger", "which", "I", "see", "before", "me"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"x5Wpx2fzq8", "1GsC"}));
		Assert.assertEquals("No, 2"  ,prefix.isOne(new String[] {"u9", "A", "u"}));
		Assert.assertEquals("No, 2"  ,prefix.isOne(new String[] {"FDaI", "PFj3", "FDa", "P"}));
		Assert.assertEquals("No, 2"  ,prefix.isOne(new String[] {"4zIw6j", "PO7wDf", "PO", "P", "PO7wD"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"mfNC66E3", "BA6IZS", "Uf235qDnOn", "eNoR9Tm", "ZtYbGjlK1I", "OmSOo"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"1Jd", "1FApgJG", "doKBPas8sr", "eF94b", "ap", "tQluf", "iMEynp"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"N8T", "6Ot", "Y6HXa", "Aq0PSxumR", "b", "L2V6g", "F", "0JWu7", "yMZ"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"kPn7pi1b8", "DQxDv", "tmH1m", "Xef", "d29CmrZXz", "E0yMc9maM", "eFPvFATmm6", "P8UZvJ6QI", "eHP0", "YkTuO57n0M"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"7iaP", "gtfZBj0T", "eiZdc7L", "zj97V7", "QZY67yCn", "pLyYJSjv", "I", "kOu", "Nbv", "62uXb", "diM"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"A", "p896Y", "1h8aRWSDu", "6MA7", "fghGP12rB", "e", "nksdl", "mJzIlAAn", "XvMlY2Qo", "SqGdTu", "Gc", "uOLef"}));
		Assert.assertEquals("No, 9"  ,prefix.isOne(new String[] {"T5Cia72L", "4k", "UAGi", "hbhxDT", "ZmRF", "MeWRoEztGK", "I2x", "C", "Ty", "I2", "UAG", "I", "MeWR"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"tPc", "oQbnJp5p", "8kqIwJEoL", "cZtEMi", "MbeyzQ", "aDf", "IUUOEKf", "e", "xxhXWajs", "yCqa8", "0W", "B9lSbFooaT", "CLr", "2Nea6Ur3fh"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"UaIr", "RbB3o0rMTl", "mdgo0", "P4kE7PvhD", "HVE2upEx", "CmyfW", "S99E", "Rb99pF", "iwm7DFKD", "7P5j", "pg", "LBhS", "tZj", "hqKwP3", "985OSIYYi"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"1dKXSK6Og", "QaerODAt4", "3EWJXk57", "ZJ0C", "Xcvd", "coPAQG", "d", "OgJRupkPa", "UZLnZ", "O65Ii4", "UR2ufZY3v", "MM6A5Wi", "0HCoof", "ukSan", "2CNvsuT", "pfG9jOEF65"}));
		Assert.assertEquals("No, 10"  ,prefix.isOne(new String[] {"bsU", "wtpv", "6jW87o9mC", "KpwjPfZxs", "YMSQrLMi", "FjFwFM41Vo", "T80Q", "N3PIvGqGg", "5", "alBqUOmhk", "Y", "6jW87o9", "bs", "wtp", "N3PIv", "YMSQrL", "alBqU"}));
		Assert.assertEquals("No, 16"  ,prefix.isOne(new String[] {"scLsC63", "ZQnGA", "zM", "u3r", "6Q", "EOaEYwUQ", "nJkuK", "RkWh", "3fFDXG4KKS", "Wo", "lMqDnO146", "MrK7", "1y", "gDcBRf", "l5pHuh0GVE", "rF5x8SnSX6", "E", "Mr"}));
		Assert.assertEquals("No, 13"  ,prefix.isOne(new String[] {"uZYUg1", "uhgeQyC", "q9ev43J", "Km8tV", "97Ogf", "LeDFJ", "tj", "5egCIZGM", "zee7Y7b", "Cy", "r", "fTzukqm", "ep6K2OrIi", "q9ev4", "uh", "u", "zee", "t", "ze"}));
		Assert.assertEquals("No, 9"  ,prefix.isOne(new String[] {"h6SrdyJxAinSeuuWIh1", "Ph9AOJk", "9V6qbYhFWyCggy", "Js1pAhqe6VlEr5ypCTv25R", "IwdSaIQhbGhQOOE3SiogZr", "36H39hiRdMrDcGtDWabtynuOVi45Y", "ZmhdvOJKzdCAFS3Qwd1p", "njxIQzNyenVQU6KqQen3", "JGzhDaj0AWi5m8384hvZ5NgP", "ZmhdvOJKzdCAFS", "Iw", "Js1pAhqe6VlE", "Ph9AO", "Js1pAh", "Zmhd", "9V6", "IwdSaIQhb", "ZmhdvOJKzdCA", "ZmhdvOJKz", "Js1pA"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"K4mQPQpYUrUZmMy", "A2HZnb62", "j3oMD1fFn3dBqBfigCS0A", "8AagvB", "pT1eqCfTRQW4bMEE2sQUqZ", "hPedZRaOsZ0", "ld9B3dDc0Ro", "HFV7mI4Rgi4F7dd0Ccg", "o5JRItPiiQzvv5hD98tpB6xo", "vyKZsZN", "pEiEu", "tLXw0j56atFho1Pj0hGqEcm5R0nduBGlUlgUSjY3coiQp59", "Ocy0O3PMo0ExGzR0dtSNSTzE9Q3EXpyvRxtpyIB", "JPiXM8Xy1yLRPKfZ", "hlGWk9xf3kd", "tMcG3A", "BfYAbtc1CFYuwJ8Q1ILgJ3Icw", "CfNnq0JzcDZbPo9HjQQ9SgT6zWOZT1", "g7OV8iSkv1LIpSZWsxgKd9RadnA6mukT26wAoMsh", "xAdXhTULm6SBg5yoCljuCl06tnSl", "pwQxXxe0PxmTPxATwydff", "pQVvHGL2j8y9", "4iURfGv3E5W819lhea57TNOoP7uMEzpIfJjJYeMmhqsjzdQbBT", "q4QEBKYPHLf", "NED1"}));
		Assert.assertEquals("No, 14"  ,prefix.isOne(new String[] {"o1Jl8VRViXFmG", "K", "UDpTZh89LfjSx0Gy", "6mRaTwnDAmXq314qTbYbkrHRJC", "BiWFTvpupb70NcqObsF4Rlg9cvbt50QGhu", "oJ2", "s9bDjQcKGpPia3rA", "11RPG8JmG53IjwPK98ijSzYph6qWGmxHmOg2Uymk3p0kj", "3tVlcv", "lPFbwUMrj6DO6hMsPNfP6Pm9", "sq", "bzv0FXwhrnQv0o1f8r4WWRctD", "Ub0fCzaDC57twtIpr6qXFh", "C1J5E2FhdDMoCwzN24EwxWmnbaIoGrXSqqV3qiiR", "bzv0FX", "C1J5E2FhdDMoCwzN24Ew", "o1", "C1J5E2FhdD", "11RPG8JmG53IjwPK98ijSzYph6qWGmxHmOg2Uymk", "b", "o", "bzv0FXwhrnQv0o1f8r4W", "C1J5E2FhdDMoCwzN2", "11RPG8JmG", "bzv0FXwhrnQv0o1f", "C1J5E2FhdDMoC", "3", "bz", "C1J", "bzv0FXwhrnQv0o1f8"}));
		Assert.assertEquals("No, 34"  ,prefix.isOne(new String[] {"XYbmDUxN7u6JAdkDda6Tx1", "dFzIa4v5cUq", "nB4fILnt60Xg50b68bhLZzvduy", "m4MZDOFTk2No1sS6q3AwcrHBrAnj", "6t5QRI", "mXe7JfxljlmtiMjzYY8JH", "MO8PmZhbDR6sWPVT8DFu", "Hnsn", "06dFQzOp", "WL7wPxSnSuvd", "k27VusrvySAOPWD8QhRXdrU4euyZY5PG7", "jzMauI03gNXrWxZxSAo", "CQnA0LDNZIqIIAr", "TpD", "lzhgWe9eR1rrozp7DDgV", "xnBmycZ9kksjRZD6", "XhiMWgCbtNIMODAZx6CWDwH6", "idomHfHyMeS2q4tDKFZVN8SR", "f", "BlnsMbedFuZZY0ZM2SXMh6p", "FUVB9", "NsTFC2rpFlPoHNNb", "n8jTCYWPn0sy", "V", "wWBzM0E5N1NkMy9A5sdHO9eB7U8F0PCwwNtGN6Lj7gT", "dbbiRCxqLa1R47e2Xq", "RDohZu2IzhjPKK00kD", "WXZvahaaEOV", "KK9CKPA16ZJPXJ9iHjDmI8KxgvB", "Oofi6mtR93QDakc73joKS1", "9PgoIqtheWNjGGANHaarKBxMulgNmj4t7ihPYY4B", "uIg4dycEnvPkHJTveDdi5kPk7xJC8Jc0cI2DEfR2Yokp8EikP", "U5qFDnWNupzuPFxdUa4W8tEvzSbjsxAK0yZBm3YetV", "IjTvD1yh7pv2m", "FUV"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"ZcWXa", "M7Fy0jXHSyAd06K7tF8fbk9n", "IoLMVgTjeSS9hs6rV6ypBr2HVc1ePINh5g1aMTHzvh6a", "CR2GNp", "Dsh", "UjKrzhX4LWdizsfsalS9yuAEF", "SpM8J3S927e5TAg9AYo28ZTGVNQiaNK", "DgBUhcdihHnASRHaz5", "6d3K6Oioz", "92InBnVlQDTgyb6PteMw", "QZIkegSSdYZdqNpdqY211", "zdmMWQgQc70urcZ", "AqcoexbIn9ImByjoi5I6jiiqgbgI8", "LIox6SshifryP0w8ocB4iukPl", "yRf6P0OBvTdnAKQzIpzDvln6", "1Ytkxr9cvWbHhUkIGtcgstUq6PbtWPLVvEFs3OS", "u3EZWyr", "SSiLuWPK7GoU", "Po", "suiomj2LFzA1ocSUvM0Ke8", "aBj0x", "n7vctfcCub", "QzOutivDN1kpbtXZrmneuiE", "rwGSJCqGYj9EcLbb5PAzwkqgVUYDhKbYGryX", "lXWvl6", "hJipIcX6I2ZrGG9poNemsdXd83", "7mCm6scMU9TlC2cQIjD46rowSMZaN8", "VscHySrJx1miBmIb41", "5du15EYdcg25XeKV5Co2BYiMK0vMzjS2KL1NZZ09E2Elf", "Ekj1kuZSEsQ9EP", "P80QVXxVhBVvuAS9u98e1h4DXUMktA", "INenscGZlmTeutnn1vP2aUG8yaqqjF41ajnSJ10", "TigKTTLMqOvKc1HCr5t49tese4Bf4ERVw5qOWBkM", "f9ewMV1DZA6B3kGCQIQpoNsejOpRiN5NWjJq", "4kTAwUvAgJS78GSysBMia45fQbN", "Qa2UKVeEzZOdqrkw5Cuy", "ewJjbjIwQiWQApvp3sM", "WDHE9KR4I", "Iwg", "GGuCfaj5lWzaZruzL7EaFXzHpjXkQ5LgLDs0oZ4Z537ds1"}));
		Assert.assertEquals("No, 23"  ,prefix.isOne(new String[] {"dxTeiqKoahrxlm21X4Y5gUPCesKZr6QV3t7jkRVI6MGr7G", "KPhyr6AWxT5oZTJcNQM5ppNwCblJscvA1c7riFNfiQSHt", "GACJz", "ftDGfU6HPFH1M8ibTL", "tlZmVP1fbIcdxUoC9JGOi", "ipjOPChh5TEqyepbD7Dq5fdHowVBc1oKoYgDkOsor5enjTOu", "ldFMs3IOCuN1DBZtNHFD54Ihrz8F", "pdI4zB5HXI9uHK3qEO5Rc9", "sqNsxbmeQNwSM5Xbc", "iW43YsFwygW5CPtYHq91SXON", "SUH5IzZM25FH2ByYG8x9eCylDQIZnFHEkYH2WoMYuZqwkoS", "uQ6Zc4IoSbNEqdSa9", "afVx", "P", "2JFomDiAJ", "kL", "Yo7u0vVSUc74GczS0WUJjI5wy", "ECyXiWLnOLitlCWsFmTEET", "mRyqMu3a615mWRZukGoUQIKf4nuGGcw12spOmqwrs1dMQ", "9P2dp", "VMjPazzWy1OlN9cJ0SJbojk2q93TzLPUi8", "5on2o9nBIPT", "rksdRcg", "rksd", "pdI4zB5HXI9uHK3qE", "5o", "af", "ipjOPChh5T", "SUH5IzZM25FH2ByYG8x9eCy", "ipj", "ipjO", "afV", "ip", "9P", "Yo7u0vVSUc74GczS0WUJjI", "i", "ldFMs3IOCuN1D", "a", "2JFom", "pdI4z", "ECyXiWLnO", "ECyXiWLnOLitlCWsF", "ftDGfU6HPFH1M8ibT", "ft", "pdI4zB5H"}));
		Assert.assertEquals("No, 23"  ,prefix.isOne(new String[] {"BLgnSm", "24wahXN389NQOViMZTGmirBr", "scdeOgeQa", "5a8DjTc6yKSVngFTXRLgHxJtJxWhVjnY", "m3NM", "gZpSE4tlTCRk8ieRd896rwfApPBAlIUPsHp6JjpnvFX3v9TX", "cd8WIJJfSSQluobBdfUMUHGh", "Hdwk", "KlKq2b8h4a6nUuOdX37", "N8BAPm48uGSfZJfARN", "zTzRNL4sM9iqWq1eEnhMhvoKU", "dULnTmlu96wzR6iHaWIDi3u", "pr0Iw0vPJgq5RjCWfCxjsCKMUX5", "P7DCyD", "tCNIV48", "TrlzVxuEn6", "Aa3F3SMGfJS7C", "S7XYg0OS", "Nu7BzgJZhWb8qrl9HsJtLl1s", "rg7pZThg", "KvE2Rp8HetPwlin5SovkSmQXZz0HdcxyVByuy6AdzZXiFKn", "7hRZTp63m5IQhFOB", "5LQFyNmV5", "zTzRNL4sM9iqWq1eEnhM", "P7D", "rg7p", "gZpSE4tlTCRk8ieR", "zTzRNL4sM9iqWq1e", "cd8WIJJf", "scd", "N8BAPm48uGSfZJf", "24w", "pr0", "rg7", "P", "S7X", "Nu7", "Nu7BzgJZhWb8qrl9H", "N8BAPm48uG", "Aa3", "zTzRNL4sM9iqWq1eEnhMhvoK", "24", "Kv", "N", "dULnTmlu96wzR6iHaWID", "scdeOg", "Nu7BzgJZhWb8qrl", "BL", "pr0Iw0vPJgq", "pr0Iw0v"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"No", "not"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"trivua"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"1010", "11", "100", "0", "1011"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"word"}));
		Assert.assertEquals("No, 2"  ,prefix.isOne(new String[] {"10001", "011", "100", "001", "10"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"no", "nosy"}));
		Assert.assertEquals("No, 2"  ,prefix.isOne(new String[] {"12345", "23456", "234", "123"}));
		Assert.assertEquals("No, 2"  ,prefix.isOne(new String[] {"tr", "ab", "a", "t"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"trivial"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"no", "not"}));
		Assert.assertEquals("No, 2"  ,prefix.isOne(new String[] {"bb", "ab", "a", "b"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"11", "1", "111"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"a", "ab", "abc", "abcd"}));
		Assert.assertEquals("No, 1"  ,prefix.isOne(new String[] {"1010", "10"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"no", "none", "n"}));
		Assert.assertEquals("No, 1"  ,prefix.isOne(new String[] {"not", "no"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"no", "not", "nosy"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"no", "not", "abcd", "abcdefg"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"trivua"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"1010", "11", "100", "0", "1011"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"word"}));
		Assert.assertEquals("No, 2"  ,prefix.isOne(new String[] {"10001", "011", "100", "001", "10"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"no", "nosy"}));
		Assert.assertEquals("No, 2"  ,prefix.isOne(new String[] {"12345", "23456", "234", "123"}));
		Assert.assertEquals("No, 2"  ,prefix.isOne(new String[] {"tr", "ab", "a", "t"}));
		Assert.assertEquals("Yes"  ,prefix.isOne(new String[] {"trivial"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"no", "not"}));
		Assert.assertEquals("No, 2"  ,prefix.isOne(new String[] {"bb", "ab", "a", "b"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"11", "1", "111"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"a", "ab", "abc", "abcd"}));
		Assert.assertEquals("No, 1"  ,prefix.isOne(new String[] {"1010", "10"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"no", "none", "n"}));
		Assert.assertEquals("No, 1"  ,prefix.isOne(new String[] {"not", "no"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"no", "not", "nosy"}));
		Assert.assertEquals("No, 0"  ,prefix.isOne(new String[] {"no", "not", "abcd", "abcdefg"}));
	}
	
}

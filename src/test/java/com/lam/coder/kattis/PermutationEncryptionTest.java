package com.lam.coder.kattis;

import com.lam.coder.kattis.PermutationEncryption;
import org.hamcrest.CoreMatchers;
import org.junit.*;

@Ignore
public class PermutationEncryptionTest {
	PermutationEncryption permutationEncryption;
	
	@Before
	public void setUp() throws Exception {
		permutationEncryption = new PermutationEncryption();
	}

	@After
	public void tearDown() throws Exception {
		permutationEncryption  = null;
	}

	@Test
	public void test() {
        Assert.assertThat("Should be the same.", permutationEncryption.find(new int[] {1}, "Four score and seven years ago"),
                CoreMatchers.is("Four score and seven years ago"));
        Assert.assertThat("Should be the same.", permutationEncryption.find(new int[] {2, 1}, "our fathers brough forth on this continent a new nation,") ,
                CoreMatchers.is("uo rafhtre srbuohgf rohto  nhtsic noitentna n wen taoi,n"));
        Assert.assertThat("Should be the same.", permutationEncryption.find(new int[] {1, 3, 2, 5, 4}, "conceived in liberty and dedicated to the proposition") ,
                CoreMatchers.is("cnoeciev di nilbreyt na dddeciaet dt ohtep orpsotiino  "));
        Assert.assertThat("Should be the same.", permutationEncryption.find(new int[] {5, 10, 8, 1, 3, 6, 4, 7, 2, 9}, "that all men are created equal.") ,
                CoreMatchers.is(" mltaatlh rece ea nr luaeedqta   .      "));
	}
}

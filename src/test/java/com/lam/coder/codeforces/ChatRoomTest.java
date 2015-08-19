package com.lam.coder.codeforces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.codeforces.ChatRoom;

public class ChatRoomTest {
	ChatRoom chat;
	
	@Before
	public void setUp() throws Exception {
		this.chat = new ChatRoom();
	}

	@After
	public void tearDown() throws Exception {
		this.chat  = null;
	}

	@Test
	public void test() {
		Assert.assertEquals("YES", this.chat.find("hhhtehdbllnhwmbyhvelqqyoulretpbfokflhlhreeflxeftelziclrwllrpflflbdtotvlqgoaoqldlroovbfsq"));
//		Assert.assertEquals("YES", this.chat.find(""));
		Assert.assertEquals("YES", this.chat.find("ahhellllloou"));
		Assert.assertEquals("NO", this.chat.find("hlelo"));
		Assert.assertEquals("YES", this.chat.find("helhcludoo"));
	}
}

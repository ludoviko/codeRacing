package com.lam.coder.kattis;

import com.lam.coder.kattis.SecretMessage;
import org.junit.*;

@Ignore
public class SecretMessageTest {
	SecretMessage secretMessage;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		secretMessage  = null;
	}

	@Test
	public void test() {
        secretMessage = new SecretMessage("iloveyouJack");
		Assert.assertEquals("Jeiaylcookuv", secretMessage.find());
        secretMessage = new SecretMessage("iloveyoutooJill");
        Assert.assertEquals("iteiloylloooJuv", secretMessage.find());
        secretMessage = new SecretMessage("TheContestisOver");
        Assert.assertEquals("OsoTvtnheiterseC", secretMessage.find());
	}
}

package com.lam.coder.topCoder;

import com.lam.coder.topCoder.SoccerLeagues;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SoccerLeaguesTest {
    SoccerLeagues soccerLeagues;

    @Before
    public void setUp() throws Exception {
        soccerLeagues = new SoccerLeagues();
    }

    @After
    public void tearDown() throws Exception {
        soccerLeagues = null;
    }

    @Test
    public void test() {
        Assert.assertThat("Should be the same.", soccerLeagues.points(new String[]{"-WW", "W-W", "WW-"}), CoreMatchers.is(new int[]{6, 6, 6}));
        Assert.assertThat("Should be the same.", soccerLeagues.points(new String[]{"-DD", "L-L", "WD-"}), CoreMatchers.is(new int[]{5, 2, 8}));
        Assert.assertThat("Should be the same.", soccerLeagues.points(new String[]
                        {"-DWWD",
                                "L-WLL",
                                "DD-WD",
                                "DDL-L",
                                "DDLL-"}
        ), CoreMatchers.is(new int[]{14, 7, 12, 8, 10}));
        Assert.assertThat("Should be the same.", soccerLeagues.points(new String[]{"-LWWLWDLDWWWWWWDDWDW",
                "D-WWLDDWDWDLWDDWLWDD",
                "LL-DLDWDLDLDWWWLWDDW",
                "LDD-LLLDLWLWWWWDWDWL",
                "LWWW-DWDLWDWDWWWDWDW",
                "DLLWD-WWLLDDDLWWDWWW",
                "WWLWDL-LLDWWWWWDWWLW",
                "LLLLLDW-LDLWDDLLLDWL",
                "DWWWWDDD-DWWWWDWWWDW",
                "WWWWLLLWL-LWWWWWLWWW",
                "DWWWWWWWLW-WDWWWWWWW",
                "DDDLLLDWWWL-DDWDWLDD",
                "LWLWLDLLLDLW-DDDWWDD",
                "LLWWLWDDLWLWL-WWWDLL",
                "WWWWLLDDDWLWDD-WWWLW",
                "DLDLLLWWLLLWWLW-DWLL",
                "DLWWWLDLWWDWWDWL-WWD",
                "LLDDLLWLLWLWLDLWW-WW",
                "LLWLLLWWLWLWWDWWLD-W",
                "LLWDLWDWDWLLWWDDWWL-"}), CoreMatchers.is(new int[]{72, 62, 41, 41, 83, 63, 53, 35, 86, 50, 90, 32, 34, 41, 45, 36, 51, 32, 51, 45}));
        //  Assert.assertThat("Should be the same.", soccerLeagues.points(new String[] ) , CoreMatchers.is(new int[] ));
    }
}

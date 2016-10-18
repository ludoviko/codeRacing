package com.lam.coder.topCoder;

import com.lam.coder.topCoder.HiddenNumbers;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HiddenNumbersTest {
    HiddenNumbers hiddenNumbers;

    @Before
    public void setUp() throws Exception {
        hiddenNumbers = new HiddenNumbers();
    }

    @After
    public void tearDown() throws Exception {
        hiddenNumbers = null;
    }

    @Test
    public void test() {
        Assert.assertThat("Should be the same.", hiddenNumbers.findAll(new String[]{"0022 22k00022a022"}), CoreMatchers.is(new String[]{"0022", "00022"}));
        Assert.assertThat("Should be the same.", hiddenNumbers.findAll(new String[]{}), CoreMatchers.is(new String[]{}));
        Assert.assertThat("Should be the same.", hiddenNumbers.findAll(new String[]{"39 000220 30 skldjdije939939slkk 3090 2912kjdk3949", "dlkjd dkljsl098 dkd3 23kdkdkl 0000002222kdjdie9000"}),
                CoreMatchers.is(new String[]{"0000002222", "2912", "3090", "3949", "9000", "939939"}));


        Assert.assertThat("Should be the same.", hiddenNumbers.findAll(new String[]{"098m03r9f80239802389f0m9KDKLKLJDKLJm0983m890DMOm03",
                "dlkfj3hljf4h3klhl  4j4 444 44  rjhkrrkr34534539893",
                " 390804980498409480 dkldjkl djkl djkl d00000002998"}), CoreMatchers.is(new String[]{"9",
                "44",
                "098",
                "444",
                "890",
                "0983",
                "00000002998",
                "34534539893",
                "80239802389",
                "390804980498409480"}));

        Assert.assertThat("Should be the same.", hiddenNumbers.findAll(new String[]{"8Cr55Vd8", "0xuMMlXY4uyfco6LNikD2U", "3EvBCXzPwvMipIrQjeTMXs", "HGWGqGATMY52ayeMItiyTjED0PyPH7MNngFpPQ",
                        "cnuSXa7ZEaGzNdsKXfTmizewxF8pNfrbj1BrmZhPwbOS", "uedcvRaiV53nb 6HPTXX06Krh4M", "9N7da9ijtfhe", "DrG9hJpP 86pDFyQbCs 0L0DH9Sz", "NHWccK2ZZEQq cHMCx", "Jd7vQ6uNqj YYRsDYAUz", "vUavZxpvloQkthSg5Ccmcn5l6GbAPTS9ZRo7U", "f", "43Dqb2zW7QbDVBcDqp98Qu2rPjc3r5huNDvOlRq", "gyoilKlgRjpn7sJ", "RdDtMVwCVz", "tH1XbCMvuubqPTCG2", "DbBnRjAzREA9sqDpwVl21gPXHF3VpmE9ipzww6M993", "vJN47UcA vGYSJd5W2An0TFwFc1IWU9pGSYGdCQVLyvwU441x"}),
                CoreMatchers.is(new String[]{"7", "7", "7", "7", "7", "7", "7", "8", "8", "9", "9", "9", "9", "9", "9", "9", "9", "21", "43", "47", "52", "53", "55", "80", "86", "98", "441", "993"}));

//        Assert.assertThat("Should be the same.", hiddenNumbers.findAll(new String[] ) , CoreMatchers.is(new String[]   ));
    }
}

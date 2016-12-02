package com.lam.coder.kattis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by UC187029 on 08/02/2016.
 */
public class SymmetricOrderTest {
    SymmetricOrder symmetricOrder;

    @Before
    public void setUp() {
        symmetricOrder = new SymmetricOrder();
    }

    @After
    public void tearDown()  {
        symmetricOrder = null;
    }

    @Test
    public void testAssertData() {
        List<String> dataIn = new ArrayList<String>();
        dataIn.add("Bo");
        dataIn.add("Pat");
        dataIn.add("Jean");
        dataIn.add("Kevin");
        dataIn.add("Claude");
        dataIn.add("William");
        dataIn.add("Marybeth");

        List<String> dataOut = new ArrayList<String>();
        dataOut.add("Bo");
        dataOut.add("Jean");
        dataOut.add("Claude");
        dataOut.add("Marybeth");
        dataOut.add("William");
        dataOut.add("Kevin");
        dataOut.add("Pat");

        assertTrue(symmetricOrder.process(dataIn).equals(dataOut));
    }

}

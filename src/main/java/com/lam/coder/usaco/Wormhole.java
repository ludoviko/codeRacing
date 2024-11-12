package com.lam.coder.usaco;

import java.io.*;

/**
 * 
 * @author Usuario
 *
 *
 *
 */

public class Wormhole {
    public static final String DirIn = "./src/main/java/com/lam/coder/usaco/dataIn/";
    public static final String DirOut = "./src/main/java/com/lam/coder/usaco/dataOut/";

    public static final String DataIn = DirIn + Wormhole.class.getSimpleName()
            + ".in";
    public static final String DataOut = DirOut
            + Wormhole.class.getSimpleName() + ".out";

//	public find() {
//	}

    public static void  main(String[]  strings) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(DataIn));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
                DataOut)));

        Wormhole main  = new Wormhole();

        int n = Integer.parseInt(reader.readLine().trim());
        String  s1 = reader.readLine().trim();

        out.println("Result");
        out.close();
        reader.close();
    }

}


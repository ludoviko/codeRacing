package com.lam.coder.topCoder;

/**
 * Created by Usuario on 05/10/2016.
 */
public class EllysTimeMachine {

    public String getTime(String time) {

        int h = Integer.parseInt(time.split(":")[0]);
        int m = Integer.parseInt(time.split(":")[1]);

        m = m == 0 ? 60 : m;

        int mf = (h * 5) % 60;
        int hf = (m / 5) ;

        String data;
        data = String.format("%02d:%02d", hf, mf);

        return data;
    }

}
package com.crimps.services.lifeline;

import org.junit.Test;

/**
 * Created by crimps on 2017/6/15.
 */
public class LifeLineTest {
    @Test
    public void testProcess() throws Exception {
        LifeLine lifeLine = new LifeLine();
        String content = "jdfd";
        String s = lifeLine.process(content);
        System.out.println(s);
    }
}
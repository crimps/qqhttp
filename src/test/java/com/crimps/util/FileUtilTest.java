package com.crimps.util;

/**
 * Created by crimps on 2017/6/13.
 */
public class FileUtilTest {
    @org.junit.Test
    public void addBOM() throws Exception {
        String f = FileUtil.addBOM("fidn jk ");
        System.out.printf(f);
    }

}
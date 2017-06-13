package com.crimps.util;

/**
 * Created by xmcares on 2017/6/13.
 */
public class FileUtil {
    /**
     * 添加BOM开头
     * @param content
     * @return
     */
    public static String addBOM(String content) {
        try {
            byte[] bomBytes = new byte[]{(byte)0xEF, (byte)0xBB, (byte)0xBF};
            byte[] contentBytes = content.getBytes("UTF-8");
            byte[] reply = new byte[bomBytes.length + contentBytes.length];
            System.arraycopy(bomBytes, 0, reply, 0, bomBytes.length);
            System.arraycopy(contentBytes, 0, reply, bomBytes.length, contentBytes.length);
            return new String(reply, "UTF-8");
        } catch (Exception e) {
            return content;
        }
    }
}

package com.crimps.util;

import java.io.*;

/**
 * Created by crimps on 2017/6/13.
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

    /**
     * 将文本文件中的内容读入到buffer中
     * @param buffer buffer
     * @param filePath 文件路径
     * @throws IOException 异常
     */
    public static void readToBuffer(StringBuffer buffer, String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        String line; // 用来保存每行读取的内容
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        line = reader.readLine(); // 读取第一行
        while (line != null) { // 如果 line 为空说明读完了
            buffer.append(line); // 将读到的内容添加到 buffer 中
            buffer.append("\n"); // 添加换行符
            line = reader.readLine(); // 读取下一行
        }
        reader.close();
        is.close();
    }
}

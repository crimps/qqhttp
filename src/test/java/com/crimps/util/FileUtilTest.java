package com.crimps.util;

import org.junit.Test;

import java.util.Map;

/**
 * Created by crimps on 2017/6/13.
 */
public class FileUtilTest {
    @org.junit.Test
    public void addBOM() throws Exception {
        String f = FileUtil.addBOM("fidn jk ");
        System.out.printf(f);
    }

    @Test
    public void testReadToBuffer(){
        try {
            Map<String, String> map = FileUtil.readToMap("D:\\IdeaProjects\\qqhttp\\src\\main\\resources/lifeLineStoryData/GameProgress.json");
            System.out.println(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWriteToFile() {
        try {
            String content = "{gameBlock:\"d\",time:\"2017-06-15 16:44\"}";
            String filePath = "D:\\IdeaProjects\\qqhttp\\src\\main\\resources/lifeLineStoryData/GameProgress.json";
            FileUtil.writeToFile(content, filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUtf8ToUnicode() {
//        String str = "[正在建立连接]";
//        System.out.println(FileUtil.utf8ToUnicode(str));
        String str1 = "连";
        System.out.println(FileUtil.utf8ToUnicode(str1));
    }
}
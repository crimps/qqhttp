package com.crimps.services.lifeline;

import org.junit.Test;

import java.util.Map;

/**
 * Created by xmcares on 2017/6/14.
 */
public class ReadStoryDataTest {
    @Test
    public void testReadStoryDate() throws Exception {
        Map<String, String> progressMap = ReadStoryData.readGameProgress();
//        StringBuffer scenesBuff = new StringBuffer();
//        StringBuffer choicesBuff = new StringBuffer();
//        FileUtil.readToBuffer(scenesBuff, "D:\\IdeaProjects\\qqhttp\\src\\main\\resources\\lifeLineStoryData\\scenes_cn.json");
//        FileUtil.readToBuffer(choicesBuff, "D:\\IdeaProjects\\qqhttp\\src\\main\\resources\\lifeLineStoryData\\choices_cn.json");
//        Map<String, List<String>> scenesMap = (Map<String, List<String>>)parse(scenesBuff.toString());
//        Map<String, Map<String, String>> choicesMap = new HashMap<String, Map<String, String>>();
//        List<Object> list = (List<Object>)parse(choicesBuff.toString());
//        for (Object choice : list) {
//            Map<String, Object> map = (Map<String, Object>)choice;
//            String id = (String) map.get("identifier");
//            List<Map<String, String>> kMap = (List<Map<String,String>>)map.get("actions");
//            Map<String, String> choiceMap = new HashMap<String, String>();
//            for (Map<String, String> tempMap : kMap) {
//                choiceMap.put(tempMap.get("identifier"), tempMap.get("choice"));
//            }
//            choicesMap.put(id, choiceMap);
//        }
//        System.out.println("dfdf");
    }


}
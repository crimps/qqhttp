package com.crimps.services.lifeline;

import com.crimps.util.FileUtil;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static com.alibaba.fastjson.JSON.parse;

/**
 * Created by xmcares on 2017/6/14.
 */
public class ReadStoryDataTest {
    @Test
    public void readStoryDate() throws Exception {
        StringBuffer scenesBuff = new StringBuffer();
        StringBuffer choicesBuff = new StringBuffer();
        FileUtil.readToBuffer(scenesBuff, "D:\\IdeaProjects\\qqhttp\\src\\main\\resources\\lifeLineStoryData\\scenes_cn.json");
        FileUtil.readToBuffer(choicesBuff, "D:\\IdeaProjects\\qqhttp\\src\\main\\resources\\lifeLineStoryData\\choices_cn.json");
        Map<String, List<String>> scenesMap = (Map<String, List<String>>)parse(scenesBuff.toString());
        System.out.println("dfdf");
    }

}
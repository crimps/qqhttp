package com.crimps.services.lifeline;

import com.crimps.util.FileUtil;

import java.io.File;
import java.util.List;
import java.util.Map;

import static com.alibaba.fastjson.JSON.parse;

/**
 * Created by crimps on 2017/6/14.
 */
public class ReadStoryData {
    private static final String FILE_SCENES = "lifeLineStoryData" + File.separator + "lifeLineStoryData/scenes_cn.json";
    private static final String FILE_CHOICES = "lifeLineStoryData" + File.separator + "lifeLineStoryData/choices_cn.json";

    private static Map<String, List<String>> choicesMap;
    private static Map<String, List<String>> scenesMap;

    /**
     * 读取lifeline内容
     * @return
     */
    public static boolean readStoryDate() {
        try {
            StringBuffer scenesBuff = new StringBuffer();
            StringBuffer choicesBuff = new StringBuffer();
            FileUtil.readToBuffer(scenesBuff, FILE_SCENES);
            FileUtil.readToBuffer(choicesBuff, FILE_CHOICES);
            scenesMap = (Map<String, List<String>>)parse(scenesBuff.toString());
            choicesMap = (Map<String, List<String>>) parse(choicesBuff.toString());
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}